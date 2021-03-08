package com.directi.training.ocp.exercise_solution;

public class ResourceAllocator
{
    public int allocateResource(Resource resource)
    {
        int resourceId = resource.findFree();
        resource.markBusy(resourceId);
        return resourceId;
    }

    public void freeResource(Resource resource, int resourceId)
    {
        resource.markFree(resourceId);
    }
}