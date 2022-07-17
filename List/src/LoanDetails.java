public class LoanDetails {
    String AccountHolder;
	long AccountNumber;
	int LoanAmount;
	float LoanInterest;
	float subsidary;
	public String getAccountHolder() {
		return AccountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		AccountHolder = accountHolder;
	}
	public long getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		AccountNumber = accountNumber;
	}
	public int getLoanAmount() {
		return LoanAmount;
	}
	public void setLoanAmount(int loanAmount) {
		LoanAmount = loanAmount;
	}
	public float getLoanInterest() {
		return LoanInterest;
	}
	public void setLoanInterest(float loanInterest) {
		LoanInterest = loanInterest;
	}
	public float getSubsidary() {
		return subsidary;
	}
	public void setSubsidary(float subsidary) {
		this.subsidary = subsidary;
	}
	public LoanDetails(String accountHolder, long accountNumber, int loanAmount, float loanInterest, float subsidary) {
		super();
		AccountHolder = accountHolder;
		AccountNumber = accountNumber;
		LoanAmount = loanAmount;
		LoanInterest = loanInterest;
		this.subsidary = subsidary;
	}
	public LoanDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "LoanDetails [AccountHolder=" + AccountHolder + ", AccountNumber=" + AccountNumber + ", LoanAmount="
				+ LoanAmount + ", LoanInterest=" + LoanInterest + ", subsidary=" + subsidary + "]";
	}
	
}