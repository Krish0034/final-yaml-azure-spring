package com.yaml.p.yamlspringboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yaml.p.yamlspringboot.entity.User;


public interface UserRepository extends JpaRepository<User,Integer>
{
    public User findByUsername(String username);
}
