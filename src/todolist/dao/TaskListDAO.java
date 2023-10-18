/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package todolist.dao;

import java.time.LocalDate;
import java.util.Date;
import todolist.model.TaskList;
import todolist.model.TaskNode;

/**
 *
 * @author Thilina
 */
public interface TaskListDAO {
    
    public void addTaskFront(TaskNode task, TaskList list);
    public void addTaskEnd(TaskNode task);
    public void editTask(String id, String newTitle, String newDescription, Date newDueDate, String newStatus);
    public void deleteTask(String taskId);
    public void writeToFile(TaskNode task);
    public void findTask(String taskId);
    public void readTaskList(TaskList list);
    
    
    
}
