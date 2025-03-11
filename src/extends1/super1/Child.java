package extends1.super1;

public class Child extends Parent {
    public String value = "Child";

    @Override
    public void hello() {
        System.out.println("Hello Child");
    }

    public void call() {
        System.out.println("value:" + value);
        System.out.println("this.value:" + this.value);
        System.out.println("super.value: " + super.value);

        System.out.println();

        hello();
        this.hello();
        super.hello();
    }

}

