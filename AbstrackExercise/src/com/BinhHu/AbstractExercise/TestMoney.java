package com.BinhHu.AbstractExercise;

public class TestMoney {
    public static void main(String[] args) {
        NhanVienFullTime nv1 = new NhanVienFullTime("Binh Hu",1,3);
        nv1.xuatThongTin();
        NhanVienPartTime nv2 = new NhanVienPartTime("Cau Vang",25);
        nv2.xuatThongTin();

    }
}
