package com.muy;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by yanglikai on 2017/7/28.
 */
public class DOList<T extends DO> extends ArrayList<T> {
    public DOList() {
        super();
    }

    public <T extends Dto> DtoList<T> parse(Class<T> dto) {
        DtoList<T> targetList = new DtoList<>(this.size());

        ListIterator<DO> sourceList = (ListIterator<DO>) this.listIterator();
        while (sourceList.hasNext()) {
            DO source = sourceList.next();
            T target = source.parse(dto);
            targetList.add(target);
        }

        return targetList;
    }
}
