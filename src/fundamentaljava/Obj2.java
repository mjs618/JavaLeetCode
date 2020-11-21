package fundamentaljava;

public class Obj2 extends ObjTest {
    public Obj2(String name, int age) {
        super(name, age);
    }

    public static void main(String[] args) {


        ObjTest objTest =  new ObjTest("张三",23);
        ObjTest objTest1 =  new ObjTest("张三",23);

        ObjTest objTest2 = null;
        objTest2.setName("zhang");
        objTest2.setAge(23);
        Object obj = new Object();
        Object rst = obj.getClass();
        if (objTest.hashCode() == objTest1.hashCode()){
            System.out.println("hashCode值相等");
        }else{
            System.out.println(objTest.hashCode()+""+ objTest1.hashCode() );
        }

    }

}
