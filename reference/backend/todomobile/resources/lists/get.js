var list = this;

dpd.todos.get({parent: list.id}, function(todos) {
  if(todos && todos.length) list.todos = todos;
});