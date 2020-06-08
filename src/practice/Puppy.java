package practice;


/**
 * @author mjs20
 */
public class Puppy {
    int puppyAge;

    public Puppy(String name){
        System.out.println("小狗的名字是：" + name);
    }

    public Puppy(){}

    public void setPuppyAge(int age) {
        this.puppyAge = age;
    }

    public int getPuppyAge() {
        System.out.println("小狗的年龄：" + puppyAge);
        return puppyAge;
    }

    public static void main(String[] args) {
        Puppy puppy = new Puppy("John");

        puppy.setPuppyAge(12);
        puppy.getPuppyAge();
        System.out.println("访问成员变量的方式获取小狗的年龄：" + puppy.puppyAge);
    }





}

/*
    实例化对象
    Object referenceVariable = new Constructor();
    访问类中的变量
    referenceVariable.variableName;
    访问类中的方法
    referenceVariable.methodName();
*/

// 同时一个java文件中只能有一个public类，可以有多个非public类。