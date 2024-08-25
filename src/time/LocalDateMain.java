package time;

import java.time.LocalDate;

public class LocalDateMain {

    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now(); // 현재 시간
        LocalDate ofDate = LocalDate.of(2013, 11, 21); // of 특정날짜를 기준으로 (년, 월, 일)
        System.out.println("오늘 날짜=" + nowDate);
        System.out.println("지정 날짜=" + ofDate);

        //계산(불변)
        // ofDate은 불변이기에, 다시 변수에 담아서 호출해야함
        LocalDate ofDatePlus = ofDate.plusDays(10);
        System.out.println("지정 날짜+10d = " + ofDate);
    }
}
