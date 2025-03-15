package poly.ex6;

public class Chicken implements Animal, Fly{

    @Override
    public void fly() {
        System.out.println("닭 날기");
    }

    @Override
    public void sound() {
        System.out.println("꼬끼오");
    }

    @Override
    public void move() {
        System.out.println("닭 이동");
    }
}
