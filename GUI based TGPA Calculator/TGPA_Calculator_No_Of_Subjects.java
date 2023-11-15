import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class TGPA_Calculator_No_Of_Subjects extends Layout implements MouseListener{  
    
    // No need to implement ActionListener Interface because it is already implementd by the Parent Class of this class which is "Layout" 

    JButton Button_1;
    JButton Button_2;
    JButton Button_3;
    JButton Button_4;
    JButton Button_5;
    JButton Button_6;
    JButton Button_7;
    JButton Button_8;
    JButton Button_9;
    JButton Button_10;

    JPanel Buttons_And_Heading_Holder;

    TGPA_Calculator_No_Of_Subjects(){

        Buttons_And_Heading_Holder = new JPanel();
        this.add(Buttons_And_Heading_Holder);
        
        
        // Setting up background colour of Panel
        
        if(Apps_Color==1){
            Buttons_And_Heading_Holder.setBackground(new Color(255, 115, 0));
        }
        else if(Apps_Color==2){
            Buttons_And_Heading_Holder.setBackground(new Color(119, 41, 196));
        }
        else if(Apps_Color==3){
            Buttons_And_Heading_Holder.setBackground(new Color(0, 123, 255));
        }
        else if(Apps_Color==4){
            Buttons_And_Heading_Holder.setBackground(new Color(76, 204, 76));
        }
        else if(Apps_Color==5){
            Buttons_And_Heading_Holder.setBackground(new Color(255, 51, 51));
        }
        else if(Apps_Color==0){
            Buttons_And_Heading_Holder.setBackground(new Color(25, 25, 25));
        }


        Buttons_And_Heading_Holder.setBorder(BorderFactory.createLineBorder(Color.ORANGE, 2));           // This will create a border around our Label which will have a thickness of 2px 

        // Creating a Label to display text and adding it to our Panel 

        JLabel Heading_label = new JLabel();                                           // Creates a Label 
        Heading_label.setText("* Select the No. of Subjects: ");                 // Sets the Text which has to be displayed Inside the Label 

        Heading_label.setForeground(new Color(255, 255, 255));                    // Sets Color of Text 

        Heading_label.setHorizontalAlignment(JLabel.CENTER);                            // Sets Horizontal Alignment of Label in Panel  

        Heading_label.setPreferredSize(new Dimension(360, 200));           // Setting Size of Label 

        Buttons_And_Heading_Holder.add(Heading_label);                                                   // Adding Label to the Panel 


        // Increasing Font Size of Text inside the Label

        Font font = Heading_label.getFont();                                          // get the current font
        int font_Size = font.getSize() + 1;                                         // increase the font size by 1px
        Font new_Font = new Font(font.getName(), font.getStyle(), font_Size);        // create a new font with the increased size
        Heading_label.setFont(new_Font);                                              // set the label's font to the new font



        // Button with "1" Number as Value 

        Button_1 = new JButton("1"); 
        Button_1.addActionListener(this); 
        Button_1.setBackground(new Color(0, 0, 0)); 
        Button_1.setForeground(new Color(255, 255, 255)); 
        Button_1.setPreferredSize(new Dimension(100, 50));
        Button_1.setFocusable(false); 
        Buttons_And_Heading_Holder.add(Button_1);


        // Button with "2" Number as Value 

        Button_2 = new JButton("2"); 
        Button_2.addActionListener(this); 
        Button_2.setBackground(new Color(0, 0, 0)); 
        Button_2.setForeground(new Color(255, 255, 255)); 
        Button_2.setPreferredSize(new Dimension(100, 50));
        Button_2.setFocusable(false); 
        Buttons_And_Heading_Holder.add(Button_2);


        // Button with "3" Number as Value 

        Button_3 = new JButton("3"); 
        Button_3.addActionListener(this); 
        Button_3.setBackground(new Color(0, 0, 0)); 
        Button_3.setForeground(new Color(255, 255, 255)); 
        Button_3.setPreferredSize(new Dimension(100, 50));
        Button_3.setFocusable(false); 
        Buttons_And_Heading_Holder.add(Button_3);


        // Button with "4" Number as Value 

        Button_4 = new JButton("4"); 
        Button_4.addActionListener(this); 
        Button_4.setBackground(new Color(0, 0, 0)); 
        Button_4.setForeground(new Color(255, 255, 255)); 
        Button_4.setPreferredSize(new Dimension(100, 50));
        Button_4.setFocusable(false); 
        Buttons_And_Heading_Holder.add(Button_4);


        // Button with "5" Number as Value 

        Button_5 = new JButton("5"); 
        Button_5.addActionListener(this); 
        Button_5.setBackground(new Color(0, 0, 0)); 
        Button_5.setForeground(new Color(255, 255, 255)); 
        Button_5.setPreferredSize(new Dimension(100, 50));
        Button_5.setFocusable(false); 
        Buttons_And_Heading_Holder.add(Button_5);


        // Button with "6" Number as Value 

        Button_6 = new JButton("6"); 
        Button_6.addActionListener(this); 
        Button_6.setBackground(new Color(0, 0, 0)); 
        Button_6.setForeground(new Color(255, 255, 255)); 
        Button_6.setPreferredSize(new Dimension(100, 50));
        Button_6.setFocusable(false); 
        Buttons_And_Heading_Holder.add(Button_6);


        // Button with "7" Number as Value 

        Button_7 = new JButton("7"); 
        Button_7.addActionListener(this); 
        Button_7.setBackground(new Color(0, 0, 0)); 
        Button_7.setForeground(new Color(255, 255, 255)); 
        Button_7.setPreferredSize(new Dimension(100, 50));
        Button_7.setFocusable(false); 
        Buttons_And_Heading_Holder.add(Button_7);


        // Button with "8" Number as Value 

        Button_8 = new JButton("8"); 
        Button_8.addActionListener(this); 
        Button_8.setBackground(new Color(0, 0, 0)); 
        Button_8.setForeground(new Color(255, 255, 255)); 
        Button_8.setPreferredSize(new Dimension(100, 50));
        Button_8.setFocusable(false); 
        Buttons_And_Heading_Holder.add(Button_8);


        // Button with "9" Number as Value 

        Button_9 = new JButton("9"); 
        Button_9.addActionListener(this); 
        Button_9.setBackground(new Color(0, 0, 0)); 
        Button_9.setForeground(new Color(255, 255, 255)); 
        Button_9.setPreferredSize(new Dimension(100, 50));
        Button_9.setFocusable(false); 
        Buttons_And_Heading_Holder.add(Button_9);


        // Button with "10" Number as Value 

        Button_10 = new JButton("10"); 
        Button_10.addActionListener(this); 
        Button_10.setBackground(new Color(0, 0, 0)); 
        Button_10.setForeground(new Color(255, 255, 255)); 
        Button_10.setPreferredSize(new Dimension(100, 50));
        Button_10.setFocusable(false); 
        Buttons_And_Heading_Holder.add(Button_10);


        // Adding Mouse Listener to Panel so that when "slidingPanel" is visible, we will use "MouseEvent" Class to make the "slidingPanel" invisible when the user will click somewhere else other than slidingPanel on the frame 

        Buttons_And_Heading_Holder.addMouseListener(this);
    }


    // Defining Functionalities of Buttons 

    public void actionPerformed(ActionEvent e){

        // This "actionPerformed" method will be overriding the Parent class Layout's "actionPerformed" method and because of this our "Navigaiton Hamburger Button" will become non-functional, therefore we will add those buttons functionalities here also in this Class's "actionPerformed" method so that our "Navigation Hamburger Button" can again become functional 
        

        // Button_1 Functionality 
        if(e.getSource() == Button_1){
            a = 1;
            this.setVisible(false);
            this.dispose();
            new TGPA_Calculator_Marks_And_Credits_1();
        }

        // Button_2 Functionality 
        if(e.getSource() == Button_2){
            a = 2;
            this.setVisible(false);
            this.dispose();
            new TGPA_Calculator_Marks_And_Credits_2();
        }

        // Button_3 Functionality 
        if(e.getSource() == Button_3){
            a = 3;
            this.setVisible(false);
            this.dispose();
            new TGPA_Calculator_Marks_And_Credits_3();
        }

        /// Button_4 Functionality 
        if(e.getSource() == Button_4){
            a = 4;
            this.setVisible(false);
            this.dispose();
            new TGPA_Calculator_Marks_And_Credits_4();
        }

        // Button_5 Functionality 
        if(e.getSource() == Button_5){
            a = 5;
            this.setVisible(false);
            this.dispose();
            new TGPA_Calculator_Marks_And_Credits_5();
        }

        // Button_6 Functionality 
        if(e.getSource() == Button_6){
            a = 6;
            this.setVisible(false);
            this.dispose();
            new TGPA_Calculator_Marks_And_Credits_6();
        }

        // Button_7 Functionality 
        if(e.getSource() == Button_7){
            a = 7;
            this.setVisible(false);
            this.dispose();
            new TGPA_Calculator_Marks_And_Credits_7();
        }

        // Button_8 Functionality 
        if(e.getSource() == Button_8){
            a = 8;
            this.setVisible(false);
            this.dispose();
            new TGPA_Calculator_Marks_And_Credits_8();
        }
        
        // Button_9 Functionality 
        if(e.getSource() == Button_9){
            a = 9;
            this.setVisible(false);
            this.dispose();
            new TGPA_Calculator_Marks_And_Credits_9();
        }

        // Button_10 Functionality 
        if(e.getSource() == Button_10){
            a = 10;
            this.setVisible(false);
            this.dispose();
            new TGPA_Calculator_Marks_And_Credits_10();
        }

        // Hamburger Navigation Button Functionality
        if(e.getSource() == nav_button){
            toggleSlidingPanel();
        }

        // Home Button Functionality
        if(e.getSource() == Home_Button){
            this.setVisible(false);
            this.dispose();
            new Home();
        }

        // Help Button Functionality
        if(e.getSource() == Help_Button){
            this.setVisible(false);
            this.dispose();
            new Help();
        }

        // TGPA Button Functionality
        if(e.getSource() == TGPA_Button){
            this.setVisible(false);
            this.dispose();
            new TGPA_Calculator_No_Of_Subjects();
        }

        // Disclaimer Button Functionality
        if(e.getSource() == Disclaimer_Button){
            this.setVisible(false);
            this.dispose();
            new Disclaimer();
        }

        // Change Apps Color Button Button Functionality
        if(e.getSource() == Change_Apps_Color_Button){
            this.setVisible(false);
            this.dispose();
            new Change_Apps_Color();
        }
    }


    // Defining what to do when user clicks on the frame anywhere else than slidingPanel

    public void mouseClicked(MouseEvent e) {
        if (Buttons_And_Heading_Holder.getBounds().contains(e.getPoint())) {
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