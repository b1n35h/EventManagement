package com.company;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ViewBookings  {

    /**
     * Setting up Variables
     */
    JFrame frame_viewbookings;
    JPanel heading;
    JLabel yours_bookings;
    JButton btn_home;
    JButton btn_logout;
    JPanel bookings;
    JTextField search_box;
    JButton btn_search;
    JLabel lb_vl;
    JLabel prog1;
    JButton btn_prog1;
    JLabel prog2;
    JButton btn_prog2;
    JLabel prog3;
    JButton btn_prog3;

    /**
     * Making Constructor of class 'ViewBookings'
     */
    ViewBookings() {

        // *Printing in the Terminal:
        System.out.println("\n\t***** Users Bookings screen *****\n");

        // font
        Font f = new Font("Serif", Font.BOLD, 30);

        /**
         * Heading Panel
         */
        heading = new JPanel();
        heading.setBackground(new Color(0,0,0,90));
        heading.setBounds(0,0,900,100);

        yours_bookings = new JLabel("E-CEM:Your Bookings");
        yours_bookings.setForeground(Color.WHITE);
        yours_bookings.setFont(f);
        heading.add(yours_bookings);

        /**
         * View Bookings Panel
         */
        bookings = new JPanel();
        bookings.setSize(600,550);
        bookings.setBackground(new Color(0,0,0,70));
        bookings.setBounds(150,150,600,550);


        // * Home Button to return back to the homepage
        btn_home = new JButton("Home");
        btn_home.setSize(60,55);
        btn_home.setBounds(410,0,90,30);
        btn_home.setBackground(Color.RED);
        bookings.add(btn_home);

        btn_home.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                /**
                 * Going back to the home screen.
                 */
                frame_viewbookings.dispose();
                StuHome view_home = new StuHome();
            }
        });

        // * Logout Button to return to the signup screen
        btn_logout = new JButton("Logout");
        btn_logout.setSize(60,55);
        btn_logout.setBounds(510,0,90,30);
        btn_logout.setBackground(Color.RED);
        bookings.add(btn_logout);

        btn_logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                /**
                 * Going back to the login screen.
                 */
                JOptionPane.showMessageDialog(null,"Are you sure you want to Logout?");
                frame_viewbookings.dispose();
                FrmLogin view_login = new FrmLogin();
            }
        });

        // * Search Box textfield
        search_box = new JTextField("Search for the event.");
        bookings.setLayout(null);
        search_box.setBounds(100,70,350,30);
        bookings.add(search_box);

        // * Button to search for the events
        btn_search = new JButton("Search");
        btn_search.setSize(60,55);
        btn_search.setBounds(450,70,90,30);
        btn_search.setBackground(new Color(60,200,150));
        bookings.add(btn_search);

        btn_search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // * Going to the search result screen.
                String s = search_box.getText().toString();
                System.out.println("Search Keyword: "+s);
                frame_viewbookings.dispose();
                SearchRes view_search = new SearchRes();
            }
        });

        /**
         * List of the Events with the buttons on your list
         that you can cancel
         */

        // * Label "List of your bookings"
        lb_vl = new JLabel("List of your bookings:");
        lb_vl.setBounds(40,220,300,30);
        lb_vl.setForeground(Color.WHITE);
        bookings.add(lb_vl);

        // * Program no. 1:
        prog1 = new JLabel("Prize Distrubution =>");
        prog1.setBounds(40,250,450,25);
        prog1.setForeground(Color.WHITE);
        prog1.setFont(f);
        bookings.add(prog1);

        // * Button to cancel program no. 1
        btn_prog1 = new JButton("Cancel");
        btn_prog1.setSize(60,55);
        btn_prog1.setBounds(450,250,90,30);
        btn_prog1.setBackground(new Color(60,200,150));
        bookings.add(btn_prog1);
        btn_prog1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                /**
                 * MessageBox to show your event cancelation
                 when the button is clicked.
                 */
                JOptionPane.showMessageDialog(null,"This event has been canceled and removed from your list.");
                System.out.println("Prize Distributin event has been removed from the user's list.");
            }
        });

        // * Program no. 2:
        prog2 = new JLabel("Holi Program =>");
        prog2.setBounds(40,250,450,125);
        prog2.setForeground(Color.WHITE);
        prog2.setFont(f);
        bookings.add(prog2);

        // * Button to cancel program no 2
        btn_prog2 = new JButton("Cancel");
        btn_prog2.setSize(60,55);
        btn_prog2.setBounds(450,300,90,30);
        btn_prog2.setBackground(new Color(60,200,150));
        bookings.add(btn_prog2);
        btn_prog2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // * MessageBox to show this event is canceled an removed from your list.
                JOptionPane.showMessageDialog(null,"This event has been canceled and removed from your list.");
                System.out.println("Holi Program has been removed from the user's list.");
            }
        });

        // * Program no. 3:
        prog3 = new JLabel("Concert =>");
        prog3.setBounds(40,250,450,225);
        prog3.setForeground(Color.WHITE);
        prog3.setFont(f);
        bookings.add(prog3);

        // * Button to Cancel program no 3
        btn_prog3 = new JButton("Cancel");
        btn_prog3.setSize(60,55);
        btn_prog3.setBounds(450,350,90,30);
        btn_prog3.setBackground(new Color(60,200,150));
        bookings.add(btn_prog3);
        btn_prog3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // * MessangeBox to show event has been removed from your list.
                JOptionPane.showMessageDialog(null,"This event has been canceled and romoved from your list.");
                System.out.println("Concert has been removed from the user's list.");
            }
        });

        /**
         * Setting up frame and background
         */
        // * Frame
        frame_viewbookings = new JFrame();
        frame_viewbookings.setSize(900,900);
        frame_viewbookings.setTitle("Extra-Curricular Event Management System");
        frame_viewbookings.setResizable(false);
        frame_viewbookings.setLayout(null);
        frame_viewbookings.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // * Background
        ImageIcon background_image = new ImageIcon("bg.jpeg");
        Image img = background_image.getImage();
        Image temp_img = img.getScaledInstance(900,900,Image.SCALE_SMOOTH);
        background_image = new ImageIcon(temp_img);
        JLabel background = new JLabel("", background_image, JLabel.CENTER);

        background.add(heading);
        background.add(bookings);
        background.setBounds(0,0,900,900);
        frame_viewbookings.add(background);

        frame_viewbookings.setVisible(true);
    }

    public static void main(String[] args) {

        new ViewBookings();
    }
}
