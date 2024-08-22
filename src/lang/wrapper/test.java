package lang.wrapper;

public class test {

    public static void main(String[] args) {
        Integer integerObj = Integer.valueOf(10); //-128 ~ 127 자주 사용하는 숫자 값 재사용, 불변
        System.out.println("integerObj = " + integerObj); // toString 오버라이딩된 상태

        int intValue = integerObj.intValue();
        System.out.println("intValue = " + intValue);

        System.out.println("min" + Integer.min(20,50)); // 요소 2개만 입력가능
        // Integer.max(20,50);
    }
}
