package niuke_top200.春招.子数组与动态规划;


// 有意思的一题，这种写法是目前最满意的。   考虑到负数，甚至是全是负数的情况，先对sum进行判断是最合适也是非常符合逻辑的情况。
// 你都为负了，接下来的情况可以保护用考虑了。
public class MaxSubArray {

    public static void main(String[] args) {

    }

    public int maxSubArray(int[] array){
        int maxValue = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if(sum < 0) sum = 0;
            sum += array[i];
            maxValue = Math.max(maxValue, sum);
        }
        return maxValue;
    }
}
