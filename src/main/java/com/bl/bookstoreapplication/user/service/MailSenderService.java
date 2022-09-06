package com.bl.bookstoreapplication.user.service;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.internet.MimeMessage;
import java.io.File;

@Data
@Service
public class MailSenderService {
    @Autowired
    private JavaMailSender javaMailSender;

    public String sendEmail() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("sharadgb567@gmail.com");
        message.setTo("sharadgb567@gmail.com");
        message.setSubject("Trying to send...");
        message.setText("Hi dear .. ");

        javaMailSender.send(message);

        return "Mail sent Successfully";
    }

    /*public String sendEmailsWithAttachment() {
        try {
            MimeMessage mimeMessage = javaMailSender.createMimeMessage();
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);

            mimeMessageHelper.setFrom("sharadgb567@gmail.com");
            mimeMessageHelper.setTo("sharadgb567@gmail.com");
            mimeMessageHelper.setSubject("Trying to send...");
            mimeMessageHelper.setText("Hi dear .. ");

            File file = new File("C:\\Users\\SHARAD\\OneDrive\\Documents\\Desktop\\SGB\\file.txt");
            mimeMessageHelper.addAttachment(file.getName(),file);
            javaMailSender.send(mimeMessage);

            return "Attachment Mail sent Successfully";
        } catch (Exception e) {
            return "Mail sent failed";
        }
    }*/
}
