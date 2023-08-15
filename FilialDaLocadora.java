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
        boolean exist = false;
        for(int i = 0; i > filmes.length; i++){
            if(filmes[i].getTitulo().equals(t)){
                exist = true;
            }
        }
        if(exist){
            System.out.println();
            return false;
        } else {
            int i = 0;
            while(filmes[i] != null){
                i++;
            }
            Filme filme = new Filme(lastFilme + 1, g, t, n);
            lastFilme++;
            return true;
        }
    }
}
