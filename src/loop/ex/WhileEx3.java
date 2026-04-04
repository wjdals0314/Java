package loop.ex;

public class WhileEx3 {
    static void main() {
        int max=100, count=1, sum=0;
        while (count<=max){
            sum+=count;
            count++;
        }
        System.out.println(sum);
    }
}
