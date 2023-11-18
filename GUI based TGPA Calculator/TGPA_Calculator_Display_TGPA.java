import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class TGPA_Calculator_Display_TGPA extends Layout implements MouseListener{

    JPanel TGPA_And_Heading_Holder;

    TGPA_Calculator_Display_TGPA(){

        TGPA_And_Heading_Holder = new JPanel();
        this.add(TGPA_And_Heading_Holder);
        

        // Setting up background colour of Panel
        
        if(Apps_Color==1){
            TGPA_And_Heading_Holder.setBackground(new Color(255, 115, 0));
        }
        else if(Apps_Color==2){
            TGPA_And_Heading_Holder.setBackground(new Color(119, 41, 196));
        }
        else if(Apps_Color==3){
            TGPA_And_Heading_Holder.setBackground(new Color(0, 123, 255));
        }
        else if(Apps_Color==4){
            TGPA_And_Heading_Holder.setBackground(new Color(76, 204, 76));
        }
        else if(Apps_Color==5){
            TGPA_And_Heading_Holder.setBackground(new Color(255, 51, 51));
        }
        else if(Apps_Color==0){
            TGPA_And_Heading_Holder.setBackground(new Color(25, 25, 25));
        }


        TGPA_And_Heading_Holder.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));           // This will create a border around our Label which will have a thickness of 2px 

        // Creating a Label to display text and adding it to our Panel 

        JLabel Heading_label = new JLabel();                                           // Creates a Label 
        Heading_label.setText("# Your TGPA is: ");                 // Sets the Text which has to be displayed Inside the Label 
        Heading_label.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        Heading_label.setForeground(new Color(255, 255, 255));                    // Sets Color of Text 
        Heading_label.setHorizontalAlignment(JLabel.CENTER);                            // Sets Horizontal Alignment of Label in Panel  
        Heading_label.setPreferredSize(new Dimension(360, 200));           // Setting Size of Label 
        TGPA_And_Heading_Holder.add(Heading_label);                                                   // Adding Label to the Panel 


        // Displaying TGPA in a Label 
        
        JLabel TGPA_label = new JLabel();                                           // Creates a Label 
        TGPA_label.setText(String.valueOf(TGPA));                                 // This will Display TGPA
        
        if(Apps_Color==1 || Apps_Color==2 || Apps_Color==3 || Apps_Color==5 || Apps_Color==0){
            TGPA_label.setForeground(new Color(0, 255, 0));                    // Sets Color of Text to Green
        }
        else if(Apps_Color==4){
            TGPA_label.setForeground(new Color(0, 0, 0));                      // Sets Color of Text to Black 
        }

        TGPA_label.setHorizontalAlignment(JLabel.CENTER);                            // Sets Horizontal Alignment of Label in Panel  
        TGPA_label.setPreferredSize(new Dimension(360, 200));           // Setting Size of Label
        TGPA_label.setFont(new Font("Times New Roman", Font.PLAIN, 120));
        TGPA_And_Heading_Holder.add(TGPA_label);                                                   // Adding Label to the Panel 


        // Increasing Font Size of Text inside the Label

        Font font = Heading_label.getFont();                                          // get the current font
        int font_Size = font.getSize() + 20;                                         // increase the font size by 1px
        Font new_Font = new Font(font.getName(), font.getStyle(), font_Size);        // create a new font with the increased size
        Heading_label.setFont(new_Font);                                              // set the label's font to the new font


        // Adding Mouse Listener to Panel so that when "slidingPanel" is visible, we will use "MouseEvent" Class to make the "slidingPanel" invisible when the user will click somewhere else other than slidingPanel on the frame 

        TGPA_And_Heading_Holder.addMouseListener(this);

    }

    
    // Defining what to do when user clicks on the frame anywhere else than slidingPanel

    public void mouseClicked(MouseEvent e) {
        if (TGPA_And_Heading_Holder.getBounds().contains(e.getPoint())) {
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
