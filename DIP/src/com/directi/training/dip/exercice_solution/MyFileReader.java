package com.directi.training.dip.exercise_solution;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader implements IReader
{
    private String fileName;

    public MyFileReader(String fileName)
    {
        this.fileName = fileName;
    }

    @Override
    public String read() throws IOException
    {
        StringBuilder builder = new StringBuilder();
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String s;
        while ((s = reader.readLine()) != null) {
            builder.append(s);
        }
        reader.close();
        return builder.toString();
    }
}