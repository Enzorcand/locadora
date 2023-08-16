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
    private Emprestimo[] emprestimos;
    
    private int pFilmes;
    private int pSocios;
    private int pEmprestimos;
    
    public FilialDaLocadora(int nFilial, int x, int y, int z)
    {
        this.nFilial = nFilial;
        this.pFilmes = 0;
        this.pSocios = 0;
        this.pEmprestimos = 0;
        
        this.lastFilme = 0;
        this.lastSocio = 0;
        this.lastEmprestimo = 0;
        
        filmes = new Filme[x];
        socios = new Socio[y];
        emprestimos = new Emprestimo[z];
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
    
    public boolean devolveEmprestimo(int n){
        Emprestimo emprestimo = buscaEmprestimo(n);
        if(emprestimo == null){
            return false;
        }
        emprestimo.encerra();
        System.out.println("Devolução concluida");
        return true;
    }
    
    public Emprestimo buscaEmprestimo(int n){
        for(int i = 0; i < pEmprestimos; i++){
            if(emprestimos[i].getNumero() == n){
                return emprestimos[i];
            }
        }
        System.out.println("Emprestimo não encontrado.");
        return null;
    }
    
    public Socio buscaSocio(int n){
        for(int i = 0; i < pSocios; i++){
            if(socios[i].getNumero() == n){
                System.out.println("Sócio encontrado: " + socios[i].getNome());
                return socios[i];
            }
        }
        System.out.println("Sócio não encontrado");
        return null;
    }
    
    public Filme buscaFilme(String t){
        for(int i = 0; i > filmes.length; i++){
                if(filmes[i].getTitulo().equals(t)){
                    return filmes[i];
                }
            }
        return null;
    }
}


