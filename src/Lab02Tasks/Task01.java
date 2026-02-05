package Lab02Tasks;

import java.util.Scanner;
public class Task01 {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        boolean flag;
        do{
           int total = 0;
           System.out.println("Enter First item name");
           String item1name = scanner.next();
           System.out.println("Enter Price:");
           total+= scanner.nextInt();
           System.out.println("Enter Second item name");
           String item2name = scanner.next();
           System.out.println("Enter Price:");
           total+= scanner.nextInt();
           System.out.println("Enter Third item name");
           String item3name = scanner.next();
           System.out.println("Enter Price:");
           total+= scanner.nextInt();
           System.out.println("Enter Fourth item name");
           String item4name = scanner.next();
           System.out.println("Enter Price:");
           total+= scanner.nextInt();
           System.out.println("Enter Fifth item name");
           String item5name = scanner.next();
           System.out.println("Enter Price:");
           total+= scanner.nextInt();

           System.out.println("Subtotal:" + total);
           System.out.println("Discount Percent: 10 %" );
           int discountAmount = total/10;
           System.out.println("Discount Amount:" + discountAmount);
           System.out.println("Sales Tax: 5%");
           int totalBeforeTax = total - (total/20);
           System.out.println("Total before tax:" + totalBeforeTax);
           total-=discountAmount;
           System.out.println("Invoice total:" + total);
           String check;
           System.out.println("Do you want to continue?(y/n)");
           check = scanner.next();
           if(check.equals("y") || check.equals("Y"))
           flag = true;
           else flag=false;




       }while(flag);
    }
}
