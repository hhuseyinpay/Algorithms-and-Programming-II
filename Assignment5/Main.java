import java.util.Random;

public class Main {

	public static void main(String[] args) {

		Random random = new Random();
		DLL dll = new DLL();
		MLL mll = new MLL(7);
		int number = 0;
		for (int i = 0; i < 14; i++) {
			number = random.nextInt(30) + 1;
			dll.insert(number);
			mll.insert(number);
		}
		dll.display();
		System.out.println("");
		mll.display();
	}
}
