package com.yaml.p.yamlspringboot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;



import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


import com.yaml.p.yamlspringboot.helper.FileUploadHelper;



import com.yaml.p.yamlspringboot.response.FileUploadUserResponse;






@RestController
public class FileUploadController 
{

    @Autowired
    private FileUploadHelper fileUploadHelper;
    
    @PostMapping(value = "/uploadFile")
    public ResponseEntity<?> uploadFile(@RequestParam("user") String fileUploadUserRequest, @RequestParam("file") MultipartFile file) throws Exception
    {
        System.out.println("It's give the Orignal Name of File: "+file.getOriginalFilename());
        System.out.println("It's give the File Size :"+file.getSize());
        System.out.println("It's give the File Name: "+file.getName());
        System.out.println("It's give the File Type: "+file.getContentType());
        System.out.println("It's give the File Name into bytes: "+file.getBytes());

    try
    {
   
        if(file.isEmpty())
        {
           
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Please Upload your File");
        }

        if(((file.getContentType().equals("image/jpeg")) || (file.getContentType().equals("image/jpg"))))
        {
            // file upload
            // where to upload the file on server
            // UPLOAD_DIR=C:\Users\Krishn\Desktop\SPRING BOOT AZURE\TASK\authentication-api-token\src\main\resources\static
        
            //String user=fileUploadUserRequest.getUsername()+fileUploadUserRequest.getEmail();
            FileUploadUserResponse user2=fileUploadHelper.uploadFile(fileUploadUserRequest, file);
            if(user2!=null)
            {
                // return ResponseEntity.ok("File is successfully uploaded");
     
                return ResponseEntity.ok(user2);
     
            }
            
           
        }
   
       
      
        return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body("Only JPEG/JPG Image are allowed");
    }
    
    catch(Exception e)
    {
        e.printStackTrace();
    }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Something is wrong");
    }
    
}
