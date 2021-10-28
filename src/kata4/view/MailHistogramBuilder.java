
package kata4.view;

import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;


public class MailHistogramBuilder {
    public static Histogram<String> build(List<Mail> listMail){
        Histogram histogram = new Histogram();
        for (Mail mail : listMail) {
            String email = mail.getDomain();
            histogram.increment(mail);
            
            
        }
        return histogram;

        
    }
    
}
