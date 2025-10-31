package onbai2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.baiThi2.utility.MathUtility;

public class MathUtilityTest {

    @Test
    void testDiem49Yeu() {
        assertEquals("Yếu", MathUtility.xepLoai(4.9));
    }

    @Test
    void testDiem50TrungBinh() {
        assertEquals("Trung bình", MathUtility.xepLoai(5.0));
    }

    @Test
    void testDiem69TrungBinh() {
        assertEquals("Trung bình", MathUtility.xepLoai(6.9));
    }

    @Test
    void testDiem70Gioi() {
       assertEquals("Giỏi", MathUtility.xepLoai(7.0));
    }

    @Test
    void testDiem90XuatSac() {
        assertEquals("Xuất sắc", MathUtility.xepLoai(9.0));
    }
}
