package com.example.demo.Entity;

import javax.persistence.*;

@Entity
@Table(name = "images")
public class Images extends BaseEntity{

    @Column
    private String tenAnh;

    @Column
    private String url;

    @ManyToOne
    @JoinColumn(name = "id_CuaHang")
    private CuaHang cuaHang;

    @ManyToOne
    @JoinColumn(name = "id_SanPham")
    private SanPham sanPham;
}
