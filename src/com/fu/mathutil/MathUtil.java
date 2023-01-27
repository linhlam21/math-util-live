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
public class MathUtil {
    
    // n!= 1.2.3.4.5.....n
    // 0! = 1
    // 20! la vua khop kieu long, kieu long toi da 18 con so 0
    // 21! la out kieu long 
    // neu dua vao am hay 21, thi k tinh, -> exception
    public static long getFactorial(int n) {
        if (n<0 || n>20) {
            throw new IllegalArgumentException("Invalid Argument. "
                    + "n must be between 0 and 20");
        }
        if (n==0 || n==1) return 1;
        return n * getFactorial(n-1);
    }
}
