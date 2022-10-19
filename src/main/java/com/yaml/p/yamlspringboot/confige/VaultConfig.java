package com.yaml.p.yamlspringboot.confige;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value={"classpath:application.yaml"})
public class VaultConfig 
{
    // @Value("${id}")
    // private String id;
    @Value("${username}")
    private String username;
    @Value("${password}")
    private String password;
    // @Value("${email}")
    // private String email;
    // @Value("${rol}")
    // private String rol;
    // @Value("${enabled}")
    // private Boolean enabled;
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
   
   
   
    
}
