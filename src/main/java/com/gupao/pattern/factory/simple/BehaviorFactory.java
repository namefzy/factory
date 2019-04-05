package com.gupao.pattern.factory.simple;

public class BehaviorFactory{
    /**
     * 简单工厂第一版
     * 问题：随着动物种类增多，需要修改工厂里面的代码
     * @param name
     * @return
     */
//    public Behavior create(String name) {
//        if("cat".equals(name)){
//            return new Cat();
//        }else if("dog".equals(name)){
//            return new Dog();
//        }else{
//            return null;
//        }
//    }

    /**
     * 第二版通过反射调用
     *业务太多就麻烦了
     * @param clazz
     * @return
     */
    public Behavior create(Class<? extends Behavior> clazz) {
        if(null!=clazz){
            try {
                return clazz.newInstance();
            }  catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
