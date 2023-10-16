/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package todolist.model;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Thilina
 */
public class TaskNode {
    
    private String id;
    private String title;
    private String description;
    private LocalDate due_date;
    private String status; 
    
    public TaskNode next;

    public TaskNode(String id, String title, String description, LocalDate due_date, String status) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.due_date = due_date;
        this.status = status;
    }
    
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the due_date
     */
    public LocalDate getDue_date() {
        return due_date;
    }

    /**
     * @param due_date the due_date to set
     */
    public void setDue_date(LocalDate due_date) {
        this.due_date = due_date;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
}
