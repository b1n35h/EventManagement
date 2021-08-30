package com.company;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class FrmLogin  {

    /**
     * Setting up Variables
     */
    JFrame frame_login;
    JPanel heading;
    JLabel name;
    JPanel login;
    JLabel log;
    JTextField user_name_login;
    JPasswordField passwd_login;
    JButton btn_signin;
    JButton btn_register;

    /**
     * Making Constructor of 'FrnLogin' class
     */

    FrmLogin() {

        // * Printing in terminal:
        System.out.println("\n\t***** Login screen *****\n");

        // font
        Font f = new Font("Serif", Font.BOLD, 30);

        /**
         * Heading Panel
         */
        heading = new JPanel();
        heading.setBackground(new Color(0,0,0,90));
        heading.setBounds(0,0,900,100);

        name = new JLabel("Extra-Curricular Event Management System");
        name.setForeground(Color.WHITE);
        name.setFont(f);
        heading.add(name);

        /**
         * Login Panel
         */
        login = new JPanel();
        login.setSize(400,350);
        login.setBackground(new Color(0,0,0,70));
        login.setBounds(250,175,400,350);

        // * Label of Login
        log = new JLabel("Login");
        log.setBounds(180,0,200,70);
        log.setForeground(Color.WHITE);
        login.add(log);

        // * Textfield to Enter your username.
        user_name_login = new JTextField("Enter username");
        login.setLayout(null);
        user_name_login.setBounds(50,70,300,50);
        login.add(user_name_login);

        // * Password to Enter your password.
        passwd_login = new JPasswordField("Enter password");
        passwd_login.setBounds(50,170,300,50);
        login.add(passwd_login);

        /**
         * Buttons for sign up && going to the registration screen.
         */
        // * Sign In Button.
        btn_signin = new JButton("Sign In");
        btn_signin.setBounds(50,260,100,50);
        btn_signin.setBackground(new Color(60,210,145));
        login.add(btn_signin);

        btn_signin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                /**
                 * Getting input for making checking credintials.
                 * Hint:-
                 * username :"student"
                 * password :"12345678"
                 */
                String u = user_name_login.getText().toString();
                String p = passwd_login.getText().toString();

                /**
                 * Checking the correct credientials with else-if statement.
                 */
                if(u.equals("student") && p.equals("12345678")) {
                    System.out.println("\nUsername: "+u);
                    System.out.println("Password: "+p);
                    JOptionPane.showMessageDialog(null,"Account Found!\nClick on O.K to continue.");
                    System.out.println("\nSuccessfully logged in!");
                    frame_login.dispose();
                    StuHome login_home = new StuHome();
                }
                else if(u.equals("student") && !p.equals("12345678")) {
                    System.out.println("\nUsername: "+u);
                    System.out.println("Password: "+p);
                    JOptionPane.showMessageDialog(null,"Incorrect Password!");
                    System.out.println("\nIncorrect Password!");
                    JOptionPane.showMessageDialog(null,"Hint:-\nusername:'student'\npassword:'12345678'");
                }
                else {
                    System.out.println("\nUsername: "+u);
                    System.out.println("Password: "+p);
                    JOptionPane.showMessageDialog(null,"No Such account has been registered!");
                    System.out.println("\nUnregistered User!");
                    JOptionPane.showMessageDialog(null,"Hint:-\nusername:'student'\npassword:'12345678'");
                }
            }
        });

        // * Button to go to registation screen.
        btn_register = new JButton("Register");
        btn_register.setBounds(250,260,100,50);
        btn_register.setBackground(new Color(60,210,145));
        login.add(btn_register);

        btn_register.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                /**
                 * Going to the Registration Screen.
                 */
                frame_login.dispose();
                FrmRegister login_register = new FrmRegister();
            }
        });


        /**
         * Setting up frame and background and frame.
         */

        //frame
        frame_login = new JFrame();
        frame_login.setSize(900,900);
        frame_login.setTitle("Extra-Curricular Event Management System");
        frame_login.setResizable(false);
        frame_login.setLayout(null);
        frame_login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // background
        ImageIcon background_image = new ImageIcon("bg.jpeg");
        Image img = background_image.getImage();
        Image temp_img = img.getScaledInstance(900,900,Image.SCALE_SMOOTH);
        background_image = new ImageIcon(temp_img);
        JLabel background = new JLabel("", background_image, JLabel.CENTER);

        background.add(login);
        background.add(heading);
        background.setBounds(0,0,900,900);
        frame_login.add(background);

        frame_login.setVisible(true);
    }

    /**
     * Calling out the constructor to run the program
     */
    public static void main(String[] args) {

        new FrmLogin();
    }
}
