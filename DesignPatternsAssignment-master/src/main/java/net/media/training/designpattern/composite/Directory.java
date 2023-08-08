package net.media.training.designpattern.composite;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 19, 2011
 * Time: 9:18:51 PM
 * To change this template use pre_refactoring.File | Settings | pre_refactoring.File Templates.
 */
class Directory extends FileSystemComponent {
    private ArrayList<FileSystemComponent> components;

    public Directory(String name) {
        super(name);
        components = new ArrayList<>();
    }

    @Override
    public int getSize() {
        int size = 0;
        for (FileSystemComponent component : components) {
            size += component.getSize();
        }
        return size;
    }

    @Override
    public boolean fileExists(String name) {
        for (FileSystemComponent component : components) {
            if (component instanceof File && component.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean directoryExists(String name) {
        for (FileSystemComponent component : components) {
            if (component instanceof Directory && component.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void add(FileSystemComponent component) {
        component.setParent(this);
        components.add(component);
    }

    @Override
    public void remove(FileSystemComponent component) {
        components.remove(component);
    }

    @Override
    public ArrayList<FileSystemComponent> getComponents() {
        return components;
    }
}
