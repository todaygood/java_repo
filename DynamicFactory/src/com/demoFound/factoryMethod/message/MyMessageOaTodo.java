package com.demoFound.factoryMethod.message;

public class MyMessageOaTodo extends  MyAbstractMessage {

    @Override
    public void sendMessage() throws Exception {

        if (null == getMessageParam()
                || "".equals(getMessageParam().get("OAUSERNAME"))
                || null == getMessageParam().get("OAUSERNAME")) {
            throw new Exception("发送OA待办，需要传入OAUSERNAME参数");

        }
        System.out.println("我是OA待办，发送通知给" + getMessageParam().get("OAUSERNAME"));
    }

}
