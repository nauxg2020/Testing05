package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //snippet
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //lệnh xuất
        System.out.printf("Hello Testing05!");

        //snippet lệnh xuất - gõ sout
        System.out.println("hello Cybersoft");

        //comment nhanh - ctrl + / hoặc macbook command + /

        //lệnh nhập
        Scanner scanner = new Scanner(System.in);

        //Biến - nơi lưu tữ dữ liệu
        // <kiểu dữ lệu> <tên biến> = <giá trị khởi tạo>

        // kiểu dữ liệu dạng primative value: byte, short, int, long, float, string, boolean, double...
        //kiểu dữ liệu tham chếu: string, array, class object và interface

        int age = 18;
        double salary = 1500.15;
        // char name = "Nguyệt";
        String name1 = "Nguyệt";
        boolean isLogin = true; //false

        //hằng số - giá trị không đổi
        final double pi = 3.14759;

        //yêu cầu: cho phép người dùng vào tên mình và xuất ra  màn hình

        // ô nhập
        System.out.println("Nhập tên ngời dùng: ");
        //nhận giá trị từ người dùng nhập và gắn vào biến
        String name = scanner.nextLine();
        System.out.println("Xin chào " + name);

        //yêu cầu: viết chương trình cho sinh viên nhập vào tên và lớp, lớp và tuổi(scanner.nextInt()) và in ra màn hình

//        System.out.println("Nhập tên người dùng: ");
//        String ten = scanner.nextLine();

//        System.out.println("Nhập lớp: ");
//        String lop = scanner.nextLine();
//
//        System.out.println("Nhập số tuổi: ");
//        int tuoi = scanner.nextInt();

//        System.out.println("Xin chào " + ten + ", " + "Hiện đang " + tuoi + " tuổi" + ", " + "Học lớp " + lop);


        //Quy tắc ặt tên biến
        //bắt buộc bắt đầu bằng chữ cái, không đc bắt đu bằng số, không được viết có dấu tiếng việt
        // k được đặt trùng với từ khoá của java (public, class, void, static,...)
        //Đặt tên theo quy tắc camel case => hoten - hoTen, tongluong - tongLuong
        }
}