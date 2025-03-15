package poly.basic;

public class PolyMain {
    public static void main(String[] args) {

        System.out.println("Parent -> parent");
        Parent parent = new Parent();
        parent.parentMethod();

        System.out.println();

        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        System.out.println();

        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentMethod();

        //Child child1 = new Parent(); 자식은 부모를 담을 수 없다.

//        자식은 기능은 호출할 수 없다. 컴파일 오류
//        poly.childMethod();



    }
}