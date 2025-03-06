package access.ex.problem2;

public class ShoppingCart {

    // Item 타입의 배열 10개 선언
    private Item[] items = new Item[10];
    private int itemCount;


    public void addItem(Item item) {
        if (itemCount >= items.length) { // 배열이므로 .length 사용 가능
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }

        items[itemCount] = item;
        itemCount++; // 장바구니에 추가할 때마다 카운트 +1
    }

    //
    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            System.out.println("상품명:" + item.getName() + ", 합계:" + item.getTotalPrice());
        }

        System.out.println("전체 가격 합:" + calculateTotalPrice());
    }

    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}
