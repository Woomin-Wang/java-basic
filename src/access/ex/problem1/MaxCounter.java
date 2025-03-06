package access.ex.problem1;

public class MaxCounter {

    // 외부에서의 접근을 제한하는 private 타입으로 멤버 변수 선언
    private int count = 0;
    private int max;


    // 최대값을 설정하는 생성자 설정
    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        if (count >= max) {
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        }
        count++;
    }

    // count가 private 타입이므로, 외부에서 접근할 수 있는 Getter 생성
    public int getCount() {
        return count;
    }
}
