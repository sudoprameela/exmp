package exmp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestApp {
	public static void main(String[] args)
			throws Exception {
	    String str = "Hi Hello welcome to java";
		 
	    System.out.println( findMaxLenEven(str));
	}
		static String findMaxLenEven(String str)
		{
		    int n = str.length();
		 
		    int i = 0;
		 
		    
		    int currlen = 0;
		 
		   
		    int maxlen = 0;
		 
		    int st = -1;
		 
		    while (i < n)
		    {
		 
		       
		        if (str.charAt(i) == ' ')
		        {
		            if (currlen % 2 == 0)
		            {
		                if (maxlen < currlen)
		                {
		                    maxlen = currlen;
		                    st = i - currlen;
		                }
		            }
		 
		           
		            currlen = 0;
		        }
		        else
		        {
		            
		            currlen++;
		        }
		 
		        i++;
		    }
		 
		    
		    if (currlen % 2 == 0)
		    {
		        if (maxlen < currlen)
		        {
		            maxlen = currlen;
		            st = i - currlen;
		        }
		    }
		 
		    
		    if (st == -1)
		        return "-1";
		 
		    return str.substring(st, st + maxlen);
		}
			
		
		
		
		
}
	

