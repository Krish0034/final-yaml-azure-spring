package com.yaml.p.yamlspringboot.helper;

import java.io.File;
//import java.io.FileOutputStream;
import java.io.IOException;
//import java.io.InputStream;
import java.nio.file.Files;
//import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;


import org.springframework.core.io.ClassPathResource;
//import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.ObjectMapper;

import com.yaml.p.yamlspringboot.response.FileUploadUserResponse;

@Component
public class FileUploadHelper 
{
   //public final String UPLOAD_DIR="C:\\Users\\Krishn\\Desktop\\SPRING BOOT AZURE\\TASK\\yaml-spring-boot\\src\\main\\resources\\static\\image";
     public final String UPLOAD_DIR=new ClassPathResource("static/image/").getFile().getAbsolutePath();

    public FileUploadHelper()throws IOException
    {

    }
    
   
    public FileUploadUserResponse uploadFile(String token, MultipartFile file)
    {
        
        FileUploadUserResponse jsonUser=new FileUploadUserResponse();
        try
        {
            // InputStream is= file.getInputStream();

            // byte[] data=new byte[is.available()]; 
            // is.read();

            // //write
            // FileOutputStream fos= new FileOutputStream(UPLOAD_DIR+File.separator+file.getOriginalFilename()); 

            // fos.write(data);
            // fos.flush();
            // fos.close();
            // f=true;
            ObjectMapper objectMapper=new ObjectMapper();
            jsonUser=objectMapper.readValue(token, FileUploadUserResponse.class);
            Files.copy(file.getInputStream(),Paths.get(UPLOAD_DIR+File.separator+file.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);

            return jsonUser;
        }
        catch(IOException e)
        {
            System.out.println("IO Error: "+e.toString());
        }
        catch(Exception e)
        {
            System.out.println("Error: "+e.toString());
        }
        return jsonUser;

    }

   
}