/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pendudukmain;

/**
 *
 * @author user
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PendudukMain_3008 {

    public static void main(String[] args) {
        System.out.println("Input Data Penduduk");
        Nelayan_3008 n = new Nelayan_3008();
        Dokter_3008 d = new Dokter_3008();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.print("NIK: ");
            n.setNIK(br.readLine());
            System.out.print("Nama: ");
            n.setNama(br.readLine());
            System.out.print("Umur: ");
            n.setUmur(Integer.parseInt(br.readLine()));
            System.out.print("Alamat: " );
            n.setAlamat(br.readLine());
            System.out.print("Jumlah Berat Ikan: ");
            n.setJmlBeratIkan(Integer.parseInt(br.readLine()));
            System.out.print("Jumlah Solar Dipakai: ");
            n.setJmlSolar(Integer.parseInt(br.readLine()));
            n.TampilNelayan();
            
            System.out.println();
            System.out.print("NIK: ");
            d.setNIK(br.readLine());
            System.out.print("Nama: ");
            d.setNama(br.readLine());
            System.out.print("Umur: ");
            d.setUmur(Integer.parseInt(br.readLine()));
            System.out.print("Alamat: " );
            d.setAlamat(br.readLine());
            System.out.print("Jumlah Pasien: ");
            d.setJmlPasien(Integer.parseInt(br.readLine()));
            System.out.print("Jumlah Obat: ");
            d.setJmlObat(Integer.parseInt(br.readLine()));
            d.TampilDokter();
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}
