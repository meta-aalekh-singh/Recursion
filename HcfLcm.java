package RecursionAssignment;

public class HcfLcm {
	/*
	 * calculate HCF of given numbers
	 * @param First Number
	 * @param Second Number
	 * @return HCF of First Number and Second Number
	 * NOTE:- assuming both numbers are positive
	 */
	public static int hcf(int x,int y){
		if (x == 0)
	          return y;
	    if (y == 0)
	          return x;
	    if (x == y)
            return x;
	    if (x > y){
            return hcf(x-y, y);
	    }
        return hcf(x, y-x);
	}
	/*
	 * calculate LCM of given numbers
	 * @param First Number
	 * @param Second Number
	 * @return LCM of First Number and Second Number
	 * NOTE:- assuming both numbers are positive
	 */
	public static int lcm(int x,int y){
		
		return (x / hcf(x, y)) * y;
	}
	public static void main(String args[]){
		int x=98,y=56;
		System.out.println("The Lcm of "+x+" & "+y+" is : "+lcm(x,y));
		System.out.println("\n\nThe Hcm of "+x+" & "+y+" is : "+hcf(x,y));
	}
}

