import java.util.Comparator;
import java.util.TreeSet;

public class comparator {

	public static void main(String[] args) {
		// Create a TreeSet with a custom Comparator
		TreeSet<String> treeSet = new TreeSet<>( new StringLengthComparator());
		
		// Add some elements to the TreeSet
		treeSet.add( "apple" );
		treeSet.add( "banana" );
		treeSet.add( "cherry" );
		treeSet.add( "date" );
		treeSet.add( "elderberry" );
		
		// Print the TreeSet
		System.out.println( treeSet );

	}

}

// Comparator that compares strings by length 
class StringLengthComparator implements Comparator<String> {
                                          public int compare(String s1, String s2) {
                                        	  return s1.length()-s2.length();                                      	  
                                          }
}