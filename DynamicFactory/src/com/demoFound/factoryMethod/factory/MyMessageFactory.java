package com.demoFound.factoryMethod.factory;

import java.util.HashMap;
import java.util.Map;

import com.demoFound.factoryMethod.message.IMyMessage;
import com.demoFound.factoryMethod.message.MyMessageEmail;
import com.demoFound.factoryMethod.message.MyMessageOaTodo;
import com.demoFound.factoryMethod.message.MyMessageSms;

/**
 * 工厂方法模式_工厂实现
 *
 *
 */


public class MyMessageFactory implements IMyMessageFactory{

    @Override
    public IMyMessage createMessage(String messageType){

        //消费者知道自己想要什么产品

        IMyMessage myMessage;
        Map<String,Object> messageParam = new HashMap<String,Object>();
        if ("SMS".equals(messageType)){
            myMessage = new MyMessageSms();
            messageParam.put("PHONENUM","123456789");
        }
        else if ("OA".equals(messageType)){
            myMessage = new MyMessageOaTodo();
            messageParam.put("OAUSERNAME", "testUser");

        }
        else if ("EMAIL".equals(messageType)){
            myMessage = new MyMessageEmail();
            messageParam.put("EMAIL","jhu_com@163.com");

        }
        else
        {
            myMessage = new MyMessageEmail();
            messageParam.put("EMAIL","jhu_com@163.com");

        }

        myMessage.setMessageParam(messageParam);

        return myMessage;

    }
}
