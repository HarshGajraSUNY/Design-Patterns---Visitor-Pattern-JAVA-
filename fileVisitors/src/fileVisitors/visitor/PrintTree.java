/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileVisitors.visitor;

import fileVisitors.store.Results;
import fileVisitors.util.MyLogger;
import fileVisitors.util.Nodes;
import fileVisitors.util.TreeBuilder;

/**
 *
 * @author Harsh Gajra
 */
public class PrintTree implements VisitorI{
    private  TreeBuilder tb;
    Results rs;
    public PrintTree(TreeBuilder tb) {
        MyLogger.writeMessage(this.getClass()+" Constructor called ", MyLogger.DebugLevel.CONSTRUCTOR);
        this.tb=tb;
    }
    @Override
    public void visit() {
        MyLogger.writeMessage("PrintTree  visits ", MyLogger.DebugLevel.IN_RUN);
      rs = new Results();
      inorder(tb.get_root());
      rs.writeToFile(tb.getOFileName());
      if(MyLogger.getDebugValue()!=MyLogger.DebugLevel.RELEASE)
      rs.writeToStdout();
    }
    @Override
    public void inorder(Nodes root){
       if(root==null)
          return;
      
       inorder(root.left);      
     
       if(root.occurences.size()==1)
           rs.output.add(root.data);
   
       inorder(root.right);
    }
    public TreeBuilder getTreeBuilder(){
        MyLogger.writeMessage("TreeBuilder object returned ", MyLogger.DebugLevel.RELEASE);
     return tb;
    }
}
