package OSS_Project.maven;

import java.io.Console;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("두 숫자 입력 : ");

    	int num1 = sc.nextInt();
    	int num2 = sc.nextInt();
    	
    	int result = sum(num1, num2);
        System.out.println("result = " + result);
    }
    public static int sum(int a, int b) {
    	return a+b;
    }
}
