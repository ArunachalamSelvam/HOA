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

    @PostMapping("/send-invitation-To-The-First-Client")
    public String sendInvitationToTheFirstClient(@RequestBody InvitationRequest invitationRequest) {
        String clientEmail = invitationRequest.getClientEmail();
        String clientName = invitationRequest.getClientName();
        String contractCode = invitationRequest.getContractCode();

        // Call the email service to send the invitation
        emailService.sendInvitationToTheFirstClient(clientEmail, clientName,contractCode);

        return "Invitation sent successfully to " + clientEmail;
    }
    
    @PostMapping("/send-invitation-To-The-Other-BoardMember")
    public String sendInvitationToTheOtherBoardMember(@RequestBody InvitationRequest invitationRequest) {
        String clientEmail = invitationRequest.getClientEmail();
        String clientName = invitationRequest.getClientName();
        String contractCode = invitationRequest.getContractCode();
        String boardMemberRole = invitationRequest.getBoardMemberRole();
        int roleId = invitationRequest.getRoleId();

        // Call the email service to send the invitation
        emailService.sendBoardMemberInvitation(clientEmail, clientName,contractCode,boardMemberRole,roleId);

        return "Invitation sent successfully to " + clientEmail;
    }
}

