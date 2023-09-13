import java.util.Scanner;

public class Midia {
    
    Scanner sca = new Scanner (System.in);

    protected int codigo;
    protected double preco;
    protected String nome;

    public Midia(int codigo, double preco, String nome){
        this.codigo = codigo;
        this.preco = preco;
        this.nome = nome;
        
    }
    public String getTipo(){
        return "Tipo: Midia ";
    }

    public String getDetalhes(){
        return" Nome: "+nome + " Código: "+codigo+" Preço: "+preco  ;
    }
    void printDados(){
        System.out.println(getTipo() + getDetalhes());
    }

    public void inserirDados(Midia midia){
        System.out.print("Insira os dados\nNome:");
        midia.nome = sca.nextLine();
        System.out.print("\nPreço:");
        midia.preco = sca.nextDouble();
        System.out.print("\nCodigo:");
        midia.codigo = sca.nextInt();

        
       
    }


}
