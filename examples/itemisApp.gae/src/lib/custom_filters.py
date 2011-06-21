def to_list(o):
    if isinstance(o, list):
        return o
    else:
        return [o]
        
def split(o, separator):
    s = (u"%s" %o)
    return s.split(unicode(separator))