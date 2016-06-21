/** Classe Customer*/

public class Customer {	

             //proprietes de la classe
             private int customerId;
	     private String firstName;
	     private String lastName;
	     private String address;
	     private long phoneNumber;

	     //les methodes de la classe
	     public int getCustomerId() {		
                     return this.customerId;
	   } 
 	     public void setCustomerId(int customerId) {	
	            this.customerId = customerId;
       	   }
 	     public String getFirstName() {
                    return this.firstName;
           }
	     public void setFirstName(String firstName) {		
	              this.firstName = firstName;
	   }
             public String getLastName() {		
                   return this.lastName;
           }
             public void setLastName(String lastName) {	
	          this.lastName = lastName;
	   }
	     public String getAddress() {
                  return this.address;
	   }
             public void setAddress(String address){	
                 this.address = address;
           } 





}
