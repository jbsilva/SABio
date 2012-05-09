package vo;

import java.util.Calendar;

public class ClienteVO extends ObjectVO {
  
    
    private String usuario;
    private String nome_cliente;
    private String cpf;
    private String rg;
    private String telefone;
    private String atestado_medico;
    Calendar data_ingresso;
    Calendar data_nascimento;
    Boolean status;
    private String mensalidades_abertas;
    
    
    public ClienteVO()
    {
        super();
    }
    
     public ClienteVO(String usuario, String nome_cliente, String cpf, String rg, String telefone,
             String atestado_medico, Calendar data_ingresso, String mensalidades_abertas, Calendar data_nascimento,
             Boolean status)
    {
        super();
        this.usuario = usuario;
        this.nome_cliente = nome_cliente;
        this.cpf = cpf;
        this.data_ingresso = data_ingresso;
        this.rg = rg;
        this.telefone = telefone;
        this.atestado_medico = atestado_medico;
        this.mensalidades_abertas = mensalidades_abertas;
        this.data_nascimento = data_nascimento;
        this.status = status;
        
        
    }

    //String ou UsuarioVO?
    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNomeCliente()
    {
        return this.nome_cliente;
    }

    public void setNomeCliente(String nome_cliente)
    {
        this.nome_cliente = nome_cliente;
    }

    public String getCPF()
    {
        return this.cpf;
    }

    public void setCPF(String cpf)
    {
        this.cpf = cpf;
    }

    public Calendar getDataIngresso()
    {
        return this.data_ingresso;
    }
    
    public void setDataIngresso(Calendar data_ingresso)
    {
        this.data_ingresso = data_ingresso;
    }

    public String getRG()
    {
        return this.rg;
    }

    public void setRG(String rg)
    {
        this.rg = rg;
    }

    public String getTelefone()
    {
        return this.telefone;
    }

    public void setTelefone(String telefone)
    {
        this.telefone = telefone;
    }

    public String getAtestadoMedico()
    {
        return this.atestado_medico;
    }

    public void setAtestadoMedico(String atestado_medico)
    {
        this.atestado_medico = atestado_medico;
    }
    
    public Boolean getStatus()
    {
        return this.status;
    }

    public void setStatus(Boolean status)
    {
        this.status = status;
    }
    
    public Calendar getDataNascimento()
    {
        return this.data_nascimento;
    }

    public void setDataNascimento(Calendar data_nascimento)
    {
        this.data_nascimento = data_nascimento;
        
    }

    public String getMensalidadesAbertas()
    {
        return this.mensalidades_abertas;
    }

    public void setMensalidadesAbertas(String mensalidades_abertas)
    {
        this.mensalidades_abertas = mensalidades_abertas;
    }
    
    @Override
    public String toString()
    {
        StringBuilder buffer = new StringBuilder();
        buffer.append("[");
        buffer.append("NomeCliente = ");
        buffer.append(this.getNomeCliente());
        buffer.append(", cpf = ");
        buffer.append(this.getCPF());
        buffer.append(", data de contratacao = ");
        buffer.append(this.getDataIngresso());
        buffer.append(", login = ");
        buffer.append(this.getUsuario());
        buffer.append(", RG = ");
        buffer.append(this.getRG());
        buffer.append(", Telefone = ");
        buffer.append(this.getTelefone());
        buffer.append(", Carteira de Trabalho = ");
        buffer.append(this.getAtestadoMedico());
        buffer.append("]");
        return buffer.toString();
    }
}
