
import java.util.ArrayList;


public interface Listagem {

    void pesquisar(String nomeBusca);
    
    void inserirGrad(Graduacao aluno);
    
    void inserirPosGrad(PosGraduacao aluno); 
    
    void gerarArquivoGrad(String arquivoDestino);
    
    void gerarArquivoPosGrad(String arquivoDestino);
        
    void LerAqrGrad(String arquivo);
    
    void LerAqrPosGrad(String arquivo);
    
    void ordenar();




    
    


    
    
}
