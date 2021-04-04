package com.decagon;

import java.util.ArrayList;
import java.io.*;

public class Main {
    /**
     * The readFile program reads from a file accessed through:
     * @param fileName
     * @param data
     */
    public static void readFile(String fileName, ArrayList<String> data){
        try{//try and catch block to handle exceptions that may cause a runtime error.
            BufferedReader brt = new BufferedReader(
                    new FileReader("src/decagonStacks.txt"));
            String line;
            while((line = brt.readLine()) != null){
                System.out.println(line);
            }
            brt.close();

        } catch(IOException e) {
            System.out.println("Error - Cannot read from file " + fileName + e);
        }
    }

    public static void main(String[] args){
        ArrayList<String> items = new ArrayList<String>();//ArrayList to store data

        //readFile application is called to be executed by the main method
        readFile("src/decagonStack.txt", items);
    }
}
