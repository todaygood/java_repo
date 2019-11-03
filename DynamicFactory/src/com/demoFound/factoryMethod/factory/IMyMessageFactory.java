package com.demoFound.factoryMethod.factory;

import com.demoFound.factoryMethod.message.IMyMessage;

/**
 * 工厂方法模式-工厂接口
 *
 *
 */


public interface IMyMessageFactory {
    public IMyMessage createMessage(String messageType);
}
