/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp5ex2;

/**
 *
 * @author houssem
 */
public class UserValidator extends Exception {
    public boolean validateAge(int age) throws UserAgeException {
        if(age < 18){
            throw new UserAgeException("too young !");
        }
        else {
            return true ;
        }
    }
}