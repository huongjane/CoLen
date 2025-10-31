package org.baiThi2.service;

import org.baiThi2.entity.BaiHat;

import java.util.ArrayList;
import java.util.List;

public class BaiHatService {
    private List<BaiHat> danhSachBaiHat = new ArrayList<>();

    public List<BaiHat> getDanhSachBaiHat() {
        return danhSachBaiHat;
    }

    public void addSong(BaiHat bh) {
        if (bh == null) {
            throw new IllegalArgumentException("Đối tượng bài hát không được null");
        }

        if (bh.getMa() == null || bh.getMa().isEmpty()
                || bh.getTen() == null || bh.getTen().isEmpty()
                || bh.getCaSi() == null || bh.getCaSi().isEmpty()
                || bh.getTheLoai() == null || bh.getTheLoai().isEmpty()) {
            throw new IllegalArgumentException("Các trường không được để trống");
        }

        if (bh.getThoiLuong() < 2.00f || bh.getThoiLuong() > 5.99f) {
            throw new IllegalArgumentException("Thời lượng phải nằm trong khoảng 2:00 - 5:59 phút");
        }

        danhSachBaiHat.add(bh);
    }
}
