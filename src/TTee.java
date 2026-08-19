public class TTee {
    public static void main(String[] args){
        for (int i = 1; i <= 5; i++){
            for (int j = 5; j>= i; j--){
                System.out.print("*");
            }System.out.println();
        }
        for (int n = 10; n >= 6; n-=2){
            for (int b = 6; b<= n; b++ ){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
