public class Socio
{
    private int numero;
    private String nome;
    private int emprestimos;
    
    public Socio(int numero, String nome)
    {
        this.numero = numero;
        emprestimos = 0;
        this.nome = nome;
    }
    
    public void retiraFilme(){
        emprestimos++;
    }
    
    public void devolveFilme(){
        emprestimos--;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getEmprestimos(){
        return emprestimos;
    }
}
