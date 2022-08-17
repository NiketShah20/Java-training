import java.util.Arrays;

public class FindDuplicateInArray {
	public static int getDuplicate(int arr[]) {
	int duplicate=-1;
	Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			if(i+1<arr.length && arr[i]==arr[i+1]) {
				duplicate=arr[i];
				break;
			}
		}
		return duplicate;
	}
	public static void main(String[] args) {
		int []arr= {1,2,2,3,4,3};
		int n=getDuplicate(arr);
		System.out.println(n);
	}
}
