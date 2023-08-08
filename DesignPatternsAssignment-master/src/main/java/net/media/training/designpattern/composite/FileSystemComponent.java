package net.media.training.designpattern.composite;

import java.util.*;
abstract class FileSystemComponent {
    protected String name;
    protected Directory parent;

    public FileSystemComponent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setParent(Directory parent) {
        this.parent = parent;
    }

    public abstract int getSize();

    public abstract boolean fileExists(String name);

    public abstract boolean directoryExists(String name);

    public abstract void add(FileSystemComponent component);

    public abstract void remove(FileSystemComponent component);

    public abstract List<FileSystemComponent> getComponents();
}