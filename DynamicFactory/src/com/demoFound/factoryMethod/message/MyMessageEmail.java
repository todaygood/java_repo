package com.demoFound.factoryMethod.message;

public class MyMessageEmail extends MyAbstractMessage{

    @Override
    public void sendMessage() throws Exception {
        if (null == getMessageParam() || null == getMessageParam().get("EMAIL")
              || "".equals(getMessageParam().get("EMAIL"))) {

            throw new Exception("发送短信，需要传入EMail参数");
        }
        System.out.println("我是邮件，发送通知给" + getMessageParam().get("EMAIL"));
    }
}



