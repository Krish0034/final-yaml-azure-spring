package com.yaml.p.yamlspringboot.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yaml.p.yamlspringboot.request.JwtRequest;
import com.yaml.p.yamlspringboot.response.JwtResponse;
import com.yaml.p.yamlspringboot.service.CustomUserDetailsService;
import com.yaml.p.yamlspringboot.util.JwtTokenUtil;



@RestController
@CrossOrigin("*")
public class JwtController 
{
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private CustomUserDetailsService customUserDetailsService;

    @Autowired
    private JwtTokenUtil jwtUtil;
 

    @RequestMapping(value ="/token", method = RequestMethod.POST)
    public ResponseEntity<?> generateToken1(@RequestBody JwtRequest jwtRequest) throws Exception
    {
        System.out.println("JWT Request: "+jwtRequest);

        try
        {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(jwtRequest.getUsername(), jwtRequest.getPassword()));
        }
        catch(UsernameNotFoundException e)
        {
           // e.printStackTrace();
            throw new Exception("Bad Credentials User Not Found.");
        }
        catch(BadCredentialsException e)
        {
           // e.printStackTrace();
            throw new Exception("Customise Bad Credentials");
        }
        //fine Area
     
        UserDetails userDetails=customUserDetailsService.loadUserByUsername(jwtRequest.getUsername());

         String token =jwtUtil.generateToken(userDetails);
        System.out.println("Token: "+token);
        return ResponseEntity.ok(new JwtResponse(token));
    }
    
    
}
