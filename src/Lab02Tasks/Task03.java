package Lab02Tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = scanner.nextInt();
        for(int i=1; i<=10; i++){
            int ans = i * x;
            System.out.println(x + " x " + i + " = " + ans );
        }
    }
}
