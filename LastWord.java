
public class LastWord {
	public static int findLastWord(String s) {
		
		int count=0;
        int j=s.length()-1;     
        while(j>=0 && s.charAt(j)==' '){
            j--;
        }
        while(j>=0 && s.charAt(j)!=' '){
            count++;
            j--;
        }
        return count;
	}
	public static void main(String[] args) {
		System.out.println(findLastWord("luffy is still joyboy"));
	}
}
