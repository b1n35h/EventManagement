package com.company;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class StuHome {

    /**
     * Setting Up Variables
     */
    JFrame frame_stuhome;
    JPanel heading;
    JLabel name;
    JPanel home;
    JButton btn_logout;
    JTextField search_box;
    JButton btn_search;
    JButton btn_view;
    JLabel lb_rec;
    JLabel prog1;
    JButton btn_prog1;
    JLabel prog2;
    JButton btn_prog2;
    JLabel prog3;
    JButton btn_prog3;

    /**
     * Making Constructor of class 'StuHome'
     */
    StuHome() {

        // *Printing in the Terminal:
        System.out.println("\n\t***** Student's Account Home screen *****\n");

        // font
        Font f = new Font("Serif", Font.BOLD, 30);

        /**
         * Heading Panel
         */
        heading = new JPanel();
        heading.setBackground(new Color(0,0,0,90));
        heading.setBounds(0,0,900,100);

        name = new JLabel("E-CEM:Home");
        name.setForeground(Color.WHITE);
        name.setFont(f);
        heading.add(name);

        /**
         * Home Panel
         */
        home = new JPanel();
        home.setSize(600,550);
        home.setBackground(new Color(0,0,0,70));
        home.setBounds(150,150,600,550);

        // * Logout Button to go to the sign up screen.
        btn_logout = new JButton("Logout");
        btn_logout.setSize(60,55);
        btn_logout.setBounds(510,0,90,30);
        btn_logout.setBackground(Color.RED);
        home.add(btn_logout);

        btn_logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                /**
                 * Logging out of the account.
                 */
                JOptionPane.showMessageDialog(null,"Are you sure you want to Logout?");
                frame_stuhome.dispose();
                FrmLogin home_login = new FrmLogin();
            }
        });


        // * Textfield for searching an event.
        search_box = new JTextField("Search for the event.");
        home.setLayout(null);
        search_box.setBounds(100,70,350,30);
        home.add(search_box);

        // * Search Button to search for and event.
        btn_search = new JButton("Search");
        btn_search.setSize(60,55);
        btn_search.setBounds(450,70,90,30);
        btn_search.setBackground(new Color(60,200,150));
        home.add(btn_search);

        btn_search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                /**
                 * Taking kewords and going to the search screen.
                 */
                String s = search_box.getText().toString();
                System.out.println("Search Keyword :"+s);
                frame_stuhome.dispose();
                SearchRes home_search = new SearchRes();
            }
        });

        // * View button for going to the pages which shows your bookings.
        btn_view = new JButton("View My Bookings");
        btn_view.setBounds(220,120,170,50);
        btn_view.setBackground(new Color(60,200,145));
        home.add(btn_view);

        btn_view.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                /**
                 * Going to the View Bookings screen.
                 */
                frame_stuhome.dispose();
                ViewBookings v_home = new ViewBookings();
            }
        });

        /**
         * List of the Events with the buttons to Book theme.
         */

        // * Label "Some events recommended for you."
        lb_rec = new JLabel("Some events recommended for you:", JLabel.LEFT);
        lb_rec.setBounds(40,220,300,30);
        lb_rec.setForeground(Color.WHITE);
        home.add(lb_rec);

        // * Program no. 1:
        prog1 = new JLabel("CTF Competition =>");
        prog1.setBounds(40,250,450,25);
        prog1.setForeground(Color.WHITE);
        prog1.setFont(f);
        home.add(prog1);

        // * Button to book program no 1.
        btn_prog1 = new JButton("Book");
        btn_prog1.setSize(60,55);
        btn_prog1.setBounds(450,250,90,30);
        btn_prog1.setBackground(new Color(60,200,150));
        home.add(btn_prog1);
        btn_prog1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                /**
                 * Messagebox to show your event is booked.
                 */
                JOptionPane.showMessageDialog(null,"This event has been booked to your list.");
                System.out.println("CTF Competition has been added to the user's list.");
            }
        });

        // * Program no. 2:
        prog2 = new JLabel("Graduation Program =>");
        prog2.setBounds(40,250,450,125);
        prog2.setForeground(Color.WHITE);
        prog2.setFont(f);
        home.add(prog2);

        // * Button to Book Program no. 2
        btn_prog2 = new JButton("Book");
        btn_prog2.setSize(60,55);
        btn_prog2.setBounds(450,300,90,30);
        btn_prog2.setBackground(new Color(60,200,150));
        home.add(btn_prog2);
        btn_prog2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // * MessageBox to show this event is booked.
                JOptionPane.showMessageDialog(null,"This event has been booked to your list.");
                System.out.println("Gradution Program has been added to the user's list.");
            }
        });

        // * Program no. 3:
        prog3 = new JLabel("Tech Seminar =>");
        prog3.setBounds(40,250,450,225);
        prog3.setForeground(Color.WHITE);
        prog3.setFont(f);
        home.add(prog3);

        // * Button to Book Program no 2
        btn_prog3 = new JButton("Book");
        btn_prog3.setSize(60,55);
        btn_prog3.setBounds(450,350,90,30);
        btn_prog3.setBackground(new Color(60,200,150));
        home.add(btn_prog3);
        btn_prog3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // * MessageBox to show this event is booked which is shown when you click book button.
                JOptionPane.showMessageDialog(null,"This event has been booked to your list.");
                System.out.println("Tech Seminar has been added to the user's list.");
            }
        });

        /**
         * Setting up frame and background
         */
        // * Frame
        frame_stuhome = new JFrame();
        frame_stuhome.setSize(900,900);
        frame_stuhome.setTitle("Extra-Curricular Event Management System");
        frame_stuhome.setResizable(false);
        frame_stuhome.setLayout(null);
        frame_stuhome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // * Background
        ImageIcon background_image = new ImageIcon("bg.jpeg");
        Image img = background_image.getImage();
        Image temp_img = img.getScaledInstance(900,900,Image.SCALE_SMOOTH);
        background_image = new ImageIcon(temp_img);
        JLabel background = new JLabel("", background_image, JLabel.CENTER);

        background.add(heading);
        background.add(home);
        background.setBounds(0,0,900,900);
        frame_stuhome.add(background);

        frame_stuhome.setVisible(true);
    }

    /**
     * Calling out the constructor to run the program
     */
    public static void main(String[] args) {

        new StuHome();
    }
}
