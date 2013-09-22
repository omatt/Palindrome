
/**
 * CS334 Activity
 * Palindrome checker
 * 
 * @author 
 * Balino, Kris-Le Dwayne Alison A.
 * Gabion, Rhys Anton T.
 * Reyes, Omar Matthew B.
 * 
 * @version 2011/09/16
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Palindrome extends JFrame{
    private JButton submitB;
    private JTextField tf;
    private JLabel label;      
    public Palindrome(){
        submitB = new JButton("Submit");
        tf =new JTextField(20);

        label =new JLabel("Enter Word: ");

        FlowLayout fl =new FlowLayout();

        setLayout(fl);
        add(label);
        add(tf);
        add(submitB);

        Handler hd =new Handler();
        submitB.addActionListener(hd);

        setTitle("Philippines Airlines");
        setVisible(true);
        setSize(300, 150);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private class Handler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String word =tf.getText();

            int initialWord = 0;
            int lastWord = word.length() - 1;

            while (initialWord < lastWord){
                if (word.charAt(initialWord) == word.charAt(lastWord)){
                    initialWord++;
                    lastWord--;
                }
                else if (word.charAt(initialWord) == ',' || word.charAt(initialWord) == '.' || word.charAt(initialWord) == '-' || word.charAt(initialWord) == ':' || word.charAt(initialWord) == ';' || word.charAt(initialWord) == ' '){
                    initialWord++;
                }
                else if (word.charAt(lastWord) == ',' || word.charAt(lastWord) == '.' || word.charAt(lastWord) == '-' || word.charAt(lastWord) == ':' || word.charAt(lastWord) == ';' || word.charAt(lastWord) == ' '){
                    lastWord--;
                }
                else{
                    break;
                }
            }

            if (initialWord < lastWord){
                JOptionPane.showMessageDialog(null, "The Word is not a Palindrome");
            }
            else  {
                JOptionPane.showMessageDialog(null, "The Word is a Palindrome");
            }

        }   
    }
    public static void main(String [] args)
    {
        Palindrome rp =new Palindrome();
    }
}

    
          