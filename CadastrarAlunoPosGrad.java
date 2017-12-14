
import java.util.Scanner;

public class CadastrarAlunoPosGrad extends ItemMenu {

    /* cria um novo aluno de graduação contendo os dados fornecidos
como entrada pelo usuário;*/
    @Override
    public String getDescricao() {
        return "2. Cadastrar aluno de pós-graduação";
    }

    public boolean executar() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = sc.next();

        System.out.println("Sobrenome: ");
        String sobrenome = sc.next();

        System.out.println("Curso: ");
        String curso = sc.next();

        System.out.println("Rga: ");
        int rga = sc.nextInt();

        System.out.println("Ano de Ingresso: ");
        int ingresso = sc.nextInt();

        System.out.println("Nome do Orientador: ");
        String nomeOri = sc.next();

        System.out.println("Sobrenome do Orientador: ");
        String sobrenomeOri = sc.next();

        System.out.println("Nota no exame de proficiência em língua estrangeira: ");
        float notaProf = sc.nextFloat();

        System.out.println("Dados cadastrados com sucesso!!!\n");

        PosGraduacao novoAluno = new PosGraduacao(nome, sobrenome, curso, rga, ingresso, nomeOri, sobrenomeOri, notaProf);

        Listagem insere = new ListagemImplement();
        insere.inserirPosGrad(novoAluno);

        return false;

    }

}
