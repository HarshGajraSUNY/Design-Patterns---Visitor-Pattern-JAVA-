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
public class PalindromeHighlight implements VisitorI{
    
    private  TreeBuilder tb;
    StringBuilder sb= null;
    public PalindromeHighlight(TreeBuilder tb) {
        MyLogger.writeMessage(this.getClass()+" Constructor called ", MyLogger.DebugLevel.CONSTRUCTOR);
        this.tb=tb;
    }
    @Override
    public void visit() {
        MyLogger.writeMessage("PalindromeHighlight visits ", MyLogger.DebugLevel.IN_RUN);
        inorder(tb.get_root());
    }
    
    public void inorder(Nodes root){
      if(root==null)
          return;
      
       inorder(root.left);      
       sb= new StringBuilder(root.data);
       if(root.data.length()>3 && root.data.equalsIgnoreCase(sb.reverse().toString()))
       {
        root.data=root.data.toUpperCase();
       }  
       inorder(root.right);      
    }
    
    public TreeBuilder getTreeBuilder(){
        MyLogger.writeMessage("TreeBuilder object returned ", MyLogger.DebugLevel.RELEASE);
     return tb;
    }
    
}
