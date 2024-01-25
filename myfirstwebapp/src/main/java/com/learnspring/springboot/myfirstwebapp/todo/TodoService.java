package com.learnspring.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	
	private static List<Todo> todos = new ArrayList<>();
	private static int todosCount = 0;
	
	static {
		todos.add(new Todo(++todosCount, "Sleep", "Sleep for 8 hours", 
				LocalDate.now().plusYears(1), false));
		todos.add(new Todo(++todosCount, "Eat", "Eat 3 times a Day", 
				LocalDate.now().plusYears(2), false));
		todos.add(new Todo(++todosCount, "Study", "Study for 6 hours", 
				LocalDate.now().plusYears(3), false));
	}
	
	public List<Todo> findByUsername(String username){
		return todos;
	}
	
	public void addTodo(String username, String description, 
			LocalDate targetDate, boolean isDone) {
		Todo todo = new Todo(++todosCount, username, description, targetDate, isDone);
		todos.add(todo);
	}
	
	public void deleteTodoByID(int id){
		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
		todos.removeIf(predicate);
	}
}
