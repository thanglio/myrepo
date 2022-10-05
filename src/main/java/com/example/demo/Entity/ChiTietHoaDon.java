package com.example.demo.Entity;

import javax.persistence.*;

@Entity
@Table(name = "chi_tiet_hoa_don")
public class ChiTietHoaDon  extends  BaseEntity{

    @Column
    private int idSanPham;

    @Column
    private int soLuong;

    // Giảm giá cho từng sản phẩm
    @Column
    private int giamGia;

    @Column
    private int tongTien;

    @ManyToOne
    @JoinColumn(name = "id_hoadon")
    private HoaDon hoaDon;


}
