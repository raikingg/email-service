package shivan.emailservice.EmailServiceApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import shivan.emailservice.EmailServiceApp.dto.SendRequest;
import shivan.emailservice.EmailServiceApp.serviceImpl.EmailSender;

@RestController
public class EmailController {

    @Autowired
    private EmailSender emailSender;

    @PostMapping("/send")
    public void sendEmail(@RequestBody SendRequest sendRequest){
        emailSender.sendEmail(sendRequest.getToEmail(),sendRequest.getSubject(),sendRequest.getBody());
        System.out.println("Mail sent successfully");
    }
}
