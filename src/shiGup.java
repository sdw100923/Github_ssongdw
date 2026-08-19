import java.util.Scanner;

public class shiGup {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int pay = 9860;
        System.out.println("시간당 받는 급여를 입력하시오 : ");
        int payHoure = sc.nextInt();
        System.out.println("일하는 시간을 입력하시오 : ");
        int houre = sc.nextInt();
        System.out.println("최저시급 기준 급여 : " + (pay * houre) + " 시간당 시급 기준 급여 : " + (payHoure * houre) + " 최저시급 급여와 시간당 시급 차이 : " + (payHoure * houre - pay * houre));


    }
}
