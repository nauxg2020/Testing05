package org.example;
import java.util.Scanner;

public class BaiTap2 {

    public static int tinhLuong(int tongGio, int tien) {
        return tongGio * tien;
    }

    static double diemTrungBinh(double diemToan, double diemLy, double diemHoa) {
        double dtb = (diemHoa + diemLy + diemToan) / 3;
        return dtb;
    }

    static String xepLoai(double dtb){
        String result = "";
        if(0 < dtb && dtb <= 5) {
            result = "Học sinh yếu";
        } else if (5.1 <= dtb && dtb <= 6) {
            result = "Học sinh trung bình";
        } else if (6.1 <= dtb && dtb <= 7) {
            result = "Học sinh khá";
        } else if (7.1 <= dtb && dtb <= 8) {
            result = "Học sinh giỏi";
        } else if (8.1 <= dtb && dtb <= 10) {
            result = "Học sinh xuất sắc";
        } else {
            result = "vui lòng nhập lại điểm";
        }
        return result;
    }

    public static void main(String[] args) {
//        //viết chương trình tính tiền lương, cho phép người dùng nhập vô số ngày làm và số tiền 1 ngày. biết tổng lương = số ngày làm * số tiền 1 ngày. Lưu ý: tách hàm ra xử lý
//        //mô hình IPO
//        //input
//        //giá trị từ phía người dùng nhập
//        //tổng số giờ làm, số lương 1 giờ
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập số giờ làm: ");
//        int tongGio = scanner.nextInt();
//        System.out.println("Nhập số lương một ngày: ");
//        int tien = scanner.nextInt();
//
//        //process
//        //giá trị từ người dùng nhập được thực hiện logic yêu cầu của bài toán
//        //tongLuong = tổng số giờ làm * số lương 1 giờ
//        int tongLuong = tinhLuong(tongGio, tien);
//
//        //output
//        //giá trị đầu ra ừ yêu cầu đề
//        //sout("...")
//        System.out.println("Tổng lương " + tongLuong);
//
//
//        //Viết chương trình đánh giá học sinh, cho phép nhập vào toán, lý, hoá. Tính điểm trung bình và đánh giá học sinh
//               < 5: học sinh yếu
//                5.1 - 6: học sinh trung bình
//                6.1 - 7: học sinh khá
//                7.1 - 8: học sinh giỏi
//                8.1 - 10: học sinh xuất sắc
//        Lưu ý: tách hàm tính điểm trung bình và tách hàm xếp loại
// input
            System.out.println("Nhập điểm toán: ");
            double diemToan = scanner.nextInt();
            System.out.println("Nhập điểm lý: ");
            double diemLy = scanner.nextInt();
            System.out.println("Nhập điểm hoá: ");
            double diemHoa = scanner.nextInt();

            //process
            double dtb = diemTrungBinh(diemToan, diemLy, diemHoa);
            String danhGia = xepLoai(dtb);

        System.out.println(danhGia);

    }
}
