package Conception.Conception.Classes;

/**
 * Created by Nicolas on 12/11/2014.
 */
public class AppliMailing
{
    private Mailer mailer = null;

    public void methodeX()
    {
        Mailer mailer = new Mailer();
        boolean b = mailer.reqSendMail();
    }

    public void indNewMail()
    {

    }
}
