package niuke_top200.春招.哈希;

// 第一次遍历先尽量把元素放在合适的位置上
// 每个元素值应该哈希映射到其该有的位置，即f(num[i]) = i + 1;
// 核心原则：只需要判断值在[1，n]之间的元素，范围之外的不用理。  为了保证交换之后的元素也能在合适的地方，使用while循环【这个很重要，学习使用】
public class FirstMissingNum {

    public static void main(String[] args) {

    }

    public int firstMissingNum(int[] num){
        for (int i = 0; i < num.length; i++) {
            while(num[i] > 0 && num[i] <= num.length && num[i] != i + 1){
                int temp = num[num[i] - 1];
                num[num[i] - 1] = num[i];
                num[i] = temp;
            }
        }

        for (int i = 0; i < num.length; i++) {
            if(num[i] != i + 1) return i + 1;
        }
        return num.length + 1;
    }
}
