package niuke_top200.笔试.百度;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        upPicture(arr, n, k);

    }

    private static void upPicture(int[][] arr, int n, int k) {
        for (int i = 0; i < n*k; i++) {
            for(int j = 0; j < n*k; j++){
                int numJ = j / k;
                int numI = i / k;
                System.out.print(arr[numJ][numI]);
            }
            System.out.println();
        }
    }

}
