package com.harryha.mathutil.core;

public class MathUtil {

    // TRONG CLASS NÀY TA SẼ VIẾT CÁC HÀM TIỆN ÍCH DÙNG CHUNG CHO CÁC NHIỀU CLASS KHÁC
    //   CÁI GÌ MÀ DÙNG CHUNG CHO CÁC CLASS KHÁC THÌ THƯỜNG THIẾT KẾ LÀ STATIC
    // hàm này tính n!  = 1.2.3.4.5...n
    // Quy uoc khong có giai thua am
    // 0! = 1! = 1
    // chi tinh n tu 0...20, vì
    // 21!  vươt 18 con số vượt long
    public static long getFactorial(int n) {
         if (n < 0 || n > 20) 
            throw new IllegalArgumentException("Invaild n. N mus between 0  to 20");
            
        
         if (n == 0 || n == 1) 
            return 1;
        
         long product = 1 ; // biến tích luỹ acc / accumulation
         for (int i = 2; i <= n; i++) 
            product *= i; // product = product * i;
         
         return product;
        
        
    
}
}

// Học kĩ thuật viết code được gọi TDD là TEST DIRVEN DEVELOPMENT 
// Là kĩ thuật ngay khi viết, code ngay khi thiết kees ra tên hàm/class
// đã phải  chuẩn bị luôn bộ kiểm thử - chuẩn bị luôn các TEST CASE
// chuẩn bị luôn  các tình huống (case) sẽ xài hàm này như thế nào 
// chuẩn bị luông các tình huống test cá hàm để xác định hàm đúng/sai
// viết code hướng về đảm bảo cá bài kiểm thử đặt ra
// Ca
//TEST CASE :
//                  LÀ 1 TÌNH HUỐNG KIỂM THỬ APP/MÀN HÌNH/TÍNH NĂNG
//                  Xem nó có chạy đúng hay không?
//                  BẰNG CÁCH đưa DATA cụ thể nào đó, 
//                  Xem nó OUTPUT CÓ ĐÚNG NHƯ DỰ KIẾN KHÔNG ?
//                  Đưa ra DATA
