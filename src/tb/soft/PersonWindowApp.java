package tb.soft;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class PersonWindowApp extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;

    JLabel IDLabel = new JLabel("             ID: ");
    JLabel passwordLabel = new JLabel("Password: ");
    JTextField IDField = new JTextField(15);
    JPasswordField passwordField = new JPasswordField(15);

    JButton login = new JButton("Login");
    JButton exit = new JButton("Cancel");

    JPanel panel = new JPanel();

    public PersonWindowApp(){
        setTitle("PersonWindowApp");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(250, 130);
        setLocationRelativeTo(null);

        login.addActionListener(this);
        exit.addActionListener(this);

        panel.add(IDLabel);
        panel.add(IDField);

        panel.add(passwordLabel);
        panel.add(passwordField);

        panel.add(login);
        panel.add(exit);

        setContentPane(panel);
        setVisible(true);
    }

    static Map<String, String> hashMap = new HashMap<>();

    @Override
    public void actionPerformed(ActionEvent e) {
        Object eventSource = e.getSource();

        String data = this.IDField.getText();
        String data_2 = this.passwordField.getText();

        if (eventSource == login) {
            if(!data.equals("") && !data_2.equals("")){
                panel.setBackground(Color.green);
                //Jezeli jest takie samo ID to po wpisaniu innego hasła nadpisuje
                hashMap.put(data, data_2);
            }
            else
                panel.setBackground(Color.red);
        }

        if (eventSource == exit) {
            //System.out.println(hashMap);
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new PersonWindowApp();
    }
}
