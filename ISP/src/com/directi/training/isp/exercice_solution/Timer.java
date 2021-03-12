package com.directi.training.isp.exercise_solution;

import java.util.TimerTask;

public class Timer
{
    public void register(long timeOut, final TimedElement timedElement)
    {
        java.util.Timer timerUtility = new java.util.Timer();
        timerUtility.schedule(new TimerTask()
        {
            @Override
            public void run()
            {
                timedElement.timeOutCallback();
            }
        }, timeOut);
    }
}