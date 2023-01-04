
package Services;
import java.util.List;

import Models.Commande;
import dao.Data;

public class PaiementService {
    private Data date;

    public PaiementService() {
        // date=new Data();
    }

    public Data getDate() {
        return date;
    }

    public void setDate(Data date) {
        this.date = date;
    }
   public List<Commande>lister(){
    return date.getCommandes();
   }
}
