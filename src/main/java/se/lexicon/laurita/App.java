package se.lexicon.laurita;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        double num1= 7, num2= 5, result= 0;
        char operator= '*';
        switch (operator) {
            case '+':
                result= num1+ num2;
            break;
            case '-':
                result= num1-num2;
            break;
            case '*':
                result= num1* num2;
            break;
            case '/':
                result= num1/ num2;
            break;
            default:
                System.out.println(operator+ " is not supported");
        }
        System.out.println(result);


    }
}
