package com.company;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SearchRes {

    /**
     * Setting Up Variables
     */
    JFrame seacrhres_frame;
    JPanel heading;
    JLabel event_search;
    JPanel result;
    JButton btn_home;
    JButton btn_logout;
    JTextField search_box;
    JButton btn_search;
    JLabel result_search;

    /**
     * Making Constructor of class 'SearchRes'
     */
    SearchRes() {

        // *Printing in the terminal:
        System.out.println("\n\t***** Search Result Screen *****\n");
        System.out.println("Search Result: 0");

        // font
        Font f = new Font("Serif", Font.BOLD, 30);

        /**
         * Heading Panel
         */
        heading = new JPanel();
        heading.setBackground(new Color(0,0,0,90));
        heading.setBounds(0,0,900,100);

        event_search = new JLabel("E-CEM:Search Result");
        event_search.setForeground(Color.WHITE);
        event_search.setFont(f);
        heading.add(event_search);

        /**
         * SearchResult Panel
         */
        result = new JPanel();
        result.setSize(600,550);
        result.setBackground(new Color(0,0,0,70));
        result.setBounds(150,150,600,550);

        // * Button for going back to dashboard.
        btn_home = new JButton("Home");
        btn_home.setSize(60,55);
        btn_home.setBounds(410,0,90,30);
        btn_home.setBackground(Color.RED);
        result.add(btn_home);

        btn_home.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                /**
                 * Going back to the screen
                 */
                seacrhres_frame.dispose();
                StuHome searchres_home = new StuHome();
            }
        });

        // * Button for logging out.
        btn_logout = new JButton("Logout");
        btn_logout.setSize(60,55);
        btn_logout.setBounds(510,0,90,30);
        btn_logout.setBackground(Color.RED);
        result.add(btn_logout);

        btn_logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                /**
                 * Going back to the login screen
                 */
                JOptionPane.showMessageDialog(null,"Are you sure you want to Logout?");
                seacrhres_frame.dispose();
                FrmLogin searchres_login = new FrmLogin();
            }
        });

        // * Textbox for search.
        search_box = new JTextField("Search for the event.");
        result.setLayout(null);
        search_box.setBounds(100,70,350,30);
        result.add(search_box);

        // * Button for search.
        btn_search = new JButton("Search");
        btn_search.setSize(60,55);
        btn_search.setBounds(450,70,90,30);
        btn_search.setBackground(new Color(60,200,150));
        result.add(btn_search);

        btn_search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                /**
                 * Reloading the Search Result screen
                 */
                String s = search_box.getText().toString();
                System.out.println("Search Keyword :"+s);
                seacrhres_frame.dispose();
                SearchRes search_search = new SearchRes();
            }
        });

        // * Label to show search results.
        result_search = new JLabel("Search Found : 0");
        result_search.setBounds(150,250,450,125);
        result_search.setForeground(Color.WHITE);
        result_search.setFont(f);
        result.add(result_search);

        /**
         *Setting up frame and background
         */

        // * Frame
        seacrhres_frame = new JFrame();
        seacrhres_frame.setSize(900,900);
        seacrhres_frame.setTitle("Extra-Curricular Event Management System");
        seacrhres_frame.setResizable(false);
        seacrhres_frame.setLayout(null);
        seacrhres_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // * Background
        ImageIcon background_image = new ImageIcon("bg.jpeg");
        Image img = background_image.getImage();
        Image temp_img = img.getScaledInstance(900,900,Image.SCALE_SMOOTH);
        background_image = new ImageIcon(temp_img);
        JLabel background = new JLabel("", background_image, JLabel.CENTER);

        background.add(heading);
        background.add(result);
        background.setBounds(0,0,900,900);
        seacrhres_frame.add(background);

        seacrhres_frame.setVisible(true);
    }

    /**
     * Calling out the constructor to run the program
     */
    public static void main(String[] args) {

        new SearchRes();
    }
}
