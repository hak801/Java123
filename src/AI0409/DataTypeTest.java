package AI0409;

public class DataTypeTest {
    public static void main(String[] args){
        byte bt = -128; //-128 ~ 127
        short st = 300;
        st = bt;
        int it = st;
        System.out.println("it 변수에 저장된 값:" + it);
        long lg = 70000000;

        float f1 = 1000;
        f1 = lg;
        f1 = 1000.0f;
        f1 = 1000.0F;
        f1 = (float) 1000.0;

        double d1 = 20000;
        d1 = f1;
        d1 = bt;
        d1 = 207.999;

        char c = 'A';
        System.out.println(c + 1);

        boolean b = true;

        System.out.println(b);
        System.out.println(!b);
    }
}
