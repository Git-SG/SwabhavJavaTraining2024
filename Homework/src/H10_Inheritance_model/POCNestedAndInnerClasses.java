package H10_Inheritance_model;

public class POCNestedAndInnerClasses {
	private String BankName = "Sarthak Gangan";
	private Integer numberOfBanks = 5;
	
	public static class Branch{
		private String branchName = "Kalwa";

		public Branch(String branchName) {
			super();
			this.branchName = branchName;
		}	
		
	}
	
	public class Customer{
		private String customerName = "Sarthak";

		public Customer(String customerName) {
			super();
			this.customerName = customerName;
		}				
	}

	public POCNestedAndInnerClasses(String bankName, Integer numberOfBanks) {
		super();
		BankName = bankName;
		this.numberOfBanks = numberOfBanks;
	}

	public String getBankName() {
		return BankName;
	}

	public Integer getNumberOfBanks() {
		return numberOfBanks;
	}

	@Override
	public String toString() {
		return "POCNestedAndInnerClasses [BankName=" + BankName + ", numberOfBanks=" + numberOfBanks + "]";
	}
	

}
