package reCapDemo_Classes;

public class Main {

	public static void main(String[] args) {
		
		int[] sonuc = new int[4];
		for (int i = 0; i < 4; i++) {
			
		
		DortIslem dortIslem = new DortIslem();

		switch (i) {
		case 0:
		sonuc[i] = dortIslem.Topla(3, 4);
		break;
		
		case 1:
		sonuc[i] = dortIslem.Cikar(5, 2);
		break;
		
		case 2:
		sonuc[i] = dortIslem.Carp(3, 3);
		break;
		
		case 3:
		sonuc[i] = dortIslem.Bol(22, 2);
		break;
		
		}
	}
		for(int sonuclar:sonuc) {
			
			System.out.println(sonuclar);
			
			
			}
	}
}
