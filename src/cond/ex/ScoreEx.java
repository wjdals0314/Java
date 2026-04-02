package cond.ex;

public class ScoreEx {
    static void main() {
        int score=20;
        String grade=(score>=90)?"A":(score>=80)?"B":(score>=70)?"C":(score>=60)?"D":"F";

        System.out.println("학점은 "+grade+"입니다.");
    }
}
