

public class Emprestimo
{
    private int numero;
    private Socio socio;
    private Filme filme;
    
    public Emprestimo(int numero, Socio socio, Filme filme)
    {
        this.numero = numero;
        this.socio = socio;
        this.filme = filme;
    }
    
    public void encerra(){
        socio.devolveFilme();
        filme.devolveCopia();
    }
    
    public int getNumero(){
        return numero;
    }
    
    public Socio getSocio(){
        return socio;
    }
    
    public Filme getFilme(){
        return filme;
    }
}
