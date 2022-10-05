package com.example.demo.Entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "cua_hang")
public class CuaHang extends  BaseEntity{


    @Column
    private String tenCuaHang;

    @Column
    private String tenChuCuaHang;

    @Column
    private String soDienThoai;

    @Column
    private String email;

    @Column
    private byte capBac;

    @Column
    private String thongTinCuaHang;

    @Column
    private int idKhachHang;

    //Cua hang n-1 Dia Chi
    @ManyToOne
    @JoinColumn(name = "id_diachi")
    private DiaChi diaChi;

    //Cửa Hàng  1-n Hóa đơn
    @OneToMany(mappedBy = "cuaHangx")
    private Set<HoaDon> hoaDons;

    //Cửa hàng 1-n Sản phẩm
    @OneToMany(mappedBy = "cuaHang")
    private Set<SanPham> sanPhams;

    @OneToMany(mappedBy = "cuaHang")
    private Set<Images> images;

    @ManyToMany(mappedBy = "cuaHangs")
    private Set<LoaiSanPham> loaiSanPhams;


}
