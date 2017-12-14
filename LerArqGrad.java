
import java.util.Scanner;

public class LerArqGrad extends ItemMenu {

    @Override
    public String getDescricao() {
        return "4. Ler arquivo com listagem de alunos de graduação";
    }

    @Override
    public boolean executar() {

        String arquivo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o nome do arquivo:");
        arquivo = sc.next();

        Listagem a = new ListagemImplement();

        a.LerAqrGrad(arquivo);

        return false;

    }
}
