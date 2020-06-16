package ReplHomeworks;

public class Account {
	
	private long acc_no;
	  private String name;
	  private String email;
	  private double amount;
	  
	  public void setAcc_No(long acc_no){
	    this.acc_no=acc_no;
	  }
	  public long getAcc_no(){
	    return acc_no;
	  }
	  public void setName(String name){
	    this.name=name;
	  }
	  public String getName(){
	    return name;
	  }
	  public void setEmail(String email){
	    this.email=email;
	  }
	  public String getEmail(){
	    return email;
	  }
	  public void setAmount(double amount){
	    this.amount = amount;
	  }
	  public double getAmount(){
	    return amount;
	  }
	  public static void main (String [] args){
		    
	  Account user = new Account();
	    user.setAcc_No(756050);
	    user.setName("Sumair");
	    user.setEmail("sumair@syntax.com ");
	    user.setAmount(50000.0);
	    
	    System.out.println(user.getAcc_no()+" "+user.getName()+" "+user.getEmail()+" "+user.getAmount());
	  }
	}