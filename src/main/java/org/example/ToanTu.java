package org.example;

public class ToanTu {
    public static void main(String[] args) {
        //cộng trừ nhân chia

        int a = 10;
        int b = 15;

        //tổng
        int sum = a + b;
        //hiệu
        int minus = a - b;
        //tích
        int multiply = a * b;
        //thương
        int divided = a / b;
        //chia lấy dư
        int LayPhanDu = a % b;

        System.out.println("Tổng "+ sum);
        System.out.println("Hiệu "+ minus);
        System.out.println("Tích "+ multiply);
        System.out.println("Thương "+ divided);
        System.out.println("Dư "+ LayPhanDu);

        //tiền tố và hậu tố
        //tiền tố
        System.out.println(++a);
        //hậu tố
        int c = 10;
        int d = c;
        System.out.println(d++);
        System.out.println(d);

        //toán tử so sánh
        // so sánh giá trị (==)
        int e = 10;
        int f = 15;
        boolean soSanh = (e == f);
        System.out.println(soSanh);
        //so sánh không bằng ( != )
        boolean soSanhKhongBang = ( e != f);
        System.out.println(soSanhKhongBang);
        //so sánh > < >= <=

        //toán tử logic
        // and(&&)
        boolean rs1 = (10 == 10) && (15 == 15);
        System.out.println(rs1);

        // or(||) nằm phía trên nút enter
        boolean rs2 = (10 == 15) || (15 == 15) || (10 == 8);
        System.out.println(rs2); //true

        //phủ định: !
        boolean rs3 = !(2>1);
        System.out.println(rs3);
    }
}
