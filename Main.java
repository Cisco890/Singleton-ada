public class Main {
    public static void main(String[] args) {
        // Obtener la instancia de AppConfig
        AppConfig config = AppConfig.getInstance();

        // Establecer la configuración
        config.setServerUrl("http://miapi.com");
        config.setPort(8080);

        // Obtener la configuración
        System.out.println("URL del Servidor: " + config.getServerUrl());
        System.out.println("Puerto: " + config.getPort());
    }
}