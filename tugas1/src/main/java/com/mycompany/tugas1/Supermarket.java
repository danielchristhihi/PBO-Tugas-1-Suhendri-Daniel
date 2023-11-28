/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas1;

/**
 *
 * @author User
 */
public class Supermarket {
    public static void checkPembelian(Barang barang, int jumlahPembelian) throws PembelianException {
        if (barang.hargaJual <= 0) {
            throw new PembelianException("Harga jual harus lebih besar dari 0.");
        }

        if (jumlahPembelian < 1) {
            throw new PembelianException("Jumlah pembelian barang harus minimal 1.");
        }
    }
}