package com.demoFound.factoryMethod;

import com.demoFound.factoryMethod.factory.IMyMessageFactory;
import com.demoFound.factoryMethod.factory.MyMessageFactory;
import com.demoFound.factoryMethod.message.IMyMessage;

public class MyFactoryMethodMain {

    public static void main(String[] args){

        IMyMessageFactory myMessageFactory = new MyMessageFactory();
        IMyMessage myMessage;

            try {
                myMessage = myMessageFactory.createMessage("SMS");
                myMessage.sendMessage();

                myMessage = myMessageFactory.createMessage("OA");
                myMessage.sendMessage();

                myMessage = myMessageFactory.createMessage("EMAIL");
            myMessage.sendMessage();

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
