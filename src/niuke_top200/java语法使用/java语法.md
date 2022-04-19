### 分析
1. 获取字符串s的某个字符
s.charAt(i)
 
2. a++ 与 ++a 
int a = 1; sout(a++) ——> 1;
int a = 1; sout(++a) ——> 2;

3. dp数组初始化为同一数值
Arrays.fill(dp, 1);

4. 字符串转化为字符数组
Char[] chars = str.toCharArray()

5. lists添加list
lists.add(new ArrayList<>(list))

6. 10的n次方
(int)Math.pow(10,n)

7. 传入参数想定义为全局参数:
this.k = k; (相当于给全局变量重新赋值)

8. 打印数组
Arrays.toString(arr)

9. 栈与队列
注意对于deque和queue来说，peek和poll是通用的，但是offer应用于queue， push应用于deque。

10.Integer 与 int
Integer.valueof(i)
i.intValue()