import java.util.Scanner;
public class Babo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = -1;
        if(N == 0) {
            result = 0;
        }
        if(N == 1){
            result = 1;
        }


        if(N >= 2){
            int first = 0;
        int second = 1;
        for(int i = 2;i<=N-26;i++) {
            System.out.println(i);
            int curr = first + second;
            first = second;
            second = curr;
            result = curr;
            System.out.println(curr + " ");
            }

        }System.out.println(N + "항의값은" + result);
    }

}
