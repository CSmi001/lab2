

import lombok.Data;
import lombok.ToString;

import java.time.LocalDateTime;


@Data
public class Task {
    String taskName;
    String taskDescription;
    String taskCategory;
    LocalDateTime taskDateTimeStart;
    LocalDateTime taskDateTimeStop;

    // Constructer 1
    public Task(){
    }

    //Constructer 2

    public Task(String taskName, String taskDescription, String taskCategory, LocalDateTime taskDateTimeStop) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskCategory = taskCategory;
        this.taskDateTimeStop = taskDateTimeStop;
    }


/*
    //Getter and Setters

    public String getTaskName(){
        return taskName;
    }
    public void setTaskName(String taskName){
        this.taskName=taskName;
    }
    public String getTaskDescription(){
        return taskDescription;
    }
    public void setTaskDescription(String taskDescription){
        this.taskDescription=taskDescription;
    }
    public String getTaskCategory(){
        return taskCategory;
    }
    public void setTaskCategory(String taskCategory){
        this.taskCategory=taskCategory;
    }

    public LocalDateTime getTaskDateTimeStart() {
        return taskDateTimeStart;
    }

    public void setTaskDateTimeStart(LocalDateTime taskDateTimeStart) {
        this.taskDateTimeStart = taskDateTimeStart;
    }

    public LocalDateTime getTaskDateTimeStop() {
        return taskDateTimeStop;
    }

    public void setTaskDateTimeStop(LocalDateTime taskDateTimeStop) {
        this.taskDateTimeStop = taskDateTimeStop;
    }

 */
}
