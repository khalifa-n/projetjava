package Views;


import java.util.List;
import java.util.Scanner;
import java.util.Set;

import Models.Commande;
import Services.PaiementService;
import dao.Data;



public class App {
 
    
    public App() {
   
    }

   
    public static void main(String[] args) throws Exception {
        Data data= new Data();
        PaiementService service= new PaiementService();
        service.setDate(data);
        Scanner sc= new Scanner(System.in);
        int ch;
        do {
            
            ch=sc.nextInt();
            switch (ch) {
                case 1:
                List<Commande> commandes =service.lister();
                for(Commande cmd:commandes){
                    System.out.println(cmd);
                }
                    break;
            
                default:
                    break;
            }
            System.out.println("1-lister Commande");
            System.out.println("2-Entrer paiement");
            System.out.println("3-quitter");
            System.out.println("faites votre choix");

           

        } while (ch!=3);
    }
}
