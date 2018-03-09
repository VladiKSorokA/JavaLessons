package com.company;

public class Main {

    // this func calculate n!
    public long faktorial (int n){
        if(n == 0){
            return 1;
        }
        else if(n > 0){
            return n * faktorial(n - 1);
        }
        else
            return -1;
    }

    public static void main(String[] args) {
        Main myObj = new Main();
        System.out.println("3! = " + myObj.faktorial(3));
        System.out.println("17! = " + myObj.faktorial(17));
        System.out.println("0! = " + myObj.faktorial(0));
        System.out.println("(-5)! = " + myObj.faktorial(-5));
    }
}
