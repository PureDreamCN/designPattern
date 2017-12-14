/**
 * Copyright 2017 弘远技术研发中心. All rights reserved
 * Project Name:designPattern
 * Module Name:TODO:Module
 */

/**
 * what:    (这里用一句话描述这个类的作用). <br/>
 * when:    (这里描述这个类的适用时机 – 可选).<br/>
 * how:     (这里描述这个类的使用方法 – 可选).<br/>
 * warning: (这里描述这个类的注意事项 – 可选).<br/>
 *
 * @author 郭飞 created on 2017/12/14
 */
public class MyIterator implements  Iterator {

    private Collection collection;
    private int index=-1;
    public MyIterator(Collection collection) {
        this.collection = collection;
    }

    @Override
    public Object first() {
        index = 0;
        return collection.get(index);
    }

    @Override
    public Object next() {
        if(index<collection.Size()-1){
            index++;
        }
        return collection.get(index);
    }

    @Override
    public Object previous() {
        if(index>0){
            index--;
        }
        return collection.get(index);
    }

    @Override
    public boolean hasNext() {
        if(index<collection.Size()-1){
            return true;
        }else{
            return false;
        }

    }
}
