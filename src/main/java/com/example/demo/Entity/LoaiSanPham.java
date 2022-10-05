package com.example.demo.Entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "loai_san_pham")
public class LoaiSanPham extends BaseEntity{

    @Column
    private String tenLoai;

    @Column
    private String thongTin;

    @OneToMany(mappedBy = "loaiSanPham")
    private Set<SanPham> sanPhams;

    @ManyToMany
    @JoinTable(name = "cuahang_loaisanpham",
            joinColumns = {
                    @JoinColumn(name = "loaisanpham_id", referencedColumnName = "id",
                            nullable = false, updatable = false)},
            inverseJoinColumns = {
                    @JoinColumn(name = "cuahang_id", referencedColumnName = "id",
                            nullable = false, updatable = false)})
    private Set<CuaHang> cuaHangs;
}
