package deu.Hangman;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		// yeni kuyruk oluşturmak yerine arkaya ekleyerek devam edeceği için
		// 1000lik kuyruk oluşturuldu.
		Queue countries = new Queue(1000);

		Queue word = new Queue(1000);
		Queue board = new Queue(1000);
		Queue misses = new Queue(1000);

		countries.enqueue("Bahrain");
		countries.enqueue("Bangladesh");
		countries.enqueue("Barbados");
		countries.enqueue("Belarus");
		countries.enqueue("Belgium");
		countries.enqueue("Belize");
		countries.enqueue("Benin");
		countries.enqueue("Bhutan");
		countries.enqueue("Bolivia");
		countries.enqueue("Bosnia");
		countries.enqueue("Botswana");
		countries.enqueue("Brazil");
		countries.enqueue("Brunei");
		countries.enqueue("Bulgaria");

		int rnd = 0;
		String country = null;// countries kuyruğunda bulunan ülke isimleri
								// object
								// türünde, bunların harflerini direk olarak bir
								// kuyruğa atayamayacağımız için önce stringe
								// anacak ve
								// substring ile başka kuyruğa atanacak
								// NOT:Özge hocaya sorulmuştur..

		rnd = random.nextInt(countries.size() - 1);//en kötü durumda son elemanı alabilmek için -1.

		for (int i = 0; i < rnd; i++) {// choose random country
			countries.enqueue(countries.dequeue());
		}
		country = (String) countries.peek();

		for (int i = 0; i < country.length(); i++) {
			word.enqueue(country.substring(i, i + 1)); 
														
			board.enqueue("-");// atanan harf sayısı kadar boarda - atanacak
		}

		// game loop
		String letter = "";
		int counter = 0;
		while (true) {
			System.out.print("Word: ");
			for (int i = 0; i < board.size(); i++) {
				System.out.print(" " + board.peek());
				board.enqueue(board.dequeue());
			}

			System.out.print("         Misses: ");
			if (misses.size() > 0) {
				for (int i = 0; i < misses.size(); i++) {
					System.out.print(misses.peek() + " ");
					misses.enqueue(misses.dequeue());
				}
			} else
				System.out.println("");
			
			
			System.out.println("");
			System.out.print("Guess: ");

			letter = scanner.nextLine();

			// harfin daha önce kullanılıp kullanılmadığının kontrolü
			boolean flag = false;
			for (int i = 0; i < misses.size(); i++) {
				if (((String) misses.peek()).equalsIgnoreCase(letter)) {
					flag = true;
					System.out.println("You entered the same letter before.");
				}
				misses.enqueue(misses.dequeue());
			}
			if (flag) {// harf daha önce girildiyse başa dön
				continue;
			}
			for (int i = 0; i < board.size(); i++) {
				if (((String) board.peek()).equalsIgnoreCase(letter)) {
					flag = true;
					System.out.println("You entered the same letter before.");
				}
				board.enqueue(board.dequeue());
			}
			if (flag) {// harf daha önce girildiyse başa dön
				continue;
			}
			
			flag = true;//harfin olup olmadğının kontrolü için kullanılacak
			int boardSize = board.size();
			for (int i = 0; i < boardSize; i++) {
				if (((String) word.peek()).equalsIgnoreCase(letter)) {
					board.dequeue();
					board.enqueue(word.peek());
					word.enqueue(word.dequeue());
					flag = false;//harf varsa misses a eklenmeyecek.
				} else {
					board.enqueue(board.dequeue());
					word.enqueue(word.dequeue());
				}
			}
			if (flag) 
				misses.enqueue(letter);
			
			if (misses.size() > 6) {// 6 dan fazla hata yaptıysa bitecek
				System.out.println("You lost !!");
				break;
			}

		}

	}

}
