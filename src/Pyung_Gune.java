public class Pyung_Gune {
    public static void main(String[] args){
        int[] score = {90, 100, 54, 66, 88, 77};
        int pyung_gune = 0;
        int b = 10;
        for(int i = 0; i < score.length; i++){
            pyung_gune += score[i];

        }
        for (int i=0; i< score.length; i++){
            score[i] -= b;
            System.out.println(score[i]);
        }
        System.out.println(pyung_gune / score.length);
    }
}
