import java.util.Scanner;
public class Arr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arrySize = sc.nextInt();
        int[] numberArry = new int[arrySize];
        for (int i = 0;i<numberArry.length;i++ ){
            System.out.print((i+1) + "번째 숫자 입력: ");
            numberArry[i] = sc.nextInt();
        }
        for (int n : numberArry) {
            System.out.print(n);
        }
    }

}
