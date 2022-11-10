package com.pbo4;

public class Mahasiswa extends Elemen{
    private int sks;

    public Mahasiswa(int sks) {
        this.sks = sks;
    }

    public int getJamSibuk() {
        return this.sks * 3;
    }

    @Override
    String getNama(String nama) {
        return nama + " adalah seorang mahasiswa dengan jam sibuk ";
    }
}
