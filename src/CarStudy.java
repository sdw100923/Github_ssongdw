class MyCar {
    String color;
    int speed;
}

public class CarStudy {
    public static void main(String[] args){
        MyCar c1 = new MyCar();
        c1.color = "빨간색 자동차";
        c1.speed = 100;
        MyCar c2 = new MyCar();
        c2.color = "파란색 자동차";
        c2.speed = 150;

        System.out.println(c1.color + ", 속도 : " + c1.speed);
        System.out.println(c2.color + ", 속도 : " + c2.speed);
    }
}
