package enumeration.ex3;

// 열거형도 클래스
// ex2에서 복잡하게 만들던 열거형을
// 현재 자바는 이와같이 간단하게 제공해준다

// 열거형은 java.lang.Enum를 (강제) 상속받는다
// 따라서, Extends Enum 를 따로 해줄 필요 없다
public enum Grade {
    BASIC, GOLD, DIAMOND
}
