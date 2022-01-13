package niuke_top200.剑指offer.lee40_45;

public class findNthNum {

    public int findNthNum(int n){

        int[] result = new int[n];
        boolean canStop = false;
        int curr = 0;
        for (int i = 0; i < n; i++) {
            String s = String.valueOf(i);
            for (int j = 0; j < s.length(); j++) {
                result[curr++] = Integer.valueOf(s.charAt(j));
                if(curr > n - 1){
                    canStop = true;
                    break;
                }
            }
            if(canStop){
                break;
            }
        }
        return result[n - 1];
    }
}
