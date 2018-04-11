// Install the C# / .NET helper library from twilio.com/docs/csharp/install

using System;
using Twilio;
using Twilio.Rest.Preview.Understand.Service.Intent;


class Program 
{
    static void Main(string[] args)
    {
        // Find your Account Sid and Token at twilio.com/console
        const string accountSid = "ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        const string authToken = "your_auth_token";

        TwilioClient.Init(accountSid, authToken);

        var field = FieldResource.Create(
            pathServiceSid: "UAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
            pathIntentSid: "UDaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
            fieldType: "FieldType",
            uniqueName: "UniqueName"
        );

        Console.WriteLine(field.Sid);
    }
}
