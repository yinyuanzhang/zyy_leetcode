## 具体题目分析:
1. linux命令
top可查看CPU状态，但是区分不出进程的用户态CPU和内核态CPU
pidstat可区分查看用户态CPU使用率、内核态PU使用率、运行虚拟机、等待CPU使用率和总的CPU使用率
iostat可查看CPU、网卡、磁盘等设备的活动情况, 负载信息
vmstat命令可以报告关于进程、内存、I/O等系统整体运行状态

2. 
僵尸进程是因为父进程没有回收子进程的资源而出现，需要在父进程里解决。
给父进程发送SIGKILL信号之后，父进程退出，这些僵尸进程会由init进程接收并回收。

清理僵尸线程：把父进程杀掉，父进程死后，僵尸进程称为“孤儿进程”，
过继给1号进程init，init始终负责清理僵尸进程，它产生的所有僵尸进程跟着消失

3. 
操作系统不知道用户线程的存在。

4.
public class Test{
    static int a = 1;
    static int b = 2;
    public static void main(String[] args) {
        static String c = "3";
        System.out.println(a+b+c);
    }
}
static不能修饰局部变量错误。

5.
子网掩码(知道网络号有多少位，主机号有多少位)
网络地址：IP地址&子网掩码（全1为1）
广播地址：网络地址的主机位有5位全部变成1


