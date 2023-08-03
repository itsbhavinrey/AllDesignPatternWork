package ocp;

public interface Allocator {
    public void markFree(int resourceId);
    public void markBusy(int resourceId);
    public int findFree();
}
