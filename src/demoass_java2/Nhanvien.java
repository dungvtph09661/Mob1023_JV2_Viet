
package demoass_java2;

import java.io.Serializable;



public class Nhanvien implements Serializable{
    private String manv;
    private String hoten;
    private int tuoi;
    private String emali;
    private double luong;

    public Nhanvien() {
    }

    public Nhanvien(String manv, String hoten, int tuoi, String emali, double luong) {
        this.manv = manv;
        this.hoten = hoten;
        this.tuoi = tuoi;
        this.emali = emali;
        this.luong = luong;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getEmali() {
        return emali;
    }

    public void setEmali(String emali) {
        this.emali = emali;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "Nhanvien{" + "manv=" + manv + ", hoten=" + hoten + ", tuoi=" + tuoi + ", emali=" + emali + ", luong=" + luong + '}';
    }
    
    
}
