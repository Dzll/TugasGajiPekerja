package GajiKaryawan;

/**
 * @author Dzulkarnain Inc
 * Nama : Wafi Dzul Q
 * Npm : 06.2016.1.06657
 */
import java.util.Scanner;
public class GajiKaryawan {
    public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	Pekerja_Tetap tetap = new Pekerja_Tetap();
        Pekerja_Kontrak kontrak = new Pekerja_Kontrak();
        Manager mngr = new Manager();
        
        System.out.println("======= Gaji Pekerja =======");
	System.out.println("1. Pekerja Tetap");
	System.out.println("2. Pekerja Kontrak");
	System.out.println("3. Manager");
	System.out.println("============================");
        System.out.println();
        
	System.out.print("Pilih : ");
	int pilih = input.nextInt();
        System.out.println("============================");
	switch(pilih){
            case 1 : tetap.Tetap(); break;
            case 2 : kontrak.Kontrak(); break;
            case 3 : mngr.manager(); break;
            default : System.out.println("Inputan Salah !!");
        }	
    }
}
