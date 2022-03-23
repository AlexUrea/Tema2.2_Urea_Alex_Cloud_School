package com.company;


public class Main {



    public static void main(String[] args) {

        MyList<Integer> test = new MyList<>(Integer.class, 5);

        test.add(0);
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);

        test.print();

        if(test.lookup(3))
            System.out.println("Se gaseste elementul ");
        else System.out.println("Nu se gaseste ");

    }
}

