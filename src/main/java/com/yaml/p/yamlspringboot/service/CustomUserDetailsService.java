package com.yaml.p.yamlspringboot.service;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.yaml.p.yamlspringboot.entity.CustomUserDetails;
import com.yaml.p.yamlspringboot.entity.User;
import com.yaml.p.yamlspringboot.repo.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService
{
    @Autowired
    private UserRepository userRepository;;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        
        User user=userRepository.findByUsername(username);

        if(user==null)
        {
            throw new UsernameNotFoundException("User Not Found !!");
        }
        else
        {
            return new CustomUserDetails(user);
        }
        // if(username.equals("Krishn"))
        // {
        //     return new User("Krishn", "Krihs0034",new ArrayList<>() );
        // }
        // else
        // {
        //     throw new UsernameNotFoundException("User are Not Allowed.");
        // }
    }
    

}
