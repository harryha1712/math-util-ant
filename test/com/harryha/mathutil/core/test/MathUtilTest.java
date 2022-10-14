/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.harryha.mathutil.core.test;

import com.harryha.mathutil.core.MathUtil;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dell
 */
public class MathUtilTest {

    // Framewwork ép DEV phải viết code theo 1 khung dững sãn nào đó
    //Thường khung dùng kí hiệu =@
    //lúc biên dịch, run time
    @Test // test thử hàm so sánh 2 giá trị expected và actual
    // máy tự so sanh giùm , không nhìn = mắt để tự so sánh
    // Mà FW Junit tự generate ra code so sanh giá trị, 
    // tự dùng bảng mauf XANH ĐỎ mang ý nghĩa PASSED FAILED

    public void tryAssert() {
        Assert.assertEquals(100, 100);
    }

    //TEST HÀM getFactorial()  nhà mình như bên main() NHƯNG CHƠI THEO KIỂU XANH ĐỎ
    @Test
    // quy tắc đặt tên hàm dành cho kiểm thử:
    // TÊN HÀM BAO GỒM NGỮ NGHĨA CỦA VIỆC KIỂM THỬ
    //TEST NÀY KIỂM TRA TÍNH GT VÀ THAM SỐ TỬ TẾ
    public void testFactorialGivenRightArgumentReturnsWell() {

        //Test Case #1:
        // n = 0, 0! hy vọng trả về 1, thực tế hàm trả về mấy, chạy mới biết
        long expected = 1;
        long actual = MathUtil.getFactorial(0);

        Assert.assertEquals(expected, actual);

        //Test Case #2:
        // n = 0, 0! hy vọng trả về 1, thực tế ?
        actual = MathUtil.getFactorial(1);

        Assert.assertEquals(expected, actual);

        //Test Case #3:
        // n = 0, 0! hy vọng trả về 1, thực tế ?
//        actual = MathUtil.getFactorial(2);
//
//        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFactorialGivenRightArgumentReturnsWell2() {
        //Test Case #4:
        // n = 3, 3! hy vọng trả về 3, thực tế ?
        long expected = 6;
        long actual = MathUtil.getFactorial(3);
        Assert.assertEquals(expected, actual);

        /*
        //Test Case #5:
        // n = 24, 4! hy vọng trả về 24, thực tế ?
        expected = 240;
        actual = MathUtil.getFactorial(4);
        Assert.assertEquals(expected, actual);
         */
    }

    //KIỂM THỬ  NGOẠI LỆ KHI DATA CÀ CHỚN!!!
    // n < 0, KHÔNG TÍNH GIAI THỪA ÂM
    //n > 20, KHÔNG TÍNH GIAI THỪA TRÀN KIỂU LONG
    // HÀM ĐƯỢC THIẾT KẾ : 
    /*
                                        NÉM RA NGOẠI LỆ TÊN LÀ Illegal-Agrument- THAY VÌ NHẬN VỀ 1 GIÁ TRỊ LONG, BẠN NHẬN VỀ CÂU CHỬI
          TA ĐO LƯỜNG
                                        
     */
    
    
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialGivenWrongArgumentThrowsException() {
        MathUtil.getFactorial(-5);
        
        //Test Case #6: n = -5, expected: hy vọng thấy  ngoại lệ
        // tên là IllegalArgumentException
    }
    
/*
        @Test(expected = NumberFormat.class)
    public void testFactorialGivenWrongArgumentThrowsException() {
        MathUtil.getFactorial(-5);
        
        //Test Case #6: n = -5, expected: hy vọng thấy  ngoại lệ
        // tên là IllegalArgumentException
    
    ==> SAI NGOẠI LỆ ƯỚC LƯỢNG BỊ SAI
    }
    
*/
  
    
  /*
        @Test // (expected = NumberFormat.class)
    public void testFactorialGivenWrongArgumentThrowsException() {
        MathUtil.getFactorial(-5);
        
        //Test Case #6: n = -5, expected: hy vọng thấy  ngoại lệ
        // tên là IllegalArgumentException
    
    ==> KHÔNG DỰ ĐỊNH TRƯỚC NGOẠI LỆ
    }
    
*/  
    
    
    // CHỐT DEAL XANH ĐỎ:
    // NẾU TẤT CẢ TEST CASES, @Test ĐỀU MÀU XANH -> KẾT LUẬN HÀM
    // ĐÚNG CHO NHỮNG THỨ MÌNH ĐÃ TEST XANH CUỐI CÙNG KHI TẤT CẢ 
    
               //@Test PHẢI XANH
    // 1. XANH KHI TẤT CẢ CÙNG XANH
        // NẾU TRONG CÁC @Test CÓ ÍT NHẤT 1 THẰNG ĐỎ / XEM NHU TẤT CẢ
        // LÀ ĐỎ, Ý NGHĨA LÀ HÀM ĐÚNG THÌ PHẢI ĐÚNG HẾT, CÓ 1THẰNG SAI
        //HÀM KHÔNG ỔN ĐỊNH VỀ KẾT QUẢ  -> PHẢI GỌI HÀM SAI
    //2. ĐỎ KHI CÓ ÍT NHẤT 1 THẰNG ĐÓ
        // ĐỎ DẾN TỪ 1 TRONG TÌNH HUỐNG
        // EXPECTED đã tính đúng, ACTUIAL trả về SAI -> BUG CỦA HÀM
        // EXPECTED đã tính / gõ SAI , ACTUAL SAI ĐÚNG
}
//@Test là gì
// Là một kí hiệu ANNOTATION báo với JUnit và JVM
// để generate cái hàm tryAssert() thành main() truyền thống
// và guier cho JVM  để . "APP chạy từ main()"
//==> Thiếu @Test tương đương APP thiếu main() no-runable
