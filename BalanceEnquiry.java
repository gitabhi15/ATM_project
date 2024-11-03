public abstract class BalanceEnquiry{
    public static String PIN;
    public static float balance;
    public BalanceEnquiry(){
        balance = 5000000;
        PIN = "5403";
    }
    public String getPIN(){
        return PIN;
    }
    public float getBalance(){
        return balance;
    }
    public abstract void balance_enquiry();
}
