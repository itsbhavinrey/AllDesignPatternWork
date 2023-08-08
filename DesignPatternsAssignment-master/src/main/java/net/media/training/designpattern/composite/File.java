package net.media.training.designpattern.composite;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 19, 2011
 * Time: 9:18:04 PM
 * To change this template use pre_refactoring.File | Settings | pre_refactoring.File Templates.
 */
class File extends FileSystemComponent {
    private int size;

    public File(String name, int size) {
        super(name);
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean fileExists(String name) {
        return this.name.equals(name);
    }

    @Override
    public boolean directoryExists(String name) {
        return false;
    }

    @Override
    public void add(FileSystemComponent component) {
        // Files cannot contain other components, so this method is not applicable
    }

    @Override
    public void remove(FileSystemComponent component) {
        // Files cannot contain other components, so this method is not applicable
    }

    @Override
    public ArrayList<FileSystemComponent> getComponents() {
        return new ArrayList<>(); // Files do not have components
    }
}
