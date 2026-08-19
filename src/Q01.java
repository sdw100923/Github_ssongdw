import java.util.Scanner;
class Person{
private int age;

Person (int age){
    this.age = age;
}
int getAge(){
    return age;
}
void setAge(int age){
    if (age < 0 || age > 150){
        System.out.println("유효하지 않은 나이입니다.");
        return;
    }
    this.age = age;
}
}


public class Q01 {
   public static void main(String[] args) {
       Person a = new Person(25);
       System.out.println("나이 : " + a.getAge());
       a.setAge(-1);
       System.out.println("나이 : " + a.getAge());
       a.setAge(200);
       System.out.println("나이 : " + a.getAge());
    }
}
