/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.baolucky.mathutil.main;

import com.baolucky.mathutil.core.MathUtil;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        //test thử coi hàm tính giai thừa chạy đúng hay k???
        //kiểm thử là so sánh giữ EXPECTED vs ACTUAL
        //ta phải tưởng tượng xem ng dùng/ng khác xài app/code
        //như thế nào, ta dùng trc họ
        //ta phải tưởng tượng các tình huống họ xài - TEST CASES
        
        //CASE #1: check the getF() with valid argument(n =0..20)
        //n = 0 -> expected = 1 0! phải trả về 1, tao kì vọng như thế
        long expected = 1;
        long actual = MathUtil.getFactorial(0);
        //so sánh giữa EXPECTED vs ACTUAL
        System.out.println("Check 0!; expected: " + expected + "; actual: " + actual);
        //CASE #2:
        //n = 6 -> expected = 720, 6! = 720 mới là đúng, kì vọng
        expected = 720;
        actual = MathUtil.getFactorial(6);
        //so sánh giữa EXPECTED vs ACTUAL
        System.out.println("Check 6!; expected: " + expected + "; actual: " + actual);
        
        //CASSE #...1, 2, ... 20! VALID ARGUMENT
        
        //CASE #x check getF() with invalid argument
        //expected = ??? cái gì đây khi mình muốn tính -5!
        // hy vọng của ta là thấy đc ngoại lệ, IllegalArgumentException
        //sure -5! phải xuất hiện ngoại lệ
        // nếu getF(-5) mà ném ra ngoại lệ, ta mừng rơi nc mắt
        System.out.println("Check if exception is thrown");
        MathUtil.getFactorial(-5);
    }
}
