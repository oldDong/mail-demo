package com.dongzj.mail;

import com.dongzj.mail.service.MailService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2018/11/21
 * Time: 16:26
 */
public class MailServiceTest extends ApplicationTests {

    @Autowired
    private MailService mailService;

    @Test
    public void testSendSimpleMail() {
        String to = "dongzhijun0314@163.com";
        String subject = "this is for test";
        String content = "把所有的春天，都揉进了一个清晨";
        mailService.sendSimpleMail(to, subject, content);
    }

    @Test
    public void testSendHtmlMail() {
        String to = "dongzhijun0314@163.com";
        String subject = "this is for test";
        String content = "<html>\n" +
                "<body>\n" +
                "   <h3>你存在，我深深的脑海里</h3>\n" +
                "</body>\n" +
                "</html>";
        mailService.sendHtmlMail(to, subject, content);
    }

    @Test
    public void testSendAttachmentsMail() {
        String to = "dongzhijun0314@163.com";
        String subject = "this is for test";
        String content = "详情见附件";
        String filePath = "/Users/dongzj/Downloads/其他.xlsx";
        mailService.sendAttachmentsMail(to, subject, content, filePath);
    }

    @Test
    public void testSendInlineResourceMail() {
        String to = "dongzhijun0314@163.com";
        String subject = "this is for test";
        String rscId = "dongzj007";
        String content = "<html><body>这是有图片的邮件：<img src=\'cid:"+rscId+"\'></body></html>";
        String imgPath = "/Users/dongzj/Downloads/董智军.png";
        mailService.sendInlineResourceMail(to, subject, content, imgPath, rscId);
    }
}
