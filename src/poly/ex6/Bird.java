package poly.ex6;

public class Bird implements Animal, Fly{

    @Override
    public void sound() {
        System.out.println("짹짹");
    }

    @Override
    public void move() {
        System.out.println("새 이동");
    }

    @Override
    public void fly() {
        System.out.println("새 날기");
    }
}
