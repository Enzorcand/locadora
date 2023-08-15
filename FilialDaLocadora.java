import java.util.Scanner;

public class FilialDaLocadora
{
    private final String[] tab_genero = 
    {"Drama","Comédia","Clássico",
    "Terror","Western","Aventura",
    "Infantil","Guerra","Outros"};
    
    private int nFilial;
    
    private int lastEmprestimo;
    private int lastSocio;
    private int lastFilme;
    
    private Filme[] filmes;
    private Socio[] socios;
    private Emprestimo[] emprestimo;
    
    private int pFilmes;
    private int pSocios;
    private int pEmprestimos;
    
    public FilialDaLocadora(int nFilial, int pFilmes, int pSocios, int pEmprestimos)
    {
        this.nFilial = nFilial;
        this.pFilmes = pFilmes;
        this.pSocios = pSocios;
        this.pEmprestimos = pEmprestimos;
    }
    
    public boolean adquireFilme(String t, int g, int n){
        if(filmes.length == pFilmes){
            System.out.println("Acervo cheio!");
            return false;
        }else {
        
            for(int i = 0; i > filmes.length; i++){
                if(filmes[i].getTitulo().equals(t)){
                    System.out.println("Este filme já existe no catálogo!");
                    return false;
                }
            }
        
            int i = 0;
            while(filmes[i] != null){
            i++;
            }
            filmes[i] = new Filme(lastFilme + 1, g, t, n);
            lastFilme++;
            pFilmes++;
            return true;
        }
    }
    
    public boolean cadastraCliente(){
        if(socios.length == pSocios){
            System.out.println("Sem vagas para novos sócios!");
            return false;
        } else {
            int i = 0;
            while(socios[i] != null){
                i++;
            }
            Scanner scan = new Scanner(System.in);
            String nome = scan.nextLine();
            socios[i] = new Socio(lastSocio + 1, nome);
            System.out.println("Número do cliente: " + (lastSocio + 1));
            scan.close();
            
            lastSocio++;
            pSocios++;
            
            
            return true;
        }
    }
}

