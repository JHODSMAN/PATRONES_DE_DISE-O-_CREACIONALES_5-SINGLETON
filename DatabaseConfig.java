public class DatabaseConfig {
    private static DatabaseConfig instance;
    private String host;
    private String port;
    private String username;
    private String password;

    // Constructor privado
    private DatabaseConfig() {
        // Valores predeterminados
        this.host = "localhost";
        this.port = "3306";
        this.username = "root";
        this.password = "";
    }

    // Método para obtener la única instancia
    public static DatabaseConfig getInstance() {
        if (instance == null) {
            instance = new DatabaseConfig();
        }
        return instance;
    }

    // Getters y Setters
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
