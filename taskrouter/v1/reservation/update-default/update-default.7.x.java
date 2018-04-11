// Install the Java helper library from twilio.com/docs/java/install

import com.twilio.Twilio;
import com.twilio.rest.taskrouter.v1.workspace.worker.Reservation;

public class Example {
    // Find your Account Sid and Token at twilio.com/console
    public static final String ACCOUNT_SID = "ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
    public static final String AUTH_TOKEN = "your_auth_token";

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Reservation reservation = Reservation.updater(
                "WSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
                "WKaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
                "WRaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa")
            .setReservationStatus(Reservation.Status.PENDING)
            .update();

        System.out.println(reservation.getAccountSid());
    }
}