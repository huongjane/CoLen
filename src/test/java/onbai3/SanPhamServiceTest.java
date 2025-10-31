package onbai3;

import org.baiThi3.entity.SanPham;
import org.baiThi3.service.SanPhamService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SanPhamServiceTest {

    private SanPhamService service;

    @BeforeEach
    void init() {
        service = new SanPhamService();
    }

    @Test
    void add_ValidBoundaryLower_shouldPass() {
        SanPham sp = new SanPham("SP1", "Ao", 2025, 100_000, 1, "Thoi trang");
        service.add(sp);
        assertTrue(service.existsByMa("SP1"));
    }

    @Test
    void add_ValidBoundaryUpper_shouldPass() {
        SanPham sp = new SanPham("SP2", "Ao2", 2025, 100_000, 100, "Thoi trang");
        service.add(sp);
        assertEquals(1, service.size());
    }

    @Test
    void add_InvalidBelowLower_shouldThrow() {
        SanPham sp = new SanPham("SP3", "Ao3", 2025, 100_000, 0, "Thoi trang");
        assertThrows(IllegalArgumentException.class, () -> service.add(sp));
    }

    @Test
    void add_InvalidAboveUpper_shouldThrow() {
        SanPham sp = new SanPham("SP4", "Ao4", 2025, 100_000, 101, "Thoi trang");
        assertThrows(IllegalArgumentException.class, () -> service.add(sp));
    }

    @Test
    void add_DuplicateMa_shouldThrow() {
        SanPham a = new SanPham("SP5", "Ao5", 2025, 100_000, 10, "Thoi trang");
        SanPham b = new SanPham("SP5", "Ao5-b", 2025, 100_000, 10, "Thoi trang");
        service.add(a);
        assertThrows(IllegalArgumentException.class, () -> service.add(b));
    }

    @Test
    void add_BlankTen_shouldThrow() {
        SanPham sp = new SanPham("SP6", "  ", 2025, 100_000, 10, "Thoi trang");
        assertThrows(IllegalArgumentException.class, () -> service.add(sp));
    }
}
