package traces.tema02.exercici01;

public class Traces01 {

	public static void main(String[] args) {
		/********** Traça 1 ************/
		System.out.println("Traça 01:");
		System.out.println("---------");
		int n1 = 5,  n2 = 1 , n3=0;
		do {
			n3=n1*n2+n3;
			n1-=n2;
			n2++;			
		} while(n2<=2*n1);
		System.out.println("res: " + (n3%10+n3));
		System.out.println("");
		/************* Traça 2 **************/
		System.out.println("Traça 02:");
		System.out.println("---------");
		int x1 = 20;
		double x2 = 7.0;
		boolean b =true;
		while ((x1*x2)>(x1+x2)) {
			x2--;
			x1=x1%(int)x2;
			if(b) {
				b=!b;
				x2--;
			}else {
				x1++;
				b=!b;
			}
			System.out.print(x1+" ");
		} 
		System.out.println(b);
		System.out.println();
		/************* Traça 3 **************/
		System.out.println("Traça 03:");
		System.out.println("---------");
		boolean boo = true;
		int n = 20;
		for(int i=1;boo;i+=5) {
			System.out.print((n%i)+"\\");
			if(i>n) boo = false;
		}
		System.out.println();
		/************* Traça 4 **************/
		System.out.println("Traça 04:");
		System.out.println("---------");
		int j = 10, acm = 0;
		while(acm<="sargantana".length()) {
			j--;
			acm+=j;
			for(int i = 0;i<acm/2;i++)
			System.out.print('*');
			System.out.print("\n");
		}
		System.out.println("acm: "+acm);
		System.out.println();
		/************* Traça 5 **************/
		System.out.println("Traça 05:");
		System.out.println("---------");
		boolean q = true;
		for(int i=0;i<4;i++) {
			for(int k=0;k<=i;k++) {
				if(k%2==0 && i%2!=0) System.out.print(q+"\\");
				else System.out.print(!q+"/");
			}
			System.out.println();
		}
	}

}
