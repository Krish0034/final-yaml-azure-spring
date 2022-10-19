package com.yaml.p.yamlspringboot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;





@Entity
@Table(name = "users")
public class User 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private int id;
    private String username;
    private String password;
    private String email;
    private String rol;
    private Boolean enabled;
    public User() {
    }
    public User(int id, String username, String password, String email, String rol, Boolean enabled) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.rol = rol;
        this.enabled = enabled;
    }
    public int getId() {
        return id;
    }
    public void setId(String id) {
        this.id = Integer.parseInt(id);
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getRol() {
        return rol;
    }
    public void setRol(String rol) {
        this.rol = rol;
    }
    
    @Override
    public String toString() {
        return "User [enabled=" + enabled + ", email=" + email + ", id=" + id + ", password=" + password + ", rol="
                + rol + ", username=" + username + "]";
    }
    public Boolean getEnabled() {
        return enabled;
    }
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    

    
}
