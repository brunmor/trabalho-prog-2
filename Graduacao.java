
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Graduacao extends Aluno {

    private float media;

    public Graduacao(float media, String nome, String sobrenome, String curso, int rga, int anoIngresso) {
        super(nome, sobrenome, curso, rga, anoIngresso);
        this.media = media;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    @Override
    public String toString() {
        return this.getNome() + " " + this.getSobrenome() + " " + this.getCurso() + " " + this.getRga() + " " + this.getAnoIngresso() + " " + this.getMedia();
    }

}
