package sabio;

import sabio.impl.*;
import sabio.spec.*;

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
    
    public IAvaliacaoFisica getAvaliacaoFisica() {
        return new AvaliacaoFisica();
    }
}
