package scanner;

import java.util.Scanner;

public class Scanner3 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요:");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하세요:");
        int num2 = scanner.nextInt();

        if (num1 == num2) {
            System.out.println("같다");
        }
        else {
            if (num1 > num2) {
                System.out.println("첫 번째 수가 더 크다");
            }
            else{
                System.out.println("두 번째 수가 더 크다");
            }
        }

    }
}
