package Lab02Tasks;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students:");
        int Students = scanner.nextInt();
        System.out.println("Enter the marks for all " + Students + " students:");
        int[] arr = new int[Students];

        int sum=0;
        int countPass=0;
        int countFail = 0;
        for (int i=0; i<Students ; i++){
            arr[i]= scanner.nextInt();
            sum += arr[i];
            if (arr[i]<60){
                countFail++;
            }
            else countPass++;

        }
        double avg = (double) sum/Students;
        System.out.println("Average: "+ avg);
        System.out.println(countPass + " students passed");
        System.out.println(countFail + " students failed");

    }
}
