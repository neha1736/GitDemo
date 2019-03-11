
public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Method m = new Method();
		//m.validateHeader();
		
		String s = "abcba";
		System.out.println(s);
		String t = "";
		for(int i = s.length(); i>0 ; i--) {
			t = t + s.charAt(i-1);
		}
		System.out.println(t);
		if (s.equals(t)) {
			System.out.println("String is palindrom");
		}
		else {
			System.out.println("String is not palindrom");
		}
	}

}
