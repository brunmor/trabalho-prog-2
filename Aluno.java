
public abstract class Aluno {

    private String nome, sobrenome, curso;
    private int rga, anoIngresso;

    public Aluno(String nome, String sobrenome, String curso, int rga, int anoIngresso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.curso = curso;
        this.rga = rga;
        this.anoIngresso = anoIngresso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getRga() {
        return rga;
    }

    public void setRga(int rga) {
        this.rga = rga;
    }

    public int getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

}
