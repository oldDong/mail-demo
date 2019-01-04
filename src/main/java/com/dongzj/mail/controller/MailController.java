package com.dongzj.mail.controller;

import com.dongzj.mail.service.MailService;
import com.dongzj.mail.vo.MailParam;
import com.dongzj.mail.vo.MailResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2018/11/21
 * Time: 17:16
 */
@RestController
public class MailController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private MailService mailService;

    @PostMapping("/sendSimpleMail")
    public MailResult sendSimpleMail(@RequestBody MailParam param) {
        MailResult mailResult = new MailResult();
        if (StringUtils.isEmpty(param.getTo()) || !param.getTo().contains("@")) {
            mailResult.setRspCode("01");
            mailResult.setRspMsg("收件人邮件格式不正确");
            return mailResult;
        }

        if (StringUtils.isEmpty(param.getContent())) {
            mailResult.setRspCode("02");
            mailResult.setRspMsg("邮件正文不能为空");
            return mailResult;
        }

        try {
            mailService.sendSimpleMail(param.getTo(), param.getSubject(), param.getContent());
            logger.info("sendSimpleMail success");
        } catch (Exception e) {
            mailResult.setRspCode("04");
            mailResult.setRspMsg("邮件发送出现异常");
            logger.error("sendSimpleMail fail - msg:{}", e);
        }
        return mailResult;
    }
}
