package com.epam.Collection;

import java.util.Arrays;

public class DataList<T> {
   
    private int size = 0;
     
    private static final int DEFAULT_CAPACITY = 10;
     
    private Object collection[];
 
  
    public DataList() {
        collection = new Object[DEFAULT_CAPACITY];
    }
 

    public void add(T t) {
        if (size == collection.length) {
            ensureCapacity();
        }
        collection[size++] = t;
    }
     
 
    @SuppressWarnings("unchecked")
    public T get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (T) collection[i];
    }
  
    @SuppressWarnings("unchecked")
    public T remove(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        Object item = collection[i];
        int numOfElements = collection.length - ( i + 1 ) ;
        System.arraycopy( collection, i + 1, collection, i, numOfElements ) ;
        size--;
        return (T) item;
    }
     
  
    public int size() {
        return size;
    }
     
  
    @Override
    public String toString() 
    {
         StringBuilder sb = new StringBuilder();
         sb.append('[');
         for(int i = 0; i < size ;i++) {
             sb.append(collection[i].toString());
             if(i<size-1){
                 sb.append(",");
             }
         }
         sb.append(']');
         return sb.toString();
    }
     
    private void ensureCapacity() {
        int newSize = collection.length * 2;
       collection = Arrays.copyOf(collection, newSize);
    }
}
