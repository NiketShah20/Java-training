import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToCollectrion {
	public static void main(String[] args) {
	
		Integer [] ar1= {1,2,3,4,5,6,6,32,11,1334};
		ArrayList<Integer> List1=new ArrayList<Integer>();
		for(int i=0;i<ar1.length;i++) {
			List1.add(ar1[i]);
		}
		System.out.println(List1);
	}

}
