import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class Layout extends JFrame implements ActionListener{

    JButton nav_button;
    JPanel slidingPanel;

    JButton Home_Button;
    JButton Help_Button;
    JButton TGPA_Button;
    JButton Disclaimer_Button;
    JButton Change_Apps_Color_Button;

    public static int a = 0;            // Storing The No. of Subjects Which User Wants to Calculate the TGPA for 

    // This above variable a's value is updated in "TGPA_Calculator_No_Of_Subjects.java" file and it is used in "TGPA_Calculator_Marks_And_Credits.java" file 


    public static double TGPA = 0;      // Used for storing the final calculated TGPA which we have to Display on Result Page 

    public static int Apps_Color = 0;        // Used to Change color of the App 


    Layout(){

        // Creating a Frame and Setting it's Attributes

        this.setSize(360, 640);                                  // This sets the x-dimension and y-dimension size of frame in pixels 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                 // This sets the close action as "Close the Frame and Exit out of Application" 
        this.setTitle("TGPA Calculator");                              // Sets Frame's label 
        ImageIcon logo = new ImageIcon("./Images/Logo.png"); 
        this.setIconImage(logo.getImage());                                  //  Changes the icon of frame
        this.getContentPane().setBackground(new Color(25, 25, 25));    // Sets Background Color of Frame 
        this.setLocation(1100, 80);                                      // Sets Location of Frame on the Screen 
        this.setResizable(false);                                         // Sets the Resizability of our Frame 


        // Creating Panel using JPanel for making a Navigation Bar 

        JPanel nav_panel = new JPanel();                             // Creates a Panel for Navigation Bar 
        nav_panel.setBackground(new Color(128,128,128));             // Sets Panel's Background Color  
        nav_panel.setPreferredSize(new Dimension(360, 40));          // Sets size of Panel 
        this.add(nav_panel, BorderLayout.NORTH);                     // Adds Panel to the Frame  with "BorderLayout.NORTH"
        nav_panel.setLayout(new BorderLayout());                     // Sets Panel's Layout Manager 


        // Creating Navigation Button 

        nav_button = new JButton(new HamburgerButtonIcon());           // Creating Navigation Button and calling HamburgerButtonIcon nested class's constructor in JButton's constructor to draw the Hamburger Logo on the button 
        
        nav_button.addActionListener(this);                            // adding ActionListener to button using "addActionListener()" method, so that it can perform tasks which we will define when we will give definiton to the only abstract method "actionPerformed()" which is present in the @FunctionalInterface "ActionListener" which we have implemented in this class 

        nav_button.setBackground(new Color(0,0,0));              // Sets Background color of button 

        nav_button.setBounds(10, 5, 30, 30);          // This method Sets, x and y values in pixels where the button should be located from left and top respectively and it it also sets the size of button, the width and the height which are the 3rd and 4th parameter in the constructor 

        nav_button.setFocusable(false);                      // Removing the focus border around the text of the button 

        nav_panel.add(nav_button);                                     // Adding Button to the Panel 


        // Creating a Label to display text and adding it to our Panel 

        JLabel text_label = new JLabel();                                           // Creates a Label 
        text_label.setText("TGPA Calculator");                                 // Sets the Text which has to be displayed Inside the Label 
        text_label.setForeground(new Color(255, 255, 255));                    // Sets Color of Text 

        text_label.setHorizontalAlignment(JLabel.CENTER);                            // Sets Horizontal Alignment of Label in Panel 
        // text_label.setVerticalAlignment(JLabel.CENTER);                              // Sets Vertical Alignment of Label in Panel  

        nav_panel.add(text_label);                                                   // Adding Label to the Panel 


        // Setting up the Sliding Navigation Panel

        slidingPanel = new JPanel(new BorderLayout());                              // Creating new Panel with BorderLayout()
        slidingPanel.setPreferredSize(new Dimension(100, getHeight()));       // Setting size of Panel


        // Setting up background colour of Panel

        if(Apps_Color==1){
            slidingPanel.setBackground(new Color(255, 176, 99));
        }
        else if(Apps_Color==2){
            slidingPanel.setBackground(new Color(179, 134, 255));
        }
        else if(Apps_Color==3){
            slidingPanel.setBackground(new Color(102, 187, 255));
        }
        else if(Apps_Color==4){
            slidingPanel.setBackground(new Color(111, 223, 148));
        }
        else if(Apps_Color==5){
            slidingPanel.setBackground(new Color(255, 192, 203));
        }
        else if(Apps_Color==0){
            slidingPanel.setBackground(Color.LIGHT_GRAY);
        }
                                        

        slidingPanel.setVisible(false);                                       // Setting default visibility of Sliding Panel as "false" so, that we can make it visible only when we click on "Navigation Button" 

        this.add(slidingPanel, BorderLayout.WEST);                                  // Adding Panel to the frame with "BorderLayout.WEST"


        // Now we will be Adding Different Different Functioning Buttons to our Sliding Panel to Make Navigation through our Application Easier 

        slidingPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));   // Setting up slidingPanel's Layout Manager as FlowLayout which will have "0px" vertical & horizontal gap between the buttons 


        // Home Button 

        Home_Button = new JButton("Home"); 
        Home_Button.addActionListener(this); 
        Home_Button.setBackground(new Color(0, 0, 0)); 
        Home_Button.setForeground(new Color(255, 255, 255)); 
        Home_Button.setPreferredSize(new Dimension(100, 50));
        Home_Button.setFocusable(false); 
        slidingPanel.add(Home_Button); 


        // TGPA Calculator 

        TGPA_Button = new JButton("<html> <center> Calculate <br> TGPA </center> </html>");                 // We have used HTML's <BR> tag to Add two lines of Content inside Button's Text Space and we have used <center> tag to center the content inside the button 
        TGPA_Button.addActionListener(this); 
        TGPA_Button.setBackground(new Color(0, 0, 0)); 
        TGPA_Button.setForeground(new Color(255, 255, 255)); 
        TGPA_Button.setPreferredSize(new Dimension(100, 58)); 
        TGPA_Button.setFocusable(false); 
        slidingPanel.add(TGPA_Button); 


        // Help Button 

        Help_Button = new JButton("Help"); 
        Help_Button.addActionListener(this); 
        Help_Button.setBackground(new Color(0, 0, 0)); 
        Help_Button.setForeground(new Color(255, 255, 255)); 
        Help_Button.setPreferredSize(new Dimension(100, 58));
        Help_Button.setFocusable(false); 
        slidingPanel.add(Help_Button);


        // Disclaimer Button 

        Disclaimer_Button = new JButton("Disclaimer"); 
        Disclaimer_Button.addActionListener(this); 
        Disclaimer_Button.setBackground(new Color(0, 0, 0)); 
        Disclaimer_Button.setForeground(new Color(255, 255, 255)); 
        Disclaimer_Button.setPreferredSize(new Dimension(100, 58));
        Disclaimer_Button.setFocusable(false); 
        slidingPanel.add(Disclaimer_Button); 

        
        // Change App Color Calculator 

        Change_Apps_Color_Button = new JButton("<html> <center> Change App's <br> Color </center> </html>"); 
        Change_Apps_Color_Button.addActionListener(this); 
        Change_Apps_Color_Button.setBackground(new Color(0, 0, 0)); 
        Change_Apps_Color_Button.setForeground(new Color(255, 255, 255)); 
        Change_Apps_Color_Button.setPreferredSize(new Dimension(100, 58)); 
        Change_Apps_Color_Button.setFocusable(false); 
        slidingPanel.add(Change_Apps_Color_Button); 


        this.setVisible(true);                                              // Makes our Frame visible 
    }


    // Defining Functionalities of Buttons 

    public void actionPerformed(ActionEvent e){

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


    // Toggling the visibility of the Sliding Navigation Panel

    public void toggleSlidingPanel() {
        if (slidingPanel.isVisible()) {
            slidingPanel.setVisible(false);
        } 
        else {
            slidingPanel.setVisible(true);
        }
    }


    // Creating Hamburger Button Icon for Navigation Button using 2D Graphics 

    // Here we will create a nested class which will implement Icon interface 

    public static class HamburgerButtonIcon implements Icon {

        // Here we are using "Icon" interface to draw hamburger on the Navigation button, this "Icon" interface contains two abstract methods getIconWidth() and getIconHeight(), these two methods return width and height of of the icon respectively 

        static final int WIDTH = 30;
        static final int HEIGHT = 30;
        
        // The paintIcon() method is responsible for actually painting the icon onto a graphical component. The method takes three arguments: a Component object, a Graphics object, and the x and y coordinates of where the icon should be painted.

        public void paintIcon(Component c, Graphics g, int x, int y) {

            Graphics2D g2D = (Graphics2D) g.create();            // "Graphics2D" is the child class of "Graphics" class and it has much advanced drawing options compared to "Graphics2D" and above we are converting parent class's object to child class thats why we're typcasting 

            g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);       // This function enables anti-aliasing, which smooths out the edges of the lines that will be drawn 

            int size = 20;                           // This sets the size of the icon that will be drawn 
            int padding = (WIDTH - size) / 2;        // This line calculates the padding required to center the icon within the available space.

            g2D.setColor(Color.WHITE);                                // Setting the color of lines to White 

            g2D.setStroke(new BasicStroke(2f));                 // setStroke() method is used to set the thickness of the lines to be drawn to 2 pixels 


            // draw() is the method of "Graphics2D" class which is used to draw things  
            // The "Line2D.Float" class is used to represent a line segment with floating-point coordinates. Its constructor takes four arguments, which are: 

            /* 
            x1: The x-coordinate of the starting point of the line segment.
            y1: The y-coordinate of the starting point of the line segment.
            x2: The x-coordinate of the end point of the line segment.
            y2: The y-coordinate of the end point of the line segment.
            */


            // Draw top line
            g2D.draw(new Line2D.Float(padding, padding + 3, padding + size, padding + 3)); 

            // Draw middle line
            g2D.draw(new Line2D.Float(padding, padding + 9, padding + size, padding + 9)); 

            // Draw bottom line
            g2D.draw(new Line2D.Float(padding, padding + 16, padding + size, padding + 16));  

            g2D.dispose();                                             //  This line disposes of the "Graphics2D" object created earlier, which releases any system resources associated with it 
        }

        // These are the two abstract methods which are present in "Icon" interface and these abstract methods has to be defined when we implement "Icon" interface 

        public int getIconWidth() {
            return WIDTH;             // This method returns the width of the icon 
        }

        public int getIconHeight() {
            return HEIGHT;            // This method returns the height of the icon 
        }
    }
}