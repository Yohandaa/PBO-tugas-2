package com.pbo4;

public class Dosen extends Elemen{
    private int jumlahHariKerja;

    public Dosen(int jumlahHariKerja) {
        this.jumlahHariKerja = jumlahHariKerja;
    }

    public int getJamSibuk() {
        return jumlahHariKerja * 8;
    }

    //mengimplementasikan "ulang" method pada child class yang dimana method tersebut sudah didefinisikan pada parent class
    @Override
    String getNama(String nama) {
        return nama + " adalah seorang dosen dengan jam sibuk ";
    }

}
