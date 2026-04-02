package variable;

public class Var8 {
    static void main() {
        //정수
        byte b=127; //-238~127
        short s=32367; //-32,768~32,767
        int i=2147483647; //-2,147,483,648~2,147,483,647 약(20억)

        //아주 많이
        long l=9223372036854775807L;

        //실수
        float f=10.0f; //f 붙여야함
        double d=10.0;

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
    }
}
