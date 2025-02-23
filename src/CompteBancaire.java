public class CompteBancaire {
    private String numeroCompte;
    private double solde;
    private String nomTitulaire;

    public CompteBancaire(String numeroCompte, double solde, String nomTitulaire) {
        this.numeroCompte = numeroCompte;
        this.solde = solde;
        this.nomTitulaire = nomTitulaire;
    }

    public void deposer(double montant) {
        solde += montant;
    }

    public void retirer(double montant) throws FondsInsuffisantsException {
        if (montant > solde) {
            throw new FondsInsuffisantsException("Fonds insuffisants pour effectuer le retrait.");
        }
        solde -= montant;
    }

    public void afficherSolde() {
        System.out.println("Solde du compte " + numeroCompte + ": " + solde);
    }

    public void transferer(CompteBancaire destination, double montant) throws FondsInsuffisantsException, CompteInexistantException {
        if (destination == null) {
            throw new CompteInexistantException("Le compte destination n'existe pas.");
        }
        this.retirer(montant);
        destination.deposer(montant);
    }

    public String getNumeroCompte() {
        return numeroCompte;
    }
    public double getSolde() {
        return solde;
    }

}