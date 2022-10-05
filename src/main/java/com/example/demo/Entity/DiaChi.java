package com.example.demo.Entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "dia_chi")
public class DiaChi extends BaseEntity{

    @Column
    private String tinh;

    @Column
    private String huyen;

    @Column
    private String xa;

    @OneToMany(mappedBy = "diaChi")
    private Set<CuaHang> cuaHangs;

    @OneToMany(mappedBy = "diaChi")
    private Set<KhachHang> khachHangs;



}

