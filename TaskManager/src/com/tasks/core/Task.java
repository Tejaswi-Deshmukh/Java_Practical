package com.tasks.core;

import java.time.LocalDate;

public class Task {
private int taskId;
private String taskName;
private String desc;
private LocalDate completionDate;
private Status state;
private boolean active;

public static int IdGenerator=0;

public Task(String taskName, String desc, LocalDate completionDate) {
	super();
	this.taskId = ++IdGenerator;
	this.taskName = taskName;
	this.desc = desc;
	this.completionDate = completionDate;
	this.state = Status.PENDING;
	this.active = true;
}

public int getTaskId() {
	return taskId;
}

public void setTaskId(int taskId) {
	this.taskId = taskId;
}

public String getTaskName() {
	return taskName;
}

public void setTaskName(String taskName) {
	this.taskName = taskName;
}

public String getDesc() {
	return desc;
}

public void setDesc(String desc) {
	this.desc = desc;
}

public LocalDate getCompletionDate() {
	return completionDate;
}

public void setCompletionDate(LocalDate completionDate) {
	this.completionDate = completionDate;
}

public Status getState() {
	return state;
}

public void setState(Status state) {
	this.state = state;
}

public boolean getActive() {
	return active;
}

public void setActive(boolean active) {
	this.active = active;
}

@Override
public String toString() {
	return "Task [taskId=" + taskId + ", taskName=" + taskName + ", desc=" + desc + ", completionDate=" + completionDate
			+ ", state=" + state + ", active=" + active + "]";
}

//public void newTask(String tName, String desc, String dt) {
//	LocalDate date = LocalDate.parse(dt);
////	if (date.isAfter(LocalDate.now())) {
////		
////	}
//}
//

}
