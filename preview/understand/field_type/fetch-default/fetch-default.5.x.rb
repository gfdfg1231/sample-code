# Download the helper library from https://www.twilio.com/docs/ruby/install
require 'rubygems'
require 'twilio-ruby'

# Your Account Sid and Auth Token from twilio.com/console
account_sid = 'ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa'
auth_token = 'your_auth_token'
@client = Twilio::REST::Client.new(account_sid, auth_token)

field_type = @client.preview.understand
                            .services('UAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa')
                            .field_types('UBaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa')
                            .fetch

puts field_type.account_sid
