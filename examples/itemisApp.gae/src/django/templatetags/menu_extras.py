from django.template import Node, Library, TemplateSyntaxError, Variable, Context, loader

register = Library()

@register.tag()
def menu(parser, token):
    bits = token.contents.split()[1:]
    
    klass = bits.pop(0)
    bits.pop(0) #selection
    selIndex = Variable(bits.pop(0))
    bits.pop(0) #with
    
    bits = [s.split(":") for s in " ".join(bits).split(r",")]
    
    items = []
    while len(bits) > 0:
        bit = bits.pop(0)
        items += [{"title" : Variable(bit[0].strip()), "url" :Variable(bit[1].strip())}]
    
    return MenuNode(klass, selIndex, items)

class MenuNode(Node):
    def __init__(self, klass, selIndex, items):
        self.klass = klass;
        self.selIndex = selIndex;
        self.items = items
    
    def render(self, context):
        for idx, item in enumerate(self.items):
            item["title"] = item["title"].resolve(context)
            item["url"] = item["url"].resolve(context)
            if idx == int(self.selIndex.resolve(context)):
                item["klass"] = "selected"
            else:    
                item["klass"] = ""

        t = loader.get_template('tag_menu.html')
        return t.render(Context({"klass" : self.klass, "items" : self.items}))