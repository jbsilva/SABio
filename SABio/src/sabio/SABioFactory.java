package sabio;

import sabio.impl.Cliente;
import sabio.impl.Instrutor;
import sabio.impl.Treino;
import sabio.impl.Usuario;
import sabio.spec.ICliente;
import sabio.spec.IInstrutor;
import sabio.spec.ITreino;
import sabio.spec.IUsuario;

public class SABioFactory {

    private static SABioFactory instance = null;

    private SABioFactory() {
    }

    public static SABioFactory getInstance() {
        if (instance == null) {
            instance = new SABioFactory();
        }
        return instance;
    }

    public IUsuario getUsuario() {
        return new Usuario();
    }
    
    public IInstrutor getInstrutor() {
        return new Instrutor();
    }
        
    public ICliente getCliente() {
        return new Cliente();
    }
}
