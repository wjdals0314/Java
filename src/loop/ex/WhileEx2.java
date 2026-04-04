package loop.ex;

public class WhileEx2 {
    static void main() {
        int sum=2;
        int count=1;

        while (count<=10){
            System.out.println(sum);
            count++;
            sum+=2;
        }
    }
}
