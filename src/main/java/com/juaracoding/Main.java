package com.juaracoding;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ATM atm = new ATM(1000);

        //Perulangan untuk kembali ke menu utama
        while (true){
            System.out.print("pilih opsi yang ingin anda pilih: \n1. lihat Saldo \n2. Setor Uang \n3. Tarik Uang \n4. Keluar \nSilahkan Masukkan pilihan: ");
            int pilihan = scanner.nextInt();

            //Percabangan untuk memilih pilihan transaksi
            if (pilihan == 1){
                System.out.println("Saldo anda sekarang: ");
                System.out.println(atm.lihatSaldo());
            }
            else if (pilihan == 2) {
                System.out.print("Masukkan Jumlah Setoran: ");
                double setoranUang = scanner.nextDouble();
                atm.setorUang(setoranUang);
                System.out.println("Saldo anda sekarang: " + atm.lihatSaldo());
            }
            else if (pilihan == 3) {
                System.out.print("Masukkan Jumlah Penarikan: ");
                double penarikanUang = scanner.nextDouble();
                atm.tarikUang(penarikanUang);
                System.out.println("Saldo anda sekarang: " + atm.lihatSaldo());
            }
            else if (pilihan == 4){
                System.out.println("Terimakasih sudah bertransaksi");
                break;
            }
            else {
                System.out.println("Pilihan anda salah silahkan ulangi");
            }
        }
    }


}