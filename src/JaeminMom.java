import java.util.Scanner;

public class JaeminMom {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("재민이는 엄마가 있나요? (있으면 1번,없으면 2번을 쓰십시오) :");
        int a = sc.nextInt();
        if (a == 1){
            System.out.println("아뇨 재민이는 엄마가 없습니다.");

        } if (a == 2) {
            System.out.println("와우 정답입니다");
            
        }
        else {
            System.out.println("뭔 소리를 하고싶은걸까");
        }
    }
}
