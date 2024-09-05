package br.com.exercicio.musicas.modelos;

public class Audio {
    private String titulo;
    private float duracao;
    private int toltalrepro;

    private int curtidas;

    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getDuracao() {
        return duracao;
    }

    public void setDuracao(float duracao) {
        this.duracao = duracao;
    }

    public int getToltalrepro() {
        return toltalrepro;
    }

    public void reproduzir() {
        this.toltalrepro++;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void curtir() {
        this.curtidas++;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao() {
        this.classificacao = classificacao;
    }
}
