public class DVD extends Midia{

    private int numFaixas;

    public DVD(int codigo, double preco, String nome, int numFaixas){
        super(codigo, preco, nome);
        this.numFaixas = numFaixas;

    }
    @Override
    public String getTipo(){
        return "Tipo: DVD ";
    }

    @Override
    public String getDetalhes(){
        return" Nome: "+nome + " Código: "+codigo+" Preço: "+preco+" Numero de faixas "+numFaixas ;
    }
    public void setNumFaixas(int numFaixas) {
        this.numFaixas = numFaixas;
    }
    @Override
    public void inserirDados(Midia midia){
        System.out.print("Insira os dados\nNome:");
        midia.nome = sca.nextLine();
        System.out.print("\nPreço:");
        midia.preco = sca.nextDouble();
        System.out.print("\nCodigo:");
        midia.codigo = sca.nextInt();
        System.out.print("\nCNumero de faixas:");
        numFaixas = sca.nextInt();

    }
    
}
