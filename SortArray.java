
public class SortArray {
	public static int[] sortArray(int[] arr) {
		int	temp1=0;
		int temp2=0;
		int temp3=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				temp1++;
			}
			else if(arr[i]==1){
				temp2++;
			}
			else {
				temp3++;
			}
		}
		for(int j=0;j<arr.length;j++) {
			if(temp1!=0) {
				arr[j]=0;
				temp1--;
			}
			else if(temp2!=0) {
				arr[j]=1;
				temp2--;
			}
			else {
				arr[j]=2;
			}
		}
		for (int i : arr) {
			System.out.println(i);
		}
		
		return arr;
	}
	public static void main(String[] args) {
		int arr[]= {0,1,2,2,1,0,0,2,0,1,1,0	};
		sortArray(arr);
	}
}
