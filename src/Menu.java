import java.util.Scanner;

public class Menu {
    

    Scanner sca = new Scanner(System.in);
    private int escolha;
    Midia m = new Midia(0, 0, null);

    DVD dvd = new DVD(0, 0, null, 0);

    CD cd = new CD(0, 0, null, 0);

    public void menu(int escolha) {

       
        this.escolha = escolha;
        boolean sla = true;

        while (sla == true) {
            System.out.println("Que tipo de produto você quer inserir???\n1.Midia\n2.DVD\n3.CD ");
            escolha = sca.nextInt();
            switch (escolha) {
                case 1:
                    m.inserirDados(m);
                    m.printDados();
                    sla = false;
                    repet(0);
                    break;
                case 2:
                    dvd.inserirDados(dvd);
                    dvd.printDados();
                    sla = false;
                    repet(0);
                    break;
                case 3:
                    cd.inserirDados(cd);
                    cd.printDados();
                    sla = false;
                    repet(0);
                    break;

                default:
                    System.out.println("Informe um valor correspondente");
                    break;
            }
        }

    }
            public void repet(int escolha){
            
            this.escolha = escolha;
            System.out.println("Deseja inserir outro produto ?\n1.Sim\n2.Não");
            escolha = sca.nextInt();
            if(escolha == 1){
                menu(0);
            }else{
                System.exit(0);
            }
    
        }

}
