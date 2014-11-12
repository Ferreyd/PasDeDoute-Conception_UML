package Conception.Conception.Classes;

/**
 * Created by Nicolas on 12/11/2014.
 */
public class Mailer
{
    private AppliMailing appliMailing = null;

    public void methodeY()
    {
        AppliMailing a = new AppliMailing(); //solution 1
        a.indNewMail();
    }



    public boolean reqSendMail()
    {
        return true;
    }
}
