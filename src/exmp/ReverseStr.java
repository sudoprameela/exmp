package exmp;

public class ReverseStr {
	public static void main(String[] args)
    {
        String str = "Welcome to Altimetrik";
        ReverseWords(str);
    }
	    
	   public static void  ReverseWords(String str) {
	    	String s[] = str. split(" ");
	    	String ans = "";
	    	for (int i = s. length - 1; i >= 0; i--) {
	    	ans += s[i] + " ";
	    	}
	    	System.out.println(ans);
	    }
	}
	
	
    

