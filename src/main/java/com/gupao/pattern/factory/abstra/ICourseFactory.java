package com.gupao.pattern.factory.abstra;

/**
 * 抽象工厂 返回某个品种的功能的实例
 */
public interface ICourseFactory {
    INote createNote();
    IVideo createVideo();
}
