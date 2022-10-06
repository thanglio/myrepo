package com.example.demo.Service.ImplementService;

import com.example.demo.Converter.KhachHangConverter;
import com.example.demo.DTO.KhachHangDto;
import com.example.demo.Entity.KhachHang;
import com.example.demo.Repository.KhachHangRepo;
import com.example.demo.Service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class KhachHangServiceImplement implements KhachHangService {
    @Autowired
    public KhachHangRepo khachHangRepo;
    @Autowired
    public KhachHangConverter khachHangConverter;

    @Override
    public List<KhachHangDto> findAll() {
        List<KhachHangDto>  listKhachHangDTO= new ArrayList<>();
        List<KhachHang> listKhachHang= khachHangRepo.getgetAllKhachHang();
        for (int i=0;i<listKhachHang.size();i++)
            listKhachHangDTO.add(khachHangConverter.toDto(listKhachHang.get(i)));
        return listKhachHangDTO;
    }

    @Override
    public KhachHangDto save(KhachHangDto khachHangDto) {
        KhachHang khachHang = new KhachHang();
        if(khachHangDto.getId() != null){
            KhachHang oldKhachHang = khachHangRepo.findById(khachHangDto.getId()).get();
            khachHang=khachHangConverter.toKhachHang(khachHangDto,khachHang);
        }else  khachHang = khachHangConverter.toKhachHang(khachHangDto);
        khachHangRepo.save(khachHang);
        return khachHangDto;
    }

    @Override
    public void delete(long[] ids) {
        for(long item: ids) {
            khachHangRepo.deleteById(item);
        }
    }


}
