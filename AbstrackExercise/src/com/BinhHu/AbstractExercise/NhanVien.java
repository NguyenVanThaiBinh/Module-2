package com.BinhHu.AbstractExercise;

 abstract class NhanVien {
     public NhanVien() {
     }

     protected String ten;

     public NhanVien(String ten) {
         this.ten = ten;
     }

     protected long luong;
     protected abstract String loaiNhanVien();
     public abstract void tinhLuong();
     public void xuatThongTin(){
         tinhLuong();
         System.out.println("Nhan vien: "+this.ten);
         System.out.println("Loai nhan vien: "+loaiNhanVien());
         System.out.println("Luong: "+this.luong+"$");
     }

}
