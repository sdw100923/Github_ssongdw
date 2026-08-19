import java.util.Arrays;

public class DaniHangReyul {
    public static void main(String[] args){
    int[][] a = new int[4][4];
    a[0] = new int[]{1, 0, 0, 0};
    a[1] = new int[]{0, 1, 0, 0};
    a[2] = new int[]{0, 0, 1, 0};
    a[3] = new int[]{0, 0, 0, 1};
    boolean isIdentity = true;
    for (int i = 0; i < a.length; i++){
        for (int j = 0; j < a[0].length; j++){
            if (i == j && a[i][j] != 1){
                isIdentity = false;
                break;
        } else if (i != j && a[i][j] !=0){
                isIdentity = false;
                break;
            }


        }
        }

    }
}
