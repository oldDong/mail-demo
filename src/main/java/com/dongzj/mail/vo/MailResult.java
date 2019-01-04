package com.dongzj.mail.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2018/11/21
 * Time: 17:13
 */
@Getter
@Setter
@NoArgsConstructor
public class MailResult implements Serializable {

    private static final long serialVersionUID = 7474468212849176205L;

    /**
     * 状态码
     */
    private String rspCode;

    /**
     * 返回消息
     */
    private String rspMsg;

    public MailResult(String rspCode, String rspMsg) {
        this.rspCode = "00";
        this.rspMsg = "发送成功";
    }
}
