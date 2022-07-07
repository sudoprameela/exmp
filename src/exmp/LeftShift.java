package exmp;

public class LeftShift {
	// Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
        int length = a.length;
        int j = 0;
        int[] temp = new int[length];
        
        for(int i = d; i < length; i++, j++) {
            temp[j] = a[i];
        } 
        if(j < length) {
             for(int i = 0; i < d; i++, j++) {
                 temp[j] = a[i];
             }
        }
       
        return temp;
    }

    public static void main(String[] args){
    	int arr[]= {4,10,6,4,9};
    	int n=3;
        int[] result = rotLeft(arr, n);

        for (int i = 0; i < result.length; i++) {
        	System.out.print(result[i] + " ");
        }

        
    }	
	}

