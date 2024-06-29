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
public class hoaDon {
    int maHD ;
    int maND ;
    double tongTien ;
    Date ngayTao ;

    public hoaDon() {
    }

    public hoaDon(int maHD, int maND, double tongTien, Date ngayTao) {
        this.maHD = maHD;
        this.maND = maND;
        this.tongTien = tongTien;
        this.ngayTao = ngayTao;
    }

    public int getMaHD() {
        return maHD;
    }

    public void setMaHD(int maHD) {
        this.maHD = maHD;
    }

    public int getMaND() {
        return maND;
    }

    public void setMaND(int maND) {
        this.maND = maND;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }
    
}
