package fundamentaljava;

import java.net.ConnectException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;

public class HashClass {
    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable();
        HashMap<String, Integer[]> hashMap = new HashMap();
        Integer[] integer = new Integer[]{2,3,5};
         Map map = new HashMap();
         map.keySet();
        hashMap.keySet();

        String a = "abc";
        String b = "abc";
        if (a.equals(b)){
            System.out.println("a等于b" +" "+ "a的HashCode:"+ a.hashCode()+"\n" + "b的HashCode: " + b.hashCode() );
       }
        HashSet hashSet = new HashSet();


        hashMap.put("31",integer);
//        hashMap.put("2",23);
//        hashMap.put("3",33);
        if (hashMap.get("31").hashCode() != 0 )
        {
            System.out.println(hashMap.get("31"));
            Integer[] h = hashMap.get("31");
            for (int i = 0; i < h.length ; i++) {
                System.out.println(h[i].intValue());
            }
            //System.out.println("HASHCODE相等");

        }else{
            System.out.println("HASHCODE不相等");
        }

        hashSet.add(integer);
        for (int i = 0; i < hashSet.size() ; i++) {
            hashSet.forEach(num ->{
                System.out.println(num.toString());
            });

        }
        if (hashSet.contains(integer)){
            System.out.println(hashSet.size());
            System.out.println("找到HashSet对象");
            hashSet.remove(integer);
            System.out.println("删除HashSet");
        }


    }
}
