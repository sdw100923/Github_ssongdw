class  Student0 {
    String name;
    int score;


    Student0(String name, int score){
        this.name = name;
        this.score = score;
    }
}


public class JJjjjJJJjjJjjJJ {
    public static void main(String[] args) {
        Student0[] students = {
                new Student0("홍길동", 80),
        new Student0("김감자", 95),
        new Student0("김홍도", 70),
        new Student0("김미림", 88),
        new Student0("노은지", 92)
    };
        int sum = 0;
        for(int i = 0; i<students.length;i++){
            System.out.println(students[i].name + " : " +students[i].score + "점");
            sum += students[i].score;
        }
        System.out.println("평균 : " + ((double) sum / students.length));
    }
}
