package onbai2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.baiThi2.entity.BaiHat;
import org.baiThi2.service.BaiHatService;

public class SanPhamServiceTest {
    private BaiHatService baiHatService;

    @BeforeEach
    public void setUp() {
        baiHatService = new BaiHatService();
    }

    // 1️⃣ Dưới biên dưới (1.99) — lỗi
    @Test
    public void testAddSong_ThoiLuong_DuoiBien() {
        BaiHat bh = new BaiHat("BH01", "Bài hát 1", "Ca sĩ A", 1.99f, "Pop");
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            baiHatService.addSong(bh);
        });
    }

    // 2️⃣ Biên dưới hợp lệ (2.00) — hợp lệ
    @Test
    public void testAddSong_ThoiLuong_BienDuoiHopLe() {
        BaiHat bh = new BaiHat("BH02", "Bài hát 2", "Ca sĩ B", 2.00f, "Pop");
        baiHatService.addSong(bh);
        Assertions.assertEquals(1, baiHatService.getDanhSachBaiHat().size());
    }

    // 3️⃣ Giá trị trong khoảng (5.59) — hợp lệ
    @Test
    public void testAddSong_ThoiLuong_GiaTriTrongKhoang() {
        BaiHat bh = new BaiHat("BH03", "Bài hát 3", "Ca sĩ C", 5.59f, "Pop");
        baiHatService.addSong(bh);
        Assertions.assertEquals(1, baiHatService.getDanhSachBaiHat().size());
    }

    // 4️⃣ Biên trên hợp lệ (5.99) — hợp lệ
    @Test
    public void testAddSong_ThoiLuong_BienTrenHopLe() {
        BaiHat bh = new BaiHat("BH04", "Bài hát 4", "Ca sĩ D", 5.99f, "Pop");
        baiHatService.addSong(bh);
        Assertions.assertEquals(1, baiHatService.getDanhSachBaiHat().size());
    }

    // 5️⃣ Trên biên trên (6.00) — lỗi
    @Test
    public void testAddSong_ThoiLuong_TrenBien() {
        BaiHat bh = new BaiHat("BH05", "Bài hát 5", "Ca sĩ E", 6.00f, "Pop");
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            baiHatService.addSong(bh);
        });
    }
}
