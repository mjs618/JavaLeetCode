package fundamentaljava;

public class ObjTest {
    private String name;
    private int age;

    public ObjTest(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {
        Object object = new Object();

        Object rst = object.getClass();
        Boolean isEqual = object.equals(rst);
        System.out.println(rst +" "+ isEqual.toString());

    }
}
