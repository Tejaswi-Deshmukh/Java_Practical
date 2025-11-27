package com.tasks.services;

import java.time.LocalDate;

import com.tasks.custom_exceptions.TaskManagingException;

public interface TaskServices{
	
	public void addTask(String taskName, String desc, String completionDate)throws TaskManagingException;
	
	public void deleteTask(int taskId);
	
	public void updateTaskStatus(int taskId);
	
	public void displayPendingTask();
	
	public void displayTodaysPending();
	
	public void sortedDate();
}
