package niuke_top200.剑指offer.lee59_63;

public class LastNumInCircle {

    public static void main(String[] args) {

    }

    public int lastNumInCircle(int n, int m){
        int index = 0;
        for (int i = 2; i <= n; i++) {
            index = (index + m) % i;
        }
        return index;
    }

}
