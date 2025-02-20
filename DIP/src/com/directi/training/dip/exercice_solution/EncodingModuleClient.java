package com.directi.training.dip.exercise_solution;

import java.io.IOException;

public class EncodingModuleClient
{
    public static void main(String[] args) throws IOException
    {
        EncodingModule encodingModule = new EncodingModule();

        IReader reader = new MyFileReader(
                "DIP/src/com/directi/training/dip/exercise_refactored/beforeEncryption.txt");
        IWriter writer = new MyFileWriter(
                "DIP/src/com/directi/training/dip/exercise_refactored/afterEncryption.txt");
        encodingModule.encode(reader, writer);

        MyDatabase database = new MyDatabase();
        reader = new NetworkReader("http", "myfirstappwith.appspot.com", "/index.html");
        writer = new DatabaseWriter(database);
        encodingModule.encode(reader, writer);
    }
}