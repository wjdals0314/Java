package casting;

public class Casting3 {
    static void main() {
        long maxIntValue=2147483647; //int 최고값
        long maxIntOver=2147483648L; //int 최고값
        int intValue = 0;

        intValue = (int) maxIntValue;//형변환
        System.out.println("maxIntValue casting=" + intValue);

        intValue = (int) maxIntOver; //형변환
        System.out.println("maxOverValue casting="+intValue);
    }
}
