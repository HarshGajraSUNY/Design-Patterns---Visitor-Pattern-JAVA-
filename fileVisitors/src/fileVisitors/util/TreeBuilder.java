package fileVisitors.util;

import fileVisitors.visitor.VisitorI;


/**
 *
 * @author Harsh Gajra
 */

public class TreeBuilder {
   private  Nodes root;
   private String iFileName;
   private String oFileName;
  
   public TreeBuilder(String iFileName,String oFileName ){
       
   MyLogger.writeMessage(this.getClass()+" Constructor called ", MyLogger.DebugLevel.CONSTRUCTOR);
    root = null;
    this.iFileName=iFileName;
    this.oFileName=oFileName;
   }
   
   public String getIFileName(){
   return iFileName;
   }
   public String getOFileName(){
   return oFileName;
   }
   
    /*
    *
    * Method to insert a Nodes to the Binary Search Tree
    */
   public  void insert(String key){ 
     // MyLogger.writeMessage("Synchronized method called", MyLogger.DebugLevel.IN_RESULTS);
      if(root==null){
          root=new Nodes(key);
         MyLogger.writeMessage("Node created ", MyLogger.DebugLevel.FROM_RESULTS);
          root.occurences.put(key,1);
      }      
      else{     
       Nodes s= search(root,key);  
       if(s!=null){  
         s.occurences.put(s.data, s.occurences.get(s.data)+1);
       }
       else{      
       Nodes n= new Nodes(key);
       MyLogger.writeMessage("Node created ", MyLogger.DebugLevel.FROM_RESULTS);
       n.occurences.put(n.data,1);    
       insert_recursive(root,n);        
       }
    }
  }
   
    /*
    *
    * Method to get the private tree root
    */
   public  Nodes get_root(){
     return root;
   }
   
    /*
    *
    * Recursive method called from insert that actually do the node insertion
    * in a binary search tree
    */
   public  Nodes insert_recursive(Nodes roots, Nodes n){
       if(roots == null)
           return n;
       if(roots.data.compareTo(n.data) > 0)
           roots.left=insert_recursive(roots.left, n);
       else
           roots.right=insert_recursive(roots.right, n);
       
       return roots;
   }
    /*
    *
    * A utility function to search a given key in BST
    */
    public Nodes search(Nodes root, String key)
    { 
    if (root==null || root.data.equals(key))
        return root;
     
    if (root.data.compareTo(key) > 0)
            return search(root.left, key);
    
    return search(root.right, key);
    }
    
  
    
    public  void delete(String key){
      Nodes v= search(root,key);  
      if(v!=null && v.occurences.get(key)>=1)
          v.occurences.put(key, v.occurences.get(key)-1);
    }
    
   public void accept(VisitorI visitor){
      visitor.visit();
   } 
}
