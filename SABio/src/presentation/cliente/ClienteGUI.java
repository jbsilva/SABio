package presentation.cliente;

import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;

public class ClienteGUI extends SingleFrameApplication {

    @Override protected void startup() {
        show(new ClienteView(this));
    }

    @Override protected void configureWindow(java.awt.Window root) {
    }

    public static ClienteGUI getApplication() {
        ClienteGUI app = Application.getInstance(ClienteGUI.class);
        return app;
    }

    public static void main(String[] args) {
        launch(ClienteGUI.class, args);
    }
}
