/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119010.latihan45.cetaknama;

import java.util.Scanner;

/**
 *
 * @author Maulana Imam Malik
 * NAMA     : Maulana Imam Malik
 * KELAS    : IF1
 * NIM      : 10119010
 * Deskripsi Program : Program ini berisi program untuk menampilkan nama sebanyak
 *                     yang di tentukan dengan konsep OOP
 */
public class IF110119010Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Printer cetakNama = new Printer();
        
        System.out.println("=====Aplikasi Pencetak Nama=====");
        System.out.print("Masukkan nama anda : ");
        String inputNama = "";
        inputNama+=scanner.nextLine();
        cetakNama.setNama(inputNama);
        String nama = cetakNama.getNama();
        
        System.out.print("Mau cetak nama berapa kali? : ");
        cetakNama.setJmlCetak(scanner.nextInt());
        int jmlCetak = cetakNama.getJmlCetak();
        scanner.close();
        
        cetakNama.cetak(nama);
        cetakNama.cetak(jmlCetak, nama);
    }
    
}
