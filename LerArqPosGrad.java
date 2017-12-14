
import java.util.Scanner;

public class LerArqPosGrad extends ItemMenu {

    @Override
    public String getDescricao() {
        return "5. Ler arquivo com listagem de alunos de pós-graduação";
    }

    @Override
    public boolean executar() {
        String arquivo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o nome do arquivo:");
        arquivo = sc.next();

        Listagem a = new ListagemImplement();

        a.LerAqrPosGrad(arquivo);

        return false;

    }
}
