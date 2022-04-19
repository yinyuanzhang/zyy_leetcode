package niuke_top200.春招.双指针;


// 既然只能取决于一边，那就哪里需要取决就去哪里
public class Water {

    public static void main(String[] args) {

    }


    public int water(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int left_max = 0, right_max = 0;
        int sum = 0;

        while(left < right){
            if(left_max < right_max){
                sum += Math.max(0, left_max - height[left]);
                left_max = Math.max(left_max, height[left]);
                left++;
            }else{
                sum += Math.max(0, right_max - height[right]);
                right_max = Math.max(right_max, height[right]);
                right--;
            }
        }
        return sum;
    }
}

