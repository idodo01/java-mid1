package enumeration.ex3;

public class EnumRefMain {

    public static void main(String[] args) {
        System.out.println("class BASIC = " + Grade.BASIC.getClass());
        System.out.println("class GOLD = " + Grade.GOLD.getClass());
        System.out.println("class DIAMOND = " + Grade.DIAMOND.getClass());

        // 열거형은 toString()을 재정의하기 때문에
        // 참조값을 직접 확인할 수 없다
        System.out.println("ref BASIC = " + refValue(Grade.BASIC));
        System.out.println("ref GOLD = " + refValue(Grade.GOLD));
        System.out.println("ref DIAMOND = " + refValue(Grade.DIAMOND));
    }

    // 참조 값을 확인하기 위해서 refValue() 메서드를 만들었다
    // System.identityHashCode() : 자바과 관리하는 객체의 참조값을 숫자로 반환한다
    // Integer.toHexString() : 숫자를 16진수로 변환, 우리가 일반적으로 확인하는 참조값을 16진수
    private static String refValue(Object grade) {
        return Integer.toHexString(System.identityHashCode(grade));
    }
}
