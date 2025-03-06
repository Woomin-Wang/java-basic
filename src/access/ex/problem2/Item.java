package access.ex.problem2;

public class Item {

    // 외부에서의 접근을 제한하는 private 타입으로 멤버 변수 선언
    private String name;
    private int price;
    private int quantity;

    // 상품의 속성들을 설정하는 생성자 설정
    public Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // name이 private 타입이므로, 외부에서 접근할 수 있는 Getter 생성
    public String getName() {
        return name;
    }

    // 마찬가지로, 외부에서 접근할 수 있는 Getter 생성
    public int getTotalPrice() {
        return price * quantity;
    }

}
