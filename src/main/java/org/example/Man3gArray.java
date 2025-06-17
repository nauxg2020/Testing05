package org.example;

public class Man3gArray {
    public static void main(String[] args) {
//        int num1 = 10;
//        int num2 = 20;
        //khởi tạo giá trị
        int[] numbers = {10, 20, 30, 40}; //ây là mảng
        String[] name = {"Nguyệt", "Denis", "Sushi"};
        //                  0         1        2
        System.out.println(name[1]);
        name[2] = "Lu";
        System.out.println(name[2]);

        //chiều dài mảng
        int length = name.length;
        System.out.println("chiều dài mảng: " + length);

        //duyệt mảng
        for(int i = 0; i < name.length; i++){
            System.out.println("Tên thứ: " + (i+1) + ": " +name[i]);
        }

        //duyệt mảng dùng vỏng lặp for-each (cxhi3 dùng trong mảng)
        for(int number: numbers){ //số là int, tên là String
            System.out.println(number);
        }
        //nâng cao: duyệt mảng ngược
        for(int index = numbers.length - 1; index >= 0; index-- ){
            System.out.println(numbers[index]);
        }
    }
}
