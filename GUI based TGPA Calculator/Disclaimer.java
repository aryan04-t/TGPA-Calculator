import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Disclaimer extends Layout implements MouseListener{

    JPanel container_panel;

    Disclaimer(){

        container_panel = new JPanel();
        this.add(container_panel);
        

        // Setting up background colour of Panel
        
        if(Apps_Color==1){
            container_panel.setBackground(new Color(255, 115, 0));
        }
        else if(Apps_Color==2){
            container_panel.setBackground(new Color(119, 41, 196));
        }
        else if(Apps_Color==3){
            container_panel.setBackground(new Color(0, 123, 255));
        }
        else if(Apps_Color==4){
            container_panel.setBackground(new Color(76, 204, 76));
        }
        else if(Apps_Color==5){
            container_panel.setBackground(new Color(255, 51, 51));
        }
        else if(Apps_Color==0){
            container_panel.setBackground(new Color(25, 25, 25));
        }


        container_panel.setLayout(new BorderLayout());

        JLabel disclaimer_text = new JLabel(); 

        disclaimer_text.setText("<html> <center> # Disclaimer: <br> <br> <br> (i) Our Calculator tells you your \"Absolute TGPA\", and Just like all other universities our university also uses \"Relative Grading\".  <br> <br> (ii) So, when your Final TGPA will be declared by the university at the time of result declaration, at that time it can even be more than the TGPA that our calculator told you, if the whole university performed bad with respect to you, as it's \"Relative Grading\" <br> <br> (iii) And it can even be less than the TGPA which our calculator told you if whole university performed very well with respect to you. <br> <br> <br> <br> </center> </html>"); 

        disclaimer_text.setForeground(new Color(255, 255, 255));  

        disclaimer_text.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));           // This will create a border around our Label which will have a thickness of 2px 

        disclaimer_text.setHorizontalAlignment(JLabel.CENTER); 
        // welcome_text.setVerticalAlignment(JLabel.CENTER);


        // Increasing Font Size of Text inside the Label

        Font font = disclaimer_text.getFont();                                          // get the current font
        int font_Size = font.getSize() + 1;                                         // increase the font size by 1px
        Font new_Font = new Font(font.getName(), font.getStyle(), font_Size);        // create a new font with the increased size
        disclaimer_text.setFont(new_Font);                                              // set the label's font to the new font


        container_panel.add(disclaimer_text);

        // Adding Mouse Listener to Panel so that when "slidingPanel" is visible, we will use "MouseEvent" Class to make the "slidingPanel" invisible when the user will click somewhere else other than slidingPanel on the frame 

        container_panel.addMouseListener(this);
    }


    
    // Defining what to do when user clicks on the frame anywhere else than slidingPanel

    public void mouseClicked(MouseEvent e) {
        if (container_panel.getBounds().contains(e.getPoint())) {
            // When click occurred inside the sliding panel, do nothing.
        } 
        else {
            // When click occurred outside the sliding panel, make the sliding panel invisible it.
            slidingPanel.setVisible(false);
        }
    }


    // These are also the abstract methods present in the MouseListener interface which should be defined when MouseListner is implemented in a class, but we don't wanna use these features so we will leave them empty 

    public void mousePressed(MouseEvent e) {
        
    }

    public void mouseReleased(MouseEvent e) {
        
    }

    public void mouseEntered(MouseEvent e) {
        
    }

    public void mouseExited(MouseEvent e) {
        
    }   
}