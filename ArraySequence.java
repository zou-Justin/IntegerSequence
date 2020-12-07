import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  int currentIndex;
  int data[];


  /*Construct the sequence by copying values from the other array into the data array*/
  public ArraySequence(int [] other){
    for (int i : other){
      data[i] = other[i];
    }
    currentIndex = 0;
  }
  public boolean hasNext(){
    if (currentIndex == data.length + 1){
      return false;
    }
    return true;
  }
  public int next(){
    if (hasNext() == false){
      throw new NoSuchElementException("bad");
    }
    int temp = currentIndex;
    currentIndex++;
    return data[temp];
  }
  public int length(){
    return data.length;
  }
  public void reset(){
    currentIndex = 0;
  }


}
