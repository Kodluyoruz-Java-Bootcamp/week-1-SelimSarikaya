import java.util.Arrays;

public class Mylist<E> {


	  //Size of list
	  private int size = 0;
	   
	  //Default capacity of list is 10
	  private static final int DEFAULT_CAPACITY = 5;
	   
	  //This array will store all elements added to list
	  private Object elements[];
	 
	  //Default constructor
	  public Mylist() {
	    elements = new Object[DEFAULT_CAPACITY];
	  }
	 
	  //Add method
	  public void add(E e) {
	    if (size == elements.length) {
	      ensureCapacity();
	    }
	    elements[size++] = e;
	  }
	   
	  //Get method
	  @SuppressWarnings("unchecked")
	  public E get(int i) {
	    if (i >= size || i < 0) {
	      throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
	    }
	    return (E) elements[i];
	  }

	  //Get Size of list
	  public int size() {
	    return size;
	  }
	   
	  //Print method
	  @Override
	  public String toString() 
	  {
	     StringBuilder sb = new StringBuilder();
	     sb.append('[');
	     for(int i = 0; i < size ;i++) {
	       sb.append(elements[i].toString());
	       if(i<size-1){
	         sb.append(",");
	       }
	     }
	     sb.append(']');
	     return sb.toString();
	  }
	   
	  private void ensureCapacity() {
	    int newSize = elements.length * 2;
	    elements = Arrays.copyOf(elements, newSize);
	  }
	
}
