

public class Filme
{
    private int codigo;
    private String titulo;
    private int genero;
    private int copias;
    
    public Filme(int codigo, int genero, String titulo, int copias)
    {
        this.codigo = codigo;
        this.genero = genero;
        this.titulo = titulo;
        this.copias = copias;
    }
    
    public void emprestaCopia(){
        copias--;
    }
    
    public void devolveCopia(){
        copias++;
    }
    
    public int getCodigo(){
        return codigo;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public int getCopias(){
        return copias;
    }
    
    public int getGenero(){
        return genero;
    }
}
