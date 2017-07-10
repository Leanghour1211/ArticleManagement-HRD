///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.example.demo.controller;
//
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.multipart.MultipartFile;
//
///**
// *
// * @author User
// */
//@Controller
//public class uploadController {
//    
//    String Location="UploadData/";
//    @GetMapping("/upload")
//    public String uploadpage()
//    {
//        return "uploadfile";
//    }
//    @PostMapping("/upload/file")
//    public String uploaded(@RequestParam("file") MultipartFile file)
//    {
//        try {
//            byte[] bytes=file.getBytes();
//            Path path=Paths.get(Location, file.getOriginalFilename());
//            Files.write(path, bytes);
//            System.out.println("file saved to : "+path);
//        } catch (IOException ex) {
//            System.out.println("Error while saving File");
//        }    
//        return "redirect:/upload";
//    }
//    
//}
