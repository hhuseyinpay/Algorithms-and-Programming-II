import java.util.Random;

public class DNA {

	public static void main(String[] args) {

		SLL dna = new SLL();
		SLL cmpDna = new SLL();

		dna = randomGenerate(30);
		dna.display();
		System.out.println("");
		cmpDna = comploment(dna);
		cmpDna.display();
		System.out.println("");
		// ------------------------------------------------------------------
		SLL SLL3 = new SLL();
		SLL SLL4 = new SLL();

		SLL3.add("AAA");
		SLL4.add("Lys");
		SLL3.add("ACA");
		SLL4.add("Thr");
		SLL3.add("ATA");
		SLL4.add("Ile");
		SLL3.add("AGA");
		SLL4.add("Arg");
		SLL3.add("CAA");
		SLL4.add("Gln");
		SLL3.add("CCA");
		SLL4.add("Pro");
		SLL3.add("CTA");
		SLL4.add("Leu");
		SLL3.add("CGA");
		SLL4.add("Arg");
		SLL3.add("AAC");
		SLL4.add("Asn");
		SLL3.add("ACC");
		SLL4.add("Thr");
		SLL3.add("ATC");
		SLL4.add("Ile");
		SLL3.add("AGC");
		SLL4.add("Ser");
		SLL3.add("CAC");
		SLL4.add("His");
		SLL3.add("CCC");
		SLL4.add("Pro");
		SLL3.add("CTC");
		SLL4.add("Leu");
		SLL3.add("CGC");
		SLL4.add("Arg");
		SLL3.add("AAT");
		SLL4.add("Asn");
		SLL3.add("ACT");
		SLL4.add("Thr");
		SLL3.add("ATT");
		SLL4.add("Ile");
		SLL3.add("AGT");
		SLL4.add("Ser");
		SLL3.add("CAT");
		SLL4.add("His");
		SLL3.add("CCT");
		SLL4.add("Pro");
		SLL3.add("CTT");
		SLL4.add("Leu");
		SLL3.add("CGT");
		SLL4.add("Arg");
		SLL3.add("AAG");
		SLL4.add("Lys");
		SLL3.add("ACG");
		SLL4.add("Thr");
		SLL3.add("ATG");
		SLL4.add("Met");
		SLL3.add("AGG");
		SLL4.add("Arg");
		SLL3.add("CAG");
		SLL4.add("Gln");
		SLL3.add("CCG");
		SLL4.add("Pro");
		SLL3.add("CTG");
		SLL4.add("Leu");
		SLL3.add("CGG");
		SLL4.add("Arg");
		SLL3.add("TAA");
		SLL4.add("(STOP)");
		SLL3.add("TCA");
		SLL4.add("Ser");
		SLL3.add("TTA");
		SLL4.add("Leu");
		SLL3.add("TGA");
		SLL4.add("(STOP)");
		SLL3.add("TAC");
		SLL4.add("Tyr");
		SLL3.add("TAT");
		SLL4.add("Tyr");
		SLL3.add("TAG");
		SLL4.add("(STOP)");
		SLL3.add("TCC");
		SLL4.add("Ser");
		SLL3.add("TTC");
		SLL4.add("Phe");
		SLL3.add("TGC");
		SLL4.add("Cys");
		SLL3.add("TCT");
		SLL4.add("Ser");
		SLL3.add("TCG");
		SLL4.add("Ser");
		SLL3.add("TTT");
		SLL4.add("Phe");
		SLL3.add("TTG");
		SLL4.add("Leu");
		SLL3.add("TGT");
		SLL4.add("Cys");
		SLL3.add("TGG");
		SLL4.add("Glu");
		SLL3.add("GAA");
		SLL4.add("Glu");
		SLL3.add("GCA");
		SLL4.add("Ala");
		SLL3.add("GTA");
		SLL4.add("Val");
		SLL3.add("GGA");
		SLL4.add("Gly");
		SLL3.add("GAC");
		SLL4.add("Asp");
		SLL3.add("GCC");
		SLL4.add("Ala");
		SLL3.add("GTC");
		SLL4.add("Val");
		SLL3.add("GGC");
		SLL4.add("Gly");
		SLL3.add("GAT");
		SLL4.add("Asp");
		SLL3.add("GCT");
		SLL4.add("Ala");
		SLL3.add("GTT");
		SLL4.add("Val");
		SLL3.add("GGT");
		SLL4.add("Gly");
		SLL3.add("GAG");
		SLL4.add("Glu");
		SLL3.add("GCG");
		SLL4.add("Ala");
		SLL3.add("GTG");
		SLL4.add("Val");
		SLL3.add("GGG");
		SLL4.add("Gly");

		SLL SLL5 = new SLL();
		Node tmp = dna.getHead();
		for (int i = 0; i < dna.size() / 3; i++) {
			String s;
			s = tmp.getData().toString();
			tmp = tmp.getNext();
			s += tmp.getData().toString();
			tmp = tmp.getNext();
			s += tmp.getData().toString();
			tmp = tmp.getNext();
			Node tmp2 = SLL3.getHead();
			Node tmp3 = SLL4.getHead();
			for (int j = 0; j < SLL3.size(); j++) {
				if (tmp2.getData().toString().equalsIgnoreCase(s)) {
					SLL5.add(tmp3.getData());
					break;
				}
				tmp2 = tmp2.getNext();
				tmp3 = tmp3.getNext();
			}

		}
		System.out.print("\namino: ");
		SLL5.display();
		// ------------------------------------------------------------------

		Random random = new Random();
		SLL dna2 = randomGenerate(30);

		System.out.print("\n\n\ndna1:  ");
		dna.display();
		System.out.print("\ndna2:  ");
		dna2.display();
		int rnd = random.nextInt(30) + 1;
		System.out.println("\nrandom number:  " + rnd);

		tmp = dna.getHead();
		Node tmp2 = dna2.getHead();
		Node tmp3 = null;
		SLL tmpDna = new SLL();
		SLL tmpDna2 = new SLL();

		for (int i = 0; i < rnd; i++) {
			tmpDna2.add(tmp.getData());
			tmpDna.add(tmp2.getData());
			tmp = tmp.getNext();
			tmp2 = tmp2.getNext();

		}
		for (int i = 0; i < dna.size() - rnd; i++) {
			tmpDna.add(tmp.getData());
			tmpDna2.add(tmp2.getData());
			tmp = tmp.getNext();
			tmp2 = tmp2.getNext();

		}
		System.out.print("\ncross:  \n");
		tmpDna.display();
		System.out.println("");
		tmpDna2.display();

	}

	public static SLL comploment(SLL sll) {

		SLL comp = new SLL();
		Node tmp = sll.getHead();
		for (int i = 0; i < sll.size(); i++) {
			if (tmp.getData().toString().equalsIgnoreCase("T"))
				comp.add("A");
			else if (tmp.getData().toString().equalsIgnoreCase("G"))
				comp.add("C");
			else if (tmp.getData().toString().equalsIgnoreCase("A"))
				comp.add("T");
			else {
				comp.add("G");
			}
			tmp = tmp.getNext();
		}
		return comp;
	}

	public static SLL randomGenerate(int size) {
		Random rnd = new Random();
		SLL sll = new SLL();

		for (int i = 0; i < size; i++) {
			int tmp = rnd.nextInt(4) + 1;
			if (tmp == 1)
				sll.add("A");
			else if (tmp == 2)
				sll.add("T");
			else if (tmp == 3)
				sll.add("G");
			else {
				sll.add("C");
			}

		}

		return sll;
	}
}
