package vo;

import java.util.Calendar;

public class AtendenteVO extends ObjectVO {
    
    private UsuarioVO usuario;
    private String nome;
    private String cpf;
    private String rg;
    private String endereco;
    private String numero_carteira_trabalho;
    Calendar data_contratacao;
    
    
    public AtendenteVO()
    {
        super();
    }
    
     public AtendenteVO(UsuarioVO usuario, String nome, String cpf, String rg, String endereco,
             String numero_carteira_trabalho, Calendar data_contratacao)
    {
        super();
        this.usuario = usuario;
        this.nome = nome;
        this.cpf = cpf;
        this.data_contratacao = data_contratacao;
        this.rg = rg;
        this.endereco = endereco;
        this.numero_carteira_trabalho = numero_carteira_trabalho;
    }

    //String ou UsuarioVO?
    public UsuarioVO getUsuario() {
        return this.usuario;
    }

    public void setUsuario(UsuarioVO usuario) {
        this.usuario = usuario;
    }

    public String getNome()
    {
        return this.nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getCPF()
    {
        return this.cpf;
    }

    public void setCPF(String cpf)
    {
        this.cpf = cpf;
    }

    public Calendar getDataContratacao()
    {
        return this.data_contratacao;
    }
    
    public void setDataContratacao(Calendar data_contratacao)
    {
        this.data_contratacao = data_contratacao;
    }

    public String getRG()
    {
        return this.rg;
    }

    public void setRG(String rg)
    {
        this.rg = rg;
    }

    public String getEndereco()
    {
        return this.endereco;
    }

    public void setEndereco(String endereco)
    {
        this.endereco = endereco;
    }

    public String getNumeroCarteiraTrabalho()
    {
        return this.numero_carteira_trabalho;
    }

    public void setNumeroCarteiraTrabalho(String numero_carteira_trabalho)
    {
        this.numero_carteira_trabalho = numero_carteira_trabalho;
    }

    @Override
    public String toString()
    {
        StringBuilder buffer = new StringBuilder();
        buffer.append("[");
        buffer.append("Nome = ");
        buffer.append(this.getNome());
        buffer.append(", cpf = ");
        buffer.append(this.getCPF());
        buffer.append(", data de contratacao = ");
        buffer.append(this.getDataContratacao());
        buffer.append(", login = ");
        buffer.append(this.getUsuario());
        buffer.append(", RG = ");
        buffer.append(this.getRG());
        buffer.append(", Endereco = ");
        buffer.append(this.getEndereco());
        buffer.append(", Carteira de Trabalho = ");
        buffer.append(this.getNumeroCarteiraTrabalho());
        buffer.append("]");
        return buffer.toString();
    }
}