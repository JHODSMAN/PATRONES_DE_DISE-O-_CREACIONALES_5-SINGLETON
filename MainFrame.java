import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JTextField hostField;
    private JTextField portField;
    private JTextField userField;
    private JPasswordField passwordField;
    private JButton saveButton;
    private JButton showConfigButton;

    public MainFrame() {
        setTitle("Configuración de Base de Datos");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel hostLabel = new JLabel("Host:");
        hostLabel.setBounds(20, 20, 100, 25);
        add(hostLabel);

        hostField = new JTextField(DatabaseConfig.getInstance().getHost());
        hostField.setBounds(120, 20, 150, 25);
        add(hostField);

        JLabel portLabel = new JLabel("Puerto:");
        portLabel.setBounds(20, 60, 100, 25);
        add(portLabel);

        portField = new JTextField(DatabaseConfig.getInstance().getPort());
        portField.setBounds(120, 60, 150, 25);
        add(portField);

        JLabel userLabel = new JLabel("Usuario:");
        userLabel.setBounds(20, 100, 100, 25);
        add(userLabel);

        userField = new JTextField(DatabaseConfig.getInstance().getUsername());
        userField.setBounds(120, 100, 150, 25);
        add(userField);

        JLabel passwordLabel = new JLabel("Contraseña:");
        passwordLabel.setBounds(20, 140, 100, 25);
        add(passwordLabel);

        passwordField = new JPasswordField(DatabaseConfig.getInstance().getPassword());
        passwordField.setBounds(120, 140, 150, 25);
        add(passwordField);

        saveButton = new JButton("Guardar");
        saveButton.setBounds(20, 180, 100, 30);
        add(saveButton);

        showConfigButton = new JButton("Ver Config.");
        showConfigButton.setBounds(150, 180, 120, 30);
        add(showConfigButton);

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DatabaseConfig config = DatabaseConfig.getInstance();
                config.setHost(hostField.getText());
                config.setPort(portField.getText());
                config.setUsername(userField.getText());
                config.setPassword(new String(passwordField.getPassword()));
                JOptionPane.showMessageDialog(null, "Configuración guardada");
            }
        });

        showConfigButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ConfigViewFrame();
            }
        });
    }

    public static void main(String[] args) {
        MainFrame frame = new MainFrame();
        frame.setVisible(true);
    }
}
