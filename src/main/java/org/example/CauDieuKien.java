package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CauDieuKien {
    public static void main(String[] args) {
        //Câu lệnh if
        // if(điều kiện){thực hiện logic}
        //điều kiện đúng
        if (9 > 2) {
            System.out.println("điều kiện đúng");
        }
        //điều kiện sai
        if (2 > 9) {
            System.out.println("điều kiện đúng");
        }
        //Viết chương trình kiểm tra xem hôm nay có phải ngày đi học không?
        int day = 4;
        if (day == 4 || day == 8) {
            System.out.println("hôm nay đi học");
        }

        //câu if.. else
        //if(điều kiện){thực hiện logic1} else {thực hiện logic2}

        int a = 8;
        int b = 10;
        if (a > b) {
            System.out.println("số a lớn hơn số b");
        } else {
            System.out.println("số b lớn hơn số a");
        }

        //yêu cầu: viết chương cho phép người dùng nhập vào số tuổi, kiểm tra xem đã đủ tuổi học đại học chưa
        Scanner scanner = new Scanner(System.in); //dòng này cần thiết và quan trọng
//        System.out.println("Nhập số tuổi: ");
//        int tuoi = scanner.nextInt();
//        if( tuoi > 18){
//            System.out.println("đủ tuổi học đại học");
//        }else {
//            System.out.println("chưa 18");
//        }

        //toán tử 3 ngôi -> điều kiện ? thực hiện logic 1 : thc hiện logic  2
//        String result = (tuoi > 18) ? "đủ tuổi học đại học" : "chưa 18";
//        System.out.println(result);

        //if(điều kiện 1){thực hiện logic} else if(điều kiện 2){thực hiện logic 2} else{thực hiện logic 3}
//    int c = 10;
//    if(c == 10) {
//        System.out.println("số 10");
//    } else if ( c == 11) {
//        System.out.println("số 11");
//    } else if (c == 12) {
//        System.out.println("số 12");
//    } else {
//        System.out.println("vui lòng nhập lại số");
//    }
//viết chương trình kiểm tra học sinh, cho phép nhập vào điểm toán, lý, hoá, sau đó tính điểm trung bình. Nếu điểm trung bình < 5 -> học sinh yếu; 5.1 - 6: học sinh trung bình; 6.1 - 7: học sinh khá; 7.1-8: học sinh giỏi; 8.1-10: học sinh xuất sắc

//        System.out.println("Nhập tên: ");
//      String name = scanner.nextLine();
//
//      System.out.println("Nhập đểm toán: ");
//      float toan = scanner.nextFloat();
//      System.out.println("Nhập đểm lý: ");
//      float ly = scanner.nextFloat();
//      System.out.println("Nhập đểm hoá: ");
//      float hoa = scanner.nextFloat();
//
//      float diemTrungBinh = (toan + ly + hoa) / 3;
//
//        if(0 < diemTrungBinh && diemTrungBinh <= 5) {
//            System.out.println("yếu");
//        } else if (5.1 <= diemTrungBinh && diemTrungBinh <= 6) {
//            System.out.println("trung bình");
//        } else if (6.1 <= diemTrungBinh && diemTrungBinh <= 7) {
//            System.out.println("khá");
//        } else if (7.1 <= diemTrungBinh && diemTrungBinh <= 8) {
//            System.out.println("giỏi");
//        } else if (8.1 <= diemTrungBinh && diemTrungBinh <= 10) {
//            System.out.println("xuất sắc");
//        } else {
//            System.out.println("vui lòng nhập lại điểm");
//        }
////bài tập tính tiền điện
//
//        System.out.print("Nhập tên khách hàng: ");
//        String ten = scanner.nextLine();
//        System.out.print("Nhập số kWh tiêu thụ: ");
//        int kw = scanner.nextInt();
//        int tienDien = 0;
//
//        if (0 < kw && kw <= 50) {
//            tienDien = kw * 500;
//        } else if (50 < kw && kw <= 100) {
//            tienDien = 50 * 500 + (kw - 50) * 650;
//        } else if (100 < kw && kw <= 200) {
//            tienDien = 50 * 500 + 50 * 650 + (kw - 100) * 850;
//        } else if (200 < 200 && kw <= 350) {
//            tienDien = 50 * 500 + 50 * 650 + 100 * 850 + (kw - 200) * 1100;
//        } else if (kw > 350) {
//            tienDien = 50 * 500 + 50 * 650 + 100 * 850 + 150 * 1100 + (kw - 350) * 1300;
//        } else {
//            System.out.println("vui lòng nhập lại");
//        }
//        System.out.println("Khách hàng: " + ten + "có số tiền điện phải đóng là: " + tienDien);
//    }
//}

//        //switch case
//        switch (giá trị đem đi so sánh){
//            case giá trị so sánh
//                    thực hiện logic
//                    break

        int d = 15;
        switch (d){
            case 5:
                System.out.println("số 5");
                break;
            case 10:
                System.out.println("số 10");
                break;
            default:
                System.out.println("vui lòng kiểm tra lại");
        }

        // lưu ý: nên sử dụng switch case - giá so sánh là giá trị cụ thể, điều kiện đơn giản

    }
}
