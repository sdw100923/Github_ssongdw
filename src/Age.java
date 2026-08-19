import java.util.Scanner;
public class Age {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (N >= 20){
            System.out.print("성인입니다.");
        }else if (N < 20){
            System.out.print("미성년자입니다.");
        }
    }
}
