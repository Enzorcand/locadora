public class Socio
{
    private int numero;
    private String nome;
    private int emprestimos;
    
    public Socio(int numero, int emprestimos, String nome)
    {
        this.numero = numero;
        this.emprestimos = emprestimos;
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
