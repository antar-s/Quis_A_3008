/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pendudukmain;

/**
 *
 * @author user
 */
public class Dokter_3008 extends Penduduk_3008 {
    private int JmlPasien;
    private int JmlObat;
    
    public Dokter_3008(){
        
    }
    
    public void setJmlPasien(int Pasien) {
        JmlPasien = Pasien;
    }
    
    public void setJmlObat(int Obat){
        JmlObat = Obat;
    }
    
    public int getJmlPasien() {
        return JmlPasien;
    }
    
    public int getJmlObat() {
        return JmlObat;
    }
    
    public double PendapatanDokter(){
        return (JmlPasien * 50000)+(JmlObat * 10000);
    }
    
    public void TampilDokter(){
        System.out.println();
        System.out.println("Data Dokter");
        TampilDataPenduduk();
        System.out.println("Jumlah Pasien: " + JmlPasien);
        System.out.println("Jumlah Obat: " + JmlObat);
        System.out.println("Total Pendapatan: " + PendapatanDokter());
    }
}
