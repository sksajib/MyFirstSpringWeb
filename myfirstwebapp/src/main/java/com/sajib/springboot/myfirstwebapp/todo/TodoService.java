package com.sajib.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.List;
import java.util.*;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

	private static List<Todo> todos = new ArrayList<>();
	static {
		todos.add(new Todo(1,"Sajib","Learn AWS",
				LocalDate.now().plusYears(1),false));
		todos.add(new Todo(2,"Sajib","Learn DevOps",
				LocalDate.now().plusYears(2),false));
		todos.add(new Todo(3,"Sajib","Learn FSDJava",
				LocalDate.now().plusYears(3),false));
		
	}
	
	public List<Todo> findByUsername(String username){
		return todos;
	}
}
