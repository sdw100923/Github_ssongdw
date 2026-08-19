/*class My_Student{
String name;
int age;
}

class My_car{
    String color;
    int speed;
}

class My_Rectangle{
    int weight;
    int height;

    void printArea(){
        System.out.println("넓이: " + (weight * height));
    }
}
class Circle{
    int radius;
    double Pi;
    void getArea(){
        System.out.println("원의 넓이: " + (Pi * radius * radius));
    }
}

/*class My_BankAccount{
  /*  int balance;
    int getBalance(){
        return balance;
    }

    void setBalance(int balance){
        if (balance < 0){
            System.out.println("잘못된 금액입니다. ");
            return;
        }
        this.balance = balance;
    }*/


//}


import java.util.Scanner;
import java.util.Random;

/*class My_Product{
    String name;
    int price;

    My_Product() {
        this.name = "미정";
        this.price = 0;
    }

    My_Product(String name , int price){
        this.name = name;
        this.price = price;
    }
}
*/
/*class My_Kimchi{
    String name;
    int price;

    My_Kimchi(){
        this.name = "미정";
        this.price = 0;
    }
    My_Kimchi(String name , int price){
        this.name = name;
        this.price = price;
    }
}

class My_Calculator{
    int add(int a,int b) {
        return a + b;
    }
    int add(int a,int b, int c){
        return a + b + c;
    }
    double add(double a, double b){
        return  a + b;
    }
}
class MYBankAccount{
    int balance;

    MYBankAccount(int balance){
        this.balance = balance;
    }

    void deposit(int amount){
        if(balance < 0){
            System.out.println("유효하지 않은 금액입니다.");
            return;
        }
        balance += amount;
    }
    boolean withdraw(int amount){
        if (amount > balance){
            System.out.println("잔액이 부족합니다.");
            return false;
        }
        balance -= amount;
        return true;
    }

    int getBalance(){
        return balance;
    }


}
*/
class Finger{
    int finger;

    Finger(int finger){
        this.finger = finger;
    }

    void del(int amount){
        if(finger < amount){
            System.out.println("유효하지 않습니다.");
        }
        finger += amount;
    }
    int getFinger(int amount){
        return finger;
    }
    boolean fingers(int amount){
        if (amount > finger){
            System.out.println("손가락이 부족합니다.");
            return true;
        }
        finger -= amount;
        return true;
    }
}
/*class Students{
    String name;
    int score;

    Students(String name, int score){
        this.name = name;
        this.score = score;
    }

}*/
/*class Students{
    String name;
    int score;

    Students(String name, int score){
        this.name = name;
        this.score = score;
    }
}
class My_Counter{
    int counter;

    void increment(){
        counter++;
    }
    void decrement(){
        if(counter <= 0){

             System.out.println("더 이상 감소할 수 없습니다.");
            return;
        }
        counter--;
    }
    void reset(){
        counter = 0;
    }
    int getCounter(){
        return counter;
    }*/

//}
/*class Grade{
    int score;

    Grade(int score){
        this.score=score;
    }


    String getGrade(){
        if(score >= 90){
        return "A";}
        else if(score >= 80){
            return "B";}
        else if(score >= 70){
            return "C";}
        else if(score >= 60){
            return "D";}
        else{
            return "F";}

    }
}
*/
/*class My_Product{
    String name;
    int price;
    int stock;

    My_Product(String name, int price, int stock){
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    void sell(int qty){
        if(stock < qty) {

            System.out.println("재고 부족. 현재 재고 : " + stock + "개");
            return;
        }
        stock -= qty;

    }
    void restock(int qty){
        if(qty <= 0){

            System.out.println("유효하지 않은 수량입니다.");
            return;
        }
        stock += qty;

    }
    String getinfo(){
        return name + " | " + price + " 원" + " | " + "재고 : " + stock + " 개";
    }
}
class Person{
    String name;
    int age;
    String job;

    Person(String name, int age, String job){
        this.age = age;
        this. name = name;
        this. job = job;
    }
}*/
/* class Item{
    String name;
    int price;

    Item(String name, int price){
        this.name = name;
        this.price = price;
    }

}

class VendingMachine{
   Item[] items = new Item[5];
    int balance;


    void addItem(int slot, Item item){
     items[slot] = item;
    }

    void insertMoney(int amount){
        balance += amount;
    }
    void buy(int slot){
        if(items[slot] == null){
            System.out.println("상품이 없습니다.");
            return;
        }
        if (balance < items[slot].price) {
            System.out.println("잔액이 부족합니다. (잔액 : " + balance + " 원, " + "가격 : " + items[slot].price + "원)");
        }else {
            System.out.println(items[slot].name + " 구매 완료. 잔액 : " + (balance - items[slot].price) + " 원");
        }
    }

}

class Book{
    String title;
    String author;
    boolean isBorrowed;

    Book(String title, String author){
        this.author=author;
        this.isBorrowed = false;
        this.title = title;
    }
}
class Library{
    Book[] books = new Book[10];
    int count;


    void addBook(Book book){
        if (count >= 10){
            System.out.println("등록 불가");
            return;
        }
        books[count++] = book;


    }
    void borrow(String title){
    for(int i = 0;i < count; i++){
        if (books[i].title.equals(title)) {
            if (books[i].isBorrowed) {
                System.out.println("대출 중");
            } else {
                books[i].isBorrowed = true;
                System.out.println(books[i].title + " 대출 완료");

            }
            return;
        }
    }
    System.out.println("없는 책 입니다.");

    }
    void returnBook(String title) {
        for (int i = 0; i < count; i++) {
            if (books[i].title.equals(title)) {
                if (!books[i].isBorrowed) {
                    System.out.println("대출된 책이 아닙니다.");
                } else {
                    books[i].isBorrowed = false;
                    System.out.println(title + " 반납.");
                }
                return;
            }

        }
        System.out.println("없는 책 입니다.");
    }
    void printAll(){
for (int i =0; i < count; i++){
    String status = books[i].isBorrowed ? "대출 중" : "대출 가능";
    System.out.println("[" + books[i].title + "] " + books[i].author + " 저 - " + status);
}
    }

}*/
public class Accumulate_1408_06_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n 입력 : ");
        Random random = new Random();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            int dice = random.nextInt(10)+1;
            arr[i] += dice;
            System.out.println();
        }




      /* int[] arr = new int[5];
       Random random = new Random();
        int reuslt = 0;

       for(int i = 0; i <= arr.length -1; i++){
           int dice = random.nextInt(6) + 1;

           arr[i] = dice;
           System.out.println(i + 1 + "번째" + "주사위 눈 : " + dice);
           reuslt += dice;
       }

      System.out.println("총합" + reuslt + "/" + "평균" + ((double)reuslt / arr.length));
      */
      /*  System.out.println("n 입력");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "번째 수 입력");
            arr[i] = sc.nextInt();
        }

        System.out.println("m 입력");
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            System.out.println((i + 1) + "번째 수 입력");
            arr2[i] = sc.nextInt();
        }
        int[] arr3 = new int[n + m];
        for (int i = 0; i < n; i++){
            arr3[i] = arr[i];
        }

        for(int i =0; i < m; i++){
            arr3[i + n] = arr2[i];
        }
        System.out.println(Arrays.toString(arr3));



       /* int[] arr2 = new int[n];
        for (int i = 0; i < n; i++){
            arr2[i] = arr[i];
        }
        arr[0] = 999;

                System.out.println("원본 : ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println("복제 : ");
        for (int i =0; i < arr2.length; i++){
            System.out.print(arr2[i] +  " ");
        }
     /*
        System.out.println("찾을 값 입력");
        int a = sc.nextInt();
boolean found = false;
        for (int i = arr.length - 1; i > -1; i-- ){
            if (arr[i] == a) {
                System.out.println("인덱스" + i);
                found = true;
            }

            }
        if(!found) {
            System.out.println("찾을 수 없습니다");
        }
        sc.close();





        /*System.out.println("n 입력");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i =0; i < n; i++){

            System.out.println( (i + 1)  + "번째 정수");
            arr[i] = sc.nextInt();
        }
       for(int i = arr.length -1; i >= 0; i--){
           System.out.println(arr[i] + " ");
       }
       System.out.println();
       sc.close();
      /*  Library a = new Library();
        a.addBook(new Book("자바의 정석", "홍길동"));
        a.addBook(new Book("클린코드", "김철수"));
        a.printAll();
        a.borrow("자바의 정석");
        a.printAll();
        a.returnBook("자바의 정석");
        a.borrow("클린코드");
        a.printAll();

      /*  VendingMachine a = new VendingMachine();
        a.addItem(0, new Item("유승연", 1));
        a.addItem(1, new Item("장정원", 10000));
        a.addItem(2, new Item("주승빈", 10));
        a.addItem(3, new Item("송동욱", 1000000));
        a.buy(1);
        a.buy(4);
        a.insertMoney(1000000);
        a.buy(3);


        System.out.println();
   /*    Person[] people = {
               new Person("송동욱", 17, "개발자"),
               new Person("홍길동", 25, "학생"),
               new Person("김철수", 35, "백수"),
               new Person("이영희", 28, "디자이너"),
               new Person("박민준", 42, "교수")
       };
       for (int i= 0; i < people.length; i++){
           if (people[i].age >= 30){
               System.out.println(people[i].name + " (" + people[i].age + ") " + " - " + people[i].job);
           }
       }
    /*    My_Product a = new My_Product("노트북", 1200000, 10);
        System.out.println(a.getinfo());
        a.sell(3);
        System.out.println(a.getinfo());
        a.sell(102);
       a.restock(-5);
       a.restock(5);
       System.out.println(a.getinfo());
       /* int[] scores = {95,83,71,60,45};
        for (int i =0; i < scores.length; i++){
            Grade a = new Grade(scores[i]);
            System.out.println(scores[i] + "->" + a.getGrade());
        }
      /*  My_Counter a = new My_Counter();
       for (int i = 0; i < 5; i++){
           a.increment();
       }
       for (int i =0; i < 2; i++){
           a.decrement();
       }
       System.out.println("현재 카운트" + a.getCounter());
       a.reset();
       System.out.println("리셋 후 : " + a.getCounter());
     /*   Students[] students= new Students[]{
new Students("유승연", 1),
                new Students("장정원" , 50),
                new Students("송동욱", 100),
                new Students("주승빈", 20),
                new Students("레전드 방송", 70)

        };
        Students top = students[0];
       for(int i =0; i < students.length; i++){
            if (students[i].score > top.score){
                top = students[i];

            }
            System.out.println(students[i].name + "/" + students[i].score + "점");
       }

       System.out.println("\n최고점수 : " + top.name + "/" + top.score + "점");
      /*  int sum = 0;
        for( int i = 0;i < students.length; i++){
            System.out.println(students[i].name + "/" + students[i].score + "점");
            sum += students[i].score;

        }
        System.out.println("평균 : " + sum / students.length + "점");

     /*   Finger a = new Finger(10);
        System.out.println("손가락 : " + a.getFinger(5));
        a.del(5);
        System.out.println("발가락 추가 후 손,발가락 : " + a.getFinger(5));
        System.out.println("빼기 성공 : " + a.fingers(5));
        a.fingers(5);
        System.out.println("빼기후 남은 손가락 : " + a.getFinger(5));
        a.fingers(981723);

     /*   MYBankAccount a = new MYBankAccount(10000);
        System.out.println("잔액 : " + a.getBalance());
        a.deposit(3000);
        System.out.println("입금 후 잔액 : " + a.getBalance());
        System.out.println("출금 성공 : " + a.withdraw(5000));
        System.out.println("출금 후 잔액 : " + a.getBalance());
        a.withdraw(9999999);

       /* My_Calculator a = new My_Calculator();
        System.out.println(a.add(1,2));
        System.out.println(a.add(1,2,3));
        System.out.println(a.add(2.5, 3.8));
      /*  My_Kimchi k1 = new My_Kimchi();
        My_Kimchi k2 = new My_Kimchi("백김치" , 2800);
        My_Kimchi k3 = new My_Kimchi("묵은지" , 2500);
        System.out.println(k1.name + "/" + k1.price + "원");
        System.out.println(k2.name + "/" + k2.price + "원");
        System.out.println(k3.name + "/" + k3.price + "원");
    /* My_Product p1 = new My_Product();
     My_Product p2 = new My_Product("노트북",1200000);
        System.out.println(p1.name + "/" + p1.price + "원");
        System.out.println(p2.name + "/" + p2.price + "원");


       /* My_BankAccount a = new My_BankAccount();
        a.setBalance(10000);
        System.out.println("진액 : " + a.getBalance());

        a.setBalance(-500);
        System.out.println("잔액 : " + a.getBalance());
       /* Circle a = new Circle();
        a.radius = 5;
        a.Pi = 3.14;
        a.getArea();

       /* My_Rectangle a = new My_Rectangle();
        a.height = 5;
        a.weight = 10;
        a.printArea();
       /* My_car a = new My_car();
        a.color = "빨간색 자동차";
        a.speed = 100;

        My_car b = new My_car();
        b.speed = 150;
        b.color = "파란색 자동차";

        System.out.println(b.color + ", 속도: " + b.speed);
        System.out.println(a.color + ", 속도: " + a.speed);
       /* My_Student a = new My_Student();
        a.age = 20;
        a.name = "홍길동";

        System.out.println("이름 : " + a.name + "\n나이 : " + a.age); */

    }
}

    

