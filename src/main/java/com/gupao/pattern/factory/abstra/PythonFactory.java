package com.gupao.pattern.factory.abstra;

/**
 * 利用工厂创建对应的具体到功能的类 该功能属于某一个种类的一个表现形式
 */
public class PythonFactory implements ICourseFactory{
    public INote createNote() {
        return new PythonNote();
    }

    @Override
    public IVideo createVideo() {
        return new PythonVideo();
    }
}
