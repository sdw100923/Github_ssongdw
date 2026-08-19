import java.util.Scanner;

class Product {
    String a;
    String b;
    int c;
    int d;

    public Product(String a, String b, int c, int d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    public void printInfo(){
        System.out.println(a + "\t" + b + "\t\t" + c + "\t" + d);
    }
}


public class ProductTest_1408 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Product[] products = new Product[5];
       int e = 0;
       for (int i =0; i< 5; i++){
           System.out.print("상품" + (i + 1) + " 구분 : ");
           String a = sc.next();

           System.out.print("상품" + (i + 1) + " 상품명 : ");
           String b = sc.next();

           System.out.print("상품" + (i + 1) + " 재고량 : ");
           int c = sc.nextInt();

           System.out.print("상품" + (i + 1) + " 단가 : ");
           int d = sc.nextInt();
           products[i] = new Product(a, b, c, d);
           e += c;
       }
       System.out.println("-----------------------------------------");
       System.out.println("구분\t상품명\t\t재고량\t단가");
       for (int i =0; + i < 5; i++){
           products[i].printInfo();
       }
       System.out.println("-----------------------------------------");
        System.out.println("상품의 총 재고량 : " + e);
    }
}
