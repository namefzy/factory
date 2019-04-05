package com.gupao.pattern.factory.abstra;

public class JavaFactory implements ICourseFactory {

    public INote createNote() {
        return new JavaNote();
    }

    @Override
    public IVideo createVideo() {
        return new JavaVideo();
    }
}
