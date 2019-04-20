import entity.*;
import service.*;
import java.util.*;

public class Aplikasi {

    private static ServiceServismtr service;
    private static Scanner scanner;

    public static void main(String[] args){
        service = new ServiceServismtr();

        int opsi = 5;
        do {
            cetakMenu();
            scanner = new Scanner(System.in);
            try {
                opsi = scanner.nextInt();
            }catch(Exception e){
                System.err.println("Tolong di cek inputnya mas/mba");
                opsi = 0;
            }
            prosesMenu(opsi);
        } while (opsi !=5);
    }

    private static void prosesMenu(int opsi) {
        switch (opsi){
            case 1 :
                formTambahData();
                break;
            case 2 :
                formUbahData();
                break;
            case 3 :
                formHapusData();
                break;
            case 4 :
                service.cetakData();
                break;
        }
    }

    private static void formHapusData(){
        System.out.println("\nForm Hapus Data");
        scanner = new Scanner(System.in);
        System.out.print("ID : ");
        String id = scanner.nextLine();
        service.hapusData(id);
    }

    private static void formUbahData(){
        String id, pemilik, merk;
        System.out.println("\nForm Ubah Data");
        scanner = new Scanner(System.in);
        System.out.print("ID            : ");
        id = scanner.nextLine();
        System.out.print("PEMILIK       : ");
        pemilik = scanner.nextLine();
        System.out.print("MERK MOTOR    : ");
        merk = scanner.nextLine();
        service.ubahData(new Servismtr(id, pemilik,merk));
    }

    private static void formTambahData() {
        String id, pemilik, merk;
        System.out.println("\nForm Tambah Data");
        scanner = new Scanner(System.in);
        System.out.print("ID            : ");
        id = scanner.nextLine();
        System.out.print("PEMILIK       : ");
        pemilik = scanner.nextLine();
        System.out.print("MERK MOTOR    : ");
        merk = scanner.nextLine();
        simpanDataBaru(new Servismtr(id, pemilik,merk));
    }

    private static void simpanDataBaru(Servismtr srv){
        service.tambahData(srv);
    }

    private static void cetakMenu(){
        System.out.println("|-----------------------------------|");
        System.out.println("|        Aplikasi Servis Motor      |");
        System.out.println("|-----------------------------------|");
        System.out.println("|                                   |");
        System.out.println("|         1. Tambah Data            |");
        System.out.println("|         2. Ubah Data              |");
        System.out.println("|         3. Hapus Data             |");
        System.out.println("|         4. Tampilkan Data         |");
        System.out.println("|         5. KELUAR                 |");
        System.out.println("|                                   |");
        System.out.println("|-----------------------------------|");
        System.out.println("|     By Muhammad Irfan Bakhtiar    |");
        System.out.println("|          17090047     4B          |");
        System.out.println("|-----------------------------------|");
        System.out.print("Pilihan > ");
    }
}