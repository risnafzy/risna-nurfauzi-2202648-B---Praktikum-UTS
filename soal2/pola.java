/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal2;

/**
 *
 * @author ACER
 */
public class pola {
    public static void main(String[] args) {
        int rows = 6;

        System.out.println("Pattern A:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Pattern B:");
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Pattern C:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Pattern D:");
        for (int i = 1; i <= rows; i++) {
        // Mencetak spasi sebanyak i - 1
        for (int j = 1; j < i; j++) {
            System.out.print("  ");
        }
        // Mencetak angka dari 1 sampai rows - i + 1
        for (int k = 1; k <= rows - i + 1; k++) {
            System.out.print(k + " ");
        }
        System.out.println();
        }
    }
}
