import java.awt.*;

import java.awt.event.*;

class guyzz2 implements ActionListener {
    Button b1, b2, b3;
    Choice li1;
    Frame f;

    void registering() {
        f = new Frame("UNITED GROUP OF INSTITUTIONS");
        b1 = new Button("FACULTY");
        b2 = new Button("STUDENT");
        b3 = new Button("Proceed");
        // JButton b2=new JButton("Cancel");

        // f.setBackground(Color.PINK);

        Label l2 = new Label("Login As:");
        // Label l1 = new Label("**** LOGIN PAGE ****");

        li1 = new Choice();

        f.setLayout(null);
        // l1.setBounds(240, 100, 300, 100);
        l2.setBounds(300, 100, 100, 200);
        b1.setBounds(180, 350, 150, 150);
        b2.setBounds(370, 350, 150, 150);
        b1.setBackground(Color.PINK);
        b2.setBackground(Color.PINK);
        // b3.setBounds(250, 400, 100, 100);
        // li1.setBounds(340, 320, 100, 40);

        // f.add(l1);
        f.add(l2);

        f.add(b1);
        f.add(b2);
        // f.add(b3);

        f.setSize(700, 700);
        f.setVisible(true);
        b1.addActionListener(this);
        b2.addActionListener(this);
        // b3.addActionListener(this);

    }
    // item listener

    // ACTION LISTENER
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {
            // if(ae.getSource()==b3){
            guyzz4 g4 = new guyzz4();
            f.setVisible(false);
        } else if (ae.getSource() == b2) {
            // if(ae.getSource()==b3){
            guyzz3 g3 = new guyzz3();
            f.setVisible(false);
        }

    }

    // MAIN
    public static void main(String arr[]) {
        guyzz2 app = new guyzz2();
        app.registering();
    }

}

// {

// // l1.setBounds(0, 0, 0, 0);


// }