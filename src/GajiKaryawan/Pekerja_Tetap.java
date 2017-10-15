package GajiKaryawan;

import java.util.Scanner;
/**
 * @author Dzulkarnain Inc
 */
public class Pekerja_Tetap {
    public void Tetap(){
        Scanner input = new Scanner(System.in);
        
        float potongan, totalgaji = 0;
        int Gaji = 5000000;
        
        System.out.println(">> Pekerja Tetap");
        System.out.println("Gaji : " +  Gaji);
        System.out.print("Jumlah Anak  : ");
        int anak = input.nextInt();
        System.out.print("Absen {hari} : ");
        int absen = input.nextInt();
        
        if(anak == 0){
            if(absen >= 3){
                potongan = Gaji * 0.1f;
                totalgaji = Gaji - potongan;
            }else{
                totalgaji = Gaji;
            }
        }else if(anak == 1){
            if(absen >= 3){
                int total = (Gaji + 750000);
                potongan = total * 0.1f;
                totalgaji = total - potongan;
            }else{
                totalgaji = Gaji + 750000;
            }
        }else if(anak >= 2){
            if(absen >= 3){
                int total = (Gaji + 1250000);
                potongan = total * 0.1f;
                totalgaji = total - potongan;
            }else{
                totalgaji = Gaji + 1250000;
            }
        }
        System.out.println("============================");
        System.out.println("Total Gaji : " + totalgaji);
        System.out.println("============================");
        System.out.println();
    }
}
