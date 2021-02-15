package com.example.demo.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "UserEntity")
@Table(name = "users")
public class User implements Serializable {
    private static long idGenerator = 0;
    private long user_id;
    private String name;
    private String surname;
    private String user_status;
    private String username;
    private String password;


    public User(){
    }

    public User(String username, String name, String surname, String password, String user_status) {
        this.user_id = idGenerator++;
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.user_status = user_status;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    public long get_id() {return this.user_id; }
    public void set_id(long user_id) { this.user_id = user_id;}

    @Column(name = "username")
    public String getUsername() {return username; }
    public void setUsername(String username) { this.username = username;}

    @Column(name = "name")
    public String getName() {return name;}
    public void setName(String name) {this.name = name; }

    @Column(name = "surname")
    public String getSurname() {return surname;}
    public void setSurname(String surname) {this.surname = surname;}

    @Column(name = "password")
    public String getPassword() {return password; }
    public void setPassword(String password) {this.password = password;}

    @Column(name = "user_status")
    public String getUser_status() {return user_status;}
    public void setUser_status(String user_status) {this.user_status = user_status;}
}
