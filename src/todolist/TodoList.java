/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package todolist;

import java.time.LocalDate;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import todolist.daoimpl.TaskListDAOImpl;
import todolist.model.TaskList;
import todolist.model.TaskNode;
import todolist.view.MainFrame;
import todolist.view.WelcomeFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author Thilina
 */
public class TodoList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TaskListDAOImpl taskListService = new TaskListDAOImpl();
        TaskList newList = new TaskList();
        
        SwingUtilities.invokeLater(() -> {
            createWelcomeFrame();
        });
            
        
        while(true){
            TaskNode newTask = insertTask();
            taskListService.addTaskFront(newTask, newList);
            taskListService.readTaskList(newList);
        }
        
    }
    
    public static void createWelcomeFrame(){
      WelcomeFrame welcomeframe = new WelcomeFrame();
      welcomeframe.setLocationRelativeTo(null);
      welcomeframe.setSize(500, 300);
      welcomeframe.setVisible(true);
      
       int delay = 2000; // 3 seconds
        Timer timer = new Timer(delay, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                welcomeframe.dispose(); // Close the welcome frame
                createMainFrame(); // Show the home page
            }
            
        });
        
        timer.setRepeats(false); // Only run the timer once
        timer.start();    
    }
    
    public static void createMainFrame(){
    
        MainFrame mainframe = new MainFrame();
        mainframe.setLocationRelativeTo(null);
        mainframe.setSize(600, 400);
        mainframe.setVisible(true);
        
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
