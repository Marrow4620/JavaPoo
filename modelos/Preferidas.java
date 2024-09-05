package br.com.exercicio.musicas.modelos;

public class Preferidas {
    public void inclui(Audio audio){
        if(audio.getClassificacao() > 9) {
            System.out.println(audio.getTitulo()+ "é bom ");
        }else {
            System.out.println(audio.getTitulo()+ "é meio meh ");
        }
    }
}
