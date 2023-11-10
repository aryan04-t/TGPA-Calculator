import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Home extends Layout implements MouseListener{

    JPanel main_panel;

    Home(){

        main_panel = new JPanel();
        this.add(main_panel);
        
        // Setting up background colour of Panel
        
        if(Apps_Color==1){
            main_panel.setBackground(new Color(255, 115, 0));
        }
        else if(Apps_Color==2){
            main_panel.setBackground(new Color(119, 41, 196));
        }
        else if(Apps_Color==3){
            main_panel.setBackground(new Color(0, 123, 255));
        }
        else if(Apps_Color==4){
            main_panel.setBackground(new Color(76, 204, 76));
        }
        else if(Apps_Color==5){
            main_panel.setBackground(new Color(255, 51, 51));
        }
        else if(Apps_Color==0){
            main_panel.setBackground(new Color(25, 25, 25));
        }

        main_panel.setLayout(new BorderLayout());


        JLabel welcome_text = new JLabel(); 

        welcome_text.setText("<html> <center> \"Welcome To Our TGPA Calculator\" <br> <br> <br> * Here you can calculate your TGPA/SGPA in just Fraction of Seconds. <br> <br> * We have taken care of User Interface & User Experience a lot. <br> <br> * Keeping all the above Things in Mind, We have built a really smooth working application which has \"Multiple Amazing Features\". <br> <br> * Enjoy using our App and Don't Forget to Give us your valuable Feedback about our App, Your Feedback will really Help us further to keep Updating our App for \"Best User Experience\". <br> <br> <br> <br> </center> </html>"); 

        welcome_text.setForeground(new Color(255, 255, 255));  

        welcome_text.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 2));           // This will create a border around our Label which will have a thickness of 2px 

        welcome_text.setHorizontalAlignment(JLabel.CENTER);
        // welcome_text.setVerticalAlignment(JLabel.CENTER);


        // Increasing Font Size of Text inside the Label

        Font font = welcome_text.getFont();                                          // get the current font
        int font_Size = font.getSize() + 1;                                         // increase the font size by 1px
        Font new_Font = new Font(font.getName(), font.getStyle(), font_Size);        // create a new font with the increased size
        welcome_text.setFont(new_Font);                                              // set the label's font to the new font

        // When "slidingPanel" is visible, we will use "MouseEvent" Class to make the "slidingPanel" invisible when the user will click somewhere else other than slidingPanel on the frame 

        main_panel.addMouseListener(this);

        main_panel.add(welcome_text);
    }


    // Defining what to do when user clicks on the frame anywhere else than slidingPanel

    public void mouseClicked(MouseEvent e) {
        if (main_panel.getBounds().contains(e.getPoint())) {
            // When click occurred inside the sliding panel, do nothing.
        } 
        else {
            // When click occurred outside the sliding panel, make the sliding panel invisible it.
            slidingPanel.setVisible(false);
        }
    }


    // These are also the abstract methods present in the MouseListener interface which should be defined when MouseListner is implemented in a class, but we don't wanna use these features so we will leave them empty 

    // We can remove these methods which are written below & which we are not really using for anything and after that we can also specify "Home" class as an "abstract" class but the problem will be that then we can not instantiate "Home" class, This means that you cannot create any object of an abstract class using the "new" keyword. Instead, you need to extend the abstract class and provide implementation for its abstract methods in the subclass.
    
    // & The reason that why we cannot create objects of abstract class is, that its an incomplete class that serves as a template for other classes 
    
    // and As we cannot create objects of abstract class, then that will sacrifice the funtionality of our Application's different modules. So, it's not a suitable option to remove below written methods and declare "Home" class as an "abstract" class. 


    public void mousePressed(MouseEvent e) {
        
    }

    public void mouseReleased(MouseEvent e) {
        
    }

    public void mouseEntered(MouseEvent e) {
        
    }

    public void mouseExited(MouseEvent e) {
        
    }   
}