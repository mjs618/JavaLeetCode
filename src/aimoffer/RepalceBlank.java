package aimoffer;

public class RepalceBlank {

    public static void main(String[] args) {
        String strings = "we are happy";
        System.out.println(replaceBlank(strings));

    }


    /* 直接替换
    public static String replaceBlank(String string){
        int n = string.length();
        char[] array = new char[ n * 3];

        int size = 0;
        for (int i = 0; i < n; i++) {
            char c = string.charAt(i);
            if (c == ' '){
                array[size ++] = '%';
                array[size ++] = '2';
                array[size ++] = '0';
            }
            else {
                array[size++] = c;
            }
            System.out.println(array);
        }
        String newString = new String(array,0,size);
        return newString;
    }
*/

    /*
     *使用StringBuilder进行存储
     */
    private static String replaceBlank(String strings) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : strings.toCharArray()) {
            if (c == ' '){
                stringBuilder.append("%20");
            }else{
                stringBuilder.append(c);
            }
        }

        return stringBuilder.toString();
    }



}


