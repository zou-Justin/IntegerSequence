import java.util.ArrayList;
import java.util.NoSuchElementException;
public class Tester {

	public static void main(String[] args) {
    int[]nums = {1,3,5,0,-1,3,9};
    System.out.println(nums.length);
    IntegerSequence as = new ArraySequence(nums);

    System.out.println("ArraySequence(array):");
    while(as.hasNext()){
      System.out.print(as.next()+", ");
    }

}
}
