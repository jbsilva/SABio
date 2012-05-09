package vo;

public class ExercicioVO extends ObjectVO {
  
    private TreinoVO treino;
    private int carga;
    private String exercicio;
    private int numero_de_series;


    public ExercicioVO()
    {
        super();
    }

    public ExercicioVO(TreinoVO treino, int carga, String exercicio,
            int numero_de_series)
    {
        super();
        this.treino = treino;
        this.carga = carga;
        this.exercicio = exercicio;
        this.numero_de_series = numero_de_series;
    }

    //String ou TreinoVO?
    public TreinoVO getTreino() {
        return this.treino;
    }

    public void setTreino(TreinoVO treino) {
        this.treino = treino;
    }

    public int getCarga()
    {
        return this.carga;
    }

    public void setCarga(int carga)
    {
        this.carga = carga;
    }

    public String getExercicio()
    {
        return this.exercicio;
    }

    public void setExercicio(String exercicio)
    {
        this.exercicio = exercicio;
    }


    public int getNumeroDeSeries()
    {
        return this.numero_de_series;
    }

    public void setNumeroDeSeries(int numero_de_series)
    {
        this.numero_de_series = numero_de_series;
    }

}
