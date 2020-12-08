import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  private int currentIndex;
  private int [] data;

  /*Construct the sequence by copying values from the other array into the data array*/
  public ArraySequence(int [] other){
    data = new int[other.length];
    for (int i = 0; i < other.length;i++)
    {
       data[i] = other[i];
     }
    currentIndex = 0;
  }
  public ArraySequence(IntegerSequence otherseq){
    data = new int[otherseq.length()];
    for (int i = 0; i < otherseq.length() && hasNext();i++)
    {
       data[i] = otherseq.next();
     }

   }
  public boolean hasNext(){
    if (currentIndex > data.length -1){
      return false;
    }
    return true;
  }
  public int next(){
    if (hasNext() == false){
      throw new NoSuchElementException("bad");
    }
    else{
    int temp = currentIndex;
    currentIndex++;
    return data[temp];
    }
  }
  public int length(){
    return data.length;
  }
  public void reset(){
    currentIndex = 0;
  }


}
