public class CustomerList {							

	private int customerId;
	private String firstNameId;	
	private String lastNameId;
	


	public CustomerList(){}

	public CustomerList(int customerId,String firstNameId,String lastNameId) {		

		this.customerId = customerId;
		this.firstNameId = firstNameId;
		this.lastNameId = lastNameId;


	}		

	public int getCustomerId() {	
		return this.customerId;
	}
	public void setCustomerId(int customerId) {	
               this.customerId = customerId;
	}
        public String getFirstNameId() {
               return this.firstNameId;
	} 
	public void setFirstNameId(String firstNameId){	
	       this.firstNameId = firstNameId;
	}
	public String getLastNameId() {
		return this.lastNameId;
	}
	public void setlastNameId(String lastNameId) {	
	        this.lastNameId = lastNameId;
	}
}
