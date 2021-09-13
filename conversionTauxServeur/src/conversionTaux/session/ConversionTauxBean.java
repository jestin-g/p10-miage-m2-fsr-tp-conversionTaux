package conversionTaux.session;

import javax.ejb.*;
import javax.persistence.*;
import conversionTaux.entity.*;

/*
 Les indications fournies n'incluent pas ce qui relève de :
1) l'écriture d'un bean session
2) les éléments JPA, en particulier ceux relatifs à l'utilisation d'une entité dans une méthode.

 A vous de déterminer ce qui doit être écrit, en particulier pour la
 synchronisation des entités avec la BD
 */


public class ConversionTauxBean implements ConversionTauxItf, ConversionTauxCste {
    
    
	public String convertir(String monnaieA, String monnaieB, double montant)
	{
		try
        {
           /*
            Remonter de la BD en mémoire la valeur du taux correspondant à la paire (monnaieA, monnaieB)
            Retourner la String RESULTAT + montant * taux trouvé)
            */
		}
		catch (...) //exception si la paire (monnaieA, monnaieB) n'est pas trouvee
		{
			return NO_RESULTAT;
		}
		catch (...) //exception si plusieurs paires (monnaieA, monnaieB) sont trouvees
		{
			return RESULTAT_MULTIPLE;
		}
	}
    
    public String creerCompte(String login, String passwd)
    {
        //Instancier l'entité
        try {
            //La faire passer à l'état "managed" (cf le diagramme du cycle de vie d'une entité)
            return SUCCESS;
            }
        catch (...) //exception si les valeurs existent deja
        {
            return NO_INSERTION;
        }
    }
}

