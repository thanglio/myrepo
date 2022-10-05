package com.example.demo.Converter;

import com.example.demo.DTO.KhachHangDto;
import com.example.demo.Entity.KhachHang;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class KhachHangConverter {
    public KhachHangDto toDto(KhachHang khachHang) {
        KhachHangDto khachHangDto = new KhachHangDto();
        if (khachHang.getId() != null) {
            khachHangDto.setId(khachHang.getId());
        }
        khachHangDto.setTenKhachHang(khachHang.getTenKhachHang());
        khachHangDto.setNgaySinh(khachHang.getNgaySinh());
        khachHangDto.setGioiTinh(khachHang.getGioiTinh());
        khachHangDto.setDiaChi(khachHang.getDiaChi());
        khachHangDto.setGhiChu(khachHang.getGhiChu());
        khachHangDto.setSoDienThoai(khachHang.getSoDienThoai());
        khachHangDto.setKieuKhachHang(khachHang.getKieuKhachHang());

        khachHangDto.setCreatedDate(khachHang.getCreatedDate());
        khachHangDto.setCreatedBy(khachHang.getCreatedBy());
        khachHangDto.setModifiedDate(khachHang.getModifiedDate());
        khachHangDto.setModifiedBy(khachHang.getModifiedBy());
        return khachHangDto;
    }

    public KhachHang toKhachHang(KhachHangDto khachHangDto){
        KhachHang khachHang = new KhachHang();


        khachHang.setTenKhachHang(khachHangDto.getTenKhachHang());
        khachHang.setNgaySinh(khachHangDto.getNgaySinh());
        khachHang.setGioiTinh(khachHangDto.getGioiTinh());
        khachHang.setDiaChi(khachHangDto.getDiaChi());
        khachHang.setGhiChu(khachHangDto.getGhiChu());
        khachHang.setSoDienThoai(khachHangDto.getSoDienThoai());
        khachHang.setKieuKhachHang(khachHangDto.getKieuKhachHang());
        return khachHang;
    }

    public KhachHang toKhachHang(KhachHangDto khachHangDto, KhachHang khachHang){
        khachHang.setTenKhachHang(khachHangDto.getTenKhachHang());
        khachHang.setNgaySinh(khachHangDto.getNgaySinh());
        khachHang.setGioiTinh(khachHangDto.getGioiTinh());
        khachHang.setDiaChi(khachHangDto.getDiaChi());
        khachHang.setGhiChu(khachHangDto.getGhiChu());
        khachHang.setSoDienThoai(khachHangDto.getSoDienThoai());
        khachHang.setKieuKhachHang(khachHangDto.getKieuKhachHang());
        return khachHang;
    }
}
