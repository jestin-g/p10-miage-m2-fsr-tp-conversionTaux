package conversionTaux.session;

import javax.ejb.Remote;

@Remote()
public interface ConversionTauxItf {
	public String convertir(String monnaieA, String monnaieB, double montant);
public String creerCompte(String login, String passwd);
}
