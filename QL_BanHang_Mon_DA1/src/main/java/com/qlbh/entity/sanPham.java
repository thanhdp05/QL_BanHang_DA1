/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qlbh.entity;

import java.sql.Date;

/**
 *
 * @author ASUS
 */
public class sanPham {
    String maSP ;
    String tenSP ;
    String loaiSP ;
    String hangSP ;
    int soLuong ;
    double giaTien ;
    int size ;
    String hinh ;
    Date ngayTao ;
    String ghiChu ;
    String maNV ;

    public sanPham() {
    }

    public sanPham(String maSP, String tenSP, String loaiSP, String hangSP, int soLuong, double giaTien, int size, String hinh, Date ngayTao, String ghiChu, String maNV) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.loaiSP = loaiSP;
        this.hangSP = hangSP;
        this.soLuong = soLuong;
        this.giaTien = giaTien;
        this.size = size;
        this.hinh = hinh;
        this.ngayTao = ngayTao;
        this.ghiChu = ghiChu;
        this.maNV = maNV;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getLoaiSP() {
        return loaiSP;
    }

    public void setLoaiSP(String loaiSP) {
        this.loaiSP = loaiSP;
    }

    public String getHangSP() {
        return hangSP;
    }

    public void setHangSP(String hangSP) {
        this.hangSP = hangSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }
    
}
