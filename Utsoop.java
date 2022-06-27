import java.util.Scanner;

public class Main
{
   public static void main (String args[])
   {
    Scanner input=new Scanner(System.in);

    System.out.print("Masukan Jumlah Pengunjung : ");
    int n=input.nextInt();

    String nama[]=new String[n];

    for (int i=0;i<n;i++){
         System.out.println("Pengunjung Ke : "+(i+1));
        System.out.print("Nama : ");
        nama[i]=input.next();
    }
    System.out.println("================================");
    System.out.println("DAFTAR PENGUNJUNG KEBUN BINATANG");
    System.out.println("================================");
    System.out.println("No   | Nama");
    System.out.println("--------------------------------");
    
    for (int i=0; i<n;i++) {
        System.out.println((i+1)+"    | "+nama[i]);
    }
    System.out.println("--------------------------------");
    System.out.print("Jumlah Pengunjung : ");
    System.out.println(nama.length);
    }
 }