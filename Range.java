import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
  private int start,end,current;

  //@param start : the starting value (inclusive) which must be <= end.
  //@param end : the ending value which is also inclusive.
  public Range(int start,  int end){
    this.start = start;
    this.end = end;
    current = start;
   }

  public void reset(){
    current = start;
  }
  public int length(){
    return start - end + 1;
  }

  //When current is no longer a valid element in the range, it should return false.
  public boolean hasNext(){
    if (current == end +1){
      return false;
    }
    return true;
   }

  //@throws NoSuchElementException when hasNext() is false.
  //This will return the current value, it will also increase current value by 1.
  //e.g.  if current is 5. This will make current 6, and return 5.
  public int next(){
    int now = current;
    current += 1;
    return now; 
  }

}
