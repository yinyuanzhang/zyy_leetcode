package niuke_top200.面试.华为;

public class DeleteChar {

    public static void main(String[] args) {
        System.out.println(deleteChar("aabbcccbdddaaxx"));
    }

    public static String deleteChar(String s){

        StringBuilder sbu = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sbu.append(s.charAt(i));
        }

        boolean flag = true;
        while(flag) {
            flag = false;
            for (int i = 0; i < sbu.length() - 2; i++) {
                if (sbu.charAt(i) == sbu.charAt(i + 1) && sbu.charAt(i) == sbu.charAt(i + 2)) {
                    char tag = sbu.charAt(i);
                    while(sbu.length() > 0 && sbu.charAt(i) == tag){
                        sbu.deleteCharAt(i);
                        flag = true;
                    }
                }
                if(flag) break;
            }
        }
        return sbu.toString();

    }



}
