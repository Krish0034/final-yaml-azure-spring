package com.yaml.p.yamlspringboot.status;


public class SuccessStatus 
{
    String status="OK (200)";
    String error= "No Error";
    String message = "Successfull !!!";
    String path="Path is Secrete";
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getError() {
        return error;
    }
    public void setError(String error) {
        this.error = error;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String getPath() {
        return path;
    }
    public void setPath(String path) {
        this.path = path;
    }
    

    
    
}
