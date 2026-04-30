package AI0430;

public class Fortest4 {
    public static void main(String[] args) {
        int hap = 0;
        for(int i = 1001; i <= 2000; i += 2) {
            hap += i;
        }

//        for(int i = 1001; i <= 2000; i++) {
//            if(i % 2 ==1)
//                hap += i;
//            }

        System.out.println(hap);
    }
}