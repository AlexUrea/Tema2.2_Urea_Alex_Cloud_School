package com.company;

import java.lang.reflect.Array;

public class MyList<T> {

    private int dimension;
    private T[] mylist;
    private int currentSize;

    public MyList(Class<T> clazz ,  int dimension){

        mylist = (T[])Array.newInstance(clazz, dimension);
        this.currentSize = 0;
        this.dimension = dimension;
    }

    public void add(T element){
        if(currentSize + 1 > dimension){
            System.out.println("Array size must not exceed " + dimension);
        }
        else {
            mylist[currentSize++] = element;
        }
    }

    public void print(){
        for(int i = 0; i < currentSize; ++i){
            System.out.println(mylist[i]);
        }
    }

    public boolean lookup(T element){
        for(int i = 0; i < currentSize; ++i){
            if(mylist[i] == element){
                return true;
            }
        }
        return false;
    }

}
