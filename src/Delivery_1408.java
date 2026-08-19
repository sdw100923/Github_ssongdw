import java.util.Scanner;
class Delivery {
    String recipient;
    int fee;
    int weight;

    void setFee (int fee){
        if (fee <= 0){
            System.out.print("유효하지 않은 요금입니다.");
            System.out.println();

        }else {
            getInfo();
        }
    }
    void getInfo (){
        System.out.print("수령인 : " + recipient + " | 요금 : " + fee + " | 무게 : " + weight + "kg");
        System.out.println();
    }

}


public class Delivery_1408 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Delivery a = new Delivery();
       System.out.print("수령인 : ");
       a.recipient = sc.nextLine();
       System.out.print("요금 : ");
       a.fee = sc.nextInt();
       System.out.print("무게 : ");
       a.weight = sc.nextInt();
       a.getInfo();
       System.out.print("변경할 요금 : ");
       a.setFee(sc.nextInt());
       a.getInfo();




    }
}
