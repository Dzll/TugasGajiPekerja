package GajiKaryawan;

import java.util.Scanner;
/**
 * @author Dzulkarnain Inc
 */
public class Pekerja_Kontrak {
    public void Kontrak(){
        Scanner input = new Scanner(System.in);
        
        System.out.println(">> Pekerja Kontrak");
        System.out.print("Jam Kerja [Hari]: ");
        int jam = input.nextInt();
        
        int totalgaji = jam * 150000;
        
        System.out.println("============================");
        System.out.println("Total gaji : " + totalgaji);
        System.out.println("============================");
        System.out.println();
    }
}
