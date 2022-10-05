package com.example.demo.Entity;


import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "sanpham")
public class SanPham extends BaseEntity {


    @Column
    private String tenSanPham;

    @Column
    private int soLuong;

    @Column
    private int giaNhap;

    @Column
    private int giaBan;

    @Column
    private int giamGia;

    @Column
    private int idNguon;

    @Column
    private String thongTin;

    @Column
    @DateTimeFormat(pattern = "MM/dd/YYYY ")
    private Date ngaySanXuat;

    @Column
    @DateTimeFormat(pattern = "MM/dd/YYYY")
    private Date hanSuDung;

    @ManyToOne
    @JoinColumn(name = "id_cua_hang")
    private CuaHang cuaHang;

    @OneToMany(mappedBy = "sanPham")
    private Set<Images> imagesSet;

    @ManyToOne
    @JoinColumn(name = "id_loai_san_pham")
    private LoaiSanPham loaiSanPham;
}
