package com.yaml.p.yamlspringboot.response;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.yaml.p.yamlspringboot.status.SuccessStatus;

@JsonIgnoreProperties(ignoreUnknown = true)
@Component
public class FileUploadUserResponse extends SuccessStatus
{
    private String username;
    private String email;
    private String rol;
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
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
    
    public FileUploadUserResponse() {
    }
    public FileUploadUserResponse(String username, String email, String rol) {
        this.username = username;
        this.email = email;
        this.rol = rol;
    }
    @Override
    public String getError() {
     
        return super.getError();
    }
    @Override
    public String getMessage() {
      
        return super.getMessage();
    }
    @Override
    public String getPath() {
      
        return super.getPath();
    }
    @Override
    public String getStatus() {
     
        return super.getStatus();
    }
    @Override
    public void setError(String error) {
       
        super.setError(error);
    }
    @Override
    public void setMessage(String message) {
       
        super.setMessage(message);
    }
    @Override
    public void setPath(String path) {
      
        super.setPath(path);
    }
    @Override
    public void setStatus(String status) {
        
        super.setStatus(status);
    }
    
    
}
