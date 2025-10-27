
package snakegame;

import javax.swing.*;  // extends pakage se ata he.

              //jvm      // inherit kar liya class ko.
public class SnakeGame  extends JFrame {
  
    SnakeGame(){   // constructor object ke baad call hota he .
      
        super("Snake Game"); // ye function heading ke liye use hota he ye hamesha first like hota chahiye ohter wise error de dega.
        
    //( add second file se link he extends JPanal. ) 
        add(new Board()); // class ko call kar rha hu 
        pack(); //function ka use hum refresh automatically ho use ke liye hota he , like hume koi code me changes kiye to late update he
                
                
          // setLocation(700,300);  
              //  setSize(300,300); // arragement se karna hota he pehle  ye run karega fir second line codde run karegi.
             setLocationRelativeTo(null); // ye aoutomatic center me frame or application ko open karta he.
                  
             setResizable(false);
             
// now hm frame use karege by default vo frame hota he but vo visible nhi hota. to
          // setVisible(true);  // this also work like pack(); fuction . but setvisible you only use once just .
    }
    
    public static void main(String[] args) {
        new SnakeGame().setVisible(true);   // ye object hai. pehle ise banaya jata he 
    }
    
}
