package de.cg.utils.ctrl;

import java.io.IOException;

import de.cg.utils.files.CGFile;
import de.cg.utils.files.FileContents;

/**
 * This file is used for local debugging
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        try {
            CGFile cf = new CGFile("demo.txt");
            cf.load(); //Load the CGFile into memory
            FileContents contents = cf.getContents(); //Print contents immediately
            contents.append("This is another string");
            contents.append("This is so much better");
            cf.setContents(contents);
            cf.save();
            
            
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
