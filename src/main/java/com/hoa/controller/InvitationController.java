package com.hoa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hoa.requestEntities.InvitationRequest;
import com.hoa.service.EmailService;

@RestController
@RequestMapping("/api/public/emailInvitation")
public class InvitationController {

    private final EmailService emailService;

    @Autowired
    public InvitationController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping("/send-invitation")
    public String sendInvitation(@RequestBody InvitationRequest invitationRequest) {
        String clientEmail = invitationRequest.getClientEmail();
        String clientName = invitationRequest.getClientName();
        String contractCode = invitationRequest.getContractCode();

        // Call the email service to send the invitation
        emailService.sendInvitation(clientEmail, clientName,contractCode);

        return "Invitation sent successfully to " + clientEmail;
    }
}

