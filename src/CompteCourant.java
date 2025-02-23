public class CompteCourant extends CompteBancaire {
    private double decouvertAutorise;

    public CompteCourant(String numeroCompte, double solde, String nomTitulaire, double decouvertAutorise) {
        super(numeroCompte, solde, nomTitulaire);
        this.decouvertAutorise = decouvertAutorise;
    }

    @Override
    public void retirer(double montant) throws FondsInsuffisantsException {
        if (montant > getSolde() + decouvertAutorise) {
            throw new FondsInsuffisantsException("Fonds insuffisants, même avec le découvert autorisé.");
        }
        super.retirer(montant);
    }
}