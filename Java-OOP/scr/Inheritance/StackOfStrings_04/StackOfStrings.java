package StackOfStrings_04;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class StackOfStrings{
    private List<String> data;
    private int lastElementIndex;

    public StackOfStrings(){
        this.data = new ArrayList<>();
        this.lastElementIndex=-1;

    }
    public void push(String element){
        this.lastElementIndex++;
        this.data.add(element);

    }
    public String pop(){
     return this.data.remove(this.lastElementIndex--);


    }
    public String peek(){
       return this.data.get(this.lastElementIndex);


    }
    public boolean isEmpty(){
        return this.data.isEmpty();

    }
}
