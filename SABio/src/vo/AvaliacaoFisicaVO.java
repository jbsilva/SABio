package vo;

import java.util.Calendar;

public class AvaliacaoFisicaVO extends ObjectVO {
    
    
    private ClienteVO cliente;
    private InstrutorVO instrutor;
    private int id;
    Calendar data_realizacao;
    private String observacoes;
    

    public AvaliacaoFisicaVO()
    {
        super();
    }

    public AvaliacaoFisicaVO(ClienteVO cliente, InstrutorVO instrutor, int id,
            Calendar data_realizacao, String observacoes)
    {
        super();
        this.cliente = cliente;
        this.instrutor = instrutor;
        this.id = id;
        this.data_realizacao = data_realizacao;
        this.observacoes = observacoes;
    }

    //String ou ClienteVO?
    public ClienteVO getCliente() {
        return this.cliente;
    }

    public void setCliente(ClienteVO cliente) {
        this.cliente = cliente;
    }

    public InstrutorVO getInstrutor() {
        return this.instrutor;
    }
    
    public void setInstrutor(InstrutorVO instrutor){
        this.instrutor = instrutor;
    }

    public int getID()
    {
        return this.id;
    }

    public void setID(int id)
    {
        this.id = id;
    }

    public Calendar getDataRealizacao()
    {
        return this.data_realizacao;
    }
    
    public void setDataRealizacao(Calendar data_realizacao)
    {
        this.data_realizacao = data_realizacao;
    }

    public String getObservacoes()
    {
        return this.observacoes;
    }

    public void setObservacoes(String observacoes)
    {
        this.observacoes = observacoes;
    }

}
