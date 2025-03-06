package access.ex.problem1;

public class CounterMain {
    public static void main(String[] args) {

        // 최대값을 3으로 설정 (MaxCounter에서 설정한 생성자 이용)
        MaxCounter counter = new MaxCounter(3);

        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();

        // Getter로 private 멤버 변수를 복사해서 가져옴
        int count = counter.getCount();

        System.out.println(count);
    }
}
