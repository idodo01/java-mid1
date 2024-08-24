package enumeration.ex1;

public class StringGradeEx1_2 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        // DiscountService의 주석을 확인하지 않고
        // StringGrade의 상수 String이 아닌
        // String을 입력해도

        // iscountService.discount()의 매개변수가 String 이기 때문에
        // 컴파일 오류가 나지 않은 채
        // 런타임 오류가 난다

        // 존재하지 않는 등급
        int vip = discountService.discount("VIP", price);
        System.out.println("VIP 등급의 할인 금액: " + vip);

        // 오타
        int diamondd = discountService.discount("DIAMONDD", price);
        System.out.println("DIAMONDD 등급의 할인 금액: " + vip);

        // 소문자 입력
        int gold = discountService.discount("gold", price);
        System.out.println("gold 등급의 할인 금액: " + gold);
    }
}
