import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  int currentIndex;
  int []data;

  /*Construct the sequence by copying values from the other array into the data array*/
  public ArraySequence(int [] other){
    for (int i : other){
      data[i] = other[i];
    }
  }
  public boolean hasNext(){

  }
  public int next(){

  }
  public int length(){

  }
  public void reset(){
    
  }


}
