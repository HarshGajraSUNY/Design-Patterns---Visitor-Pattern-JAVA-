/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileVisitors.visitor;

import fileVisitors.util.Nodes;

/**
 *
 * @author Harsh Gajra
 */
public interface VisitorI {
   
    public void visit();
    
    public void inorder(Nodes root);
}
