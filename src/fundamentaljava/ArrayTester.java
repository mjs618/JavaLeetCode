package fundamentaljava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayTester {

    public static void main(String[] args) {
        ArrayTester arrayTester = new ArrayTester();
        List<Integer> array = arrayTester.arrayList();
        array.remove(1);

        int[] array1 =  arrayTester.intsInit();
        System.out.println("array1 : " + Arrays.toString(array1) );

       int[] s =  Arrays.stream(array1).toArray();

        int[] array2 =  arrayTester.intsNew();


        System.out.println(" 通过ArrayList初始化数组 ");
        for (int i = 0; i <array.size() ; i++) {
            System.out.println( array.get(i));
        }

        System.out.println( "通过直接赋值初始化数组  " );

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }


        System.out.println( "通过实例化初始化数组 ");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
    }

    /*
    * 初始化一个长度为5的数组
    */
    private int[] intsNew(){
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        return array;
    }

    /*
    * 直接赋值
    */
    private int[] intsInit(){
        int[] array = {2,3,1,0,2};
        return array;
    }

    /*
    * 使用Arraylist 进行初始化，实现可变长数组
    */
    private List<Integer> arrayList(){
        List<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(3);
        array.add(12);
        array.add(10);
        return  array;
    }
}
