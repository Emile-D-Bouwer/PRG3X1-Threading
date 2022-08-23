package com.basepackage;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
	Student st = new student(); 
	System.out.println("What course you want to register? (Diploma/Degree)");
        Scanner input = new Scanner(System.in);
        String type = input.nextLine();
	    switch (type) {
            case "diploma":
                    //st.Diploma();
                break;

            case "degree":
                  //st.Degree();
                break;

            default:
                System.out.println("==== Input is invalid ====");
                type = input.nextLine();
                break;
        }
        input.close();
	//st.Print();
    }
}
