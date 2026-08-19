class Calculator2{
    int add(int a, int b) {
        return  a + b;
    }
    int add(int a, int b, int c){
        return  a + b + c;
    }
    double add(double a, double b) {
        return  a + b;
    }

}

public class Calculator {
    public static void main(String[] args) {
        Calculator2 calc = new Calculator2();
        System.out.println(calc.add(1,2));
        System.out.println(calc.add(1,2,3));
        System.out.println(calc.add(2.5, 3.0));
    }
}
