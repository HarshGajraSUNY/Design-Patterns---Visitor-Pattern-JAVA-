/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileVisitors.driver;

import fileVisitors.util.MyLogger;
import fileVisitors.util.TreeBuilder;
import fileVisitors.visitor.PalindromeHighlight;
import fileVisitors.visitor.PopulateVisitor;
import fileVisitors.visitor.PrimeLength;
import fileVisitors.visitor.PrintTree;

/**
 *
 * 
 */
public class Driver {
     
  public static void main(String[] args){
    String input_file="";
    String output_file="";
	if(args[0].contains("${arg") || args[1].contains("${arg")||
           args[2].contains("${arg") || args.length < 3)
         {
	  System.out.println("Wrong number of arguments exiting program!. Please try again later");
          System.exit(0);     
	 }
        
        try{
         int debugNo =Integer.parseInt(args[2]);
         
         if(debugNo < 0 && debugNo > 4){
          System.out.println("Debug value was not proper!Please try again later!");
          System.exit(0);
         }
          MyLogger.setDebugValue(debugNo);
        }
         catch(Exception ex){
          System.out.println("Debug value was not proper!Please try again later!");
          System.exit(0);
         }
    try{
            input_file= args[0];
        }
        catch(Exception e){
            System.out.println("Input File not availaible in the arguments! Please try again later");
            System.exit(0);
        }
     
      try{
            output_file= args[1];
        }
        catch(Exception e){
            System.out.println("output File not availaible in the arguments! Please try again later");
            System.exit(0);
        }
     
     TreeBuilder tb= new TreeBuilder(input_file,output_file);
    
     PopulateVisitor pv = new PopulateVisitor(tb);
    
     tb.accept(pv);
    
     tb=pv.getTreeBuilder();
    
     PalindromeHighlight ph= new PalindromeHighlight(tb);
    
     tb.accept(ph);
    
     tb= ph.getTreeBuilder();
    
     PrimeLength pl= new PrimeLength(tb);
    
     tb.accept(pl);
    
     tb= pl.getTreeBuilder();
    
     PrintTree pt= new PrintTree(tb);
     
     tb.accept(pt);
  
  }
}
