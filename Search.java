package RecursionAssignment;

public class Search {
	/*
	 * perform Linear Search on given list of numbers
	 * @param array of numbers
	 * @param Starting point of search
	 * @return ending point of search
	 * @return number to be searched
	 */
	public static int linearSearch(int arr[], int start, int last, int x)
	{
	     if (last < start)
	        return -1;
	     if (arr[start] == x)
	        return start;
	     return linearSearch(arr, start+1, last, x);
	}
	/*
	 * perform Binary Search on given list of numbers
	 * @param array of numbers
	 * @param Starting point of search
	 * @return ending point of search
	 * @return number to be searched
	 */
	public static int binarySearch(int arr[], int start, int last, int x) 
    { 
        if (last >= start) { 
            int mid = start + (last - start) / 2;  
            if (arr[mid] == x) 
                return mid;  
            if (arr[mid] > x) 
                return binarySearch(arr, start, mid - 1, x);  
            return binarySearch(arr, mid + 1, last, x); 
        }
        return -1; 
    }
	public static void main(String args[])
    {
        int arr[] = { 2, 3, 4, 10, 40 };
        int x = 40;
        System.out.println("======================Linear Search========================");
        int result = linearSearch(arr,0,arr.length-1,x);
        if (result == -1)
            System.out.print("Element is not present in array");
        else
            System.out.print("Element is present at index : "+ result);
        System.out.println("\n\n======================Binary Search========================");
        int binaryResult = binarySearch(arr,0,arr.length-1, x);
        if (binaryResult == -1)
            System.out.print("Element is not present in array");
        else
            System.out.print("Element is present at index : "+ binaryResult);
        
    }
}

