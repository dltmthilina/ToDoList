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
import java.time.ZoneId;
import java.util.Date;


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
}
