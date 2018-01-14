/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fileVisitors.util;

public class MyLogger{

   
    public static DebugLevel getDebugValue(){
    return debugLevel;
    }

    

    /*DEBUG_VALUE=4 [Print to stdout everytime a constructor is called]
      DEBUG_VALUE=3 [Visitor visits ]
      DEBUG_VALUE=2 [Prime number found.]
      DEBUG_VALUE=1 [When a node is created.]
      DEBUG_VALUE=0 [TreeBuilder Object returned" ]
    */

    public static enum DebugLevel {RELEASE, FROM_RESULTS, IN_RESULTS, IN_RUN, CONSTRUCTOR
                                   };

    private static DebugLevel debugLevel;


    public static void setDebugValue (int levelIn) {
	switch (levelIn) {
           
            //[Print to stdout everytime a constructor is called]
	  case 4: debugLevel = DebugLevel.CONSTRUCTOR; break;
          
         // [Visitor visits]
          case 3: debugLevel = DebugLevel.IN_RUN;break;
          
          //Prime Number found
          case 2:debugLevel  =  DebugLevel.IN_RESULTS;break;
          
          //When a node is created.
          case 1: debugLevel =  DebugLevel.FROM_RESULTS;break;
	     
	 // No output should be printed from the applicatio to stdout.
          case 0: debugLevel = DebugLevel.RELEASE; break;
          
	}
    }

    public static void setDebugValue (DebugLevel levelIn) {
	debugLevel = levelIn;
    }

    // @return None
    public static void writeMessage (String  message  ,
                                     DebugLevel levelIn ) {
	if (levelIn == debugLevel)
	    System.out.println(message);
    }

    /**
	 * @return String
	 */
    public String toString() {
	return "Debug Level is " + debugLevel;
    }
}
