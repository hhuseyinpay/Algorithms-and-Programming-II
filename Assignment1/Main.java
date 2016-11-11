package deu.Assignment1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// classların-fonksiyonların doğru çalıştığını göstermek için bir kaç
		// bilgi tam girildikten sonra diğerleri null olarak atanmıştır.
		// tam bilgilerde girilse sorun oluşturmayacaktır ancak hem
		// okunabilirlik artacaktı hemde zaman kaybı.

		Date d1 = new Date(2010, 12, 1);
		Date d2 = new Date(2020, 12, 1);
		Adress a1 = new Adress("izmir", "yeni gün", "hasan");
		Adress.Phone p1 = new Adress().new Phone("555", "555", "555");

		Coach c1 = new Coach("Mustafa Denizli", d1, d2, 10000, a1, p1);
		Sponsor sp1 = new Sponsor("coco cola", p1, d2);

		Team gs = new Team("gs", "Galatasaray", "1905", 10, "uefa", "yellow", "red", c1, 0);
		Team fb = new Team("fb", "Fenerbahçe", "1907", 3, "super lig", "yellow", "dark blue", c1, 0);
		Team bjk = new Team("bjk", "Beşiktaş", "1903", 2, "nothing", "white", "black", c1, 0);
		Team ts = new Team("ts", "Trabzonspor", "1950", 2, "nothing", "claret red", "blue", c1, 0);

		gs.addSponsor(sp1);
		fb.addSponsor(sp1);
		bjk.addSponsor(sp1);
		ts.addSponsor(sp1);

		Player pl1 = new Player("1111111", "ali deneme", null, "turkish", null, null, 0, "goal keeper");
		Player pl2 = new Player("2222222", "veli deneme", null, "turkish", null, null, 0, "Defance");
		Player pl3 = new Player("333333", "deli deneme", null, "turkish", null, null, 0, "Defance");
		Player pl4 = new Player("1111112311", "ahmet deneme", null, "turkish", null, null, 0, "Defance");
		Player pl5 = new Player("112312111111", "mehmet denememe", null, "turkish", null, null, 0, "mid fielder");
		Player pl6 = new Player("123124123124", "sabri sarıoğlu", null, "turkish", null, null, 0, "mid fielder");
		Player pl7 = new Player("1231aa123", "muslera aaaa", null, "america", null, null, 0, "attack");
		Player pl8 = new Player("123", "linoel messi", null, "argentina", null, null, 0, "attack");
		Player pl9 = new Player("111afaf1111", "pele", null, "brasil", null, null, 0, "Defance");
		Player pl10 = new Player("1111231fc1111", "hasan pay ", null, "turkish", null, null, 0, "attack");
		Player pl11 = new Player("1113333", "hüseyin pay", null, "turkish", null, null, 0, "mid filder");
		Player pl12 = new Player("666666", "hasan hüseyin pay", null, "turkish", null, null, 0, "mid filder");

		gs.addPlayer(pl1);
		gs.addPlayer(pl2);
		gs.addPlayer(pl3);
		ts.addPlayer(pl4);
		ts.addPlayer(pl5);
		ts.addPlayer(pl6);
		fb.addPlayer(pl7);
		fb.addPlayer(pl8);
		fb.addPlayer(pl9);
		bjk.addPlayer(pl10);
		bjk.addPlayer(pl11);
		bjk.addPlayer(pl12);

		League l1 = new League("Super Lig", 4);
		l1.addTeam(gs);
		l1.addTeam(fb);
		l1.addTeam(bjk);
		l1.addTeam(ts);

		TFF tff = new TFF(11);
		tff.addLeague(l1);

		Stadium s1 = new Stadium("TTarena", "Istanbul", 50000, "68 x 105", true, "10000");
		tff.addStadium(s1);

		Referee r1 = new Referee("Cüneyt Çakır", a1, p1);
		tff.addReferee(r1);

		Scanner scan = new Scanner(System.in);

		boolean flag = false;
		while (true) {
			System.out.println("\n\n\n------    MENU   -----------  " 
					+ "\n1-  List "
					+ "\n2-  Take a match information "
					+ "\n3-  Find the winner" 
					+ "\n4-  Exit" 
					+ "\n");

			switch (scan.next()) {
			case "1":
				tff.list();
				break;
			case "2":
				Team firstTeam;
				Team secondTeam;
				int fTGoal;
				int sTGoal;
				int goal = 0;
				System.out.println("First team: ");
				while (true) {
					String team = scan.next();
					if (tff.searchTeam(team) != null) {
						firstTeam = tff.searchTeam(team);
						break;
					} else
						System.out.println(team + " not found! Try again: ");
				}
				System.out.println("\nFirst team goal: ");
				while (true) {
					goal = scan.nextInt();
					if (goal > -1) {
						fTGoal = goal;
						break;
					} else
						System.out.println("The number of goals can’t be a negative number. Try again: ");
				}

				System.out.println("Second team: ");
				while (true) {
					String team = scan.next();
					if (tff.searchTeam(team) != null) {
						secondTeam = tff.searchTeam(team);
						break;
					} else
						System.out.println(team + " not found! Try again: ");
				}
				System.out.println("\nSecond team goal: ");
				while (true) {
					goal = scan.nextInt();
					if (goal > -1) {
						sTGoal = goal;
						break;
					} else
						System.out.println("The number of goals can’t be a negative number. Try again: ");
				}
				tff.machInfo(firstTeam, secondTeam, fTGoal, sTGoal);

				break;
			case "3":
				System.out.println(tff.findWinner());
				break;
			case "4":
				flag = true;
				break;
			default:
				System.out.print("Wrong Entry!");
				break;
			}
			
			if (flag) break;

		}

	}
}
