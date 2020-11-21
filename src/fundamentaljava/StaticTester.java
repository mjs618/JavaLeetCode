package fundamentaljava;

public class StaticTester {
    public static void main(String[] args) {
        StaticMethod staticClass = new StaticMethod();
        staticClass.setAge(20);


        StaticMethod.setName("拉斯韦");
        int rst = StaticMethod.one(2);
        System.out.println(rst);
        new StaticMethod.Name();


        StaticMethod.Price(67);
        int rst1 = staticClass.one1(2);
        System.out.println(rst1);
        int age = staticClass.getAge();
        System.out.println(age);

    }
}
