package com.Oop4;


class datahide{
	private int AcNo;
	private String AcHolderName;
	private String BankName;
	private Integer balance;
	public int getAcNo() {
		return AcNo;
	}
	public void setAcNo(int acNo) {
		this.AcNo = acNo;
	}
	public String getAcHolderName() {
		return AcHolderName;
	}
	public void setAcHolderName(String acHolderName) {
		this.AcHolderName = acHolderName;
	}
	public String getBankName() {
		return BankName;
	}
	public void setBankName(String bankName) {
		this.BankName = bankName;
	}
	public Integer getBalance() {
		return balance;
	}
	public void setBalance(Integer balance) {
		this.balance = balance;
	}
	
	
	
}



public class Encapsulation2 {

	// Encapsulation is to achieve writing the variables as a private and 
	// all the get and set method as a public 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		datahide dt= new datahide();
		dt.setAcNo(512201);
		dt.setAcHolderName("Prasanth");
		dt.setBankName("Canara Bank");
		dt.setBalance(100);
		dt.setAcNo(512202);
		
		System.out.println(dt.getAcNo()+" "+dt.getBalance()+" "+dt.getAcHolderName()+" "+ dt.getBankName()+" ");
		
	}

}
