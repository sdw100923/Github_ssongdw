class counter{
    int count;

        void increment(){
            count++;
        }
        void decrement(){
            if (count <= 0){
                System.out.println("더 이상 감소할 수 없습니다");
                return;
            }
            count--;
        }
        void reset(){
            count = 0;
        }
        int getCount(){
            return count;
        }

}

public class Counter {
    public static void main(String[] args){
        counter c = new counter();
        for (int i = 0; i < 5; i++ ) c.increment();
        for (int i = 0; i< 2; i++) c.decrement();
            System.out.println("현재카운트 : " + c.getCount());
            c.reset();
            System.out.println("리셋 후 : " + c.getCount());
            c.decrement();

    }
}
