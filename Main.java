
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ItemMenu a = new CadastrarAlunoGrad();
        ItemMenu b = new CadastrarAlunoPosGrad();
        ItemMenu c = new BuscarAluno();
        ItemMenu d = new LerArqGrad();
        ItemMenu e = new LerArqPosGrad();
        ItemMenu f = new GerarArqGrad();
        ItemMenu g = new GerarArqPosGrad();
        ItemMenu h = new FecharPrograma();

        System.out.println(a.getDescricao() + "\n" + b.getDescricao() + "\n" + c.getDescricao() + "\n"
                + d.getDescricao() + "\n" + e.getDescricao() + "\n" + f.getDescricao() + "\n" + g.getDescricao() + "\n" + h.getDescricao());
        
        
        boolean fecharPrograma = false;

        do {

            int opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    fecharPrograma = a.executar();
                    System.out.println(a.getDescricao() + "\n" + b.getDescricao() + "\n" + c.getDescricao() + "\n"
                            + d.getDescricao() + "\n" + e.getDescricao() + "\n" + f.getDescricao() + "\n" + g.getDescricao() + "\n" + h.getDescricao());
                    break;
                case 2:
                    fecharPrograma = b.executar();
                    System.out.println(a.getDescricao() + "\n" + b.getDescricao() + "\n" + c.getDescricao() + "\n"
                            + d.getDescricao() + "\n" + e.getDescricao() + "\n" + f.getDescricao() + "\n" + g.getDescricao() + "\n" + h.getDescricao());
                    break;
                case 3:
                    fecharPrograma = c.executar();
                    System.out.println(a.getDescricao() + "\n" + b.getDescricao() + "\n" + c.getDescricao() + "\n"
                            + d.getDescricao() + "\n" + e.getDescricao() + "\n" + f.getDescricao() + "\n" + g.getDescricao() + "\n" + h.getDescricao());
                    break;
                case 4:
                    fecharPrograma = d.executar();
                    System.out.println(a.getDescricao() + "\n" + b.getDescricao() + "\n" + c.getDescricao() + "\n"
                            + d.getDescricao() + "\n" + e.getDescricao() + "\n" + f.getDescricao() + "\n" + g.getDescricao() + "\n" + h.getDescricao());
                    break;
                case 5:
                    fecharPrograma = e.executar();
                    System.out.println(a.getDescricao() + "\n" + b.getDescricao() + "\n" + c.getDescricao() + "\n"
                            + d.getDescricao() + "\n" + e.getDescricao() + "\n" + f.getDescricao() + "\n" + g.getDescricao() + "\n" + h.getDescricao());
                    break;
                case 6:
                    fecharPrograma = f.executar();
                    System.out.println(a.getDescricao() + "\n" + b.getDescricao() + "\n" + c.getDescricao() + "\n"
                            + d.getDescricao() + "\n" + e.getDescricao() + "\n" + f.getDescricao() + "\n" + g.getDescricao() + "\n" + h.getDescricao());
                    break;
                case 7:
                    fecharPrograma = g.executar();
                    System.out.println(a.getDescricao() + "\n" + b.getDescricao() + "\n" + c.getDescricao() + "\n"
                            + d.getDescricao() + "\n" + e.getDescricao() + "\n" + f.getDescricao() + "\n" + g.getDescricao() + "\n" + h.getDescricao());
                    break;
                case 8:
                    fecharPrograma = h.executar();
                    System.out.println(a.getDescricao() + "\n" + b.getDescricao() + "\n" + c.getDescricao() + "\n"
                            + d.getDescricao() + "\n" + e.getDescricao() + "\n" + f.getDescricao() + "\n" + g.getDescricao() + "\n" + h.getDescricao());
                    break;
            }

        } while (!fecharPrograma);

    }

}
