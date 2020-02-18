package Menu_Kalkulasi;

import Menu_Makan.Makanan;
import Menu_Makan.Minuman;


import java.util.Scanner;

public class MainClass {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Makanan makanan = new Makanan();
        Minuman minuman = new Minuman();
        Kalkulasi kalkulasi = new Kalkulasi();
        char balik;
        do {
        System.out.println("Menu Burjo");
        System.out.println("1. Makanan");
        System.out.println("2. Minuman");
        System.out.println("3. Ga jadi beli");
        System.out.print("PILIH = ");
        int menu = input.nextInt();

        double akhirMinuman = 0;
        double akhirMakanan = 0;
        switch (menu) {
            case 1:
                System.out.println("Menu Makanan");
                System.out.print(" Bubur Kacang Ijo = ");
                int x = input.nextInt();
                System.out.print(" Indomie = ");
                int y = input.nextInt();
                akhirMakanan = makanan.total(x, y);

            case 2:
                System.out.println("Menu Minuman");
                System.out.print(" Es teh =");
                int p = input.nextInt();
                System.out.print(" Kopi = ");
                int q = input.nextInt();
                akhirMinuman = minuman.total(p, q);
                break;

            default:
                break;
        }
        System.out.println("Total Pembayaran : " + kalkulasi.kalkulasiAkhir(akhirMakanan, akhirMinuman));
        
        System.out.println("balik ke menu ? (y/t)");
        balik = input.next().charAt(0);
        } while (balik == 'y');

    }








}

