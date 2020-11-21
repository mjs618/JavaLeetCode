package datastructure;

import java.util.Arrays;

/**
 * @author mjs20
 */
@SuppressWarnings("ALL")
public class SqList {


    public static void main(String[] args) {
        String[] strings = {"张三","赵四","王五","张三","李四"};
        String[] index = returnIndex(strings,"张三");
        for (int i = 0; i <index.length ; i++) {
            if (index[i] != null){
                System.out.println(i);
            }

        }

    }

    public static String[] returnIndex(String[] strings, String s){
        String[] index = new String[100];
        for (int i = 0; i < strings.length; i++){
            if(s == strings[i]){
               index[i] = strings[i];
            }
        }
        return index;
    }

}
