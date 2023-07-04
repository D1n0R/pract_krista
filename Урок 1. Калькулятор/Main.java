package org.example;

import java.util.Arrays;
import java.util.Scanner;

/*
*   print "break" to break
*
*/

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        for(int i = 0; i < args.length; i++){
            str += args[i];
        }
        while (true) {
            if(str.equals("")) {
                str = sc.nextLine();
            }
            if("break".equals(str)){
                break;
            }
            String[] parts = str.split(" ");
            if(parts.length != 3){
                System.out.println("Error!\nWrong input!");
                break;
            }
            String[] number1 = parts[0].split("/");
            String[] number2 = parts[2].split("/");
            switch (parts[1]) {
                case "+":
                    if(number1.length == 2 || number2.length == 2){
                        if(number1.length == 2 && number2.length == 2) {
                            System.out.println(Integer.parseInt(number1[0]) * Integer.parseInt(number2[1])
                                    + Integer.parseInt(number2[0]) * Integer.parseInt(number1[1]) + "/"
                                    + Integer.parseInt(number1[1]) * Integer.parseInt(number2[1]));
                        }
                        else if(number1.length == 2){
                            System.out.println(Integer.parseInt(number1[0])
                                    + Integer.parseInt(number2[0]) * Integer.parseInt(number1[1]) + "/"
                                    + Integer.parseInt(number1[1]));
                        }
                        else{
                            System.out.println(Integer.parseInt(number2[0])
                                    + Integer.parseInt(number2[1]) * Integer.parseInt(number1[0]) + "/"
                                    + Integer.parseInt(number2[1]));
                        }
                    }
                    else{
                        System.out.println(Integer.parseInt(number1[0]) + Integer.parseInt(number2[0]));
                    }
                    break;

                case "-":
                    if(number1.length == 2 || number2.length == 2){
                        if(number1.length == 2 && number2.length == 2) {
                            System.out.println(Integer.parseInt(number1[0]) * Integer.parseInt(number2[1])
                                    - Integer.parseInt(number2[0]) * Integer.parseInt(number1[1]) + "/"
                                    + Integer.parseInt(number1[1]) * Integer.parseInt(number2[1]));
                        }
                        else if(number1.length == 2){
                            System.out.println(Integer.parseInt(number1[0])
                                    - Integer.parseInt(number2[0]) * Integer.parseInt(number1[1]) + "/"
                                    + Integer.parseInt(number1[1]));
                        }
                        else{
                            System.out.println(Integer.parseInt(number2[0])
                                    - Integer.parseInt(number2[1]) * Integer.parseInt(number1[0]) + "/"
                                    + Integer.parseInt(number2[1]));
                        }
                    }
                    else{
                        System.out.println(Integer.parseInt(number1[0]) - Integer.parseInt(number2[0]));
                    }
                    break;

                case "/":
                    if(number1.length == 2 || number2.length == 2){
                        if(number1.length == 2 && number2.length == 2) {
                            System.out.println(Integer.parseInt(number1[0]) * Integer.parseInt(number2[1]) + "/" +
                                    Integer.parseInt(number1[1]) * Integer.parseInt(number2[0]) );
                        }
                        else if(number1.length == 2){
                            System.out.println(Integer.parseInt(number1[0])+
                                    "/" + Integer.parseInt(number1[1]) * Integer.parseInt(number2[0]));
                        }
                        else{
                            System.out.println(Integer.parseInt(number2[0]) *  Integer.parseInt(number1[1]) +
                                    "/" + Integer.parseInt(number2[0]));
                        }
                    }
                    else{
                        System.out.println(Integer.parseInt(number1[0]) / Integer.parseInt(number2[0]));
                    }
                    break;

                case "*":
                    if(number1.length == 2 || number2.length == 2){
                        if(number1.length == 2 && number2.length == 2) {
                            System.out.println(Integer.parseInt(number1[0]) * Integer.parseInt(number2[0]) + "/" +
                                    Integer.parseInt(number1[1]) * Integer.parseInt(number2[1]) );
                        }
                        else if(number1.length == 2){
                            System.out.println(Integer.parseInt(number1[0]) *  Integer.parseInt(number2[0]) +
                                    "/" + Integer.parseInt(number1[1]));
                        }
                        else{
                            System.out.println(Integer.parseInt(number1[0]) * Integer.parseInt(number2[1]) +
                                    "/" + Integer.parseInt(number2[0]));
                        }
                    }
                    else{
                        System.out.println(Integer.parseInt(number1[0]) * Integer.parseInt(number2[0]));
                    }
                    break;

                default:
                    break;
            }
            str = "";
        }
    }
}