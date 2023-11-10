import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Help extends Layout implements MouseListener{

    JPanel content_panel;

    Help(){

        content_panel = new JPanel();
        this.add(content_panel);


        // Setting up background colour of Panel
        
        if(Apps_Color==1){
            content_panel.setBackground(new Color(255, 115, 0));
        }
        else if(Apps_Color==2){
            content_panel.setBackground(new Color(119, 41, 196));
        }
        else if(Apps_Color==3){
            content_panel.setBackground(new Color(0, 123, 255));
        }
        else if(Apps_Color==4){
            content_panel.setBackground(new Color(76, 204, 76));
        }
        else if(Apps_Color==5){
            content_panel.setBackground(new Color(255, 51, 51));
        }
        else if(Apps_Color==0){
            content_panel.setBackground(new Color(25, 25, 25));
        }


        content_panel.setLayout(new BorderLayout());

        JLabel help_text = new JLabel(); 

        help_text.setText("<html> <center> # How to use our \"TGPA Calculator Interface\": <br> <br> <br> ---> First go to Top Left Corner of our App and click on the \"Hamburger Menu Button\".  <br> <br> ---> After Clicking on the \"Hamburger Menu Button\" a Sliding Panel will come out from left side of our Application. <br> <br> ---> In that Sliding Panel Click on the \"Calculate TGPA Button\" and then \"Choose the No. of Subjects\" & Enter your Marks out of 100 & Credits of Each Subject in their respective columns <br> <br> ---> After filling all the Marks and Credits Click on the \"Claculate TGPA\" button. <br> <br> <br> <br> </center> </html>"); 

        help_text.setForeground(new Color(255, 255, 255));  

        help_text.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));           // This will create a border around our Label which will have a thickness of 2px 

        help_text.setHorizontalAlignment(JLabel.CENTER);
        // welcome_text.setVerticalAlignment(JLabel.CENTER);


        // Increasing Font Size of Text inside the Label

        Font font = help_text.getFont();                                          // get the current font
        int font_Size = font.getSize() + 1;                                         // increase the font size by 1px
        Font new_Font = new Font(font.getName(), font.getStyle(), font_Size);        // create a new font with the increased size
        help_text.setFont(new_Font);                                              // set the label's font to the new font


        content_panel.add(help_text);

        // Adding Mouse Listener to Panel so that when "slidingPanel" is visible, we will use "MouseEvent" Class to make the "slidingPanel" invisible when the user will click somewhere else other than slidingPanel on the frame 

        content_panel.addMouseListener(this);
    }


    
    // Defining what to do when user clicks on the frame anywhere else than slidingPanel

    public void mouseClicked(MouseEvent e) {
        if (content_panel.getBounds().contains(e.getPoint())) {
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