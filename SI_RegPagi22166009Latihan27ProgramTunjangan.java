/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi.pkg22166009.latihan27.programtunjangan;
import java.util.Scanner;
/**
 *
 * @author HP
 * Nama     : Affa Muntazah
 * Kelas    : PBO 027
 * NIM      : 22166009
 * Deskripsi Program : Waktu Saat Ini
 */
public class SI_RegPagi22166009Latihan27ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kalimat: ");
        String kalimat = scanner.nextLine();
        
        System.out.println("====Hasil Formatting====");
         System.out.println();

        System.out.println("uruf Besar: " + kalimat.toUpperCase());
        System.out.println("Huruf Kecil: " + kalimat.toLowerCase());

        }
    }