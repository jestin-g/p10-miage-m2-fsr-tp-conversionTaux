package conversionTaux.entity;

import javax.persistence.*;
import java.util.*;

//classe java à transformer en classe entity JPA

public class AbonneEntity {

	private int idAbonne;
    public int getIdAbonne ()  {
        return this.idAbonne;
    }

    public void setIdAbonne (int value)  {
        this.idAbonne = value; 
    }

    private String login;
    public String getLogin ()  {
        return this.login;
    }

    public void setLogin (String value)  {
        this.login = value;
    }

    private String passwd;
    public String getPasswd ()  {
        return this.passwd;
    }

    public void setPasswd (String value)  {
        this.passwd = value; 
    }

    public AbonneEntity()
    {
    }
    
    public AbonneEntity(String login, String passwd)
    {
        this.login = login;
        this.passwd = passwd;
    }
    
}
