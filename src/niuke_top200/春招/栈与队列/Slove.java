package niuke_top200.春招.栈与队列;


import java.util.Deque;
import java.util.LinkedList;

// 表达式求值：这里仅给出 逆波兰表达式求值【后缀表达式】求解，无需考虑优先级 leetcode 150题
public class Slove {

    public static void main(String[] args) {

    }

    public static int slove(String[] tokens){
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < tokens.length; i++) {
            if(isNum(tokens[i])){
                deque.push(Integer.parseInt(tokens[i]));
            }else{
                // 操作数位置容易弄反
                int num2 = deque.poll();
                int num1 = deque.poll();
                switch (tokens[i]){
                    case "+":
                        deque.push(num1 + num2);
                        break;
                    case "-":
                        deque.push(num1 - num2);
                        break;
                    case "*":
                        deque.push(num1 * num2);
                        break;
                    case "/":
                        deque.push(num1 / num2);
                        break;
                    default:
                }
            }
        }
        return deque.peek();
    }

    // 这个写法很规范，值得学习
    private static boolean isNum(String token) {
        return !("+".equals(token) || "-".equals(token) || "*".equals(token) || "/".equals(token));
    }


}
