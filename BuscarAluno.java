
import java.util.Scanner;

//NAO PEGA TODOS OS MESMOS NOMES
public class BuscarAluno extends ItemMenu {

    @Override
    public String getDescricao() {
        return "3. Buscar aluno";
    }

    public boolean executar() {

        Scanner sc = new Scanner(System.in);

        String nomeBusca;
        System.out.println("Nome de busca: \n");
        nomeBusca = sc.next();

        Listagem pesq = new ListagemImplement();

        pesq.pesquisar(nomeBusca);

        return false;

    }
}
