package pro3;

public class Oddnum {
	public static void main(String[] args) {
		System.out.print("Odd numbers from 1 to 50:\n");
		for (int i=1;i<=50;i++) {
			if (i%2==0) {
				continue;
			}
			System.out.print(i+"\n");
		}
	}

}
