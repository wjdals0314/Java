package loop.ex;

public class WhileEx1 {
    static void main() {
        int count=1;
        while (count <= 10) {
            System.out.println(count);//count++해 놓으면 count++; 생략해도 됨
            count++;
        }
    }
}
