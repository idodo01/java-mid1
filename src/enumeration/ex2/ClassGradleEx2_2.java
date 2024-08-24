package enumeration.ex2;

public class ClassGradleEx2_2 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
/*
        이 방법에서도 문제가 생길 수 있다
        discountService.discount()의 매개변수 인스턴스인 것을 확인하고,
        이미 ClassGrade에서 생성된 인스턴스가 아닌
        해당 클래스에서 또 다른 인스턴스를 생성에서 삽입하여
        런타임 오류가 생길 수 있다
        ->  <해결 방법> ClassGrade에서 private 생성자 추가하여,
        외부에서 임의로 인스턴스를 생성하는 것을 막는다

        ClassGrade newClassGrade = new ClassGrade(); //x009
        int result = discountService.discount(newClassGrade, price);
        System.out.println("newClassGrade 등급의 할인 금액: " + result);
*/
    }
}
