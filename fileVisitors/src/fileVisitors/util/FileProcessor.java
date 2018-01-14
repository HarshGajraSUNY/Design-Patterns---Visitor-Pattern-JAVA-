
package fileVisitors.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Harsh Gajra
 */
public class FileProcessor {
    private Scanner sc;

    
    /*
    *Constructor to intialize the scanner object using file path
    * 
    */ 
  
    public FileProcessor(String path) {
  MyLogger.writeMessage(this.getClass()+" Constructor called ", MyLogger.DebugLevel.CONSTRUCTOR);
     File f = new File(path);
     try
     {
             sc= new Scanner(f);
     }
     catch(FileNotFoundException ex){
        System.err.print("input file name does not exist");
        System.exit(0);
    }   
  }
    /* 
    * Read a single line from the file 
	*
    */ 
    public  String readLine(){
      if(sc.hasNext()){
          String s= sc.next();
          return s;
      }
      else
          return null;
    }

}