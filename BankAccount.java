public class BankAccount{
  private double balance;
  private int accountID;
  private String password;

  public BankAccount(String p, int id){
    balance = 0;
    accountID = id;
    password = p;
  }

  public double getBalance(){
    return balance;
  }

  public int getAccountID(){
    return accountID;
  }

  public void setPassword(String newPass){
    password = newPass;
  }

  public boolean deposit(int dep){
    if (dep>0){
      balance+=dep;
      return true;
    }
    return false;
  }


}
