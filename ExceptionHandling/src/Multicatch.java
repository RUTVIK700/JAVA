
public class Multicatch {

	public static void main(String[] args) {
		try {
			String input= args[0];
			System.out.println("INPUT "+input);
			int output=Integer.parseInt(input);
			System.out.println("OUTPUT "+output);
		} catch (NumberFormatException e) {
			System.out.println("please give input");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("totally wrong");
		}
	}

}
