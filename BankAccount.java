public class BankAccount{
  private double balance;
  private int accountID;
  private String password;

  public BankAccount( int id,String p){
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

  public boolean deposit(double dep){
    if (dep>0){
      balance+=dep;
      return true;
    }
    return false;
  }

  public boolean withdraw(double wid){
    balance-=wid;
    if (balance<0){
      balance+=wid;
      return false;
    }
    return true;
  }

  public String toString(){
    String answer = "#";
    answer += Integer.toString(accountID);
    answer += "$";
    answer += Double.toString(balance);
    return answer;
  }

}
