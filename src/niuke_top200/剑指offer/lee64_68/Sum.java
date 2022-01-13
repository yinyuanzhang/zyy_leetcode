package niuke_top200.剑指offer.lee64_68;

public class Sum {

    public static void main(String[] args) {

    }

    public int sum(int n){
        boolean x = n > 1 && (n += sum(n - 1)) > 0;
        return n;
    }
}
