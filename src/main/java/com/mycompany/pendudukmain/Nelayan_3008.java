/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pendudukmain;

/**
 *
 * @author user
 */
public class Nelayan_3008 extends Penduduk_3008 {
    private int JmlBeratIkan;
    private int JmlSolar;
    
    public Nelayan_3008(){
        
    }
    
    public void setJmlBeratIkan(int BeratIkan) {
        JmlBeratIkan = BeratIkan;
    }
    
    public void setJmlSolar(int Solar){
        JmlSolar = Solar;
    }
    
    public int getJmlBeratIkan() {
        return JmlBeratIkan;
    }
    
    public int getJmlSolar() {
        return JmlSolar;
    }
    
    public double PendapatanNelayan(){
        return (JmlBeratIkan * 8000) - (JmlSolar * 10000);
    }
    
    public void TampilNelayan(){
        System.out.println();
        System.out.println("Data Nelayan");
        TampilDataPenduduk();
        System.out.println("Jumlah Berat Ikan: " + JmlBeratIkan);
        System.out.println("Jumlah Solar Dipakai: " + JmlSolar);
        System.out.println("Total Pendapatan: " + PendapatanNelayan());
    }
}
