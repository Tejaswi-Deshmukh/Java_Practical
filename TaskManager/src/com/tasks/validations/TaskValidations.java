package com.tasks.validations;

import java.io.ObjectInputFilter.Status;
import java.time.LocalDate;
import java.util.Map;

import com.tasks.core.Task;
import com.tasks.custom_exceptions.TaskManagingException;

public class TaskValidations {

	
	public static LocalDate validateDate(String compDate) throws TaskManagingException {
		LocalDate completionDate = LocalDate.parse(compDate);
		
		if (completionDate.isBefore(LocalDate.now())) {
			throw new TaskManagingException("Invalid Date....date must be in future!!!!!!");
		}
		return completionDate;
	}
	
//	public static Status validateStatus() {
//		
//		return ;
//		
//	}
//	
//	public static void validateName(Map<String,Task>taskmap,String taskName) {
//		for(Task t:taskmap.values()) {
//			
//		}
//	}
}
