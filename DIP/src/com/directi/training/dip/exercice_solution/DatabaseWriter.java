package com.directi.training.dip.exercise_solution;

public class DatabaseWriter implements IWriter
{
    MyDatabase database;
    public DatabaseWriter(MyDatabase database)
    {
        this.database = database;
    }
    @Override
    public void write(String input)
    {
        database.write(input);
    }
}