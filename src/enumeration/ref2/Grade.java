package enumeration.ref2;

public enum Grade {
    // 괄호를 이용하여 바로 생성자 호출 가능
    BASIC(10), GOLD(20), DIAMOND(30);

    private final int discountPercent;

    // 열겨형은 생성자에 접근제어자를 작성하는 것이 막혀있다.
    // 기본이 private

    // 생성자에 private가 생략되어있는 상태
    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

}
