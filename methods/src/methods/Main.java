package methods;

public class Main {

	public static void main(String[] args) {
        numberFind();
        
	}
	
	public static void numberFind() {
		int[] numbers = new int[]{1,2,5,7,9,0};
		int numberToSearch = 6;
		boolean isThere = false;
		
		for(int number:numbers) {
				if(number==numberToSearch) {
						isThere = true;
				}
		}
		if (isThere) {
				writeMessage("Sayı Mevcuttur: " + numberToSearch);
		}else {
				writeMessage("Sayı Mevcut Değildir: " + numberToSearch);

		}
	}
	public static void writeMessage(String message){
			System.out.println(message);
		
		
	}

}
