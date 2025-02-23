# ComptesBancairesEtExceptions

![Java](https://img.shields.io/badge/Java-17-blue)
![GitHub](https://img.shields.io/badge/GitHub-Repository-brightgreen)

**ComptesBancairesEtExceptions** est un programme Java qui permet de gérer des comptes bancaires, y compris des comptes courants et des comptes d'épargne. Le programme utilise des exceptions personnalisées pour gérer les erreurs telles que les fonds insuffisants ou les comptes inexistants.

---

## Fonctionnalités

1. **Types de comptes** :
    - **CompteCourant** : Autorise un découvert limité.
    - **CompteEpargne** : Génère des intérêts sur le solde.

2. **Opérations disponibles** :
    - **Dépôt** : Ajoute de l'argent au compte.
    - **Retrait** : Retire de l'argent du compte (gère les fonds insuffisants).
    - **Transfert** : Transfère de l'argent entre deux comptes (gère les comptes inexistants).
    - **Affichage du solde** : Affiche le solde actuel du compte.

3. **Gestion des erreurs** :
    - **FondsInsuffisantsException** : Levée en cas de fonds insuffisants pour un retrait ou un transfert.
    - **CompteInexistantException** : Levée si un compte n'existe pas lors d'un transfert.

---

## Utilisation

1. Créez des comptes bancaires (courants ou d'épargne).
2. Effectuez des opérations telles que des dépôts, des retraits et des transferts.
3. Capturez les exceptions pour gérer les erreurs.

---


}