package datastructure.string;

public class BF {
    public static void main(String[] args) {
        char[] priChar = {'d','w','c','o','n','g','r','a','t','u','l','a','t','e','\0'};
        char[] subChar = {'c','o','n','g','r','a','t','u','l','a','t','e','\0'};
        int index = bf(priChar,subChar);
        System.out.println(index);
    }

    private static int bf(char[] priChar, char[] subChar) {
        int start = 0;
        int i = 0,j = 0;
        while (priChar[i] !='\0' && subChar[j] != '\0'){
            if(priChar[i] == subChar[j]){
                i++;
                j++;
            }else{
                start++;
                i= start;
                j = 0;
            }
        }
        if (subChar[j] == '\0'){
            return start + 1;
        }else{
            return 0;
        }
    }

}
