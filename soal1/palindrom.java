/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal1;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class palindrom {
    public static boolean isPalindrome(int number) {
        String numStr = String.valueOf(number);
        return numStr.equals(new StringBuilder(numStr).reverse().toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan tiga digit integer : ");
        int num = scanner.nextInt();

        if (num < 100 || num > 999) {
            System.out.println("error!");
            return;
        }

        if (isPalindrome(num)) {
            System.out.println(num + " adalah palindrom.");
        } else {
            System.out.println(num + " bukan palindrom.");
        }

        scanner.close();
    }
}
