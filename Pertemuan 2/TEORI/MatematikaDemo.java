/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematikademo;

public class MatematikaDemo {
    public static void main(String[] args) {
        matematika hitung = new matematika();
        hitung.pertambahan(20, 20);
        hitung.pengurangan(10, 5);
        hitung.perkalian(10, 20);
        hitung.pembagian(20, 2);
    }
}

class matematika {
    matematika() {

    }

    public void pertambahan(int num1, int num2) {
        int hasil = num1 + num2;
        System.out.println("Pertambahan: " + num1 + " + " + num2 + " = " + hasil);
    }

    public void pengurangan(int num1, int num2) {
        int hasil = num1 - num2;
        System.out.println("Pengurangan: " + num1 + " - " + num2 + " = " + hasil);
    }

    public void perkalian(int num1, int num2) {
        int hasil = num1 * num2;
        System.out.println("Perkalian: " + num1 + " x " + num2 + " = " + hasil);
    }

    public void pembagian(int num1, int num2) {
        int hasil = num1 / num2;
        System.out.println("Pembagian: " + num1 + " / " + num2 + " = " + hasil);
    }
}