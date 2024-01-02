import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class guyzz3 implements ActionListener {
    Frame f;
    Button b1, b2;
    Label l1, l2, l3, l4;
    TextField t1, t2;
    Connection con;

    guyzz3() {
        f = new Frame("STUDENT PORTAL");
        b1 = new Button("Proceed");
        // JButton b2=new JButton("Cancel");
        con = null;

        b1.addActionListener(this);

        // f.setBackground(Color.PINK);

        l1 = new Label("STUDENT ID:");
        l3 = new Label("PASSWORD:");
        l4 = new Label("Incorrect Id and PASSWORD:");

        l2 = new Label("**** STUDENT LOGIN ****");
        t1 = new TextField();
        t2 = new TextField();
        t2.setEchoChar('*');
        b2 = new Button("Return");
        b2.addActionListener(this);

        // Choice li1=new Choice();

        f.setLayout(null);
        b2.setBounds(10, 10, 50, 50);
        l1.setBounds(240, 310, 80, 40);
        l2.setBounds(250, 210, 200, 40);
        l3.setBounds(240, 360, 80, 40);
        t1.setBounds(330, 320, 100, 20);
        t2.setBounds(330, 370, 100, 20);
        b1.setBounds(290, 450, 100, 40);
        l4.setBounds(250, 525, 200, 60);
        l1.setBackground(Color.PINK);
        l2.setBackground(Color.PINK);
        l3.setBackground(Color.PINK);
        l4.setBackground(Color.PINK);

        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(t1);
        f.add(t2);

        f.add(b1);
        // f.add(b2);

        f.setSize(700, 700);
        f.setVisible(true);
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "1821");
        } catch (Exception e) {

        }

    }

    // ACTION LISTENER
    public void actionPerformed(ActionEvent ae) {
        try {
            String id = t1.getText();
            String pass = t2.getText();

            Statement st = con.createStatement();
            String sql = "select * from num  ";
            
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            while(rs.next()) {
                if (rs.getString(2).equals(pass)){ 
                    String un = (rs.getString(1));
                    String pas = (rs.getString(2));
                    String m1 = (rs.getString(3));
                    String m2 = (rs.getString(4));
                    String m3 = (rs.getString(5));
                    String m4 = (rs.getString(6));
                    // String un=(rs.getString(1));
                    result r = new result(un, pas, m1, m2, m3, m4);
                    f.setVisible(false);

                }}
            //       else {
            // f.add(l4);
            // System.out.println("invalid password");

            // }
            
            // else if (ae.getSource() == b2) {
            // guyzz2 g2 = new guyzz2();
            // }

          
            // f.setVisible(false);

             } catch (Exception ex) {
            System.out.println(ex);

        }
    }

    // MAIN
    public static void main(String arr[]) {
        guyzz3 app = new guyzz3();
        // app.studentlogin();
    }
}
// where id='"+t1.getText()+"' and pass ='"+t2.getText()+"'