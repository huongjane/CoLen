package org.baiThi2.utility;

public class MathUtility {
    public static String xepLoai(double diem) {
        if (diem < 0 || diem > 10)
            throw new IllegalArgumentException("Điểm phải từ 0 đến 10");
        if (diem >= 9) return "Xuất sắc";
        else if (diem >= 7) return "Giỏi";
        else if (diem >= 5) return "Trung bình";
        else return "Yếu";
    }
}
