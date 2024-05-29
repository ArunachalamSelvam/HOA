package com.hoa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.hoa.exception.EmailSendingException;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Service
public class EmailService {

	@Autowired
	private JavaMailSender emailSender;

	public void sendInvitationToTheFirstClient(String clientEmail, String clientName, String contractCode) {
		MimeMessage message = emailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message);

		try {
			helper.setTo(clientEmail);
			helper.setSubject("Invitation for Client Onboarding");
			if (clientName != null) {
				String htmlMsg = "<h3>Hello " + clientName + ",</h3>"
						+ "<p>Welcome to our community! We're thrilled to have you on board.</p>"
						+ "<h3>Contract Code: " + contractCode + "</h3>"
						+ "<p>Please follow this link to complete your onboarding process: <a href=\"https://hoa-web-reactjs.netlify.app/hoa-client-register/\">Onboarding Link</a></p>"
						+ "<p>Looking forward to working with you!</p>";
				helper.setText(htmlMsg, true);
			} else {
				String htmlMsg = "<h3>Hello There," + ",</h3>"
						+ "<p>Welcome to our community! We're thrilled to have you on board.</p>"
						+ "<h3>Contract Code: " + contractCode + "</h3>"
						+ "<p>Please follow this link to complete your onboarding process: <a href=\"https://hoa-web-reactjs.netlify.app/hoa-client-register/\">Onboarding Link</a></p>"
						+ "<p>Looking forward to working with you!</p>";
				helper.setText(htmlMsg, true);
			}
			emailSender.send(message);
		} catch (MessagingException e) {
			e.printStackTrace();
			throw new EmailSendingException("Failed to send email", e);
		}
	}

	public void sendBoardMemberInvitation(String clientEmail, String clientName, String contractCode,
			String boardMemberRole, int roleId) {
		MimeMessage message = emailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message);

		try {
			helper.setTo(clientEmail);
			helper.setSubject("Invitation for Client Onboarding");
			// Construct the onboarding link with the boardMemberRole as a query parameter
			String onboardingLink = "https://hoa-web-reactjs.netlify.app/hoa-register/" + roleId + "/"
					+ boardMemberRole;

			String htmlMsg;
			if (clientName != null) {
				htmlMsg = "<h3>Hello " + clientName + ",</h3>"
						+ "<p>Welcome to our community! We're thrilled to have you on board.</p>"
						+ "<h3>Contract Code: " + contractCode + "</h3>"
						+ "<p>Please follow this link to complete your onboarding process: <a href=\"" + onboardingLink
						+ "\">Onboarding Link</a></p>" + "<p>Looking forward to working with you!</p>";
			} else {
				htmlMsg = "<h3>Hello There,</h3>"
						+ "<p>Welcome to our community! We're thrilled to have you on board.</p>"
						+ "<h3>Contract Code: " + contractCode + "</h3>"
						+ "<p>Please follow this link to complete your onboarding process: <a href=\"" + onboardingLink
						+ "\">Onboarding Link</a></p>" + "<p>Looking forward to working with you!</p>";
			}

			helper.setText(htmlMsg, true);
			emailSender.send(message);
		} catch (MessagingException e) {
			throw new EmailSendingException("Failed to send email", e);
			// Handle exception
		}
	}

	public void sendUserCredentials(String toEmail, String userName, String password) throws MessagingException {

		MimeMessage message = emailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message, true);
		try {
			helper.setTo(toEmail);
			helper.setSubject("Your Account Credentials");

			String htmlMsg = "<h3>Dear " + userName + ",</h3>"
					+ "<p>Your account has been activated. Here are your credentials:</p>"
					+ "<p><b>Username / Email:</b> " + toEmail + "<br>" + "<b>Password:</b> " + password + "</p>"
					+ "<p>Best regards,<br>Your Company</p>";

			helper.setText(htmlMsg, true);

			emailSender.send(message);
		} catch (MessagingException e) {
			throw new EmailSendingException("Failed to send email", e);
		}
	}

}
