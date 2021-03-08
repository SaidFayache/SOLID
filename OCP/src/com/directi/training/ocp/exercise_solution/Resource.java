package com.directi.training.ocp.exercise_solution;

public interface Resource {

    int findFree();

    void markBusy(int resourceId);

    void markFree(int resourceId);

}
