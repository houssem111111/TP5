/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp5ex2;

/**
 *
 * @author houssem
 */
import java.io.FileNotFoundException;
import java.io.File;



public class FileManager {
    public void readFile(String filePath) throws FileNotFoundException{
        File file = new File(filePath);
        if(file.exists()){
            System.out.println("file exists !");
        }
        else {
            throw new FileNotFoundException("File not found: " + filePath) ; 
        }
    }
}