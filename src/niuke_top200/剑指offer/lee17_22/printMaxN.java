package niuke_top200.剑指offer.lee17_22;

public class printMaxN {

    public static void main(String[] args) {

    }

    public static int[] printMaxN(int n){
        //n=1,9; n=2,99; n=3,999;
        //10-1;100-1;1000-1
        int maxN = 10;
        for (int i = 0; i < n; i++) {
            maxN *= 10;
        }
        maxN -= 1;
        int[] result = new int[maxN];
        for (int i = 0; i < maxN; i++) {
            result[i] = i + 1;
        }
        return result;
    }

    // 全排列方法: 这里的全排列可以重复
//    StringBuilder res = new StringBuilder();
//
//    public static String printMaxN2(int n){
//        char[] chars = {'0','1','2','3','4','5','6','7','8','9'};
//
//
//
//    }

}
