/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal4;
import soal4.Balok;
/**
 *
 * @author ACER
 */
public class Main {
   public static void main(String[] args) {
       
        Balok balok1 = new Balok(1, 1, 1);
        System.out.println("Balok dengan panjang : " + balok1.getPanjang() + 
                ", lebar = " + balok1.getLebar() + " dan tinggi : " + balok1.getTinggi() +
                ". Luasnya : " + balok1.getLuas()+" sedangkan\nKelilingnya : " +
                balok1.getKeliling() + " dan volumenya : "+ balok1.getVolume());
        System.out.println("");

        Balok balok2 = new Balok(30, 40, 50);
        System.out.println("Balok dengan panjang : " + balok2.getPanjang() + 
                ", lebar = " + balok2.getLebar() + " dan tinggi : " + balok2.getTinggi() +
                ". Luasnya : " + balok2.getLuas()+" sedangkan\nKelilingnya : " +
                balok1.getKeliling() + " dan volumenya : "+ balok2.getVolume());
        System.out.println("");

        Balok balok3 = new Balok(25, 35,45);
        System.out.println("Balok dengan panjang : " + balok3.getPanjang() + 
                ", lebar = " + balok3.getLebar() + " dan tinggi : " + balok3.getTinggi() +
                ". Luasnya : " + balok3.getLuas()+" sedangkan\nKelilingnya : " +
                balok1.getKeliling() + " dan volumenya : "+ balok3.getVolume());
    }
}