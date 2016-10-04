import java.util.Scanner;

class Loans{
  public static void main(String[] args) {


    int loan;
    int length;
    int interest;
    int deposit;

    Scanner input = new Scanner(System.in);

    System.out.println("Enter Carloan");
    loan = input.nextInt();
    System.out.println("You entered"+loan);

    System.out.println("Enter Length of loan");
    length = input.nextInt();
    System.out.println("You entered"+length);

    System.out.println("Enter Interest rate");
    interest = input.nextInt();
    System.out.println("You entered"+interest);

    System.out.println("Enter how much you deposit");
    deposit = input.nextInt();
    System.out.println("You entered"+deposit);

    int RemainingBalance = loan - deposit;

    int months = length * 12;

    int MonthlyAmount = RemainingBalance / months;

    int MonthlyPayment = MonthlyAmount + (MonthlyAmount * interest) / 100;

System.out.println(MonthlyPayment);
  }
}

/*
RemainingBalance = loan - deposit
months = length * 12
MonthlyAmount = RemainingBalance / months
MonthlyPayment = MonthlyAmount + (MonthlyAmount * interest) / 100
*/
