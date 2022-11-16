/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pendudukmain;

/**
 *
 * @author user
 */
public class Penduduk_3008 {

    protected String NIK;
    protected String Nama;
    protected int Umur;
    protected String Alamat;
    
    public void setNIK(String nik){
        NIK = nik;
    }
    
    public void setNama(String nama){
        Nama = nama;
    }
    
    public void setUmur(int umur){
        Umur = umur;
    }
    
    public void setAlamat(String alamat){
        Alamat = alamat;
    }
    
    public String getNIK(){
        return NIK;
    }
    
    public String getNama(){
        return Nama;
    }
    
    public int getUmur(){
        return Umur;
    }
    
    public String getAlamat(){
        return Alamat;
    }

    public void TampilDataPenduduk() {
            System.out.println("NIK: " + NIK);
            System.out.println("Nama: " + Nama);
            System.out.println("Umur: " + Umur);
            System.out.println("Alamat: " + Alamat);
    }
}
