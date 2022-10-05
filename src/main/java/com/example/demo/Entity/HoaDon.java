package com.example.demo.Entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "hoadon")
public class HoaDon extends BaseEntity {


    @Column
    private Long tongTien;

    @Column
    private String phuongThucThanhToan;

    @Column
    private String trangThaiThanhToan;

    @Column
    private byte loaiGiaoDich;

    @Column
    private String nguoiBan;

    //Hoa đơn n-1 Cửa Hàng
    @ManyToOne
    @JoinColumn(name = "idCuaHang")
    private CuaHang cuaHangx;

    //Hóa đơn n-1 Khách hàng
    @ManyToOne
    @JoinColumn(name = "idKhachHang")
    private KhachHang khachHangx;

    @OneToMany(mappedBy = "hoaDon")
    private Set<ChiTietHoaDon> chiTietHoaDons;

    public Long getTongTien() {
        return tongTien;
    }

    public void setTongTien(Long tongTien) {
        this.tongTien = tongTien;
    }

    public String getPhuongThucThanhToan() {
        return phuongThucThanhToan;
    }

    public void setPhuongThucThanhToan(String phuongThucThanhToan) {
        this.phuongThucThanhToan = phuongThucThanhToan;
    }

    public String getTrangThaiThanhToan() {
        return trangThaiThanhToan;
    }

    public void setTrangThaiThanhToan(String trangThaiThanhToan) {
        this.trangThaiThanhToan = trangThaiThanhToan;
    }

    public byte getLoaiGiaoDich() {
        return loaiGiaoDich;
    }

    public void setLoaiGiaoDich(byte loaiGiaoDich) {
        this.loaiGiaoDich = loaiGiaoDich;
    }

    public String getNguoiBan() {
        return nguoiBan;
    }

    public void setNguoiBan(String nguoiBan) {
        this.nguoiBan = nguoiBan;
    }

    public CuaHang getCuaHangx() {
        return cuaHangx;
    }

    public void setCuaHangx(CuaHang cuaHangx) {
        this.cuaHangx = cuaHangx;
    }

    public KhachHang getKhachHangx() {
        return khachHangx;
    }

    public void setKhachHangx(KhachHang khachHangx) {
        this.khachHangx = khachHangx;
    }

    public Set<ChiTietHoaDon> getChiTietHoaDons() {
        return chiTietHoaDons;
    }

    public void setChiTietHoaDons(Set<ChiTietHoaDon> chiTietHoaDons) {
        this.chiTietHoaDons = chiTietHoaDons;
    }
}
