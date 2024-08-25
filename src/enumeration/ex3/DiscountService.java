package enumeration.ex3;

import static enumeration.ex3.Grade.BASIC;

public class DiscountService {

    public int discount(Grade grade, int price) {
        int discountPercent = 0;

        // 열거형 선택해둔채 Alt + Enter
        // (열거형도 staitc이기 때문에 import 가능)
        // 가독성이 높아짐
        if (grade == BASIC) {
            discountPercent = 10;
        } else if (grade == Grade.GOLD) {
            discountPercent = 20;
        } else if (grade == Grade.DIAMOND) {
            discountPercent = 30;
        } else {
            System.out.println("할인X");
        }

        return price * discountPercent / 100;
    }
}
