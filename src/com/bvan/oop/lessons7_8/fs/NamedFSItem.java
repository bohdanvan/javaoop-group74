package com.bvan.oop.lessons7_8.fs;

/**
 * @author bvanchuhov
 */
public abstract class NamedFSItem implements FSItem {

    private final String name;

    public NamedFSItem(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
