 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package todolist.daoimpl;

import java.time.LocalDate;
import java.util.Date;
import todolist.dao.TaskListDAO;
import todolist.model.TaskList;
import todolist.model.TaskNode;

/**
 *
 * @author Thilina
 */
public class TaskListDAOImpl implements TaskListDAO{
    
    TaskList taskList = new TaskList();
    private TaskNode head;

    public TaskListDAOImpl() {
        head = taskList.head;
    }

    @Override
    public void readTaskList(TaskList list) {
        
    }
    
 
    @Override
    public void addTaskFront(TaskNode newTask, TaskList list) {
       
        if(list.head == null){ 
            list.head= newTask; 
        }else{
            newTask.next = list.head;
            list.head = newTask;
        }
    }

    @Override
    public void addTaskEnd(TaskNode newTask) {
        if(head == null){
            head= newTask;
        }else{
            TaskNode current = head;
            while(current.next !=null){
               current = current.next;
            }
            current.next = newTask; 
        } 
    }
    

    @Override
    public void editTask(String id, String newTitle, String newDescription, Date newDueDate, String newStatus) {
        TaskNode current = head;
        while(current.getId()!=id){
            current = current.next;
        }
        current.setTitle(newTitle);
        current.setDescription(newDescription);
        current.setDue_date(newDueDate);
        current.setStatus(newStatus);
    }

    @Override
    public void deleteTask(String taskId ) {
         if (head == null) {
            return;
        }
        TaskNode previous = null;
        TaskNode current = head;
        while (current != null && !current.getId().equals(taskId)) {
            previous = current;
            current = current.next;
        }
        if (previous == null) {
            head = current;
        } else {
            previous.next = current.next;
        }

    }

    @Override
    public void writeToFile(TaskNode task) {
      
    }

    @Override
    public void findTask(String taskId) {
        
    }
    
}
