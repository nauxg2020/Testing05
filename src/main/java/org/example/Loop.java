package org.example;
import java.util.Scanner;
public class Loop {
    public static void main(String[] args) {
//        System.out.println("hello");
//        System.out.println("hello");
//        System.out.println("hello");
//        System.out.println("hello");
//        System.out.println("hello");
        // vòng lặp while
//        giá trị ban đầu
//                while(điều kiện){
//                    thực hiện logic
//                    thay đổi giá trị ban đầu
        //yêu cu: in ra 5 dòng hello
//        int i = 1; //giá trị ban đầu
//        while (i <= 5) { // điều kiện thực hiện vòng lặp
//            System.out.println("hello"); //thực hiện yêu cầu
//            i++; // i = i +1 hoặc 1 +=1     thay đổi giá trị ban đầu
//        }
//        //yêu cầu: viết chương trình cho php người dùng nhập số n, in ra giao diện n lần dòng Hello testing 05
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("nhập vô số lần: ");
//        int soLan = scanner.nextInt();
//
//        int lan = 1;
//        while (lan <= soLan) {
//            System.out.println("hello testing 05");
//            lan++;
//        }

        // vòng lặp do...while
        // giá trị ban đầu
        // do{
        // thực hiện logic
        //
        // làm thay đổi giá tri ban đầu
        // }while( điều kiện)

        int index = 1;
        do {
            System.out.println("Giá trị i " + index);
            index++;
        } while (index <= 5);

        // vòng lặp for
        //for( giá trị khởi tạo: điều kiện; cập nật giá trị khởi tạo)

        for (int j = 1; j <= 5; j++) {
            System.out.println("Giá trị j: " + j);
        }

        Scanner scanner = new Scanner(System.in);
        //bài tập 1: viết chương trình cho phép người dùng nhập vào số N. tính tổng số từ 1 đến N
        System.out.println("Nhập vào số N: ");
        int N = scanner.nextInt();
        int tong = 0;
        for (int k = 0; k <= N; k++){
           tong += k;
        }
        System.out.println("Tổng N = " + tong);

        //bài tập 2: viết chương trình cho phép người dùng nập vàoso61o61 n. tính tổng số chẵn từ 0 đến n
        System.out.println("Nhập vào số chẵn n: ");
        int n2 = scanner.nextInt();
        int tong2 = 0;
//        for (int k = 0; k <= n2; k++) {
//            if (k % 2 == 0) {
//                tong2 += k;
//            }
//        }
        // tổng chẵn
        for(int k = 0; k <= n2; k+=2){
            tong2 += k;
        }
        System.out.println("Tổng n = " + tong2);
        //chia hết cho 3 => for(int k = 3; k <= n; k +=3){}
    }
}


