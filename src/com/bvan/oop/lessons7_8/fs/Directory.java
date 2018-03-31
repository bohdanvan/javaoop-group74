package com.bvan.oop.lessons7_8.fs;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class Directory extends NamedFSItem {

    private final List<FSItem> items = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    public void add(FSItem item) {
        items.add(item);
    }

    @Override
    public int getSize() {
        int size = 0;
        for (FSItem item : items) {
            size += item.getSize();
        }
        return size;
    }
}
