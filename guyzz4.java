import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class guyzz4 implements ActionListener {
    Frame f;
    Button b1;
    Label l1, l2, l3, l4;
    TextField t1, t2;
    Connection con;

    guyzz4() {
        // con = null;
        f = new Frame("UNIVERSITY PORTAL");
        b1 = new Button("Proceed");
        // JButton b2=new JButton("Cancel");

        b1.addActionListener(this);

        // f.setBackground(Color.PINK);

        l1 = new Label("ADMIN ID:");
        l3 = new Label("PASSWORD:");
        l4 = new Label("Invalid Information");

        l2 = new Label("**** ADMININSTRATIVE LOGIN ****");
        t1 = new TextField();
        t2 = new TextField();
        t2.setEchoChar('*');

        // Choice li1=new Choice();

        f.setLayout(null);
        l1.setBounds(240, 310, 80, 25);
        l2.setBounds(250, 210, 200, 40);
        l3.setBounds(240, 360, 80, 25);
        t1.setBounds(330, 310, 100, 20);
        t2.setBounds(330, 360, 100, 20);
        b1.setBounds(290, 450, 100, 40);
        l4.setBounds(2, 530, 150, 40);
        l1.setBackground(Color.PINK);
        l2.setBackground(Color.PINK);
        l3.setBackground(Color.PINK);
      
      

        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(t1);
        f.add(t2);
        f.add(b1);
        l4.setBackground(Color.PINK);

        f.setSize(900, 900);
        f.setVisible(true);
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "1821");
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    // ACTION EVENT

    public void actionPerformed(ActionEvent ae) {
        try {
            String id = t1.getText();
            String pass = t2.getText();

            Statement st = con.createStatement();
            String sql = "select * from faculty where UserName='" + id + "'";
            ResultSet rs = st.executeQuery(sql);
            //rs.next();
            if(rs.next()){
            if (rs.getString(2).equals(pass)) {

                guyzz5 g5 = new guyzz5();
                f.setVisible(false);

                // else
            } else {
                 f.add(l4);

                System.out.println("User Name or Password is incorrect");
               
            }}
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    // MAIN
    public static void main(String arr[]) {
        guyzz4 app = new guyzz4();

        // app.teacherlogin();
    }

}