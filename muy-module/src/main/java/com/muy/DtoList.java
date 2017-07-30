package com.muy;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by yanglikai on 2017/7/28.
 */
public class DtoList<T extends Dto> extends ArrayList<T> {
    public DtoList() {
        super();
    }

    public DtoList(int initialCapacity) {
        super(initialCapacity);
    }

    public <T extends VO> VOList<T> parse(Class<T> vo) {
        VOList<T> targetList = new VOList<>(this.size());

        ListIterator<Dto> sourceList = (ListIterator<Dto>) this.listIterator();
        while (sourceList.hasNext()) {
            Dto source = sourceList.next();
            T target = source.parse(vo);
            targetList.add(target);
        }

        return targetList;
    }
}
