
package START;

import javax.swing.JOptionPane;

public class JADatabaseSystem {
     
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
               
    }
    
}
