package com.BinhHu.AbstractExercise;

public class NhanVienFullTime  extends NhanVien{
    @Override
    protected String loaiNhanVien() {
        return "FULL_TIME";
    }

    @Override
    public void tinhLuong() {
        this.luong = Configs.LUONG_LAM_THEM_MOI_NGAY*this.ngayLamThem+Configs.LUONG_NHAN_VIEN_FULL_TIME_LINH;
    }
    private int loaiChucVu;
    private int ngayLamThem;

    public NhanVienFullTime(String ten,int loaiChucVu, int ngayLamThem) {
        super(ten);
        this.loaiChucVu =loaiChucVu;
        this.ngayLamThem = ngayLamThem;
    }
}
