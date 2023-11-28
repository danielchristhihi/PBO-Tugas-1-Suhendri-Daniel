/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas1;

/**
 *
 * @author User
 */
public class Barang {
    String kodeBarang;
    String namaBarang;
    String gudang;
    double hargaBeli;
    double hargaJual;

    public Barang(String kodeBarang, String namaBarang, String gudang, double hargaBeli, double hargaJual) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.gudang = gudang;
        this.hargaBeli = hargaBeli;
        this.hargaJual = hargaJual;
    }
}