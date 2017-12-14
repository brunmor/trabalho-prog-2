
public class PosGraduacao extends Aluno {

    private String nomeOri, sobrenomeOri;
    private float notaProf;

    public PosGraduacao(String nome, String sobrenome, String curso, int rga, int anoIngresso, String nomeOri, String sobrenomeOri, float notaProf) {
        super(nome, sobrenome, curso, rga, anoIngresso);
        this.nomeOri = nomeOri;
        this.sobrenomeOri = sobrenomeOri;
        this.notaProf = notaProf;
    }

    public String getNomeOri() {
        return nomeOri;
    }

    public void setNomeOri(String nomeOri) {
        this.nomeOri = nomeOri;
    }

    public String getSobrenomeOri() {
        return sobrenomeOri;
    }

    public void setSobrenomeOri(String sobrenomeOri) {
        this.sobrenomeOri = sobrenomeOri;
    }

    public float getNotaProf() {
        return notaProf;
    }

    public void setNotaProf(float notaProf) {
        this.notaProf = notaProf;
    }

    public String toString() {
        return this.getNome() + " " + this.getSobrenome() + " " + this.getCurso() + " " + this.getRga() + " " + this.getAnoIngresso() + " " + this.getNomeOri() + " " + this.getSobrenomeOri() + " " + this.getNotaProf();
    }

}
