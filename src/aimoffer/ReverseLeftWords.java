package aimoffer;

public class ReverseLeftWords {


    public static void main(String[] args) {
        System.out.println(reverseLeftWords("helloworld",3));
    }



   /*使用截取字符串的方法*/
   private static String reverseLeftWords(String s, int n) {
        return s.substring(n,s.length()) + s.substring(0,n);
    }


   /*
    * 使用 StringBuilder
    public static String reverseLeftWords(String s, int n) {
        StringBuilder res = new StringBuilder();
        int count = 0;
        int count1 = 0;
        for(char c : s.toCharArray()){
            count++;
            if(count > n){
                res.append(c);
            }
        }

        for(char c : s.toCharArray()){
            count1++;
            if(count1 <= n){
                res.append(c);
            }
        }
        return res.toString();

    }*/


}
