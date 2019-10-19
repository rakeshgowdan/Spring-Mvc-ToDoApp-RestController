package com.rakesh.todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoRestController {

	@Autowired
	TodoService service;

	
	@RequestMapping(value = "/todos", method = RequestMethod.GET)
public List<Todo> listAllTodos() {
	//List<Todo> users = service.retrieveTodos("Rakesh");
	//return users;
		return service.retrieveTodos("Rakesh");
}
	/*
	 * 
	 * 
	 * @RequestMapping(value = "/todos/{id}", method = RequestMethod.GET)
	public Todo listAllTodos(@PathVariable int id) {
		//List<Todo> users = service.retrieveTodos("Rakesh");
		//return users;
			return service.retrieveTodo(id);
	}*/
}
