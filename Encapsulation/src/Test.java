
public class Test {

	public static void main(String[] args) {
		Customer c = new Customer();
		c.setFirstname(null);
		c.setLastname("Bhalekar");
		c.setDebitcard(1242);

		System.out.println("firstname= " + c.getFirstname());
		System.out.println("Lastname= " + c.getLastname());
		System.out.println("Debitcard= " + c.getDebitcard());
	}

}
