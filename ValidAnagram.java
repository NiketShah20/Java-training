
public class ValidAnagram {
	public static boolean validAnagram(String str,String str2) {
		boolean bool=false;
		if(str.length()!=str2.length()) {
			return false;
		}
		int i=0;
		while(i<str.length() ){
			String s=String.valueOf(str.charAt(i));
			if(str2.contains(s)==true){
				str2=str2.replaceFirst(s,"@");
				bool=true;
			}
			else {
				bool=false;
				break;
			}
			i++;
		}
		return bool;
	}
	public static void main(String[] args) {
		String s="anagram";
		String s1="nagaram";
		System.out.println(validAnagram(s, s1));
	}
}
