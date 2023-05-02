package JAVAOO.IamNatri.com.github.OODataStructures.Audiofill.modelos;

public class Podcast extends Audio {
    private String apresentador;
    private String descricao;

    public Podcast(String titulo, double duracao, String apresentador, String descricao) {
        super(titulo, duracao);
        this.apresentador = apresentador;
        this.descricao = descricao;
    }

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    @Override
    public double getClassificacao(){
        if(this.getTotalCurtidas() > 500){
            return 10;
        }else{
            return 8;
        }
    }
}