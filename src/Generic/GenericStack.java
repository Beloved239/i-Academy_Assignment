package Generic;

import java.util.ArrayList;

public class GenericStack<E> {

    //This Generic Stack is programming in the General not in the Specifics
    //User scan specify what Data Types to be used <E>
    private ArrayList<E> list = new ArrayList<E>();

    //Method isEmpty to check if a stack is empty
    public boolean isEmpty(){
//        if (list.size() >0){
//            return false;
//        }
//        return true;
        return list.size() ==0;
    }

    //isFull method can be implemented since the size if always specified


    //Push method to add element to the list stack
    public void  push(E element){
        list.add(element);
        System.out.println("Element Added Successfully");
    }

    public void push2(E element){
        int currentIndex = 0;
        if (currentIndex < list.size()){
//            list[currentIndex++] = element;
            list.set(currentIndex++, element);
        }
    }


    //pop method to remove element from the stack

    public E pop(){
       return list.remove(list.size()-1);
    }

//    public E pop2(){
//        int currentIndex;
//        E lastValue = list[currentIndex-1];
//        list[currentIndex--]
//    }


    //Peek method will display the element in the last index

    public E peek(){
        int lastIndex = list.size()-1;
        return list.get(lastIndex);
    }

    //This method returns the size of the stack
    public Integer size(){
        return list.size();
    }

    public void  display(){
        for (int i = 0; i < list.size()-1; i++) {
            System.out.println(list.get(i));

        }
    }

    public static void main(String[] args) {
        //Generic Stack of String
        GenericStack<String> stack = new GenericStack<>();

        //Generic Stack of Integer
        GenericStack<Integer> scores = new GenericStack<>();
        System.out.println(stack.isEmpty());

        stack.push("Ridor");
        stack.push("Noah");
        stack.push("Pelorina");
        stack.push("Carpenter");


        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
//        System.out.println(stack.display());
        stack.display();
        System.out.println();

    }

}
