// Install the C# / .NET helper library from twilio.com/docs/csharp/install

using System;
using Twilio;
using Twilio.Rest.Api.V2010.Account;


class Program 
{
    static void Main(string[] args)
    {
        // Find your Account Sid and Token at twilio.com/console
        const string accountSid = "ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
        const string authToken = "your_auth_token";

        TwilioClient.Init(accountSid, authToken);

        var shortCode = ShortCodeResource.Update(
            smsUrl: new Uri("http://demo.twilio.com/docs/sms.xml"),
            pathSid: "SC6b20cb705c1e8f00210049b20b70fce3"
        );

        Console.WriteLine(shortCode.FriendlyName);
    }
}
