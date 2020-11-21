package datastructure.stack;

import jdk.nashorn.internal.runtime.regexp.joni.encoding.ObjPtr;

public class Expression {
    private String expr;

    public Expression(String expr) {
        this.expr = expr;
    }

    public int compute(){
        char[] OPND = new char[10];
        char[] OPTR = new char[10];
        OPTR[0] = '#';
        int top1 = -1,top2 = 0;
        char[] chars = expr.toCharArray();
        for (int i = 0; i < chars.length ; i++) {
            int grade,num1,num2,oper,result = 0;
            if (chars[i] >= 48 && chars[i] <= 57){
                OPND[++top1] = (char) (chars[i++]-48);
            }else {
                grade = comp(chars[i],OPTR[top2]);
                if (grade == 1){
                    OPTR[++top2] = chars[i++];
                }
                else if(grade ==-1){
                    num2 = OPND[top1--];
                    num1 = OPND[top1--];
                    oper = OPTR[top2--];
                    switch (oper){
                        case '+':
                            result = num1 + num2;
                            break;
                        case '-':
                            result = num1 - num2;
                            break;
                        case '*':
                            result = num1 * num2;
                            break;
                        case '/':
                            result = num1 / num2;
                            break;
                        default:break;

                    }
                    OPND[++top1] = (char) result;
                }else{
                    top2--;
                    i++;
                }
            }

        }
        return OPND[top1];

    }

    private int comp(char oper1, char oper2){
        int index = 0;
        switch (oper1){
            case '+': case '-':if (oper2 =='(' || oper2 == '#'){
                index = -1;
            }break;
            case '*': case '/':if (oper2 =='*' || oper2 == '/'){
                index = -1;
            } else {
                index = 1;
            }break;
            case '(': index = 1;break;
            case ')':if (oper2 =='(') {
                index = 0;
            }else {
                index = -1;
            }break;
            case '#':if (oper2 == '#'){
                index = 0;
            }else {
                index = -1;
            }break;
            default:break;

        }
        return index;
    }
    
}
