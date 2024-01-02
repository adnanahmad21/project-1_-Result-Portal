import java.lang.*;
import java.awt.*;
import javax.swing.*;

class result {
    Label l1, l2, l3, l4, l5, l6, l0;
    TextField t1, t2, t3, t4, t5, t6, t7;
    Frame f = new Frame("RESULT");

    result(String un,String pas,String m1,String m2,String m3,String m4) {
        l0 = new Label(" STUDENT RESULT");
        l1 = new Label("Student ID ");
        l2 = new Label("DOB ");
        l3 = new Label("PHYSICS ");
        l4 = new Label("CHEMISTRY ");
        l5 = new Label("MATHEMATICS ");
        l6 = new Label("ENGLISH ");
        f.setSize(700, 700);
        f.setVisible(true);
        f.setBackground(Color.PINK);

        t1 = new TextField(un);
        t2 = new TextField(pas);
        t3 = new TextField(m1);
        t4 = new TextField(m2);
        t5 = new TextField(m3);
        t6 = new TextField(m4);
        t7 = new TextField(m4);

        l0.setBounds(235, 100, 200, 100);
        l1.setBounds(150, 230, 100, 40);
        l2.setBounds(150, 310, 100, 40);
        //
        l3.setBounds(150, 390, 100, 40);
        l4.setBounds(150, 470, 100, 40);
        l5.setBounds(150, 550, 100, 40);
        l6.setBounds(150, 630, 100, 40);
        t1.setBounds(270, 230, 200, 40);
        t2.setBounds(270, 310, 200, 40);
        t3.setBounds(270, 390, 200, 40);
        t4.setBounds(270, 470, 200, 40);
        t5.setBounds(270, 550, 200, 40);
        t6.setBounds(270, 630, 200, 40);
        t7.setBounds(270, 630, 200, 40);
        f.add(l0);
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(t3);
        f.add(l4);
        f.add(t4);
        f.add(l5);
        f.add(t5);
        f.add(l6);
        f.add(t6);
        f.add(t7);

    }

    // public static void main(String[] args) {
    //     result r = new result();

    // }

}
