package c22;

public abstract class Bank {
  String name;
  String account;
  int totalAmount;

  public Bank() {
    System.out.println("Back constructor");
  }

  public Bank(String name, String account, int totalAmount) {
    this.name = name;
    this.account = account;
    this.totalAmount = totalAmount;
  }

  // deposit, withdraw는 정해짐
  public void deposit() {
    System.out.println("deposit()");
  }

  public void withdraw() {
    System.out.println("withdraw()");
  }

  // installmentSavings, cancellation은 알아서 구현하도록 함
  public abstract void installmentSavings();

  public abstract void cancellation();

  public void getInfo() {
    System.out.println("name: " + name);
    System.out.println("account: " + account);
    System.out.println("totalAmount: " + totalAmount);
  }
}
