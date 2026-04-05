package casting;

public class Casting2 {
    static void main() {
        double doublevalue = 1.5;
        int intvalue = 0;

        //intvalue=doublevalue; //컴파일 요류 발생
        intvalue = (int) doublevalue; //형변환
        System.out.println(intvalue);
    }
}
