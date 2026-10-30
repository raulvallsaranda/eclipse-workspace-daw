package exercicis.tema03.cadenessenzills01;

public class Exercici08 {

	public static void main(String[] args) {
		String caracter = "*";
		int n = 1;
		int m=5;
		System.out.println("Car�cter: "+caracter);
		System.out.println("Enter: "+n);
		for(int i=0;i<m;i++) {
			for(int j=0;j<m;j++) {
				if(i==j) {
					System.out.print(caracter.repeat(n));
				} else if(i+j==4) {
					System.out.print(caracter.repeat(n));
				}else {
					System.out.print(" ".repeat(n));
				}
			}
			System.out.println();
		}

	}

}
