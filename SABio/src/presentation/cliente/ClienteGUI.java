/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;

/**
 *
 * @author Andre
 */
public class ClienteGUI extends SingleFrameApplication {

    @Override protected void startup() {
        show(new Clientview(this));
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
