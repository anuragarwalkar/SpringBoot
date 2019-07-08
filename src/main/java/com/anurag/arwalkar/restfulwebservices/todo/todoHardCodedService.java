package com.anurag.arwalkar.restfulwebservices.todo;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class todoHardCodedService {
	private static List<Todo> todos = new ArrayList<Todo>();
	private static int idCounter = 0;
	

	static {
		todos.add(new Todo(idCounter,"aarwalka",
				"want to learn spring boot",true,new Date()));
		
//		todos.add(new Todo(++idCounter,"praju",
//				"want to learn and master MBA",new Date(),"false"));
//
//		
//		todos.add(new Todo(++idCounter,"nilesh",
//				"want to learn a car and mba",new Date(),"false"));
//		
//		todos.add(new Todo(++idCounter,"swapnil",
//				"want to learn a car and mba",new Date(),"false"));
//		
//		todos.add(new Todo(++idCounter,"dagdu",
//				"want to learn a car and mba",new Date(),"false"));
//		
//		todos.add(new Todo(++idCounter,"praju",
//				"want to learn a car and mba",new Date(),"false"));
//		
//		todos.add(new Todo(++idCounter,"mansi",
//				"want to learn a car and mba",new Date(),"false"));

	}
	
	public List<Todo> findAll(){
		return todos;
	}
	
	public Todo deleteByID(long id) {
		Todo todo = findById(id);
		
		if(todo == null) {
			return null;
		};
		
		if(todos.remove(todo)){
			return todo;
			
		};
		
		return null;
		
	}

	public Todo findById(long id) {
		for(Todo todo:todos) {
			if(todo.getId() == id) {
				return todo;
			}
		}
		return null;
	}
	
	public Todo save(Todo todo) {
		if(todo.getId() == -1 || todo.getId() == 0) {
			todo.setId(++idCounter);
			todos.add(todo);
		}else {
			deleteByID(todo.getId());
			todos.add(todo);
			
		}
		
		return todo;
	}
	
	
	
	
	
}
