package com.bvan.oop.lessons7_8.fs;

/**
 * @author bvanchuhov
 */
public class File extends NamedFSItem {

    private final int size;

    public File(String name, int size) {
        super(name);
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }
}
