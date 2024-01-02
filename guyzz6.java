
import java.awt.*;
//import javax.swing.*;

import java.sql.Connection;
import java.sql.ResultSet;

class guyzz6 {
    Button b1, b2;
    Frame f;
    TextField t1, t2, t3, t4, t5, t6, t7, t8, t9;
    Label l1, l2, l3, l4, l5, l6;

    guyzz6(String un, String pass, String m1, String m2, String m3, String m4) {

        f = new Frame("RESULT");
        f.setBackground(Color.PINK);

        Label l1 = new Label("STUDENT ID;");
        Label l2 = new Label("DOB:");
        Label l3 = new Label("PHYSICS:");
        Label l4 = new Label("CHEMISTRY:");
        Label l5 = new Label("MATHS:");
        Label l6 = new Label("ENGLISH:");
        t1 = new TextField();
        t2 = new TextField();
        t3 = new TextField();
        t4 = new TextField();
        t5 = new TextField();
        t6 = new TextField();
        t7= new TextField();

        l1.setBounds(50, 70, 100, 40);
        l2.setBounds(430, 70, 100, 40);
        l3.setBounds(50, 150, 100, 40);
        l4.setBounds(430, 150, 100, 40);
        l5.setBounds(50, 230, 100, 40);
        l6.setBounds(430, 230, 100, 40);

        t1.setBounds(180, 70, 200, 40);
        t2.setBounds(550, 70, 200, 40);
        t3.setBounds(180, 150, 200, 40);
        t4.setBounds(550, 150, 200, 40);
        t5.setBounds(180, 230, 200, 40);
        t6.setBounds(550, 230, 200, 40);
        t7.setBounds(550, 430, 200, 40);

        t1.setText(un);
        t2.setText(pass);
        t3.setText(m1);
        t4.setText(m2);
        t5.setText(m3);
        t6.setText(m4);
        t7.setText(m4);

        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(l5);
        f.add(l6);
        f.add(t6);

        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(t4);
        f.add(t5);

        f.add(t7);

        f.setSize(1500, 1500);
        f.setVisible(true);

    }

}