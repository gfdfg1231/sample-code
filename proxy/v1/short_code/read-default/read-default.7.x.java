// Install the Java helper library from twilio.com/docs/java/install

import com.twilio.Twilio;
import com.twilio.base.ResourceSet;
import com.twilio.rest.proxy.v1.service.ShortCode;

public class Example {
    // Find your Account Sid and Token at twilio.com/console
    public static final String ACCOUNT_SID = "ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
    public static final String AUTH_TOKEN = "your_auth_token";

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        ResourceSet<ShortCode> shortCodes = 
            ShortCode.reader("KSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")
            .read();

        for(ShortCode record : shortCodes) {
            System.out.println(record.getSid());
        }
    }
}