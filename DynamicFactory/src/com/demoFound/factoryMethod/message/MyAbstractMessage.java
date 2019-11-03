package com.demoFound.factoryMethod.message;

import java.util.Map;

public abstract class MyAbstractMessage implements IMyMessage {

    private  Map<String,Object> messageParam;
    // 这里可以理解为生产产品所需要的原材料库，最好是个自定义的对象

    @Override
    public Map<String,Object> getMessageParam(){
        return messageParam;
    }

    @Override
    public void setMessageParam(Map<String,Object> messageParam){
        this.messageParam = messageParam;
    }
}
