
public class Customer {
	private String Firstname;
	private String Lastname;
	private int debitcard;

	public String getFirstname() {
		if (Firstname == null) {
			String v="error plz pass correct value";
			return v;
		}
		else {
			return Firstname;
		}
	}

	public void setFirstname(String firstname) {
		if (firstname == null) {
			System.out.println("error plz pass correct value");
		}
		this.Firstname = firstname;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		this.Lastname = lastname;
	}

	public int getDebitcard() {
		return debitcard;
	}

	public void setDebitcard(int debitcard) {
		this.debitcard = debitcard;
	}

}
