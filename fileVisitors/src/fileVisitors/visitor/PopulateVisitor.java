/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileVisitors.visitor;

import fileVisitors.util.FileProcessor;
import fileVisitors.util.MyLogger;
import fileVisitors.util.Nodes;
import fileVisitors.util.TreeBuilder;

/**
 *
 * @author Harsh Gajra
 */
public class PopulateVisitor implements VisitorI{
 
    private  TreeBuilder tb;

    public PopulateVisitor(TreeBuilder tb) {
        MyLogger.writeMessage(this.getClass()+" Constructor called ", MyLogger.DebugLevel.CONSTRUCTOR);
        this.tb=tb;
    }

    @Override
    public void visit() {
    MyLogger.writeMessage("PopulateVisitor visits ", MyLogger.DebugLevel.IN_RUN);
        FileProcessor fPro=null;           
        fPro= new FileProcessor(tb.getIFileName());        
        String str = "";
        while((str = fPro.readLine())!= null){
           for(String s:str.split("\\s+")){ 
           tb.insert(s);          
           }
        }
        
    }
    
    
    public TreeBuilder getTreeBuilder(){
        MyLogger.writeMessage("TreeBuilder object returned ", MyLogger.DebugLevel.RELEASE);
     return tb;
    }

    @Override
    public void inorder(Nodes root) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
