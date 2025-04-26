
//import javax.swing.JDialog;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

class Code {
    Frame frame = new Frame("FORM");
    Label title = new Label("STUDENT REGISTRATION");
    Label label = new Label("NAME");
    Label label1 = new Label("CLASS");
    Label label2 = new Label("SECTION");
    Label label3 = new Label("ADDRESS");
    Button button = new Button("Register");
    TextField field = new TextField();
    TextField field1 = new TextField();
    TextField field2 = new TextField();
    TextArea area = new TextArea();
    Font font = new Font("monospace", 15, 020);
    Font font1 = new Font("monospace", 15, 030);
    JDialog dialog = new JDialog();
    JPasswordField password = new JPasswordField();
    JButton login = new JButton("LOGIN");
    Label lb = new Label("E-mail");
    JOptionPane pane = new JOptionPane();
    TextField f = new TextField();
    Label pass = new Label("PASSWORD");
    TextField fi = new TextField();
    Font font2 = new Font("monospace", 15, 015);

    public Code() {
        frame.setSize(600, 600);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        addlabel();
        addfield();
        addbutton();
        adddialog();
        addEmail();

        frame.setVisible(true);

    }

    public void addEmail() {
        f.setBounds(140, 70, 140, 30);
        dialog.add(f);
        pass.setBounds(50, 105, 80, 50);
        pass.setFont(font2);
        pass.setForeground(Color.black);
        dialog.add(pass);
        password.setBounds(140, 110, 140, 30);
        dialog.add(password);
        login.addActionListener(new Check());

    }

    int b = 0;

    class Check implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String str = f.getText();
            if (!str.contains("@") || !str.contains("gmail.com")) {
                ++b;
                if (b == 3) {
                    dialog.setVisible(false);
                } else {
                    pane.showMessageDialog(dialog, "Email is Incorrect");
                }

            } else {
                pane.showMessageDialog(dialog, "Registration Confirm");
                dialog.setVisible(false);
            }

        }
    }

    public void adddialog() {
        dialog.setSize(300, 300);
        dialog.setLayout(null);
        dialog.setLocationRelativeTo(null);
        dialog.setAlwaysOnTop(true);
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        button.addActionListener(new act());
        // dialog.setModal(false);
        // dialog.setResizable(false);
        // frame.add(dialog);
        // dialog.setLocationRelativeTo(null);
    }

    public void addbutton() {
        button.setBounds(200, 450, 200, 70);
        button.setBackground(Color.red);
        button.setFont(font);
        frame.add(button);
        login.setBounds(100, 170, 100, 50);
        dialog.add(login);
    }

    int a = 0;

    class act implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            frame.setVisible(false);
            dialog.setVisible(true);
        }
    }

    public void addlabel() {
        title.setBounds(150, 50, 300, 50);
        title.setFont(font1);
        title.setBackground(Color.green);
        frame.add(title);
        label.setForeground(Color.red);
        label1.setForeground(Color.green);
        label2.setForeground(Color.blue);
        label3.setForeground(Color.orange);
        label.setFont(font);
        label1.setFont(font);
        label2.setFont(font);
        label3.setFont(font);
        label.setBounds(100, 100, 100, 100);
        label1.setBounds(100, 170, 100, 100);
        label2.setBounds(100, 240, 100, 100);
        label3.setBounds(100, 310, 100, 100);
        frame.add(label2);
        frame.add(label);
        frame.add(label1);
        frame.add(label3);
        lb.setBounds(50, 60, 50, 50);
        lb.setFont(font);
        dialog.add(lb);

    }

    public void addfield() {
        // field.setBounds(250, 100, 0200, 20);
        field.setFont(font);
        field1.setFont(font);
        field2.setFont(font);
        area.setFont(font);
        field.setBounds(250, 130, 200, 30);
        frame.add(field);
        field1.setBounds(250, 200, 200, 30);
        frame.add(field1);
        field2.setBounds(250, 270, 200, 30);
        frame.add(field2);
        area.setBounds(250, 340, 200, 30);
        frame.add(area);
    }

    public static void main(String[] args) {
        new Code();
    }
}