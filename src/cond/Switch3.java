package cond;

public class Switch3 {
    static void main() {
        int grade=2, coupon;
        switch (grade){
            case 1:
                coupon=1000;
                break;
            case 2:
            case 3:
                coupon=3000;
                break;
            default:
                coupon=500;
                break;
        }
        System.out.println("발급 받은 쿠폰 "+coupon);
    }
}
