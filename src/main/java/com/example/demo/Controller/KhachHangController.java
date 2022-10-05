package com.example.demo.Controller;

import com.example.demo.DTO.KhachHangDto;
import com.example.demo.Service.ImplementService.KhachHangServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class KhachHangController {
    @Autowired
    KhachHangServiceImplement khachHangServiceImplement;

    @GetMapping()
    public List<KhachHangDto> getAllKhachHang(){
        return khachHangServiceImplement.findAll();
    }

    @PostMapping()
    public KhachHangDto addKhachHang(@RequestBody KhachHangDto dto){
        khachHangServiceImplement.save(dto);
        return dto;
    }
    @PutMapping(value = "{id}")
    public KhachHangDto updateKhachHang(@RequestBody KhachHangDto khachHangDto,@PathVariable("id") Long id){
        khachHangDto.setId(id);
        return khachHangServiceImplement.save(khachHangDto);
    }
    @DeleteMapping()
    public void deleteKhachHang(@RequestBody long[] ids) {
        khachHangServiceImplement.delete(ids);
    }
   
}
