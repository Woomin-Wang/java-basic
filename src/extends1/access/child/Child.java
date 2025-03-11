package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {

    public void call() {
        publicValue = 1;
        protectedValue = 2;
//      defaultValue = 3;

        publicMethod();
        protectedMethod();

        printParent();

    }
}
