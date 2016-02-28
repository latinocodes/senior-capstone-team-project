package sunset.BackEnd;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

// Email class used to send emails to users
// This class is referenced in update tenant an an object "em" created from it there
public class Email
{
	////Action Methods////
	public void sendEmail(String emailToAddress, String emailSubject, String emailBody)
	{
		//Variable declarations
		Properties propertiesObject = new Properties();
		Session emailSession = null;
		Message mailObject = null;
		
		//Set the email account address, username, and password
		final String ACCOUNT_USERNAME = "ssgcapp@gmail.com";
		final String ACCOUNT_PASSWORD = "P@ssword123!";
		final String ACCOUNT_EMAIL_ADDRESS = "ssgcapp@gmail.com";
		
		//Set properties for email configuration
		propertiesObject.put("mail.smtp.auth", "true");
		propertiesObject.put("mail.smtp.starttls.enable", "true");
		propertiesObject.put("mail.smtp.host", "smtp.gmail.com");
		propertiesObject.put("mail.smtp.port", "587");
		
		//Set the session authorization and authenticate the account username and password
		emailSession = Session.getInstance(propertiesObject, new javax.mail.Authenticator()
		{
			protected PasswordAuthentication getPasswordAuthentication()
			{
				return new PasswordAuthentication(ACCOUNT_USERNAME, ACCOUNT_PASSWORD);
			}
		});
		
		try
		{
			//Attempt to connect to the mail server and send the email
			mailObject = new MimeMessage(emailSession);
			
			//Set the from address and receiving address
			mailObject.setFrom(new InternetAddress(ACCOUNT_EMAIL_ADDRESS));
			mailObject.setRecipients(Message.RecipientType.TO, InternetAddress.parse(emailToAddress));
			
			//Set the subject and email body
			mailObject.setSubject(emailSubject);
			mailObject.setText(emailBody);
			
			//Send the email
			Transport.send(mailObject);
			
			////Add log data here and dialog success
			System.out.println("Email successfully sent!");
			////Add log data here and dialog success
		}
		catch (MessagingException e) 
		{
			////Add log data here and dialog error
			System.out.println("Email failed to send!");
			////Add log data here and dialog error
		}
	}
	
}