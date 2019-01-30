package dummyPack;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the number to test against : ");
        int number=0;
        String result=null;
        if(scanner.hasNext()){
            number=Integer.parseInt(scanner.next());
        }
        if(number>0){
            result = getFizzBuzzOutput(number);
        }else{
            System.out.println(number);
        }

        System.out.println(result);
    }

    public static String getFizzBuzzOutput(int number){

        if(number%15==0){
            return "FizzBuzz";
        }else if(number%5==0){
            return "Buzz";
        }else if(number%3==0){
            return "Fizz";
        }else{
            return String.valueOf(number);
        }

    }
}
