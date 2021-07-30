package c22;

public class MainClass {
  public static void main(String[] args) {
    Bank myBank = new MyBank("아잠만", "123-4567-8901", 10000);

    myBank.deposit();
    myBank.withdraw();
    myBank.installmentSavings();
    myBank.cancellation();

    System.out.println();

    myBank.getInfo();
  }
}
