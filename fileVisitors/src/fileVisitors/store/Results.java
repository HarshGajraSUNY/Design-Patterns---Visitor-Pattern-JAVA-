package fileVisitors.store;

import java.io.IOException;
import java.io.PrintWriter;
import fileVisitors.util.FileDisplayInterface;
import fileVisitors.util.StdoutDisplayInterface;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 *  */
public class Results implements FileDisplayInterface,StdoutDisplayInterface{
    /**
    *
    * Method to write the output of the test to output file
    */
    public ArrayList<String> output=new ArrayList<String>();
    
    @Override
    public void writeToFile(String file) {
    
    try{
	PrintWriter writer = new PrintWriter(file, "UTF-8");
        for(String x: output)
            writer.println(x);
        writer.close();
        }
        catch(IOException ex){
        System.err.print("Output file name does not exist");  
        }    
    }
 
    /*
    *
    * Method to write the output of the test to console
    */
    public void writeToStdout() {
       for(String x: output)
            System.out.println(x);
    } 

}
