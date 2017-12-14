
import java.util.Scanner;

public class CadastrarAlunoGrad extends ItemMenu {

    @Override
    public String getDescricao() {
        return "1. Cadastrar aluno de graduação";
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

        System.out.println("Média: ");
        float media = sc.nextFloat();

        System.out.println("Dados cadastrados com sucesso!!!\n");

        Graduacao novoAluno = new Graduacao(media, nome, sobrenome, curso, rga, ingresso);

        Listagem insere = new ListagemImplement();
        insere.inserirGrad(novoAluno);

        return false;

    }
}
