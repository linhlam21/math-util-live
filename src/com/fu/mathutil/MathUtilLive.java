/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil;

/**
 *
 * @author hungl
 */
public class MathUtilLive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        long result = MathUtil.getFactorial(5);
        System.out.println("5! = 120; actual: " + result);
//        long result21 = MathUtil.getFactorial(21);
//        System.out.println("21! = error; actual: " + result21);
        long result20 = MathUtil.getFactorial(20);
        System.out.println("20! = " + result20);
    }
    
}
