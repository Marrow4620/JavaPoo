package br.com.exercicio.musicas;

import br.com.exercicio.musicas.modelos.Musica;
import br.com.exercicio.musicas.modelos.Podcast;
import br.com.exercicio.musicas.modelos.Preferidas;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Forever ");
        minhaMusica.setArtista("Kiss");

        for (int i = 0; i < 50; i++) {
            minhaMusica.curtir();

        }
        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduzir();
        }
        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("origem ");
        meuPodcast.setHost("Vitor");

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curtir();

        }
        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduzir();
        }
        Preferidas minha = new Preferidas();
        minha.inclui(meuPodcast);
        minha.inclui(minhaMusica);
    }
}