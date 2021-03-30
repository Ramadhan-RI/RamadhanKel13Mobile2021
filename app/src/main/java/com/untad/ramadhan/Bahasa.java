package com.untad.ramadhan;

public class Bahasa {
    private String nama;
    private String deskripsi;
    private int bahasaImageId;

    public Bahasa(String nama, String deskripsi, int bahasaImageId) {
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.bahasaImageId = bahasaImageId;
    }

    public String getNama() {
        return nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public int getBahasaImageId() {
        return bahasaImageId;
    }
}
