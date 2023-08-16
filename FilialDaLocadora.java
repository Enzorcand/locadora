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
    
    public FilialDaLocadora(int nFilial, int x, int y, int z)
    {
        this.nFilial = nFilial;
        pFilmes = 0;
        pSocios = 0;
        pEmprestimos = 0;
        
        lastEmprestimo = 0;
        lastSocio = 0;
        lastFilme = 0;
        
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
    
    public boolean cadastraNovoSocio(){
        if(socios.length == pSocios){
            System.out.println("Sem vagas para novos sócios!");
            return false;
        } else {
            int i = 0;
            while(socios[i] != null){
                i++;
            }
            Scanner scan = new Scanner(System.in);
            System.out.println("Insira o nome do cliente: ");
            String nome = scan.nextLine();
            socios[i] = new Socio(lastSocio + 1, nome);
            System.out.println("Código do cliente: " + (lastSocio + 1));
            scan.close();
            
            lastSocio++;
            pSocios++;
            
            return true;
        }
    }
    
    public void fazEmpréstimo(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o número do sócio: ");
        int entrada = scan.nextInt();
        if(socios[entrada] == null){
            System.out.println("Sócio não cadastrado.");
            return;
        }
        if(socios[entrada].getEmprestimos() == 2){
            System.out.println("Sócio não cadastrado.");
            return;
        }
        System.out.println("Insira o titulo da obra: ");
        String titulo = scan.nextLine();
        
        int filme;
        boolean exist = false;
        for(int i = 0; i < lastFilme; i++){
            if(filmes[i].getTitulo().equals(titulo)){
                exist = true;
                break;
            }
        }
        
        if(!exist){
            System.out.println("Filme não encontrado.");
            return;
        }
            
        emprestimos[pEmprestimo + 1] = new Emprestimo();
        
        scan.close();
    }
}

