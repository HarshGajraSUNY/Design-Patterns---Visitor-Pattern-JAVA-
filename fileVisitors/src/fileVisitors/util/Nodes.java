/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileVisitors.util;

import java.util.HashMap;

public class Nodes{
public Nodes left;
public Nodes right;
public String data;
public HashMap<String, Integer> occurences= new HashMap<>();

 public Nodes(String str){
     MyLogger.writeMessage(this.getClass()+" Constructor called ", MyLogger.DebugLevel.CONSTRUCTOR);

     data=str;
 }
 
}
