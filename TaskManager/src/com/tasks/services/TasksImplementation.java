package com.tasks.services;

import java.util.HashMap;
import java.util.Map;

import static com.tasks.validations.TaskValidations.*;
import com.tasks.core.Task;
import com.tasks.custom_exceptions.TaskManagingException;

public class TasksImplementation implements TaskServices{

	Map<String,Task> taskmap = new HashMap<>();		
	@Override
	public void addTask(String taskName, String desc, String completionDate) throws TaskManagingException {
		validateDate(completionDate);
		//Task task = new Task(taskName, desc, completionDate);
	}

	@Override
	public void deleteTask(int taskId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateTaskStatus(int taskId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayPendingTask() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayTodaysPending() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sortedDate() {
		// TODO Auto-generated method stub
		
	}

}
