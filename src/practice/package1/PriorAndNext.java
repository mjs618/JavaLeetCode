package practice.package1;

/**
 * @author mjs20
 */
public class PriorAndNext {
    public static void main(String[] args) {
       int b = addint(5,3);
       System.out.println(b);
    }

    public static int addint(int a, int b ){
        int temp = 0;
        if (a > b){
            temp = a;
            a = b;
            b = temp;

        }
        return (add(a,b));
    }

    private static int add(int a, int b){

        if(a == 0){
            return b;
        }
        else
            {
                return add(prior(a),next(b));
            }
    }

    private static int prior(int p){
        p = p - 1;
        return p;
    }

    private static int next(int n){
        n = n + 1;
        return n;
    }
}
