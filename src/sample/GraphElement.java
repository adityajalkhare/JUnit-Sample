
package sample;

import java.util.*;


public class GraphElement {
    private String elementName;
    private ArrayList<String> conections;
    private int size;
    
    public GraphElement( String elementName, ArrayList<String>conections, int size)
    {this.elementName=elementName;
    this.conections=conections;
    this.size=size;
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
     public String getName() {
        return elementName;
    }
      public ArrayList<String> getConnections() {
        return conections;
    }
       public int getSize(){
        return size;
      
    }   
       public String toString() {
        return this.elementName + " " + this.conections + " " + this.size;
    }
      
}
