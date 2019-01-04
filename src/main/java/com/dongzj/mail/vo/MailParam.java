package com.dongzj.mail.vo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2018/11/21
 * Time: 17:18
 */
@Getter
@Setter
public class MailParam implements Serializable {

    private static final long serialVersionUID = -497810795538814059L;

    /**
     * 接收者
     */
    private String to;

    /**
     * 邮件主题
     */
    private String subject;

    /**
     * 邮件正文
     */
    private String content;

    /**
     * 附件路径
     */
    private String path;

    /**
     * 静态资源Id
     */
    private String rscId;
}
