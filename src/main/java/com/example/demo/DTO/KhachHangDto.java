package com.example.demo.DTO;

import com.example.demo.Entity.DiaChi;
import org.springframework.format.annotation.DateTimeFormat;


import java.util.Date;

public class KhachHangDto extends AbstractDto {

    private String tenKhachHang;

    private Date ngaySinh;

    private String gioiTinh;

    private String soDienThoai;

    private int kieuKhachHang; // true : khach si; false: khach Le

    private String ghiChu;

    private DiaChi diaChi;

    public String getTenKhachHang(String tenKhachHang) {
        return this.tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public int getKieuKhachHang() {
        return kieuKhachHang;
    }

    public void setKieuKhachHang(int kieuKhachHang) {
        this.kieuKhachHang = kieuKhachHang;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public DiaChi getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(DiaChi diaChi) {
        this.diaChi = diaChi;
    }
}
