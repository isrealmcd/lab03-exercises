import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDuplicates {

    public static List<Integer> findModeNestedLoops(List<Integer> l) {

	//create a second list to hold the numbers found in the primary list
	//create a third list to hold the numbers that are pairs
	//iterate through the primary list
	//checks if the first number exists in the secondary list
	//if no, record it on the secondary list and continue to next number
	//if yes, add that number to the third list to be printed.
	//after iterating through the whole list, print the contents of the third list
	List<Integer> checkedNumbers = new ArrayList<>();
	List<Integer> matches = new ArrayList<>();
		for (int i = 0; i < l.size(); i++){
			int current = l.get(i);
			for(int j = i + 1; j < l.size(); j++){
				if (current == l.get(j)){
					if(!matches.contains(current)){
						matches.add(current);
				}//contitional 2
			}//conditional 1
		}//inner loop
	}//outer loop
		return matches;
    }

    public static void main(String[] args) {
        // some test strings:
        List<Integer> sample1 = new ArrayList<Integer>(Arrays.asList(3, 7, 5, 6, 7, 4, 8, 5, 7, 66));
        List<Integer> sample2 = new ArrayList<Integer>(Arrays.asList(3, 5, 6, 4, 4, 5, 66, 6, 7, 6));
        List<Integer> sample3 = new ArrayList<Integer>(Arrays.asList(3, 0, 5, 1, 0));
        List<Integer> sample4 = new ArrayList<Integer>(Arrays.asList(3));
        System.out.println("Sample 1: " + findModeNestedLoops(sample1));
        System.out.println("Sample 2: " + findModeNestedLoops(sample2));
        System.out.println("Sample 3: " + findModeNestedLoops(sample3));
        System.out.println("Sample 4: " + findModeNestedLoops(sample4));
    }

}
