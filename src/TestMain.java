public class TestMain {

    public static void main(String[] args) {
        Test test = new Test();
        test.testMethod();

        // toString()은 Object 클래스의 메서드
        String string = test.toString();
        System.out.println(string);
    }
}
