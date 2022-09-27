package methods2;

public class Main {

	public static void main(String[] args) {
		String message = "Bugün hava çok güzel.";
		String newMessage = giveTheCity();
		System.out.println(newMessage);
		int number = addition(5,7);
		System.out.println(number);
		int total = addition2(2,3,4);
		System.out.println(total);

	}
	
	public static void add() {
		System.out.println("Eklendi");
	}
	
	public static void remove() {
		System.out.println("Silindi");
	}
	
	public static void update() {
		System.out.println("Güncellendi");
	}
	
	public static int addition(int number1, int number2) {
		return number1 + number2;
	}
	
	public static int addition2(int...numbers) {
		int total = 0;
		for(int number:numbers) {
			total += number;
		}
		return total;
	}
	
	public static String giveTheCity() {
		
		return "Ankara";
	}
	

}
