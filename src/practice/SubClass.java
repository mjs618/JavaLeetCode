package practice;


import practice.package1.SuperClass;

/**
 * @author mjs20
 */
public class SubClass extends SuperClass {
    @Override
    public void hello() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        subClass.hello();
    }
}
