/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal4;

/**
 *
 * @author ACER
 */
public class Balok {
    int panjang;
    int lebar;
    int tinggi;

    Balok(int panjangBaru, int lebarBaru, int tinggiBaru) {
        panjang = panjangBaru;
        lebar = lebarBaru;
        tinggi = tinggiBaru;
    }

    int getLuas() {
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }
    
    int getKeliling() {
        return 4 * (panjang + lebar + tinggi);
    }
    
    int getVolume() {
        return panjang * lebar * tinggi;
    }

    int getPanjang() {
        return panjang;
    }

    int getLebar() {
        return lebar;
    }
    
    int getTinggi() {
        return tinggi;
    }
}