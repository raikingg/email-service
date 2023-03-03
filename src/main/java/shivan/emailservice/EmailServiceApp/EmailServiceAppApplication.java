package shivan.emailservice.EmailServiceApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import shivan.emailservice.EmailServiceApp.serviceImpl.EmailSender;

@SpringBootApplication

public class EmailServiceAppApplication {


	public static void main(String[] args) {
		SpringApplication.run(EmailServiceAppApplication.class, args);
	}


}
