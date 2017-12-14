
import java.util.Scanner;

public class GerarArqPosGrad extends ItemMenu {

    @Override
    public String getDescricao() {
        return "7. Gerar arquivo com dados dos alunos de pós-graduação cadastrados, ordenado em ordem crescente\n"
                + "de RGA";
    }

    public boolean executar() {

        Scanner sc = new Scanner(System.in);
        String arquivo;
        System.out.println("Informe o nome do arquivo destino: ");
        arquivo = sc.nextLine();
        Listagem a = new ListagemImplement();
        a.gerarArquivoPosGrad(arquivo);

        return false;

    }
}
