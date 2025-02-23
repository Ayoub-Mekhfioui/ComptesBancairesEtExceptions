import java.util.ArrayList;

public class MainCompteBancaire {
    public static void main(String[] args) {
        ArrayList<CompteBancaire> comptes = new ArrayList<>();

        CompteCourant compte1 = new CompteCourant("CC123", 1000, "Alice", 500);
        CompteEpargne compte2 = new CompteEpargne("CE456", 2000, "Bob", 2.5);

        comptes.add(compte1);
        comptes.add(compte2);

        try {
            compte1.retirer(1500); // Cela fonctionnera grâce au découvert
            compte2.appliquerInteret();

            compte1.transferer(compte2, 500); // Transfert réussi
            compte1.afficherSolde();
            compte2.afficherSolde();

            compte1.retirer(2000); // Cela générera une exception
        } catch (FondsInsuffisantsException | CompteInexistantException e) {
            System.out.println("Erreur: " + e.getMessage());
        }
    }
}

