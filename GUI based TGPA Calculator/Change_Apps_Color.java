import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Change_Apps_Color extends Layout implements MouseListener{  
    
    JPanel Buttons_And_Heading_Holder;

    JButton Orange_Button;
    JButton Violet_Button;
    JButton Blue_Button;
    JButton Green_Button;
    JButton Red_Button;
    JButton Default_Button;


    Change_Apps_Color(){

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
         

        Buttons_And_Heading_Holder.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 211), 2));           // This will create a border around our Label which will have a thickness of 2px 


        // Creating a Label to display text and adding it to our Panel 

        JLabel Heading_label = new JLabel();                                           // Creates a Label 
        Heading_label.setText("<html> <center> <br> <br> <br> * Click On Any of the Below Given Buttons to Change <br> App's Colour To that Specific Color Variant <br> <br> <br> <br> </center> </html>");              // Sets the Text which has to be displayed Inside the Label 
        
        // above "&nbsp" inside "<html>" tag means "Non Breaking Space" it is used to add Horizontal Space between the words 


        Heading_label.setForeground(new Color(255, 255, 255));                    // Sets Color of Text 

        Heading_label.setHorizontalAlignment(JLabel.CENTER);                            // Sets Horizontal Alignment of Label in Panel  

        Heading_label.setPreferredSize(new Dimension(360, 160));           // Setting Size of Label 

        Buttons_And_Heading_Holder.add(Heading_label);                                                   // Adding Label to the Panel 


        // Increasing Font Size of Text inside the Label

        Font font = Heading_label.getFont();                                          // get the current font
        int font_Size = font.getSize() + 1;                                         // increase the font size by 10
        Font new_Font = new Font(font.getName(), font.getStyle(), font_Size);        // create a new font with the increased size
        Heading_label.setFont(new_Font);                                              // set the label's font to the new font 


        // Setting up Text_Field_And_Heading_Holder Panel's Layout Manager as FlowLayout which will have "10px" horizontal & "5px" vertical gap between the TextFields 

        Buttons_And_Heading_Holder.setLayout(new FlowLayout(FlowLayout.CENTER, 12, 5));    



        // Orange Button for changing App's Layout's Color to Orange 

        Orange_Button = new JButton("Orange"); 
        Orange_Button.addActionListener(this); 
        Orange_Button.setBackground(new Color(0, 0, 0)); 
        Orange_Button.setForeground(new Color(255, 115, 0)); 
        Orange_Button.setPreferredSize(new Dimension(140, 100));
        Orange_Button.setFocusable(false); 
        Orange_Button.setFont(new Font("Times New Roman", Font.PLAIN, 25));
        Buttons_And_Heading_Holder.add(Orange_Button);


        // Violet Button for changing App's Layout's Color to Violet  

        Violet_Button = new JButton("Violet"); 
        Violet_Button.addActionListener(this); 
        Violet_Button.setBackground(new Color(0, 0, 0)); 
        Violet_Button.setForeground(new Color(119, 41, 196)); 
        Violet_Button.setPreferredSize(new Dimension(140, 100));
        Violet_Button.setFocusable(false); 
        Violet_Button.setFont(new Font("Times New Roman", Font.PLAIN, 25));
        Buttons_And_Heading_Holder.add(Violet_Button);


        // Blue Button for changing App's Layout's Color to Blue  

        Blue_Button = new JButton("Blue"); 
        Blue_Button.addActionListener(this); 
        Blue_Button.setBackground(new Color(0, 0, 0)); 
        Blue_Button.setForeground(new Color(0, 123, 255)); 
        Blue_Button.setPreferredSize(new Dimension(140, 100));
        Blue_Button.setFocusable(false); 
        Blue_Button.setFont(new Font("Times New Roman", Font.PLAIN, 25));
        Buttons_And_Heading_Holder.add(Blue_Button);


        // Green Button for changing App's Layout's Color to Green 

        Green_Button = new JButton("Green"); 
        Green_Button.addActionListener(this); 
        Green_Button.setBackground(new Color(0, 0, 0)); 
        Green_Button.setForeground(new Color(111, 223, 148)); 
        Green_Button.setPreferredSize(new Dimension(140, 100));
        Green_Button.setFocusable(false); 
        Green_Button.setFont(new Font("Times New Roman", Font.PLAIN, 25));
        Buttons_And_Heading_Holder.add(Green_Button);


        // Red Button for changing App's Layout's Color to Red 

        Red_Button = new JButton("Red"); 
        Red_Button.addActionListener(this); 
        Red_Button.setBackground(new Color(0, 0, 0)); 
        Red_Button.setForeground(new Color(255, 51, 51)); 
        Red_Button.setPreferredSize(new Dimension(140, 100));
        Red_Button.setFocusable(false); 
        Red_Button.setFont(new Font("Times New Roman", Font.PLAIN, 25));
        Buttons_And_Heading_Holder.add(Red_Button);


        
        // Default Button for changing App's Layout's Color to Default 

        Default_Button = new JButton("Default"); 
        Default_Button.addActionListener(this); 
        Default_Button.setBackground(new Color(0, 0, 0)); 
        Default_Button.setForeground(new Color(255, 255, 255)); 
        Default_Button.setPreferredSize(new Dimension(140, 100));
        Default_Button.setFocusable(false); 
        Default_Button.setFont(new Font("Times New Roman", Font.PLAIN, 25));
        Buttons_And_Heading_Holder.add(Default_Button);

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


    // Defining Functionality of Submit Button 

    public void actionPerformed(ActionEvent e){

        // This "actionPerformed" method will be overriding the Parent class Layout's "actionPerformed" method and because of this our "Navigaiton Hamburger Button" will become non-functional, therefore we will add those buttons functionalities here also in this Class's "actionPerformed" method so that our "Navigation Hamburger Button" can again become functional 


        // Setting up Funcionalities of COlor Buttons 

        if(e.getSource()==Orange_Button){
            Apps_Color = 1;
            this.setVisible(false);
            this.dispose();
            new Change_Apps_Color();
        }

        if(e.getSource()==Violet_Button){
            Apps_Color = 2;
            this.setVisible(false);
            this.dispose();
            new Change_Apps_Color();
        }

        if(e.getSource()==Blue_Button){
            Apps_Color = 3;
            this.setVisible(false);
            this.dispose();
            new Change_Apps_Color();
        }

        if(e.getSource()==Green_Button){
            Apps_Color = 4;
            this.setVisible(false);
            this.dispose();
            new Change_Apps_Color();
        }

        if(e.getSource()==Red_Button){
            Apps_Color = 5;
            this.setVisible(false);
            this.dispose();
            new Change_Apps_Color();
        }

        if(e.getSource()==Default_Button){
            Apps_Color = 0;
            this.setVisible(false);
            this.dispose();
            new Change_Apps_Color();
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
}