package com.company;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class FrmRegister {

    /**
     * Setting Up Variables
     */
    JFrame register_frame;
    JPanel heading;
    JLabel name;
    JPanel register;
    JLabel lb_conform;
    JTextField userName;
    JTextField email_address;
    JPasswordField passwd_register;
    JLabel ac_type_lb;
    JComboBox ac_type;
    JButton btn_register;
    JButton btn_login;

    /**
     * Making Constructor of 'FrmRegister' class
     */
    FrmRegister() {

        // * Printing in the terminal:
        System.out.println("\n\t***** Registration screen *****\n");

        // font
        Font f = new Font("Serif", Font.BOLD, 30);

        /**
         * Heading Panel
         */
        heading = new JPanel();
        heading.setBackground(new Color(0,0,0,90));
        heading.setBounds(0,0,900,100);

        name = new JLabel("E-CEM:Registration Form");
        name.setForeground(Color.WHITE);
        name.setFont(f);
        heading.add(name);

        /**
         * Register Panel
         */
        register = new JPanel();
        register.setSize(650,500);
        register.setBackground(new Color(0,0,0,70));
        register.setBounds(150,150,650,500);

        // * Textfield to Enter your username.
        userName = new JTextField("Enter your UserName");
        register.setLayout(null);
        userName.setBounds(150,50,300,50);
        register.add(userName);

        // * Textfield to Enter your email address.
        email_address = new JTextField("Enter your Email Address");
        email_address.setLayout(null);
        email_address.setBounds(150,100,300,50);
        register.add(email_address);

        // * Passwordfield to Enter your password.
        passwd_register = new JPasswordField("Enter Your Password");
        passwd_register.setBounds(150,150,300,50);
        register.add(passwd_register);

        /**
         * Label and Combobox which gives you choices of the account types.
         */
        ac_type_lb = new JLabel("Choose account type:", JLabel.LEFT);
        ac_type_lb.setBounds(150,220,200,20);
        ac_type_lb.setForeground(Color.WHITE);
        register.add(ac_type_lb);

        // * Setting up Combobox
        String[] types = {"Choose one:", "Student", "Event Organiser"};
        ac_type = new JComboBox(types);
        ac_type.setBounds(150,240,300,30);
        register.add(ac_type);

        // * Label which for conformation which is changed when register button is clicked.
        lb_conform = new JLabel("Fill up the forms and register.", JLabel.LEFT);
        lb_conform.setBounds(180,290,250,30);
        lb_conform.setForeground(Color.GREEN);
        register.add(lb_conform);

        /**
         * Buttons for registration and going back to the login screen
         */

        // * Buttons for registration
        btn_register = new JButton("Add Me");
        btn_register.setBounds(0,350,250,50);
        btn_register.setBackground(new Color(60,200,145));
        register.add(btn_register);

        btn_register.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                /**
                 * Getting the input
                 */
                String u = userName.getText().toString();
                String e_a = email_address.getText().toString();
                String p = passwd_register.getText().toString();
                String a = ac_type.getSelectedItem().toString();

                /**
                 * Taking the registration input in the else-if statement
                 */
                if(u.equals("student")){
                    /**
                     * Printing out the inputs
                     */
                    System.out.println("\nUser Name: "+u);
                    System.out.println("Email Address: "+e_a);
                    System.out.println("Password: "+p);
                    System.out.println("Account Type: "+a);

                    // *Account Already taken
                    JOptionPane.showMessageDialog(null,"Username 'student' have already been taken.\nTry something else.");

                    // * Printing "New Account has been registered."
                    System.out.println("\nAccount Already taken.");
                }
                else if(u.equals("") && e_a.equals("") && p.equals("") && a.equals("Choose one:")){
                    /**
                     * Printing out the inputs
                     */
                    System.out.println("\nUser Name: "+u);
                    System.out.println("Email Address: "+e_a);
                    System.out.println("Password: "+p);
                    System.out.println("Account Type: "+a);

                    // * Fill the form message.
                    JOptionPane.showMessageDialog(null,"Please fill the form");

                    // * Printing "New Account has been registered."
                    System.out.println("\nPlease fill the form");
                }
                else if(u.equals("Enter your UserName") && e_a.equals("Enter your Email Address") && p.equals("Enter Your Password") && a.equals("Choose one:")){
                    /**
                     * Printing out the inputs
                     */
                    System.out.println("\nUser Name: "+u);
                    System.out.println("Email Address: "+e_a);
                    System.out.println("Password: "+p);
                    System.out.println("Account Type: "+a);

                    // * Fill the from message
                    JOptionPane.showMessageDialog(null,"Please fill the form");

                    // * Printing "New Account has been registered."
                    System.out.println("\nPlease fill the form");

                }
                else{
                    /**
                     * Printing out the inputs
                     */
                    System.out.println("\nUser Name: "+u);
                    System.out.println("Email Address: "+e_a);
                    System.out.println("Password: "+p);
                    System.out.println("Account Type: "+a);

                    // * showing label "You Have Been registered."
                    lb_conform.setText("You Have Been registered.");

                    // *Registeration sucessfull.
                    JOptionPane.showMessageDialog(null,"You Have Been registered.");

                    // * Printing "New Account has been registered."
                    System.out.println("\nNew Account has been registered.");

                }
            }
        });

        // * Button for going back to the login screen.
        btn_login = new JButton("Back To Login");
        btn_login.setBounds(350,350,250,50);
        btn_login.setBackground(new Color(60,200,145));
        register.add(btn_login);

        btn_login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // Returning back to the login screen.
                register_frame.dispose();
                FrmLogin register_login = new FrmLogin();
            }
        });

        /**
         * Setting up frame and background
         */

        // * Frame
        register_frame = new JFrame();
        register_frame.setSize(900,900);
        register_frame.setTitle("Extra-Curricular Event Management System");
        register_frame.setResizable(false);
        register_frame.setLayout(null);
        register_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // * Background
        ImageIcon background_image = new ImageIcon("bg.jpeg");
        Image img = background_image.getImage();
        Image temp_img = img.getScaledInstance(900,900,Image.SCALE_SMOOTH);
        background_image = new ImageIcon(temp_img);
        JLabel background = new JLabel("", background_image, JLabel.CENTER);

        background.add(register);
        background.add(heading);
        background.setBounds(0,0,900,900);
        register_frame.add(background);

        register_frame.setVisible(true);
    }

    /**
     * Calling out the constructor to run the program
     */
    public static void main(String[] args) {

        new FrmRegister();
    }
}
