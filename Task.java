package com.example.taskmanager.entity;
import jakarta.persistence.*;

@Entity
public class Task {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String status;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    public Long getId(){return id;}
    public void setId(Long id){this.id=id;}
    public String getTitle(){return title;}
    public void setTitle(String title){this.title=title;}
    public String getStatus(){return status;}
    public void setStatus(String status){this.status=status;}
}