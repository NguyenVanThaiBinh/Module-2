package com.BinhHu.AbstractExercise;

public class NhanVienPartTime extends NhanVien {
    private int gioLamViec;

    public NhanVienPartTime(String ten,int gioLamViec) {
        super(ten);
        this.gioLamViec = gioLamViec;
    }

    @Override
    protected String loaiNhanVien() {
        return "NHAN_VIEN_PART_TIME";
    }

    @Override
    public void tinhLuong() {
    this.luong= Configs.LUONG_NHAN_VIEN_PART_TIME_MOI_GIO*gioLamViec;
    }
}
