/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp5ex2;

/**
 *
 * @author houssem
 */
public class MathOperations {
    public int calculateFactorial( int num) throws IllegalArgumentException{
        if( num < 0){
            throw new IllegalArgumentException("impossible car le nombre est negatif !") ;
        }
        else if (num == 0){
            return 1 ;    
        }
        else {
            int f = 1 ;
            for(int i = num ; i > 0 ; i--){
                f *= i ;
            }
            return f ;
        }
    }
    public float calculateSquareRoot( float num) throws ArithmeticException{
        if( num < 0){
            throw new ArithmeticException("impossible car le nombre est negatif !") ;
        }
        else {
            return (float) Math.sqrt(num) ;    
        }

    }
}