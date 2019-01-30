package dummyPack;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the number to test against : ");
        int number=-1;
        String result=null;
        if(scanner.hasNext()){
            number=Integer.parseInt(scanner.next());
        }
        if(number!=-1){
            result = getFizzBuzzOutput(number);
        }else{
            System.out.println("Invalid Number!! Try again.");
        }

        System.out.println(result);
    }

    public static String getFizzBuzzOutput(int number){
        return null;
    }
}
