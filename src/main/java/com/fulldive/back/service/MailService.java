package com.fulldive.back.service;

import java.io.File;

import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeUtility;

import com.fulldive.back.entity.MailEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class MailService implements MailServiceImpl{

//    private final Logger logger = LoggerFactory.getLogger(this.getClass());
//
//    @Autowired
//    private JavaMailSenderImpl javaMailSender;
//
//    @Override
//    public void sendMail(MailEntity mailEntity) {
//        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
//
//        try {
//            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true, "UTF-8"); // use multipart (true)
//
////            InternetAddress[] toAddress = MailUtil.listToArray(mailDto.getToAddressList(), "UTF-8");
////            InternetAddress[] ccAddress = MailUtil.listToArray(mailDto.getCcAddressList(), "UTF-8");
////            InternetAddress[] bccAddress = MailUtil.listToArray(mailDto.getBccAddressList(), "UTF-8");
//            mailEntity.setSubject("Subject");
//            mailEntity.setContent("Content");
//            mailEntity.setFromAddress("info@fulldive.live");
//
//            mimeMessageHelper.setSubject(MimeUtility.encodeText(mailEntity.getSubject(), "UTF-8", "B")); // Base64 encoding
//            mimeMessageHelper.setText(mailEntity.getContent(), mailEntity.isUseHtmlYn());
//            mimeMessageHelper.setFrom(new InternetAddress(mailEntity.getFromAddress(), mailEntity.getFromAddress(), "UTF-8"));
//            mimeMessageHelper.setTo("yzon007@naver.com");
//            mimeMessageHelper.setCc("yzon007@milkomeda.co.kr");
//            mimeMessageHelper.setBcc("zed@milkomeda.co.kr");
//
////            if(!CollectionUtils.isEmpty(mailEntity.getAttachFileList())) {
////                for(AttachFileDto attachFileDto: maimailEntitylDto.getAttachFileList()) {
////                    FileSystemResource fileSystemResource = new FileSystemResource(new File(attachFileDto.getRealFileNm()));
////                    mimeMessageHelper.addAttachment(MimeUtility.encodeText(attachFileDto.getAttachFileNm(), "UTF-8", "B"), fileSystemResource);
////                }
////            }
//
//            javaMailSender.send(mimeMessage);
//
//            logger.info("MailServiceImpl.sendMail() :: SUCCESS");
//        } catch (Exception e) {
//            logger.info("MailServiceImpl.sendMail() :: FAILED");
//            e.printStackTrace();
//        }
//
//    }

}
