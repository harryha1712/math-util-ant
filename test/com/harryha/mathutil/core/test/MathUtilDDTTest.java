/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.harryha.mathutil.core.test;

import com.harryha.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;



@RunWith(value = Parameterized.class) 
// Clas này chuẩn bị chơi trò TÁCH DATA RA KHỔI CÂU LỆNH XANH ĐỎ CHO DỄ KIỂM SOÁT CÁC TESTE CASE
// Thư viện JUnit nó tự generate thêm code phía hậu tường, lúc biên dịch để thực hiện hoá ý tượng DDT
// EXAMPLE:
//      NÓ DẼ TỰ BIẾT LẤY DATA Ở MẢNG 2 CHIỀU NÀO ĐÓ NHỒI VÀO HÀM assertEqual()
//      Ép ta phải viết code theo các nào đó trược mới chạy được 
//      thư viện đó được gợi là FRAMEWORK

/*
Parameterized : THAM SỐ HOÁ

*/
public class MathUtilDDTTest {
   
    
    @Parameterized.Parameters// bộ DATA nè
    public static  Object[][] initData() {
        int a[] = {5, 10, 15,20, 25};
        
        Object arr1[] [] = { 
                                {1,0},
                                {1,1},
                                {2,2},
                                {6,3},
                                {24,4},
                                {12,5},
                                {720,6}
                            };
        return new Integer[][]{
                                {1,0},
                                {1,1},
                                {2,2},
                                {6,3},
                                {24,4},
                                {120,5},
                                {720,6}
                             };
    }
    @Parameterized.Parameter(value = 0)
    public long expected; // biến này sẽ lưu giá trị kì vọng khi xài hàm
    // getFactorial() -> expected
    @Parameterized.Parameter(value = 1)
    public int n; // biến này sẽ lưu giá tị đưa cho hàm getF() để check  2 cột của tùng dòng  của mảng trên
    // ta phải quy ước biến expected map vào    
    
    @Test
    public void testFactorial() {
        Assert.assertEquals(expected, MathUtil.getFactorial(n));
    }
}


//  DDT: Data Driven Testing , là 1 kĩ thuật viết code kiểm thử dùng trong Unit Test
// dùng để viết code test các hàm/class một cách dễ đọc hơn!!
//BẰNG CÁCH: 
// Tách DATA KIỂM THỬ và
// CÁC CÂU LỆNH TEST HÀM THÀNH 2 NƠI KHÁC NHAU

//Ví dụ cách CŨ, Non - DDT vừa làm xong
//assertEquals(0, getF(0));
//assertEquals(1, getF(1));
//assertEquals(2, getF(2));
//assertEquals(6, getF(3));
//assertEquals(24, getF(4));
//assertEquals(120, getF(5));
//assertEquals(720, getF(6));
//assertEquals(0, getF(0));

// CÁCH NÀY DỄ VIẾT NHƯNG KHÓ KIỂM TRA ĐỦ HẾT TAAPJHOPWJ TEST CASES CẦN TEST, TRỘN LẪN DATA ĐỪ VÀO, VÀ CÂU LỆNH GỌI HÀM KIỂM THỬ

//KĨ THUẬT TÁCH DATA 00, 11,22,63,1205, 7206
// ĐỂ RIÊNG 1 CHỖ , SAU ĐÓ NHỒI fill/feed nạp chung vào 

/*
EXP| n
1   | 0
1   |   1
2   |   2
 3  |   6
4   |   240
5   |   120
6   |   7720

MẢNG 2 CHIỀU

Mảng lành danh sách các DỮ LIỆU CÙNG KIỂU

*/

//LỆNH GỌI HÀM assertEquals(?, getF(?));
//==> GIÚP CODE TRONG SÁNG DỄ HIỂU

//KĨ THUẬT NÀY GỌI LÀ: DATA     DRIVEN      TESTING
//THAM SỐ HOÁ DATA  - BIẾN DATA RA 1 NƠI, ĐẶT CHO CHUNG TÊN BIẾN'
// LÁT HỒI NHỒI VÀO LỆNH SO SÁNH

// KHI ĐỎ THÌ CÓ 2 TÌNH HUỐNG 
// ĐỎ DO CÓ SỰ KHÁC NHAU GIỮA EXPECTED VÀ ACTUAL 
// ĐỎ VÌ EXPECTD KHÁC ACTUAL , VẬY KHÔNG BẰNG VÌ LÝ DO GÌ
//  1. Exxpected là GIÁ TRỊ TÍNH TOÁN TRƯỚC HÀM PHẢI TRẢ VỀ GIÁ TRỊ BẰNG ĐƯỢC GIÁ TRỊ NÀY 
// VÀ EXPECTED MÍNH TÍNH BẰNG TAY KHI CHƯA XÀI APP PHẢI TÍNH ĐÚNG
//==> MÀU ĐỎ LÀ DO ACTUAL ÉO GIỐNG , TỨC LÀ CODE SAI , BUG!!

//  2.EXPECTD MÌNH TÍNH BẰNG TAY VÀ BỊ SAI , KÌ VỌNG ĐÃ SAI TRƯỚC
//  KHI ĐÓ HÀM TRẢ VỀ CHO DÙ CÓ ĐÚNG THÌ CŨNG BỊ MÀU ĐỎ
// KÌ VỌNG SAI THÌ KHÔNG THỂ KẾT LUẬN ĐƯỢC HÀM CÓ BUG HAY KHÔNG?


// BÀI TẬP VỀ NHÀ
// HÃY CHỌN 1 UNitTest nhóm thích
// JAVA : JUnit , TestNG
//C# : NUnit, xUnit, MSTest (Nuget)
//Search Google Unit Test Framework for NNLT???" ra tên thư viện
//Thứ 3 Tuần 6 demo
//Mỗi nhóm demo 30 phút
