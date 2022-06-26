
public class If_else {
	public static void main(String[] args) {
		int maths=36;
		int physics=35;
		int chemsitry=35;
		
		if (maths<35 || physics<35 || chemsitry<35 ) {
			System.out.println("failed");
		}
		else {
			int avg=maths+physics+chemsitry;
			if (avg<=59) {
				System.out.println("Grade C");
			}
			else if(avg<=69) {
				System.out.println("Grade B");
			}
			else {
				System.out.println("Grade A");
			}
		}
	}
}
