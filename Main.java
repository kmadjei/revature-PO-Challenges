import java.util.*;

public class Main {

    /*
     * Given an array of integers, return the largest gap between the sorted elements of the array.

        For example, consider the array:
        [9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5]... in which, after sorting, the array becomes:
        <code>[0, 0, 4, 5, 5, 6, 9, 20, 25, 26, 26]</code>... so that we now see that the largest gap in the array is between 9 and 20 which is 11.

     */
    public static void largestArrayGap(List<Integer> array) {

        int largestInt = 0;
        int[] arrayPair = new int[2];

        for (int i = 0; i < array.size(); i++) {
            Collections.sort(array); // sort ArrayList 
            if (i == 0) continue; // skips initial array index  
                // assign largest array gap
            if (Math.abs(array.get(i-1) - array.get(i)) > largestInt) {
                largestInt = Math.abs(array.get(i-1) - array.get(i));
                arrayPair[0] = array.get(i-1);
                arrayPair[1] = array.get(i);
            }   
        }
        System.out.println("Largest Gap = " + largestInt);
        System.out.println("The largest gap in the array is between " + arrayPair[0] + " and " + arrayPair[1]);
    }
	public static void main(String[] args) {
		
        List<Integer> arr = new ArrayList<>(
            Arrays.asList(9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5)
        );

        largestArrayGap(arr);
	}

}