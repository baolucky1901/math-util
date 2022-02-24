/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.baolucky.mathutil.core;

/**
 *
 * @author Admin
 */
public class MathUtil {
    //hàm nhận vào n trả về n!= 1.2.3...n
    //n! giấ trị tăng rất nhanh
    //20! vừa đủ cho kiểu long, 18 số 0
    //ko có âm giai thừa
    //0! = 1! = 1
    public static long getFactorial(int n){
        long product = 1;
        
        if (n >20 || n < 0)
            throw new IllegalArgumentException("n must be between 0..20");
        
        if ( n == 0 || n == 1)
            return 1;
        
        for (int i = 2; i <= n; i++) 
            product *=i;
        
        return product;
    }
}
