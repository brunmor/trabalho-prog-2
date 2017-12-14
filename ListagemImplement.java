
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ListagemImplement implements Listagem {

    private static ArrayList<Aluno> dados = new ArrayList<Aluno>();

    public void inserirGrad(Graduacao aluno) {
        dados.add(aluno);
    }

    public void inserirPosGrad(PosGraduacao aluno) {
        dados.add(aluno);
    }

    //Procura no vetor alunos com o mesmo nome e imprime suas informacoes
    @Override
    public void pesquisar(String nomeBusca) {
        boolean existe = false;
        for (Aluno aluno : dados) {
            if (aluno.getNome().equals(nomeBusca)) {
                System.out.println(aluno.getNome() + " " + aluno.getSobrenome() + " " + aluno.getCurso());
                existe = true;
            }
        }
        if (existe == false) {
            System.out.println("Aluno nao cadastrado! \n");
        }
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
    }

    //Gera arquivo com os dados dos alunos de graduacao cadastrados
    @Override
    public void gerarArquivoGrad(String arquivo) {
        ordenar();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo))) {
            for (Aluno grad : dados) {
                if (grad.getClass().equals(Graduacao.class)) {
                    bw.write(grad + "\n");
                } 
            }
            System.out.println("Arquivo gerado com sucesso!\n");
           bw.close();
        }  catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void gerarArquivoPosGrad(String arquivo) {

        ordenar();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo))) {
            for (Aluno pos : dados) {
                
                if (pos.getClass().equals(PosGraduacao.class)) {
                    bw.write(pos + "\n");
                } 
                System.out.println("Arquivo gerado com sucesso!\n");
                
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Le dados de alunos de graduacao do arquivo e guarda no vetor
    public void LerAqrGrad(String arquivo) {
        Scanner input;
        try {
            input = new Scanner(new File(arquivo));

            while (input.hasNext()) {
                String nome = input.next();
                String sobrenome = input.next();
                String curso = input.next();
                int ingresso = input.nextInt();
                int rga = input.nextInt();
                float media = input.nextFloat();

                Aluno aluno = new Graduacao(media, nome, sobrenome, curso, ingresso, rga);
                dados.add(aluno);
            }
            System.out.println("Dados salvos com sucesso!\n");

        } catch (FileNotFoundException ex) {
            System.out.println("Arquivo nao encontrado!\n");
        }
    }

    //Le dados de alunos de pos graduacao do arquivo e guarda no vetor
    public void LerAqrPosGrad(String arquivo) {
        Scanner input;
        try {
            input = new Scanner(new File(arquivo));

            while (input.hasNext()) {
                String nome = input.next();
                String sobrenome = input.next();
                String curso = input.next();
                int rga = input.nextInt();
                int ingresso = input.nextInt();
                String nomeOri = input.next();
                String sobrenomeOri = input.next();
                float notaProf = input.nextFloat();

                Aluno alunoPos = new PosGraduacao(nome, sobrenome, curso, rga, ingresso, nomeOri, sobrenomeOri, notaProf);
                dados.add(alunoPos);

            }
            System.out.println("Dados salvos com sucesso!");

        } catch (FileNotFoundException ex) {
            System.out.println("arquivo nao encontardo");
        }

    }

    //Ordena os alunos pelo Rga em ordem crescente com o Selection Sort
    public void ordenar() {
        for (int i = 0; i < dados.size() - 1; i++) {
            int m = i;
            for (int j = i + 1; j < dados.size(); j++) {
                if (dados.get(m).getRga() > dados.get(j).getRga()) {
                    m = j;
                }
            }
            Aluno temp = dados.get(i);
            dados.set(i, dados.get(m));
            dados.set(m, temp);
        }

    }
}
