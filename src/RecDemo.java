class MyCircle{
    double radius;
        double getArea(){
            return 3.14 * radius * radius;
    }

}



public class RecDemo {
    public static void main(String[] args){
        MyCircle c1 = new MyCircle();
        c1.radius = 10.0;
        double area = c1.getArea();
        System.out.println("원의 넓이 : " + c1.getArea());

    }
}
