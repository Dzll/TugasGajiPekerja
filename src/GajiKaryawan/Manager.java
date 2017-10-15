package GajiKaryawan;

import java.util.Scanner;
/**
 * @author Dzulkarnain Inc
 */
public class Manager {
    public void manager(){
        Scanner input = new Scanner(System.in);
        
        float totalgaji = 0, potongan;
        int Gaji = 10000000;
        
        System.out.println(">> Manager");
        System.out.println("Gaji : " + Gaji);
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
