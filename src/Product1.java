class Product2{
    String name;
    int price;

    Product2(){
        name = "미정";
        price = 0;
    }

    Product2(String name, int price){
        this.name = name;
        this.price = price;

    }
}

public class Product1 {
    public static void main(String[] args){
        Product2 p1 = new Product2();
        Product2 p2 = new Product2("노트북", 1200000);
        System.out.println(p1.name + " / " + p1.price + " 원");
        System.out.println(p2.name + " / " + p2.price + " 원");
    }
}
