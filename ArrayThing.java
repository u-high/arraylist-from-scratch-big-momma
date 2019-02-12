import java.util.*;
public class ArrayThing{
  private int[] ray;
  
  public ArrayThing(){
    ray = new int[1];
  }
  
  public ArrayThing(int[] in){
    ray = in;
  }
  public int get(int in){
    return ray[in];
  }
  public void set(int index, int element){
    ray[index] = element;
  }
  public void add(int element){
    int[] dog = new int[ray.length+1];
    for( int i = 0; i < ray.length; i++){
      dog[i] = get(i);
    }
    dog[ray.length]= element;
    ray = dog;
    }
  public String toString(){
   return Arrays.toString(ray);
  }
  
  }
    
      
  
  
  
