import java.util.Scanner;

public class arrange {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("N 입력");
        int n = sc.nextInt();
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++){
            System.out.println((i + 1) + "번째 정수 : ");
            a[i] = sc.nextInt();
        }
        for(int i =0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++){
                if (a[j] > a[j + 1]){
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println("정렬 결과 : ");
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}
