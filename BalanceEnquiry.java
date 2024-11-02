public abstract class BalanceEnquiry{
    public String PIN;
    public float balance;
    public BalanceEnquiry(){
        this.balance = 5000000;
        this.PIN = "5403";
    }
    public String getPIN(){
        return this.PIN;
    }
    public float getBalance(){
        return this.balance;
    }
    public abstract void balance_enquiry();
}
