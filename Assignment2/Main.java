package deu.findPair;

import java.awt.TexturePaint;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		Stack animals = new Stack(12);
		Stack temp = new Stack(24);

		animals.push("dog");
		animals.push("cat");
		animals.push("bird");
		animals.push("horse");
		animals.push("cow");
		animals.push("owl");
		animals.push("lizard");
		animals.push("eagle");
		animals.push("hawk");
		animals.push("tiger");
		animals.push("lion");
		animals.push("shark");

		System.out.println("Please enter the number of pairs ");

		int amount;
		while (true) {
			amount = scanner.nextInt();
			if (0 < amount && amount < 13) {
				break;
			} else {
				System.out.println("Please enter number amount 1-12, Try again:");
			}
		}

		Stack gameAnimal = new Stack(amount * 2);
		Stack gameAnimal2 = new Stack(amount * 2);

		// // hayvanları rasgele seçimle almak için
		for (int i = 0; i < amount; i++) {
			int rnd = random.nextInt(animals.size());
			for (int j = 0; j < rnd; j++) {
				temp.push(animals.pop());
			}
			gameAnimal.push(animals.peek());
			gameAnimal.push(animals.pop());

			while (!temp.isEmpty()) {
				animals.push(temp.pop());
			}
		}
		// hayvanların 2şerli sıralarını bozmak için
		// temp.clear();
		for (int i = 0; i < amount * 2; i++) {
			int rnd = random.nextInt(gameAnimal.size());
			Object obj = null;
			for (int j = 0; j < rnd; j++) {
				temp.push(gameAnimal.pop());
			}
			obj = gameAnimal.pop();

			while (!temp.isEmpty()) {
				gameAnimal.push(temp.pop());
			}
			gameAnimal2.push(obj);
		}
		while (!gameAnimal2.isEmpty()) {
			gameAnimal.push(gameAnimal2.pop());
		}

		// oyun
		int step = 0;
		int score = 0;

		System.out.println("Step: 0        Score : 0");
		while (!gameAnimal.isEmpty()) {
			System.out.print("    " + gameAnimal.peek());
			gameAnimal2.push(gameAnimal.pop());
		}
		System.out.println("");
		while (!gameAnimal2.isEmpty()) {
			gameAnimal.push(gameAnimal2.pop());
		}

		while (!gameAnimal.isEmpty()) {
			step++;

			int number1;
			int number2;
			if (gameAnimal.size() > 2) {// random sayı üretirken stack'in
										// büyüklüğü 2den küçük olursa hata
										// verir.
				number1 = random.nextInt(gameAnimal.size() - 2) + 1;
				while (true) {
					number2 = random.nextInt(gameAnimal.size() - 1) + 1;
					if (number1 < number2)
						break;
				}
			} else {
				number1 = 1;
				number2 = 2;
			}

			System.out.println("Step: " + step + "        Score: " + score);
			System.out.println("Randomly generated numbers: " + number1 + "  " + number2);

			Object animal1 = null;
			Object animal2 = null;

			int size = gameAnimal.size();
			for (int i = 0; i < size - number1; i++) {
				gameAnimal2.push(gameAnimal.pop()); // üretilen sayıya(indexe)
													// kadar ilerle
			}
			animal1 = gameAnimal.peek();

			while (!gameAnimal2.isEmpty()) {
				gameAnimal.push(gameAnimal2.pop()); // gameAnimal'i eski haline
													// getirir
			}
			for (int i = 0; i < size - number2; i++) {
				gameAnimal2.push(gameAnimal.pop());
			}
			animal2 = gameAnimal.peek();

			while (!gameAnimal2.isEmpty()) {
				gameAnimal.push(gameAnimal2.pop());
			}

			if (animal1.equals(animal2)) { // hayvanlar aynı ise
				score += 20;

				for (int i = 0; i < size - number2; i++) {
					gameAnimal2.push(gameAnimal.pop());
				}
				gameAnimal.pop(); // hayvanı sil.
				while (!gameAnimal2.isEmpty()) {
					gameAnimal.push(gameAnimal2.pop());
				}

				// hayvan silinince stack küçüldü. aynı şekilde ikinci indexte
				// küçülür.
				size--;
				for (int i = 0; i < size - number1; i++) {
					gameAnimal2.push(gameAnimal.pop());
				}
				gameAnimal.pop(); // hayvanı sil.
				while (!gameAnimal2.isEmpty()) { // kalanlarını ana stack'e
													// topla.
					gameAnimal.push(gameAnimal2.pop());
				}

			} else
				score -= 1;

			// ekrana yaz
			while (!gameAnimal.isEmpty()) {
				System.out.print("    " + gameAnimal.peek());
				gameAnimal2.push(gameAnimal.pop());
			}
			System.out.println("");
			while (!gameAnimal2.isEmpty()) {
				gameAnimal.push(gameAnimal2.pop());
			}
		}
		System.out.println("Game is over.");

	}

}
