package tb.soft;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class PersonWindowApp extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;

    JLabel IDLabel = new JLabel("             ID: ");
    JLabel passwordLabel = new JLabel("Password: ");
    JTextField IDField = new JTextField(15);
    JPasswordField passwordField = new JPasswordField(15);

    JButton login = new JButton("Login");
    JButton reset = new JButton("Reset");
    JButton exit = new JButton("Cancel");

    JPanel panel = new JPanel();

    public PersonWindowApp(){
        setTitle("PersonWindowApp");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(250, 130);
        setLocationRelativeTo(null);

        login.addActionListener(this);
        reset.addActionListener(this);
        exit.addActionListener(this);

        panel.add(IDLabel);
        panel.add(IDField);

        panel.add(passwordLabel);
        panel.add(passwordField);

        panel.add(login);
        panel.add(reset);
        panel.add(exit);

        setContentPane(panel);
        panel.setBackground(Color.WHITE);
        setVisible(true);
    }

    HashMap<String, String> dane = new HashMap<>();

    @Override
    public void actionPerformed(ActionEvent e) {
        Object eventSource = e.getSource();

        dane.put("John", "Smith");
        dane.put("Adam", "File");
        dane.put("Piotr", "Nowak");
        dane.put("Szymon", "Kowalski");
        dane.put("Radek", "Smok");
        dane.put("Agata", "Rydz");

        String data = this.IDField.getText();
        String data_2 = new String(passwordField.getPassword());

        if (eventSource == login) {
            if (dane.containsKey(data) && dane.get(data).equals(data_2)){
                panel.setBackground(Color.green);
            }
            else
                panel.setBackground(Color.red);
        }

        if (eventSource == reset) {
            panel.setBackground(Color.WHITE);
            IDField.setText("");
            passwordField.setText("");
        }

        if (eventSource == exit) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new PersonWindowApp();
    }
}
