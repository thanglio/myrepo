package com.example.demo.Entity;


import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "khach_hang")
public class KhachHang extends BaseEntity{

    @Column
    private String tenKhachHang;

    @Column
    @DateTimeFormat(pattern = "MM/dd/YYYY ")
    private Date ngaySinh;

    @Column
    private String gioiTinh;

    @Column
    private String soDienThoai;

    @Column
    private int kieuKhachHang; // true : khach si; false: khach Le

    @Column
    private String ghiChu;

    @ManyToOne
    @JoinColumn(name = "id_diachi")
    private DiaChi diaChi;


    public String getTenKhachHang() {
        return tenKhachHang;
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

