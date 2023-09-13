public class CD extends Midia{

    private int numMusica;

    public CD(int codigo, double preco, String nome, int numMusica){
        super(codigo, preco, nome);
        this.numMusica = numMusica;

    }
    @Override
    public String getTipo(){
        return "Tipo: CD ";
    }

    @Override
    public String getDetalhes(){
        return" Nome: "+nome + " Código: "+codigo+" Preço: "+preco+" Numero de Musicas "+numMusica ;
    }
    public void setNumFaixas(int numMusica) {
        this.numMusica = numMusica;
    }
    @Override
    public void inserirDados(Midia midia){
        System.out.print("Insira os dados\nNome:");
        midia.nome = sca.nextLine();
        System.out.print("\nPreço:");
        midia.preco = sca.nextDouble();
        System.out.print("\nCodigo:");
        midia.codigo = sca.nextInt();
        System.out.print("\nCNumero de musicas:");
        numMusica = sca.nextInt();

    }
    
}
