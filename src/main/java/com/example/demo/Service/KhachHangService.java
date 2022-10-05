package com.example.demo.Service;

import com.example.demo.DTO.KhachHangDto;
import com.example.demo.Entity.KhachHang;

import java.util.List;

public interface KhachHangService {
    public List<KhachHangDto> findAll();
    public KhachHangDto save(KhachHangDto khachHangDto);
    public void delete(long[] ids);
}
