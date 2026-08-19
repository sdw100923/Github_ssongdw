public class StringJoinerDemo {
    public static void main(String[] args){
        System.out.println(StringJoiner.join("-", "Java", "python", "C++"));
        System.out.println(StringJoiner.join(", ", "홍길동", "김철수", "이영희"));
        System.out.println(StringJoiner.join("|", "one", "two", "three", "four"));
    }
}
