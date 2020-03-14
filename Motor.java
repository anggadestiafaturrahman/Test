package com.belajar;

public class Motor {
    private String warna;

    public void jalankan(){
        System.out.println("Masukkan gigi 1,lepaskan kopling sambil tekan gas");
    }
    public void setWarna(String warna){
        this.warna=warna;
    }
    public String getWarna(){
        return this.warna;
    }
}
