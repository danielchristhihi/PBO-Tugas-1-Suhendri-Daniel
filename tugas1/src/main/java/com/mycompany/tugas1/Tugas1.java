/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas1;

import static com.mycompany.tugas1.FileReaderExample.bacaFile;
import static com.mycompany.tugas1.Supermarket.checkPembelian;

/**
 *
 * @author User
 */
public class Tugas1 {

    public static void main(String[] args) {
        // Contoh penggunaan
        Barang barang1 = new Barang("001", "Sabun", "Gudang A", 5.0, 10.0);
        int jumlahPembelian1 = 5;

        try {
            checkPembelian(barang1, jumlahPembelian1);
            System.out.println("Pembelian barang sukses!");
        } catch (PembelianException e) {
            System.out.println("Error: " + e.getMessage());
        }

        Barang barang2 = new Barang("002", "Shampoo", "Gudang B", -2.0, 3.0);
        int jumlahPembelian2 = 0;

        try {
            checkPembelian(barang2, jumlahPembelian2);
            System.out.println("Pembelian barang sukses!");
        } catch (PembelianException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

    public static void main(String[] args) {
        String fileName = "nonexistent_file.txt"; // Ganti dengan nama file yang ada di sistem Anda

        String fileContent = bacaFile(fileName);

        if (fileContent != null) {
            System.out.println("Isi file:\n" + fileContent);
        } else {
            System.out.println("File tidak ditemukan atau terjadi kesalahan.");
        }
    }
}

    public static void main(String[] args) {
        String fileName = "nonexistent_file.txt"; // Ganti dengan nama file yang ada di sistem Anda

        String fileContent = bacaFile(fileName);

        if (fileContent != null) {
            System.out.println("Isi file:\n" + fileContent);
        } else {
            System.out.println("File tidak ditemukan atau terjadi kesalahan.");
        }
    }
}
