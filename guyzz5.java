import java.awt.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.awt.event.*;

class guyzz5 implements ActionListener {
    Button b1;
    Frame f;
    Statement st;
    ResultSet rs;
    TextField t1, t2, t3, t4, t5, t6, t7, t8, t9;
    Connection con;

    guyzz5() {
        con = null;
        f = new Frame("UPDATE RESULT");
        b1 = new Button("Submit");
       // f.setBackground(Color.PINK);
     

        Label l1 = new Label("*** UPDATE RESULT ***");
        Label l2 = new Label("STUDENT ID:");
        Label l3 = new Label("DOB :");

        Label l5 = new Label("PHYSICS");
        Label l6 = new Label("CHEMISTRY");
        Label l7 = new Label("MATHEMATICS");
        Label l8 = new Label("ENGLISH");

        t1 = new TextField();
        t2 = new TextField();
        t3 = new TextField();
        t4 = new TextField();
        t5 = new TextField();
        t6 = new TextField();
        l1.setBackground(Color.PINK);
        l2.setBackground(Color.PINK);
        l3.setBackground(Color.PINK);
        //l4.setBackground(Color.PINK);
        l5.setBackground(Color.PINK);
        l6.setBackground(Color.PINK);
        l7.setBackground(Color.PINK);
        l8.setBackground(Color.PINK);
       // l3.setBackground(Color.PINK);
      

  

        f.setLayout(null);
        l1.setBounds(250, 160, 400, 50);
        l2.setBounds(150, 230, 100, 40);
        l3.setBounds(150, 310, 100, 40);
        b1.setBounds(550, 460, 150, 60);
        l5.setBounds(150, 390, 100, 40);
        l6.setBounds(150, 470, 100, 40);
        l7.setBounds(150, 550, 100, 40);
        l8.setBounds(150, 630, 100, 40);
     

        t1.setBounds(270, 230, 200, 40);
        t2.setBounds(270, 310, 200, 40);
        t3.setBounds(270, 390, 200, 40);
        t4.setBounds(270, 470, 200, 40);
        t5.setBounds(270, 550, 200, 40);
        t6.setBounds(270, 630, 200, 40);


        f.add(l1);
        f.add(l2);
        f.add(l3);
     
        f.add(l5);
        f.add(l6);
        f.add(l7);
        f.add(l8);

        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(t4);
        f.add(t5);
        f.add(t6);
      
        f.add(b1);
        b1.addActionListener(this);

        f.setSize(1000, 1000);
        f.setVisible(true);
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "1821");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            String un = t1.getText();
            String pass = t2.getText();
            String m1 = t3.getText();
            String m2 = t4.getText();
            String m3 = t5.getText();
            String m4 = t6.getText();
      

            String s = "insert into num values(" + un + "," + pass + "," + m1 + "," + m2 + "," + m3
                    + "," + m4 + ")";

            Statement st = con.createStatement();
            int r = st.executeUpdate(s);

            if (r != 0) {
                if (ae.getSource() == b1) {
                    guyzz6 g6 = new guyzz6(un, pass, m1, m2, m3, m4);
                    f.setVisible(false);

                } else
                    System.out.println("Unable to store");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}