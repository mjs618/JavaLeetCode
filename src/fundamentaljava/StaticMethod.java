package fundamentaljava;

public class StaticMethod {
    public static Object Price;
    private  int age;

    public static void Price(int price                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ) {
        System.out.println(name + price);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        StaticMethod.name = name;
    }

    public static  String name;

    public static class Name{
        public static void main(String[] args) {
            System.out.println("静态类运行" + name);
        }
    }

    public class Price{
        public void price(int price){

        }
    }

    public StaticMethod() {
        System.out.println("非静态方法");
    }





    private void printOutName(String name){
        name = StaticMethod.name;
        System.out.println(name);
    }

    public static  int one (int num){
        System.out.println(num);
        num ++;
        return num;
    }
    public int one1 (int num){
        System.out.println(num);
        ++num;
        return num;
    }

}
