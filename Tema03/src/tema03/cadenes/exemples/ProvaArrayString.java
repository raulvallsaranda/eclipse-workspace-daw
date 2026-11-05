package tema03.cadenes.exemples;

public class ProvaArrayString {

	public static void main(String[] args) {
		String[] array =  new String[5];
		
		for(int i =0;i<array.length;i++) {
			array[i]="";
		}
		
		for(int i =0;i<array.length;i++) {
			array[i]+="hola";
			System.out.println(array[i]);
		}

	}

}
