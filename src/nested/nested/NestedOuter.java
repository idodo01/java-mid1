package nested.nested;

public class NestedOuter {

    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    // 정적 중첩 클래스
    static class Nested {
        private int nestedInstanceValue = 1;

        public void print() {
            // 자신의 멤버에 접근
            System.out.println(nestedInstanceValue);

            // Nested가 정적클래스이기 때문에
            // 바깥 클래스의 인스턴스 멤버에 접근에는 접근할 수 없다.
            
            // nested.inner에 InnerOuter 클래스는
            // 정적 클래스가 아니기 때문에
            // 바깥 클래스의 인스턴스 멤버에 접근 가능한 것
            
            // 정적 -> 인스턴스 접근 불가
            // 인스턴스 -> 정적 접근 가능
		
            //System.out.println(outInstanceValue);

            // 바깥 클래스의 클래스 멤버에는 접근할 수 있다. private도 접근 가능
            System.out.println(NestedOuter.outClassValue);
        }
    }
}
