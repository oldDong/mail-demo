package com.dongzj.mail.service;

/**
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2018/11/21
 * Time: 16:16
 */
public interface MailService {

    /**
     * 发送简单邮件
     *
     * @param to 接收者
     * @param subject 主题
     * @param content 内容
     */
    void sendSimpleMail(String to, String subject, String content);

    /**
     * 发送HTML邮件
     *
     * @param to
     * @param subject
     * @param content
     */
    void sendHtmlMail(String to, String subject, String content);

    /**
     * 发送带附件的邮件
     *
     * @param to
     * @param subject
     * @param content
     * @param filePath 附件的绝对路径
     */
    void sendAttachmentsMail(String to, String subject, String content, String filePath);

    /**
     * 发送带静态资源的邮件
     *
     * @param to
     * @param subject
     * @param content
     * @param rscPath 资源路径
     * @param rscId 资源Id
     */
    void sendInlineResourceMail(String to, String subject, String content, String rscPath, String rscId);
}
