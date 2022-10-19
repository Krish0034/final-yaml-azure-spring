package com.yaml.p.yamlspringboot.response;

import org.springframework.stereotype.Component;

import com.yaml.p.yamlspringboot.status.SuccessStatus;

@Component
public class JwtResponse extends SuccessStatus
{
    String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public JwtResponse() {
    }

    
    public JwtResponse(String token) {
        this.token = token;
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
