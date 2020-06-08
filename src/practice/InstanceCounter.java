package practice;

import org.jetbrains.annotations.Contract;

/**
 * @author mjs20
 */
public class InstanceCounter {


    private  static  int numInstances = 0;
    @Contract(pure = true)
    public static int getNumInstances() {
        return numInstances;
    }

    private static void addInstance(){
        numInstances++;
    }

    InstanceCounter(){
            InstanceCounter.addInstance();
    }
    public static void main(String[] args) {
        int count =500;
        System.out.println("Starting with " + InstanceCounter.getNumInstances() + " instances");
        for (int i = 0; i < count ; i++) {
            new InstanceCounter();
        }
        System.out.println("Created " + InstanceCounter.getNumInstances() + " instances");
    }


}


/*
*
* ## 数据类型
* 内置数据类型
*
    byte short int long float boolean char

* 引用数据类型
*
 对象和数组都是引用数据类型.

 所有引用类型的默认值都是 null.

 一个引用变量可以用来引用任何与之兼容的类型
 例子：Site site = new Site("Runoob")。

* Java 常量

 在 Java 中使用 final 关键字修饰常量


//符号	字符含义
// \n	    换行 (0x0a)
//\r	    回车 (0x0d)
//\f	    换页符(0x0c)
//\b	    退格 (0x08)
//\0	    空字符 (0x0)
//\s	    空格 (0x20)
//\t	    制表符
//\"	    双引号
//\'	    单引号
//\\	    反斜杠
//\ddd	八进制字符 (ddd)

*/



/*
* 低  ------------------------------------>  高

   byte,short,char—> int —> long—> float —> double

*  1. 不能对boolean类型进行类型转换。

*  2. 不能把对象类型转换成不相关类的对象。

*  3. 在把容量大的类型转换为容量小的类型时必须使用强制类型转换。

*  4. 转换过程中可能导致溢出或损失精度，

* 强制类型转换
*  1. 条件是转换的数据类型必须是兼容的。

*  2. 格式：(type)value type是要强制类型转换后的数据类型
*
*/

