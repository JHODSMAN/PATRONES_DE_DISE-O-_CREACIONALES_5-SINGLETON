import javax.swing.*;

public class ConfigViewFrame extends JFrame {
    public ConfigViewFrame() {
        setTitle("Configuración Actual");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        DatabaseConfig config = DatabaseConfig.getInstance();

        JLabel hostLabel = new JLabel("Host: " + config.getHost());
        JLabel portLabel = new JLabel("Puerto: " + config.getPort());
        JLabel userLabel = new JLabel("Usuario: " + config.getUsername());
        JLabel passwordLabel = new JLabel("Contraseña: " + config.getPassword());

        add(hostLabel);
        add(portLabel);
        add(userLabel);
        add(passwordLabel);

        setVisible(true);
    }
}
