package myarray;

import java.util.Arrays;

public class MyArray {
   Object arr[];
   int arrsize;
   
   public MyArray(int size) {
	   
	   arr=new Object[size];
   }
   
   public void add(Object element) {
	  if(arrsize==arr.length) {
		  grow();
	  }
	  arr[arrsize++]=element;
   }
   
   public void grow() {
	  int size=arrsize+10;
	  Object arr1[]=new Object[size];
	   System.arraycopy(arr, 0, arr1, 0, arrsize);
	   arr=arr1;
   }

@Override
public String toString() {
	return "MyArray arr=" + Arrays.toString(arr);
}
   
   
}
