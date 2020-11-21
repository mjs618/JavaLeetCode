package practice;

/**
 * @author mjs20
 * @date 202006008
 */
public class SwitchTest {

    private void yourGrade(char grade){
        switch (grade)
        {
            case'A':
                System.out.println("优秀");
                break;

            case 'B':
                System.out.println("良好");
                break;

            case 'C':
                System.out.println("及格");
                break;
        }

    }

    public static void main(String[] args) {
        SwitchTest switchTest = new SwitchTest();
        char grade = 'C';
        switchTest.yourGrade(grade);

    }
}
