package ocp;

public class ResourceAllocator {

    public void allocate(Allocator allocator) {
        int resourceId ;
        resourceId = allocator.findFree();
        allocator.markBusy(resourceId);
    }

    public void free(Allocator allocator, int resourceId) {
        allocator.markBusy(resourceId);
    }

}
