import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCalc {

    public static void main(String[] args) {

       Operations operations = new Operations();
       Scanner scanner = new Scanner(System.in);

       System.out.println("How many items have you purchased?");
       int userInput = Integer.valueOf(scanner.nextLine());
       System.out.println("Number of purchased items: " + userInput);

       ArrayList listItem = new ArrayList();
       ArrayList listPrice = new ArrayList();
       String itemName ="";
       int itemPrice=0;

       for (int i=0; i< userInput; i++) {
           System.out.println("Please type the name of the item #" + (i+1) +" : ");
           itemName = scanner.nextLine();
           listItem.add(itemName);
           System.out.println("Please type the price of the item #" + (i+1) + " in dollar: ");
           itemPrice= Integer.valueOf(scanner.nextLine()); //scanner.nextInt(); - valamiert ezzel nem varta meg a user inputot a itemname esetén
           listPrice.add(itemPrice);
       }

       for (int i=0; i< userInput; i++) {
           System.out.println("The purchesed items are: " + listItem.get(i)+" " + listPrice.get(i) + " dollar" );
        }

       System.out.println("Please choose the operation: "
                +"\n" + "#1 - Payment calculator"
                + "\n" + "#2 - Residual amount of money after payment"
                + "\n" + "#3 - Credit option" );

       int operationNumber =  scanner.nextInt();

       int sum=0;
       for (int i=0; i<listPrice.size(); i++){
           sum+= (int) listPrice.get(i);
       }

       switch(operationNumber){
           case 1:
               System.out.println(("Please pay the following amount: ")+ sum);
               break;
           case 2:
               System.out.println("How much money do you have?: ");
               int userMoney = Integer.valueOf(scanner.nextLine());
               System.out.println(sum-userMoney);
               break;
           case 3:
               System.out.println("How much money do you need?: ");
               int userNeed = scanner.nextInt();
               System.out.println("What interest rate do you get from your bank monthly in %?: ");
               int userRate = scanner.nextInt();
               System.out.println("How long do you need the banks money (in months)?: ");
               int userCreditLength= scanner.nextInt();
               double moneyBanks = operations.interestSum(userNeed, userRate, userCreditLength);
               System.out.println("You will need to pay at the end the following amount: " + moneyBanks);
               break;
       }

        //System.out.println(("Please pay the following amount: ")+ operations.sum(3,5));
    }
}
