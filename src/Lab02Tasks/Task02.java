package Lab02Tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] array= new int[10];
        int sum1=0;
        int sum2=0;

        System.out.println("Enter 10 numbers between 1-100");
        for(int i=0 ; i<10 ; i++){
            array[i] = scanner.nextInt();
            if(array[i] % 2 ==  0){
                sum1+= array[i];
            }
            else{
                sum2+=array[i];
            }
        }
        System.out.println("The sum of even numbers is " + sum1 );
        System.out.println("The sum of odd numbers is " + sum2 );
    }
}
