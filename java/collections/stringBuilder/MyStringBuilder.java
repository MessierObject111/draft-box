package collections.stringBuilder;

import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;

public class MyStringBuilder implements Serializable, CharSequence, Appendable{
	/**
	 * The value is used for character storage.
	 */
	char[] value;
	
	/**  
	 * The count is the number of characters used.
	 */
	int count;
	/**
	 * The default capacity of a buffer.
	 */
	private static final int DEFAULT_CAPACITY = 16;
	
	/**
	 * Constructor function.
	 */
	public MyStringBuilder(){
		this(DEFAULT_CAPACITY);
	}
	/**
	 * Create a new StringBuilder with default capacity 16.
	 */
	public MyStringBuilder(int capacity){
		value = new char[capacity];
	}
	/**
	 * Create an empty <code>StringBuilder</code> with the specified initial
	 * capacity.
	 *
	 * @param capacity the initial capacity
	 * @throws NegativeArraySizeException if capacity is negative
	 */
	public MyStringBuilder(String value) {
		this.value = value.toCharArray();
		this.count = value.length();
	}
	/**
	 * Create a new <code>StringBuilder</code> with the characters in the
	 * specified <code>CharSequence</code>. Initial capacity will be the
	 * length of the sequence plus 16; if the sequence reports a length
	 * less than or equal to 0, then the initial capacity will be 16.
	 *
	 * @param seq the initializing <code>CharSequence</code>
	 * @throws NullPointerException if str is null
	 */
	public MyStringBuilder(CharSequence seq) {
		 int len = seq.length();
		 count = len <= 0 ? 0 : len;
		 value = new char[count + DEFAULT_CAPACITY];
		 for (int i = 0; i < len; ++i) {
		   value[i] = seq.charAt(i);
		 }
	}
	
	public MyStringBuilder append(String str) {
		if(str == null || str.length() == 0) return null;
		int len = str.length();
		if(count + len > value.length) {
			increaseCapacity(count + len);
		}
		//Public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) 
		//Copies characters from this string into the destination character array.
		str.getChars(0, count, value, count + 1);
		count = count + len;
		return this;
	}
	
	public MyStringBuilder append(MyStringBuilder msb) {
		return append(msb.toString());
	}
	/**
	 * Increase the capacity of this <code>StringBuilder</code>. This will
	 * ensure that an expensive growing operation will not occur until
	 * <code>minimumCapacity</code> is reached. The buffer is grown to the
	 * larger of <code>minimumCapacity</code> and
	 * <code>capacity() * 2 + 2</code>, if it is not already large enough.
	 *
	 * @param minimumCapacity the new capacity
	 */
	void increaseCapacity(int minimumCapacity) {
	    //get the current length add one and double it
	    int newCapacity = (value.length + 1) * 2; 
	    if (newCapacity < 0) { //if we had an integer overflow
	        newCapacity = Integer.MAX_VALUE; //then use the max positive integer
	    } else if (minimumCapacity > newCapacity) { //is it enough?
	        //if doubling wasn't enough, use the actual length computed
	        newCapacity = minimumCapacity;
	    }
	    //copy the old value in the new array
	    value = Arrays.copyOf(value, newCapacity); 
	}
	
	@Override
	public Appendable append(CharSequence arg0) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Appendable append(char arg0) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Appendable append(CharSequence arg0, int arg1, int arg2)
			throws IOException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public char charAt(int i) {
		// TODO Auto-generated method stub
		return value[i];
	}
	@Override
	public int length() {
		return count;
	}
	@Override
	public CharSequence subSequence(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String toString(){
		//In java, it is one line: return new String(this);
		//But here java does not recognize 'MyStringBuilder' as one of 
		//the objects accepted by String constructor function.
		String result = "";
		for(char c : value) {
			result += c;
		}
		return result;
	}
}
