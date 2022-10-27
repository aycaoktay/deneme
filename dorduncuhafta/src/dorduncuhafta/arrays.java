package dorduncuhafta;

public class arrays {
public static void main(String[]args) {
	int[] array = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};
		System.out.printf("%s%8%s%n","Index","Value");
	for (int counter = 0; counter < array.length; counter++) {
		
		System.out.printf("%5d%8d%n",counter,array[counter]);
	}
System.out.println("Ters cevirilen dizi:");
	for(int i=array.length-1 ; i>=0; i--)
		System.out.print(array[i] + " ");
	
}
}
