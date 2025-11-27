package com.tasks.tester;

import static com.tasks.validations.TaskValidations.validateDate;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.tasks.core.Status;
import com.tasks.core.Task;
import com.tasks.custom_exceptions.TaskManagingException;


public class TaskManager {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("--------TASK MANAGER-------");
			Map<Integer,Task> taskmap = new HashMap<>();
			
			//populate
			
			taskmap.put(Task.IdGenerator,new Task("Study", "python revision", LocalDate.parse("2025-10-12")));
			taskmap.put(Task.IdGenerator,new Task("Cricket", "play and enjoy", LocalDate.parse("2025-11-13")));
			taskmap.put(Task.IdGenerator,new Task("Cooking", "making food", LocalDate.parse("2025-12-09")));
			
			
			boolean running = true;
			while(running) {
				System.out.println("What you want to do:\n 1.Add a new task\n 2.Delete your task\n 3.Update your task status\n 4.Display all your pending tasks\n 5.Display all pending tasks for today\n 6.Display all your sorted completed tasks\n 7.Display All the Tasks\n 0.Exit");
				switch (sc.nextInt()) {
				case 1:
					//add new task
					
					System.out.println("Enter the Completion Date:");
					validateDate(sc.next());
					
					System.out.println("Enter Your new Task:- Taskname,Description,DateOfCompetion:");
					Task t = new Task(sc.next(), sc.next(), LocalDate.parse(sc.next()));
					
					taskmap.put(Task.IdGenerator, t);
					System.out.println("New Task Added!!!!!!");
					break;
					
					
				case 2:
					//delete task
					
					
					System.out.println("Enter the Id of the task");
					int taskId = sc.nextInt();
					
					taskmap.values().stream().filter(g -> g.getTaskId() == taskId).forEach(i -> i.setActive(false));
					
					System.out.println("Task Removed!!!!");
					
					
					break;
				
					
				case 3:
					//update task status
					
					System.out.println("Enter the Id of your task:");
					int tid = sc.nextInt();
					if(!taskmap.containsKey(tid)) {
						throw new TaskManagingException("Invalid id");

					}
					
					System.out.print("Status (PENDING/IN_PROGRESS/COMPLETED): ");
					 Status status = Status.valueOf(sc.next().toUpperCase());
					 for(Task t1:taskmap.values()) {
							taskmap.values().stream().filter(s -> s.getTaskId()==tid).forEach(s -> s.setState(status));
						}
					 System.out.println("Task Status Updated!!!!!!!");
					
					
					break;
					
					
				case 4:
					//display all pending tasks
					
					System.out.println("All Your Pending Tasks are--->");
						taskmap.values().stream().filter(i -> i.getState()==Status.PENDING).forEach(System.out::println);
					
					break;
					
					
				case 5:
					//display all pending tasks for today
					
					LocalDate date = LocalDate.now();
					
					taskmap.values().stream().filter(f -> (f.getCompletionDate()).isEqual(date)).filter(j->j.getState()==Status.PENDING).forEach(System.out::println);
					
					break;
					
					
				case 6:
					//Display all tasks sorted by completionDate 
					
					System.out.println("All tasks sorted by completionDate ");
					List<Task> tList = new ArrayList<>(taskmap.values());
					Collections.sort(tList,new Comparator<Task>() {

						@Override
						public int compare(Task o1, Task o2) {
							return o1.getCompletionDate().compareTo(o2.getCompletionDate());
					
						}
					}) ;
						
					for (Task t1 : tList)
						System.out.println(t1);
					
					break;
					
				case 7:
					
					//Display all records
					
					System.out.println("All customers - ");
					for (Task t1 : taskmap.values())
						System.out.println(t1);
					break;
					
				case 0:
					System.out.println("Exit!!");
					running = false;
					break;
					
				default:
					System.out.println("Invalid Input!!");
					break;
				}
			}
			
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}
