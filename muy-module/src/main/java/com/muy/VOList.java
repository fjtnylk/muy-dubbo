package com.muy;

import java.util.ArrayList;

/**
 * Created by yanglikai on 2017/7/30.
 */
public class VOList<T extends VO> extends ArrayList<T> {
    public VOList(int initialCapacity) {
        super(initialCapacity);
    }

    public VOList() {
    }
}
