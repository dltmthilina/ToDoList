/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package todolist;

import java.time.LocalDate;
import java.util.Scanner;
import javax.swing.Timer;
import todolist.daoimpl.TaskListDAOImpl;
import todolist.model.TaskList;
import todolist.model.TaskNode;
import todolist.view.WelcomeFrame;

/**
 *
 * @author Thilina
 */
public class TodoList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //WelcomeFrame welcomeframe = new WelcomeFrame();
        //welcomeframe.setLocationRelativeTo(null);
        //welcomeframe.show();
        //Timer timer = new Timer(2000, e -> {
          //  welcomeframe.dispose();
       // });
       // timer.start();
        
        TaskListDAOImpl taskListService = new TaskListDAOImpl();
        TaskList newList = new TaskList();
        
            
        
        while(true){
            
            
            TaskNode newTask = insertTask();
            taskListService.addTaskFront(newTask, newList);
            taskListService.readTaskList(newList);
        }
        
    }
    
    public static TaskNode insertTask(){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the id of the task:" + " ");
        String id = scanner.nextLine();
        
        System.out.print("Enter the title of the task:" + " ");
        String title = scanner.nextLine();
        
         System.out.print("Enter the description of the task:" + " ");
        String description = scanner.nextLine();

        System.out.print("Enter the due date of the task (YYYY-MM-DD):" + " ");
        String dueDateString = scanner.nextLine();
        LocalDate dueDate = LocalDate.parse(dueDateString);

        System.out.print("Enter the status of the task (To do, In progress, or Done):" + " ");
        String status = scanner.nextLine();

        return new TaskNode(id,title,description, dueDate, status);
    }
    
    
    
}
