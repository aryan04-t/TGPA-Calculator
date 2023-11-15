import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;


public class TGPA_Calculator_Marks_And_Credits_6 extends Layout implements KeyListener, MouseListener{  
    
    JPanel Text_Field_And_Heading_Holder;


    // 1st Line
    JTextField Text_Field_for_Marks_of_Subject1;
    JTextField Text_Field_for_Credits_of_Subject1;
    JLabel Sub1_Marks_Error_Text;
    JLabel Sub1_Credits_Error_Text;


    // 2nd Line
    JTextField Text_Field_for_Marks_of_Subject2;
    JTextField Text_Field_for_Credits_of_Subject2;
    JLabel Sub2_Marks_Error_Text;
    JLabel Sub2_Credits_Error_Text;


    // 3rd Line
    JTextField Text_Field_for_Marks_of_Subject3;
    JTextField Text_Field_for_Credits_of_Subject3;
    JLabel Sub3_Marks_Error_Text;
    JLabel Sub3_Credits_Error_Text;


    // 4th Line
    JTextField Text_Field_for_Marks_of_Subject4;
    JTextField Text_Field_for_Credits_of_Subject4;
    JLabel Sub4_Marks_Error_Text;
    JLabel Sub4_Credits_Error_Text;


    // 5th Line
    JTextField Text_Field_for_Marks_of_Subject5;
    JTextField Text_Field_for_Credits_of_Subject5;
    JLabel Sub5_Marks_Error_Text;
    JLabel Sub5_Credits_Error_Text;


    // 6th Line
    JTextField Text_Field_for_Marks_of_Subject6;
    JTextField Text_Field_for_Credits_of_Subject6;
    JLabel Sub6_Marks_Error_Text;
    JLabel Sub6_Credits_Error_Text;



    // Submit Button
    JButton Submit;


    // Submit Button's Activation Checking Variables

    boolean m1_1, m1_2, m1_3, m1_4, m1_5, m1_6, c1_1, c1_2, c1_3, c1_4, c1_5, c1_6;

    boolean m2_1, m2_2, m2_3, m2_4, m2_5, m2_6, c2_1, c2_2, c2_3, c2_4, c2_5, c2_6;


    TGPA_Calculator_Marks_And_Credits_6(){

        Text_Field_And_Heading_Holder = new JPanel();
        this.add(Text_Field_And_Heading_Holder);
        
        
        // Setting up background colour of Panel
        
        if(Apps_Color==1){
            Text_Field_And_Heading_Holder.setBackground(new Color(255, 115, 0));
        }
        else if(Apps_Color==2){
            Text_Field_And_Heading_Holder.setBackground(new Color(119, 41, 196));
        }
        else if(Apps_Color==3){
            Text_Field_And_Heading_Holder.setBackground(new Color(0, 123, 255));
        }
        else if(Apps_Color==4){
            Text_Field_And_Heading_Holder.setBackground(new Color(76, 204, 76));
        }
        else if(Apps_Color==5){
            Text_Field_And_Heading_Holder.setBackground(new Color(255, 51, 51));
        }
        else if(Apps_Color==0){
            Text_Field_And_Heading_Holder.setBackground(new Color(25, 25, 25));
        }
        

        Text_Field_And_Heading_Holder.setBorder(BorderFactory.createLineBorder(new Color(148, 0, 211), 2));           // This will create a border around our Label which will have a thickness of 2px 


        // Creating a Label to display text and adding it to our Panel 

        JLabel Heading_label = new JLabel();                                           // Creates a Label 
        Heading_label.setText("<html> <center> <br> <br> <br> <br> * Enter Your Marks of Each Subject out of 100 <br> and Their Credits: <br> <br> <br> <br> Marks    &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;     Credits </center> </html>");              // Sets the Text which has to be displayed Inside the Label 
        
        // above "&nbsp" inside "<html>" tag means "Non Breaking Space" it is used to add Horizontal Space between the words 


        Heading_label.setForeground(new Color(255, 255, 255));                    // Sets Color of Text 

        Heading_label.setHorizontalAlignment(JLabel.CENTER);                            // Sets Horizontal Alignment of Label in Panel  

        Heading_label.setPreferredSize(new Dimension(360, 180));           // Setting Size of Label 

        Text_Field_And_Heading_Holder.add(Heading_label);                                                   // Adding Label to the Panel 


        // Increasing Font Size of Text inside the Label

        Font font = Heading_label.getFont();                                          // get the current font
        int font_Size = font.getSize() + 1;                                         // increase the font size by 10
        Font new_Font = new Font(font.getName(), font.getStyle(), font_Size);        // create a new font with the increased size
        Heading_label.setFont(new_Font);                                              // set the label's font to the new font 


        // Setting up Text_Field_And_Heading_Holder Panel's Layout Manager as FlowLayout which will have "10px" horizontal & "5px" vertical gap between the TextFields 

        Text_Field_And_Heading_Holder.setLayout(new FlowLayout(FlowLayout.CENTER, 12, 5));   


        // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

        
        // Below we are Customizing Panels for user's each response for "No. of Subjects", and only that "Customized Panel" will be shown to the user for which he/she has opted by giving input for "No. of Subjects" in the last frame  
        
        // These "Customized Panels" which we will be working on below will have JTextFields which will take Input from user for "Marks & Credits of Each Subject" 

        // For How many "Subjects" we have to take input from user for "Marks and Credits" was decided in the last frame which was the frame created by the file "TGPA_Calculator_No_Of_Subjects.java"
        
        // When user clicked on any numbered button out of the number buttons which were displayed infront of him/her in the last frame, "Integer Varibale a's" value was updated to the "No. of Subjects" for which user wanted to calculate it's TGPA for and after that this file's constructor was called to switch to the next frame of our application for "TGPA Calculation" 
        
        // And in this next Frame, As per that Updated value of "Variable a" the user will be shown a Frame which will have a Panel that will have exactly the same amount of JTextFields which are needed for taking input from user for "Marks and Credits" of all the n number of subjects for which he/she wants to Calculate his/her TGPA for.  

        
        if(a == 6){    

            // 1st Line 

            // Creating 1st Text Field for Marks of 1st Subject 
            Text_Field_for_Marks_of_Subject1 = new JTextField();
            Text_Field_for_Marks_of_Subject1.setBackground(new Color(0, 0, 0)); 
            Text_Field_for_Marks_of_Subject1.setForeground(new Color(255, 255, 255));
            Text_Field_for_Marks_of_Subject1.setPreferredSize(new Dimension(158, 20)); 
            Text_Field_for_Marks_of_Subject1.setText("Enter Marks of 1st Subject");
            Text_Field_for_Marks_of_Subject1.setFont(new Font("Segoe UI", Font.PLAIN, 10));
            Text_Field_for_Marks_of_Subject1.addKeyListener(this);
            Text_Field_And_Heading_Holder.add(Text_Field_for_Marks_of_Subject1);

            // Creating 2nd Text Field for Credits of 1st Subject 
            Text_Field_for_Credits_of_Subject1 = new JTextField();
            Text_Field_for_Credits_of_Subject1.setBackground(new Color(0, 0, 0)); 
            Text_Field_for_Credits_of_Subject1.setForeground(new Color(255, 255, 255));
            Text_Field_for_Credits_of_Subject1.setPreferredSize(new Dimension(158, 20)); 
            Text_Field_for_Credits_of_Subject1.setText("Enter Credits of 1st Subject");
            Text_Field_for_Credits_of_Subject1.setFont(new Font("Segoe UI", Font.PLAIN, 10));
            Text_Field_for_Credits_of_Subject1.addKeyListener(this);
            Text_Field_And_Heading_Holder.add(Text_Field_for_Credits_of_Subject1);


            // Label for Displaying Error of 1st Subject's Marks
            Sub1_Marks_Error_Text = new JLabel(); 
            Sub1_Marks_Error_Text.setPreferredSize(new Dimension(158, 10));

            if(Apps_Color==3 || Apps_Color==4 || Apps_Color==0){
                Sub1_Marks_Error_Text.setForeground(new Color(255, 0, 0)); 
            }
            else if(Apps_Color==1 || Apps_Color==2 || Apps_Color==5){
                Sub1_Marks_Error_Text.setForeground(new Color(255, 255, 255)); 
            }

            Sub1_Marks_Error_Text.setFont(new Font("Segoe UI", Font.PLAIN, 8));
            Text_Field_And_Heading_Holder.add(Sub1_Marks_Error_Text);


            // Label for Displaying Error of 1st Subject's Credits
            Sub1_Credits_Error_Text = new JLabel(); 
            Sub1_Credits_Error_Text.setPreferredSize(new Dimension(158, 10));

            if(Apps_Color==3 || Apps_Color==4 || Apps_Color==0){
                Sub1_Credits_Error_Text.setForeground(new Color(255, 0, 0)); 
            }
            else if(Apps_Color==1 || Apps_Color==2 || Apps_Color==5){
                Sub1_Credits_Error_Text.setForeground(new Color(255, 255, 255)); 
            }

            Sub1_Credits_Error_Text.setFont(new Font("Segoe UI", Font.PLAIN, 8));
            Text_Field_And_Heading_Holder.add(Sub1_Credits_Error_Text);



            // 2nd Line 

            // Creating 3rd Text Field for Marks of 2nd Subject 
            Text_Field_for_Marks_of_Subject2 = new JTextField();
            Text_Field_for_Marks_of_Subject2.setBackground(new Color(0, 0, 0)); 
            Text_Field_for_Marks_of_Subject2.setForeground(new Color(255, 255, 255));
            Text_Field_for_Marks_of_Subject2.setPreferredSize(new Dimension(158, 20)); 
            Text_Field_for_Marks_of_Subject2.setText("Enter Marks of 2nd Subject");
            Text_Field_for_Marks_of_Subject2.setFont(new Font("Segoe UI", Font.PLAIN, 10));
            Text_Field_for_Marks_of_Subject2.addKeyListener(this);
            Text_Field_And_Heading_Holder.add(Text_Field_for_Marks_of_Subject2);

            // Creating 4th Text Field for Credits of 2nd Subject 
            Text_Field_for_Credits_of_Subject2 = new JTextField();
            Text_Field_for_Credits_of_Subject2.setBackground(new Color(0, 0, 0)); 
            Text_Field_for_Credits_of_Subject2.setForeground(new Color(255, 255, 255));
            Text_Field_for_Credits_of_Subject2.setPreferredSize(new Dimension(158, 20)); 
            Text_Field_for_Credits_of_Subject2.setText("Enter Credits of 2nd Subject");
            Text_Field_for_Credits_of_Subject2.setFont(new Font("Segoe UI", Font.PLAIN, 10));
            Text_Field_for_Credits_of_Subject2.addKeyListener(this);
            Text_Field_And_Heading_Holder.add(Text_Field_for_Credits_of_Subject2);


            // Label for Displaying Error of 2nd Subject's Marks
            Sub2_Marks_Error_Text = new JLabel(); 
            Sub2_Marks_Error_Text.setPreferredSize(new Dimension(158, 10));
            
            if(Apps_Color==3 || Apps_Color==4 || Apps_Color==0){
                Sub2_Marks_Error_Text.setForeground(new Color(255, 0, 0)); 
            }
            else if(Apps_Color==1 || Apps_Color==2 || Apps_Color==5){
                Sub2_Marks_Error_Text.setForeground(new Color(255, 255, 255)); 
            }

            Sub2_Marks_Error_Text.setFont(new Font("Segoe UI", Font.PLAIN, 8));
            Text_Field_And_Heading_Holder.add(Sub2_Marks_Error_Text);


            // Label for Displaying Error of 2nd Subject's Credits
            Sub2_Credits_Error_Text = new JLabel(); 
            Sub2_Credits_Error_Text.setPreferredSize(new Dimension(158, 10));
            
            if(Apps_Color==3 || Apps_Color==4 || Apps_Color==0){
                Sub2_Credits_Error_Text.setForeground(new Color(255, 0, 0)); 
            }
            else if(Apps_Color==1 || Apps_Color==2 || Apps_Color==5){
                Sub2_Credits_Error_Text.setForeground(new Color(255, 255, 255)); 
            }

            Sub2_Credits_Error_Text.setFont(new Font("Segoe UI", Font.PLAIN, 8));
            Text_Field_And_Heading_Holder.add(Sub2_Credits_Error_Text);



            // 3rd Line 

            // Creating 5th Text Field for Marks of 3rd Subject 
            Text_Field_for_Marks_of_Subject3 = new JTextField();
            Text_Field_for_Marks_of_Subject3.setBackground(new Color(0, 0, 0)); 
            Text_Field_for_Marks_of_Subject3.setForeground(new Color(255, 255, 255));
            Text_Field_for_Marks_of_Subject3.setPreferredSize(new Dimension(158, 20)); 
            Text_Field_for_Marks_of_Subject3.setText("Enter Marks of 3rd Subject");
            Text_Field_for_Marks_of_Subject3.setFont(new Font("Segoe UI", Font.PLAIN, 10));
            Text_Field_for_Marks_of_Subject3.addKeyListener(this);
            Text_Field_And_Heading_Holder.add(Text_Field_for_Marks_of_Subject3);

            // Creating 6th Text Field for Credits of 3rd Subject 
            Text_Field_for_Credits_of_Subject3 = new JTextField();
            Text_Field_for_Credits_of_Subject3.setBackground(new Color(0, 0, 0)); 
            Text_Field_for_Credits_of_Subject3.setForeground(new Color(255, 255, 255));
            Text_Field_for_Credits_of_Subject3.setPreferredSize(new Dimension(158, 20)); 
            Text_Field_for_Credits_of_Subject3.setText("Enter Credits of 3rd Subject");
            Text_Field_for_Credits_of_Subject3.setFont(new Font("Segoe UI", Font.PLAIN, 10));
            Text_Field_for_Credits_of_Subject3.addKeyListener(this);
            Text_Field_And_Heading_Holder.add(Text_Field_for_Credits_of_Subject3);


            // Label for Displaying Error of 3rd Subject's Marks
            Sub3_Marks_Error_Text = new JLabel(); 
            Sub3_Marks_Error_Text.setPreferredSize(new Dimension(158, 10));

            if(Apps_Color==3 || Apps_Color==4 || Apps_Color==0){
                Sub3_Marks_Error_Text.setForeground(new Color(255, 0, 0)); 
            }
            else if(Apps_Color==1 || Apps_Color==2 || Apps_Color==5){
                Sub3_Marks_Error_Text.setForeground(new Color(255, 255, 255)); 
            }

            Sub3_Marks_Error_Text.setFont(new Font("Segoe UI", Font.PLAIN, 8));
            Text_Field_And_Heading_Holder.add(Sub3_Marks_Error_Text);


            // Label for Displaying Error of 3rd Subject's Credits
            Sub3_Credits_Error_Text = new JLabel(); 
            Sub3_Credits_Error_Text.setPreferredSize(new Dimension(158, 10));
            
            if(Apps_Color==3 || Apps_Color==4 || Apps_Color==0){
                Sub3_Credits_Error_Text.setForeground(new Color(255, 0, 0)); 
            }
            else if(Apps_Color==1 || Apps_Color==2 || Apps_Color==5){
                Sub3_Credits_Error_Text.setForeground(new Color(255, 255, 255)); 
            }

            Sub3_Credits_Error_Text.setFont(new Font("Segoe UI", Font.PLAIN, 8));
            Text_Field_And_Heading_Holder.add(Sub3_Credits_Error_Text);



            // 4th Line 

            // Creating 7th Text Field for Marks of 4th Subject 
            Text_Field_for_Marks_of_Subject4 = new JTextField();
            Text_Field_for_Marks_of_Subject4.setBackground(new Color(0, 0, 0)); 
            Text_Field_for_Marks_of_Subject4.setForeground(new Color(255, 255, 255));
            Text_Field_for_Marks_of_Subject4.setPreferredSize(new Dimension(158, 20)); 
            Text_Field_for_Marks_of_Subject4.setText("Enter Marks of 4th Subject");
            Text_Field_for_Marks_of_Subject4.setFont(new Font("Segoe UI", Font.PLAIN, 10));
            Text_Field_for_Marks_of_Subject4.addKeyListener(this);
            Text_Field_And_Heading_Holder.add(Text_Field_for_Marks_of_Subject4);

            // Creating 8th Text Field for Credits of 4th Subject 
            Text_Field_for_Credits_of_Subject4 = new JTextField();
            Text_Field_for_Credits_of_Subject4.setBackground(new Color(0, 0, 0)); 
            Text_Field_for_Credits_of_Subject4.setForeground(new Color(255, 255, 255));
            Text_Field_for_Credits_of_Subject4.setPreferredSize(new Dimension(158, 20)); 
            Text_Field_for_Credits_of_Subject4.setText("Enter Credits of 4th Subject");
            Text_Field_for_Credits_of_Subject4.setFont(new Font("Segoe UI", Font.PLAIN, 10));
            Text_Field_for_Credits_of_Subject4.addKeyListener(this);
            Text_Field_And_Heading_Holder.add(Text_Field_for_Credits_of_Subject4);


            // Label for Displaying Error of 4th Subject's Marks
            Sub4_Marks_Error_Text = new JLabel(); 
            Sub4_Marks_Error_Text.setPreferredSize(new Dimension(158, 10));
            
            if(Apps_Color==3 || Apps_Color==4 || Apps_Color==0){
                Sub4_Marks_Error_Text.setForeground(new Color(255, 0, 0)); 
            }
            else if(Apps_Color==1 || Apps_Color==2 || Apps_Color==5){
                Sub4_Marks_Error_Text.setForeground(new Color(255, 255, 255)); 
            }

            Sub4_Marks_Error_Text.setFont(new Font("Segoe UI", Font.PLAIN, 8));
            Text_Field_And_Heading_Holder.add(Sub4_Marks_Error_Text);


            // Label for Displaying Error of 4th Subject's Credits
            Sub4_Credits_Error_Text = new JLabel(); 
            Sub4_Credits_Error_Text.setPreferredSize(new Dimension(158, 10));
            
            if(Apps_Color==3 || Apps_Color==4 || Apps_Color==0){
                Sub4_Credits_Error_Text.setForeground(new Color(255, 0, 0)); 
            }
            else if(Apps_Color==1 || Apps_Color==2 || Apps_Color==5){
                Sub4_Credits_Error_Text.setForeground(new Color(255, 255, 255)); 
            }

            Sub4_Credits_Error_Text.setFont(new Font("Segoe UI", Font.PLAIN, 8));
            Text_Field_And_Heading_Holder.add(Sub4_Credits_Error_Text);



            // 5th Line 

            // Creating 9th Text Field for Marks of 5th Subject 
            Text_Field_for_Marks_of_Subject5 = new JTextField();
            Text_Field_for_Marks_of_Subject5.setBackground(new Color(0, 0, 0)); 
            Text_Field_for_Marks_of_Subject5.setForeground(new Color(255, 255, 255));
            Text_Field_for_Marks_of_Subject5.setPreferredSize(new Dimension(158, 20)); 
            Text_Field_for_Marks_of_Subject5.setText("Enter Marks of 5th Subject");
            Text_Field_for_Marks_of_Subject5.setFont(new Font("Segoe UI", Font.PLAIN, 10));
            Text_Field_for_Marks_of_Subject5.addKeyListener(this);
            Text_Field_And_Heading_Holder.add(Text_Field_for_Marks_of_Subject5);

            // Creating 10th Text Field for Credits of 5th Subject 
            Text_Field_for_Credits_of_Subject5 = new JTextField();
            Text_Field_for_Credits_of_Subject5.setBackground(new Color(0, 0, 0)); 
            Text_Field_for_Credits_of_Subject5.setForeground(new Color(255, 255, 255));
            Text_Field_for_Credits_of_Subject5.setPreferredSize(new Dimension(158, 20)); 
            Text_Field_for_Credits_of_Subject5.setText("Enter Credits of 5th Subject");
            Text_Field_for_Credits_of_Subject5.setFont(new Font("Segoe UI", Font.PLAIN, 10));
            Text_Field_for_Credits_of_Subject5.addKeyListener(this);
            Text_Field_And_Heading_Holder.add(Text_Field_for_Credits_of_Subject5);


            // Label for Displaying Error of 5th Subject's Marks
            Sub5_Marks_Error_Text = new JLabel(); 
            Sub5_Marks_Error_Text.setPreferredSize(new Dimension(158, 10));
            
            if(Apps_Color==3 || Apps_Color==4 || Apps_Color==0){
                Sub5_Marks_Error_Text.setForeground(new Color(255, 0, 0)); 
            }
            else if(Apps_Color==1 || Apps_Color==2 || Apps_Color==5){
                Sub5_Marks_Error_Text.setForeground(new Color(255, 255, 255)); 
            }

            Sub5_Marks_Error_Text.setFont(new Font("Segoe UI", Font.PLAIN, 8));
            Text_Field_And_Heading_Holder.add(Sub5_Marks_Error_Text);


            // Label for Displaying Error of 5th Subject's Credits
            Sub5_Credits_Error_Text = new JLabel(); 
            Sub5_Credits_Error_Text.setPreferredSize(new Dimension(158, 10));
            
            if(Apps_Color==3 || Apps_Color==4 || Apps_Color==0){
                Sub5_Credits_Error_Text.setForeground(new Color(255, 0, 0)); 
            }
            else if(Apps_Color==1 || Apps_Color==2 || Apps_Color==5){
                Sub5_Credits_Error_Text.setForeground(new Color(255, 255, 255)); 
            }

            Sub5_Credits_Error_Text.setFont(new Font("Segoe UI", Font.PLAIN, 8));
            Text_Field_And_Heading_Holder.add(Sub5_Credits_Error_Text);



            // 6th Line 

            // Creating 11th Text Field for Marks of 6th Subject 
            Text_Field_for_Marks_of_Subject6 = new JTextField();
            Text_Field_for_Marks_of_Subject6.setBackground(new Color(0, 0, 0)); 
            Text_Field_for_Marks_of_Subject6.setForeground(new Color(255, 255, 255));
            Text_Field_for_Marks_of_Subject6.setPreferredSize(new Dimension(158, 20)); 
            Text_Field_for_Marks_of_Subject6.setText("Enter Marks of 6th Subject");
            Text_Field_for_Marks_of_Subject6.setFont(new Font("Segoe UI", Font.PLAIN, 10));
            Text_Field_for_Marks_of_Subject6.addKeyListener(this);
            Text_Field_And_Heading_Holder.add(Text_Field_for_Marks_of_Subject6);

            // Creating 12th Text Field for Credits of 6th Subject 
            Text_Field_for_Credits_of_Subject6 = new JTextField();
            Text_Field_for_Credits_of_Subject6.setBackground(new Color(0, 0, 0)); 
            Text_Field_for_Credits_of_Subject6.setForeground(new Color(255, 255, 255));
            Text_Field_for_Credits_of_Subject6.setPreferredSize(new Dimension(158, 20)); 
            Text_Field_for_Credits_of_Subject6.setText("Enter Credits of 6th Subject");
            Text_Field_for_Credits_of_Subject6.setFont(new Font("Segoe UI", Font.PLAIN, 10));
            Text_Field_for_Credits_of_Subject6.addKeyListener(this);
            Text_Field_And_Heading_Holder.add(Text_Field_for_Credits_of_Subject6);


            // Label for Displaying Error of 6th Subject's Marks
            Sub6_Marks_Error_Text = new JLabel(); 
            Sub6_Marks_Error_Text.setPreferredSize(new Dimension(158, 10));
           
            if(Apps_Color==3 || Apps_Color==4 || Apps_Color==0){
                Sub6_Marks_Error_Text.setForeground(new Color(255, 0, 0)); 
            }
            else if(Apps_Color==1 || Apps_Color==2 || Apps_Color==5){
                Sub6_Marks_Error_Text.setForeground(new Color(255, 255, 255)); 
            }

            Sub6_Marks_Error_Text.setFont(new Font("Segoe UI", Font.PLAIN, 8));
            Text_Field_And_Heading_Holder.add(Sub6_Marks_Error_Text);


            // Label for Displaying Error of 6th Subject's Credits
            Sub6_Credits_Error_Text = new JLabel(); 
            Sub6_Credits_Error_Text.setPreferredSize(new Dimension(158, 10));
            
            if(Apps_Color==3 || Apps_Color==4 || Apps_Color==0){
                Sub6_Credits_Error_Text.setForeground(new Color(255, 0, 0)); 
            }
            else if(Apps_Color==1 || Apps_Color==2 || Apps_Color==5){
                Sub6_Credits_Error_Text.setForeground(new Color(255, 255, 255)); 
            }

            Sub6_Credits_Error_Text.setFont(new Font("Segoe UI", Font.PLAIN, 8));
            Text_Field_And_Heading_Holder.add(Sub6_Credits_Error_Text);




            // Last Line, "The Submit Button"

            Submit = new JButton("Submit");
            Submit.setFocusable(false);
            Submit.setBackground(new Color(25, 25,25));
            Submit.setForeground(new Color(0, 0, 0));
            Submit.setEnabled(false);
            Submit.addActionListener(this);
            Text_Field_And_Heading_Holder.add(Submit);

        }

        // Adding Mouse Listener to Panel so that when "slidingPanel" is visible, we will use "MouseEvent" Class to make the "slidingPanel" invisible when the user will click somewhere else other than slidingPanel on the frame 

        Text_Field_And_Heading_Holder.addMouseListener(this);
    }



    // Abstract Methods of KeyListener Interface 

    public void keyPressed(KeyEvent e) {  // Here we are restricting user to only type numeric values in TextField 

        // 1st Subject's Marks 
        if(e.getSource()==Text_Field_for_Marks_of_Subject1){
            char c = e.getKeyChar();
            if (c >= '0' && c <= '9' || c == KeyEvent.VK_BACK_SPACE) {
                Text_Field_for_Marks_of_Subject1.setEditable(true);
                Sub1_Marks_Error_Text.setText("");
                
                m1_1 =true;

                if(m1_1 && m1_2 && m1_3 && m1_4 && m1_5 && m1_6 && c1_1 && c1_2 && c1_3 && c1_4 && c1_5 && c1_6 && m2_1 && m2_2 && m2_3 && m2_4 && m2_5 && m2_6 && c2_1 && c2_2 && c2_3 && c2_4 && c2_5 && c2_6){
                    Submit.setEnabled(true);
                    Submit.setBackground(new Color(0, 255,0));
                }
            }
            else {
                Text_Field_for_Marks_of_Subject1.setText("");
                Sub1_Marks_Error_Text.setText("* Enter only whole no.s between 0-100");
                
                m1_1 = false;
                Submit.setBackground(new Color(25, 25,25));
                Submit.setEnabled(false);
            }
        }  

        // 1st Subject's Credits
        if(e.getSource()==Text_Field_for_Credits_of_Subject1){
            char c = e.getKeyChar();
            if (c >= '1' && c <= '5' || c == KeyEvent.VK_BACK_SPACE) {
                Text_Field_for_Credits_of_Subject1.setEditable(true);
                Sub1_Credits_Error_Text.setText("");

                c1_1= true;

                if(m1_1 && m1_2 && m1_3 && m1_4 && m1_5 && m1_6 && c1_1 && c1_2 && c1_3 && c1_4 && c1_5 && c1_6 && m2_1 && m2_2 && m2_3 && m2_4 && m2_5 && m2_6 && c2_1 && c2_2 && c2_3 && c2_4 && c2_5 && c2_6){
                    Submit.setEnabled(true);
                    Submit.setBackground(new Color(0, 255,0));
                }
            }
            else {
                Text_Field_for_Credits_of_Subject1.setText("");
                Sub1_Credits_Error_Text.setText("* Enter only whole no.s between 1-5");

                c1_1 = false;
                Submit.setBackground(new Color(25, 25,25));
                Submit.setEnabled(false);
            }
        }  


        // 2nd Subject's Marks 
        if(e.getSource()==Text_Field_for_Marks_of_Subject2){
            char c = e.getKeyChar();
            if (c >= '0' && c <= '9' || c == KeyEvent.VK_BACK_SPACE) {
                Text_Field_for_Marks_of_Subject2.setEditable(true);
                Sub2_Marks_Error_Text.setText("");

                m1_2 = true;

                if(m1_1 && m1_2 && m1_3 && m1_4 && m1_5 && m1_6 && c1_1 && c1_2 && c1_3 && c1_4 && c1_5 && c1_6 && m2_1 && m2_2 && m2_3 && m2_4 && m2_5 && m2_6 && c2_1 && c2_2 && c2_3 && c2_4 && c2_5 && c2_6){
                    Submit.setEnabled(true);
                    Submit.setBackground(new Color(0, 255,0));
                }
            }
            else {
                Text_Field_for_Marks_of_Subject2.setText("");
                Sub2_Marks_Error_Text.setText("* Enter only whole no.s between 0-100");

                m1_2 = false;
                Submit.setBackground(new Color(25, 25,25));
                Submit.setEnabled(false);
            }
        }  

        // 2nd Subject Credits
        if(e.getSource()==Text_Field_for_Credits_of_Subject2){
            char c = e.getKeyChar();
            if (c >= '1' && c <= '5' || c == KeyEvent.VK_BACK_SPACE) {
                Text_Field_for_Credits_of_Subject2.setEditable(true);
                Sub2_Credits_Error_Text.setText("");

                c1_2 = true;

                if(m1_1 && m1_2 && m1_3 && m1_4 && m1_5 && m1_6 && c1_1 && c1_2 && c1_3 && c1_4 && c1_5 && c1_6 && m2_1 && m2_2 && m2_3 && m2_4 && m2_5 && m2_6 && c2_1 && c2_2 && c2_3 && c2_4 && c2_5 && c2_6){
                    Submit.setEnabled(true);
                    Submit.setBackground(new Color(0, 255,0));
                }
            }
            else {
                Text_Field_for_Credits_of_Subject2.setText("");
                Sub2_Credits_Error_Text.setText("* Enter only whole no.s between 1-5");

                c1_2 = false;
                Submit.setBackground(new Color(25, 25,25));
                Submit.setEnabled(false);
            }
        }  


        // 3rd Subject's Marks 
        if(e.getSource()==Text_Field_for_Marks_of_Subject3){
            char c = e.getKeyChar();
            if (c >= '0' && c <= '9' || c == KeyEvent.VK_BACK_SPACE) {
                Text_Field_for_Marks_of_Subject3.setEditable(true);
                Sub3_Marks_Error_Text.setText("");

                m1_3 = true;

                if(m1_1 && m1_2 && m1_3 && m1_4 && m1_5 && m1_6 && c1_1 && c1_2 && c1_3 && c1_4 && c1_5 && c1_6 && m2_1 && m2_2 && m2_3 && m2_4 && m2_5 && m2_6 && c2_1 && c2_2 && c2_3 && c2_4 && c2_5 && c2_6){
                    Submit.setEnabled(true);
                    Submit.setBackground(new Color(0, 255,0));
                }
            }
            else {
                Text_Field_for_Marks_of_Subject3.setText("");
                Sub3_Marks_Error_Text.setText("* Enter only whole no.s between 0-100");

                m1_3 = false;
                Submit.setBackground(new Color(25, 25,25));
                Submit.setEnabled(false);
            }
        }  

        // 3rd Subject's Credits
        if(e.getSource()==Text_Field_for_Credits_of_Subject3){
            char c = e.getKeyChar();
            if (c >= '1' && c <= '5' || c == KeyEvent.VK_BACK_SPACE) {
                Text_Field_for_Credits_of_Subject3.setEditable(true);
                Sub3_Credits_Error_Text.setText("");

                c1_3 = true;

                if(m1_1 && m1_2 && m1_3 && m1_4 && m1_5 && m1_6 && c1_1 && c1_2 && c1_3 && c1_4 && c1_5 && c1_6 && m2_1 && m2_2 && m2_3 && m2_4 && m2_5 && m2_6 && c2_1 && c2_2 && c2_3 && c2_4 && c2_5 && c2_6){
                    Submit.setEnabled(true);
                    Submit.setBackground(new Color(0, 255,0));
                }
            }
            else {
                Text_Field_for_Credits_of_Subject3.setText("");
                Sub3_Credits_Error_Text.setText("* Enter only whole no.s between 1-5");

                c1_3 = false;
                Submit.setBackground(new Color(25, 25,25));
                Submit.setEnabled(false);
            }
        }  


        // 4th Subject's Marks 
        if(e.getSource()==Text_Field_for_Marks_of_Subject4){
            char c = e.getKeyChar();
            if (c >= '0' && c <= '9' || c == KeyEvent.VK_BACK_SPACE) {
                Text_Field_for_Marks_of_Subject4.setEditable(true);
                Sub4_Marks_Error_Text.setText("");

                m1_4 = true;

                if(m1_1 && m1_2 && m1_3 && m1_4 && m1_5 && m1_6 && c1_1 && c1_2 && c1_3 && c1_4 && c1_5 && c1_6 && m2_1 && m2_2 && m2_3 && m2_4 && m2_5 && m2_6 && c2_1 && c2_2 && c2_3 && c2_4 && c2_5 && c2_6){
                    Submit.setEnabled(true);
                    Submit.setBackground(new Color(0, 255,0));
                }
            }
            else {
                Text_Field_for_Marks_of_Subject4.setText("");
                Sub4_Marks_Error_Text.setText("* Enter only whole no.s between 0-100");

                m1_4 = false;
                Submit.setBackground(new Color(25, 25,25));
                Submit.setEnabled(false);
            }
        }  

        // 4th Subject's Credits
        if(e.getSource()==Text_Field_for_Credits_of_Subject4){
            char c = e.getKeyChar();
            if (c >= '1' && c <= '5' || c == KeyEvent.VK_BACK_SPACE) {
                Text_Field_for_Credits_of_Subject4.setEditable(true);
                Sub4_Credits_Error_Text.setText("");

                c1_4 = true;

                if(m1_1 && m1_2 && m1_3 && m1_4 && m1_5 && m1_6 && c1_1 && c1_2 && c1_3 && c1_4 && c1_5 && c1_6 && m2_1 && m2_2 && m2_3 && m2_4 && m2_5 && m2_6 && c2_1 && c2_2 && c2_3 && c2_4 && c2_5 && c2_6){
                    Submit.setEnabled(true);
                    Submit.setBackground(new Color(0, 255,0));
                }
            }
            else {
                Text_Field_for_Credits_of_Subject4.setText("");
                Sub4_Credits_Error_Text.setText("* Enter only whole no.s between 1-5");

                c1_4 = false;
                Submit.setBackground(new Color(25, 25,25));
                Submit.setEnabled(false);
            }
        }  


        // 5th Subject's Marks 
        if(e.getSource()==Text_Field_for_Marks_of_Subject5){
            char c = e.getKeyChar();
            if (c >= '0' && c <= '9' || c == KeyEvent.VK_BACK_SPACE) {
                Text_Field_for_Marks_of_Subject5.setEditable(true);
                Sub5_Marks_Error_Text.setText("");

                m1_5 = true;

                if(m1_1 && m1_2 && m1_3 && m1_4 && m1_5 && m1_6 && c1_1 && c1_2 && c1_3 && c1_4 && c1_5 && c1_6 && m2_1 && m2_2 && m2_3 && m2_4 && m2_5 && m2_6 && c2_1 && c2_2 && c2_3 && c2_4 && c2_5 && c2_6){
                    Submit.setEnabled(true);
                    Submit.setBackground(new Color(0, 255,0));
                }
            }
            else {
                Text_Field_for_Marks_of_Subject5.setText("");
                Sub5_Marks_Error_Text.setText("* Enter only whole no.s between 0-100");

                m1_5 = false;
                Submit.setBackground(new Color(25, 25,25));
                Submit.setEnabled(false);
            }
        }  

        // 5th Subject's Credits
        if(e.getSource()==Text_Field_for_Credits_of_Subject5){
            char c = e.getKeyChar();
            if (c >= '1' && c <= '5' || c == KeyEvent.VK_BACK_SPACE) {
                Text_Field_for_Credits_of_Subject5.setEditable(true);
                Sub5_Credits_Error_Text.setText("");

                c1_5 = true;

                if(m1_1 && m1_2 && m1_3 && m1_4 && m1_5 && m1_6 && c1_1 && c1_2 && c1_3 && c1_4 && c1_5 && c1_6 && m2_1 && m2_2 && m2_3 && m2_4 && m2_5 && m2_6 && c2_1 && c2_2 && c2_3 && c2_4 && c2_5 && c2_6){
                    Submit.setEnabled(true);
                    Submit.setBackground(new Color(0, 255,0));
                }
            }
            else {
                Text_Field_for_Credits_of_Subject5.setText("");
                Sub5_Credits_Error_Text.setText("* Enter only whole no.s between 1-5");

                c1_5 = false;
                Submit.setBackground(new Color(25, 25,25));
                Submit.setEnabled(false);
            }
        }  


        // 6th Subject's Marks 
        if(e.getSource()==Text_Field_for_Marks_of_Subject6){
            char c = e.getKeyChar();
            if (c >= '0' && c <= '9' || c == KeyEvent.VK_BACK_SPACE) {
                Text_Field_for_Marks_of_Subject6.setEditable(true);
                Sub6_Marks_Error_Text.setText("");

                m1_6 = true;

                if(m1_1 && m1_2 && m1_3 && m1_4 && m1_5 && m1_6 && c1_1 && c1_2 && c1_3 && c1_4 && c1_5 && c1_6 && m2_1 && m2_2 && m2_3 && m2_4 && m2_5 && m2_6 && c2_1 && c2_2 && c2_3 && c2_4 && c2_5 && c2_6){
                    Submit.setEnabled(true);
                    Submit.setBackground(new Color(0, 255,0));
                }
            }
            else {
                Text_Field_for_Marks_of_Subject6.setText("");
                Sub6_Marks_Error_Text.setText("* Enter only whole no.s between 0-100");

                m1_5 = false;
                Submit.setBackground(new Color(25, 25,25));
                Submit.setEnabled(false);
            }
        }  

        // 6th Subject's Credits
        if(e.getSource()==Text_Field_for_Credits_of_Subject6){
            char c = e.getKeyChar();
            if (c >= '1' && c <= '5' || c == KeyEvent.VK_BACK_SPACE) {
                Text_Field_for_Credits_of_Subject6.setEditable(true);
                Sub6_Credits_Error_Text.setText("");

                c1_6 = true;

                if(m1_1 && m1_2 && m1_3 && m1_4 && m1_5 && m1_6 && c1_1 && c1_2 && c1_3 && c1_4 && c1_5 && c1_6 && m2_1 && m2_2 && m2_3 && m2_4 && m2_5 && m2_6 && c2_1 && c2_2 && c2_3 && c2_4 && c2_5 && c2_6){
                    Submit.setEnabled(true);
                    Submit.setBackground(new Color(0, 255,0));
                }
            }
            else {
                Text_Field_for_Credits_of_Subject6.setText("");
                Sub6_Credits_Error_Text.setText("* Enter only whole no.s between 1-5");

                c1_6 = false;
                Submit.setBackground(new Color(25, 25,25));
                Submit.setEnabled(false);
            }
        }  

    }


    public void keyReleased(KeyEvent e) {  // Here we are restricting user to just enter number in range 1-100 for marks and 1-5 for credits

        // 1st Subject's Marks
        if(e.getSource()==Text_Field_for_Marks_of_Subject1){
            String value = Text_Field_for_Marks_of_Subject1.getText();
            try {
                int number = Integer.parseInt(value);
                if (number < 0 || number > 100) {
                    Sub1_Marks_Error_Text.setText("* Enter only whole no.s between 0-100");
                    Text_Field_for_Marks_of_Subject1.setText("");

                    m2_1 = false;
                    Submit.setBackground(new Color(25, 25,25));
                    Submit.setEnabled(false);
                }
                else{
                    m2_1 = true;

                    if(m1_1 && m1_2 && m1_3 && m1_4 && m1_5 && m1_6 && c1_1 && c1_2 && c1_3 && c1_4 && c1_5 && c1_6 && m2_1 && m2_2 && m2_3 && m2_4 && m2_5 && m2_6 && c2_1 && c2_2 && c2_3 && c2_4 && c2_5 && c2_6){
                        Submit.setEnabled(true);
                        Submit.setBackground(new Color(0, 255,0));
                    }
                }
            } 
            catch (NumberFormatException ex) {
                Text_Field_for_Marks_of_Subject1.setText("");
                Sub1_Marks_Error_Text.setText("* Enter only whole no.s between 0-100");

                m2_1 = false;
                Submit.setBackground(new Color(25, 25,25));
                Submit.setEnabled(false);
            }
        }   

        // 1st Subject's Credits
        if(e.getSource()==Text_Field_for_Credits_of_Subject1){
            String value = Text_Field_for_Credits_of_Subject1.getText();
            try {
                int number = Integer.parseInt(value);
                if (number < 1 || number > 5) {
                    Sub1_Credits_Error_Text.setText("* Enter only whole no.s between 1-5");
                    Text_Field_for_Credits_of_Subject1.setText("");

                    c2_1 = false;
                    Submit.setBackground(new Color(25, 25,25));
                    Submit.setEnabled(false);
                }
                else{
                    c2_1 = true;

                    if(m1_1 && m1_2 && m1_3 && m1_4 && m1_5 && m1_6 && c1_1 && c1_2 && c1_3 && c1_4 && c1_5 && c1_6 && m2_1 && m2_2 && m2_3 && m2_4 && m2_5 && m2_6 && c2_1 && c2_2 && c2_3 && c2_4 && c2_5 && c2_6){
                        Submit.setEnabled(true);
                        Submit.setBackground(new Color(0, 255,0));
                    }
                }
            } 
            catch (NumberFormatException ex) {
                Text_Field_for_Credits_of_Subject1.setText("");
                Sub1_Credits_Error_Text.setText("* Enter only whole no.s between 1-5");

                c2_1 = false;
                Submit.setBackground(new Color(25, 25,25));
                Submit.setEnabled(false);
            }
        }  


        // 2nd Subject's Marks
        if(e.getSource()==Text_Field_for_Marks_of_Subject2){
            String value = Text_Field_for_Marks_of_Subject2.getText();
            try {
                int number = Integer.parseInt(value);
                if (number < 0 || number > 100) {
                    Sub2_Marks_Error_Text.setText("* Enter only whole no.s between 0-100");
                    Text_Field_for_Marks_of_Subject2.setText("");

                    m2_2 = false;
                    Submit.setBackground(new Color(25, 25,25));
                    Submit.setEnabled(false);
                }
                else{
                    m2_2 = true;

                    if(m1_1 && m1_2 && m1_3 && m1_4 && m1_5 && m1_6 && c1_1 && c1_2 && c1_3 && c1_4 && c1_5 && c1_6 && m2_1 && m2_2 && m2_3 && m2_4 && m2_5 && m2_6 && c2_1 && c2_2 && c2_3 && c2_4 && c2_5 && c2_6){
                        Submit.setEnabled(true);
                        Submit.setBackground(new Color(0, 255,0));
                    }
                }
            } 
            catch (NumberFormatException ex) {
                Text_Field_for_Marks_of_Subject2.setText("");
                Sub2_Marks_Error_Text.setText("* Enter only whole no.s between 0-100");

                m2_2 = false;
                Submit.setBackground(new Color(25, 25,25));
                Submit.setEnabled(false);
            }
        }   

        // 2nd Subject's Credits
        if(e.getSource()==Text_Field_for_Credits_of_Subject2){
            String value = Text_Field_for_Credits_of_Subject2.getText();
            try {
                int number = Integer.parseInt(value);
                if (number < 1 || number > 5) {
                    Sub2_Credits_Error_Text.setText("* Enter only whole no.s between 1-5");
                    Text_Field_for_Credits_of_Subject2.setText("");

                    c2_2 = false;
                    Submit.setBackground(new Color(25, 25,25));
                    Submit.setEnabled(false);
                }
                else{
                    c2_2 = true;

                    if(m1_1 && m1_2 && m1_3 && m1_4 && m1_5 && m1_6 && c1_1 && c1_2 && c1_3 && c1_4 && c1_5 && c1_6 && m2_1 && m2_2 && m2_3 && m2_4 && m2_5 && m2_6 && c2_1 && c2_2 && c2_3 && c2_4 && c2_5 && c2_6){
                        Submit.setEnabled(true);
                        Submit.setBackground(new Color(0, 255,0));
                    }
                }
            } 
            catch (NumberFormatException ex) {
                Text_Field_for_Credits_of_Subject2.setText("");
                Sub2_Credits_Error_Text.setText("* Enter only whole no.s between 1-5");

                c2_2 = false;
                Submit.setBackground(new Color(25, 25,25));
                Submit.setEnabled(false);
            }
        }  


        // 3rd Subject's Marks
        if(e.getSource()==Text_Field_for_Marks_of_Subject3){
            String value = Text_Field_for_Marks_of_Subject3.getText();
            try {
                int number = Integer.parseInt(value);
                if (number < 0 || number > 100) {
                    Sub3_Marks_Error_Text.setText("* Enter only whole no.s between 0-100");
                    Text_Field_for_Marks_of_Subject3.setText("");

                    m2_3 = false;
                    Submit.setBackground(new Color(25, 25,25));
                    Submit.setEnabled(false);
                }
                else{
                    m2_3 = true;

                    if(m1_1 && m1_2 && m1_3 && m1_4 && m1_5 && m1_6 && c1_1 && c1_2 && c1_3 && c1_4 && c1_5 && c1_6 && m2_1 && m2_2 && m2_3 && m2_4 && m2_5 && m2_6 && c2_1 && c2_2 && c2_3 && c2_4 && c2_5 && c2_6){
                        Submit.setEnabled(true);
                        Submit.setBackground(new Color(0, 255,0));
                    }
                }
            } 
            catch (NumberFormatException ex) {
                Text_Field_for_Marks_of_Subject3.setText("");
                Sub3_Marks_Error_Text.setText("* Enter only whole no.s between 0-100");

                m2_3 = false;
                Submit.setBackground(new Color(25, 25,25));
                Submit.setEnabled(false);
            }
        }   

        // 3rd Subject's Credits
        if(e.getSource()==Text_Field_for_Credits_of_Subject3){
            String value = Text_Field_for_Credits_of_Subject3.getText();
            try {
                int number = Integer.parseInt(value);
                if (number < 1 || number > 5) {
                    Sub3_Credits_Error_Text.setText("* Enter only whole no.s between 1-5");
                    Text_Field_for_Credits_of_Subject3.setText("");

                    c2_3 = false;
                    Submit.setBackground(new Color(25, 25,25));
                    Submit.setEnabled(false);
                }
                else{
                    c2_3 = true;

                    if(m1_1 && m1_2 && m1_3 && m1_4 && m1_5 && m1_6 && c1_1 && c1_2 && c1_3 && c1_4 && c1_5 && c1_6 && m2_1 && m2_2 && m2_3 && m2_4 && m2_5 && m2_6 && c2_1 && c2_2 && c2_3 && c2_4 && c2_5 && c2_6){
                        Submit.setEnabled(true);
                        Submit.setBackground(new Color(0, 255,0));
                    }
                }
            } 
            catch (NumberFormatException ex) {
                Text_Field_for_Credits_of_Subject3.setText("");
                Sub3_Credits_Error_Text.setText("* Enter only whole no.s between 1-5");

                c2_3 = false;
                Submit.setBackground(new Color(25, 25,25));
                Submit.setEnabled(false);
            }
        }  


        // 4th Subject's Marks
        if(e.getSource()==Text_Field_for_Marks_of_Subject4){
            String value = Text_Field_for_Marks_of_Subject4.getText();
            try {
                int number = Integer.parseInt(value);
                if (number < 0 || number > 100) {
                    Sub4_Marks_Error_Text.setText("* Enter only whole no.s between 0-100");
                    Text_Field_for_Marks_of_Subject4.setText("");

                    m2_4 = false;
                    Submit.setBackground(new Color(25, 25,25));
                    Submit.setEnabled(false);
                }
                else{
                    m2_4 = true;

                    if(m1_1 && m1_2 && m1_3 && m1_4 && m1_5 && m1_6 && c1_1 && c1_2 && c1_3 && c1_4 && c1_5 && c1_6 && m2_1 && m2_2 && m2_3 && m2_4 && m2_5 && m2_6 && c2_1 && c2_2 && c2_3 && c2_4 && c2_5 && c2_6){
                        Submit.setEnabled(true);
                        Submit.setBackground(new Color(0, 255,0));
                    }
                }
            } 
            catch (NumberFormatException ex) {
                Text_Field_for_Marks_of_Subject4.setText("");
                Sub4_Marks_Error_Text.setText("* Enter only whole no.s between 0-100");

                m2_4 = false;
                Submit.setBackground(new Color(25, 25,25));
                Submit.setEnabled(m2_4);
            }
        }   

        // 4th Subject's Credits
        if(e.getSource()==Text_Field_for_Credits_of_Subject4){
            String value = Text_Field_for_Credits_of_Subject4.getText();
            try {
                int number = Integer.parseInt(value);
                if (number < 1 || number > 5) {
                    Sub4_Credits_Error_Text.setText("* Enter only whole no.s between 1-5");
                    Text_Field_for_Credits_of_Subject4.setText("");

                    c2_4 = false;
                    Submit.setBackground(new Color(25, 25,25));
                    Submit.setEnabled(false);
                }
                else{
                    c2_4 = true;

                    if(m1_1 && m1_2 && m1_3 && m1_4 && m1_5 && m1_6 && c1_1 && c1_2 && c1_3 && c1_4 && c1_5 && c1_6 && m2_1 && m2_2 && m2_3 && m2_4 && m2_5 && m2_6 && c2_1 && c2_2 && c2_3 && c2_4 && c2_5 && c2_6){
                        Submit.setEnabled(true);
                        Submit.setBackground(new Color(0, 255,0));
                    }
                }
            } 
            catch (NumberFormatException ex) {
                Text_Field_for_Credits_of_Subject4.setText("");
                Sub4_Credits_Error_Text.setText("* Enter only whole no.s between 1-5");

                c2_4 = false;
                Submit.setBackground(new Color(25, 25,25));
                Submit.setEnabled(false);
            }
        }  


        // 5th Subject's Marks
        if(e.getSource()==Text_Field_for_Marks_of_Subject5){
            String value = Text_Field_for_Marks_of_Subject5.getText();
            try {
                int number = Integer.parseInt(value);
                if (number < 0 || number > 100) {
                    Sub5_Marks_Error_Text.setText("* Enter only whole no.s between 0-100");
                    Text_Field_for_Marks_of_Subject5.setText("");

                    m2_5 = false;
                    Submit.setBackground(new Color(25, 25,25));
                    Submit.setEnabled(false);
                }
                else{
                    m2_5 = true;

                    if(m1_1 && m1_2 && m1_3 && m1_4 && m1_5 && m1_6 && c1_1 && c1_2 && c1_3 && c1_4 && c1_5 && c1_6 && m2_1 && m2_2 && m2_3 && m2_4 && m2_5 && m2_6 && c2_1 && c2_2 && c2_3 && c2_4 && c2_5 && c2_6){
                        Submit.setEnabled(true);
                        Submit.setBackground(new Color(0, 255,0));
                    }
                }
            } 
            catch (NumberFormatException ex) {
                Text_Field_for_Marks_of_Subject5.setText("");
                Sub5_Marks_Error_Text.setText("* Enter only whole no.s between 0-100");

                m2_5 = false;
                Submit.setBackground(new Color(25, 25,25));
                Submit.setEnabled(false);
            }
        }   

        // 5th Subject's Credits
        if(e.getSource()==Text_Field_for_Credits_of_Subject5){
            String value = Text_Field_for_Credits_of_Subject5.getText();
            try {
                int number = Integer.parseInt(value);
                if (number < 1 || number > 5) {
                    Sub5_Credits_Error_Text.setText("* Enter only whole no.s between 1-5");
                    Text_Field_for_Credits_of_Subject5.setText("");

                    c2_5 = false;
                    Submit.setBackground(new Color(25, 25,25));
                    Submit.setEnabled(false);
                }
                else{
                    c2_5 = true;

                    if(m1_1 && m1_2 && m1_3 && m1_4 && m1_5 && m1_6 && c1_1 && c1_2 && c1_3 && c1_4 && c1_5 && c1_6 && m2_1 && m2_2 && m2_3 && m2_4 && m2_5 && m2_6 && c2_1 && c2_2 && c2_3 && c2_4 && c2_5 && c2_6){
                        Submit.setEnabled(true);
                        Submit.setBackground(new Color(0, 255,0));
                    }
                }
            } 
            catch (NumberFormatException ex) {
                Text_Field_for_Credits_of_Subject5.setText("");
                Sub5_Credits_Error_Text.setText("* Enter only whole no.s between 1-5");

                c2_5 = false;
                Submit.setBackground(new Color(25, 25,25));
                Submit.setEnabled(false);
            }
        }  


        // 6th Subject's Marks
        if(e.getSource()==Text_Field_for_Marks_of_Subject6){
            String value = Text_Field_for_Marks_of_Subject6.getText();
            try {
                int number = Integer.parseInt(value);
                if (number < 0 || number > 100) {
                    Sub6_Marks_Error_Text.setText("* Enter only whole no.s between 0-100");
                    Text_Field_for_Marks_of_Subject6.setText("");

                    m2_6= false;
                    Submit.setBackground(new Color(25, 25,25));
                    Submit.setEnabled(false);
                }
                else{
                    m2_6 = true;

                    if(m1_1 && m1_2 && m1_3 && m1_4 && m1_5 && m1_6 && c1_1 && c1_2 && c1_3 && c1_4 && c1_5 && c1_6 && m2_1 && m2_2 && m2_3 && m2_4 && m2_5 && m2_6 && c2_1 && c2_2 && c2_3 && c2_4 && c2_5 && c2_6){
                        Submit.setEnabled(true);
                        Submit.setBackground(new Color(0, 255,0));
                    }
                }
            } 
            catch (NumberFormatException ex) {
                Text_Field_for_Marks_of_Subject6.setText("");
                Sub6_Marks_Error_Text.setText("* Enter only whole no.s between 0-100");

                m2_6 = false;
                Submit.setBackground(new Color(25, 25,25));
                Submit.setEnabled(false);
            }
        }   

        // 6th Subject's Credits
        if(e.getSource()==Text_Field_for_Credits_of_Subject6){
            String value = Text_Field_for_Credits_of_Subject6.getText();
            try {
                int number = Integer.parseInt(value);
                if (number < 1 || number > 5) {
                    Sub6_Credits_Error_Text.setText("* Enter only whole no.s between 1-5");
                    Text_Field_for_Credits_of_Subject6.setText("");

                    c2_6 = false;
                    Submit.setBackground(new Color(25, 25,25));
                    Submit.setEnabled(false);
                }
                else{
                    c2_6 = true;

                    if(m1_1 && m1_2 && m1_3 && m1_4 && m1_5 && m1_6 && c1_1 && c1_2 && c1_3 && c1_4 && c1_5 && c1_6 && m2_1 && m2_2 && m2_3 && m2_4 && m2_5 && m2_6 && c2_1 && c2_2 && c2_3 && c2_4 && c2_5 && c2_6){
                        Submit.setEnabled(true);
                        Submit.setBackground(new Color(0, 255,0));
                    }
                }
            } 
            catch (NumberFormatException ex) {
                Text_Field_for_Credits_of_Subject6.setText("");
                Sub6_Credits_Error_Text.setText("* Enter only whole no.s between 1-5");

                c2_6 = false;
                Submit.setBackground(new Color(25, 25,25));
                Submit.setEnabled(false);
            }
        }  

    }

    public void keyTyped(KeyEvent e) {
        
    }



    // Defining what to do when user clicks on the frame anywhere else than slidingPanel

    public void mouseClicked(MouseEvent e) {
        if (Text_Field_And_Heading_Holder.getBounds().contains(e.getPoint())) {
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


        if(e.getSource()==Submit){
            if(a == 6){
                double m1 = Double.parseDouble(Text_Field_for_Marks_of_Subject1.getText());
                double c1 = Double.parseDouble(Text_Field_for_Credits_of_Subject1.getText());
                double m2 = Double.parseDouble(Text_Field_for_Marks_of_Subject2.getText());
                double c2 = Double.parseDouble(Text_Field_for_Credits_of_Subject2.getText());
                double m3 = Double.parseDouble(Text_Field_for_Marks_of_Subject3.getText());
                double c3 = Double.parseDouble(Text_Field_for_Credits_of_Subject3.getText());
                double m4 = Double.parseDouble(Text_Field_for_Marks_of_Subject4.getText());
                double c4 = Double.parseDouble(Text_Field_for_Credits_of_Subject4.getText());
                double m5 = Double.parseDouble(Text_Field_for_Marks_of_Subject5.getText());
                double c5 = Double.parseDouble(Text_Field_for_Credits_of_Subject5.getText());
                double m6 = Double.parseDouble(Text_Field_for_Marks_of_Subject6.getText());
                double c6 = Double.parseDouble(Text_Field_for_Credits_of_Subject6.getText());
    
                double credit_sum = (c1 + c2 + c3 + c4 + c5 + c6);
    
                double s1_TGPA = Math.floor(m1 / 9);
                double s2_TGPA = Math.floor(m2 / 9);
                double s3_TGPA = Math.floor(m3 / 9);
                double s4_TGPA = Math.floor(m4 / 9);
                double s5_TGPA = Math.floor(m5 / 9);
                double s6_TGPA = Math.floor(m6 / 9);
    
    
                double multiple_sum = ((s1_TGPA*c1)+(s2_TGPA*c2)+(s3_TGPA*c3)+(s4_TGPA*c4)+(s5_TGPA*c5)+(s6_TGPA*c6));
    
                TGPA = (multiple_sum/credit_sum);
                DecimalFormat df = new DecimalFormat(".00");
                TGPA = Double.parseDouble(df.format(TGPA));
                if(TGPA>=10){
                    TGPA = 10;
                }
                
                this.setVisible(false);
                this.dispose();
                new TGPA_Calculator_Display_TGPA();
            }
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