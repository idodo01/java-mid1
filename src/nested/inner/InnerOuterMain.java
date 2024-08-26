package nested.inner;

public class InnerOuterMain {

    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter();
        // 내부 클래스는 바깥 클래스의 인스턴스 소속이기에
        // 바깥 클래스의 인스턴스 outer. 으로 접근해야한다
        InnerOuter.Inner inner = outer.new Inner();
        inner.print();

        System.out.println("innerClass = " + inner.getClass());

    }
}
