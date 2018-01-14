/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileVisitors.visitor;

import fileVisitors.util.MyLogger;
import fileVisitors.util.Nodes;
import fileVisitors.util.TreeBuilder;

/**
 *
 * @author Harsh Gajra
 */
public class PrimeLength implements VisitorI{
    private  TreeBuilder tb;

    public PrimeLength(TreeBuilder tb) {
        MyLogger.writeMessage(this.getClass()+" Constructor called ", MyLogger.DebugLevel.CONSTRUCTOR);
        this.tb=tb;
    }
    
    @Override
    public void visit() {
        MyLogger.writeMessage("PrimeLength visits ", MyLogger.DebugLevel.IN_RUN);
        inorder(tb.get_root());
    }
    
     public void inorder(Nodes root){
      if(root==null)
          return;
      
       inorder(root.left);      
     
       if(isPrime(root.data))
           root.data=root.data+"-PRIME";
   
       inorder(root.right);      
    }
     
    public boolean isPrime(String s){
     int len= s.length();
     
     if(len<=1)
         return false;
     
     for(int i=2; i<=len/2;i++){
      if(len%i==0)
          return false;
     }
     MyLogger.writeMessage("Prime number found", MyLogger.DebugLevel.IN_RESULTS);
     return true;
     
    } 
    
    public TreeBuilder getTreeBuilder(){
        MyLogger.writeMessage("TreeBuilder object returned ", MyLogger.DebugLevel.RELEASE);
     return tb;
    }
}
