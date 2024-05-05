package com.hoa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender emailSender;

    public void sendInvitation(String clientEmail, String clientName, String communityCode) {
        MimeMessage message = emailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);

        try {
            helper.setTo(clientEmail);
            helper.setSubject("Invitation for Client Onboarding");
            String htmlMsg = "<h3>Hello " + clientName + ",</h3>"
                    + "<p>Welcome to our community! We're thrilled to have you on board.</p>"
                    + "<h3>Community Code: " +communityCode+ "</h3>"
                    + "<p>Please follow this link to complete your onboarding process: <a href=\"https://hoa-web-reactjs.netlify.app/hoa-register/\">Onboarding Link</a></p>"
                    + "<p>Looking forward to working with you!</p>";
            helper.setText(htmlMsg, true);

            emailSender.send(message);
        } catch (MessagingException e) {
            e.printStackTrace();
            // Handle exception
        }
    }
}

