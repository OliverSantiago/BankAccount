public class BankTester{
  public static void main(String[] args) {
    BankAccount fa = new BankAccount(2, "password");
    System.out.println(fa.getBalance());
    System.out.println(fa.getAccountID());
    fa.setPassword("newPass");
    System.out.println(fa.deposit(100.0));
    System.out.println(fa.deposit(200.0));
  }
}
