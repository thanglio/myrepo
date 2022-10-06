package com.example.demo.Repository;

import com.example.demo.Entity.KhachHang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface KhachHangRepo extends JpaRepository<KhachHang,Long> {
    @Query(value = "SELECT * FROM khach_hang",
            nativeQuery = true)
    public List<KhachHang> getgetAllKhachHang();
    
}
