import java.util.Scanner;

public class Scanner_PyunGune {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n[] = new int[6];
        double Pyung_Gune = 0;
        int GunHap = 0;
        double D = 0;
        for(int i = 0; i < n.length; i++){
            n[i] = sc.nextInt();

        }
        for (int i =0; i < n.length; i++){
            GunHap += n[i];
            D += n[i];
        }
        Pyung_Gune = (double)GunHap / 6;
        System.out.println("총합 : " + GunHap + " " +  Pyung_Gune);
    }
}
