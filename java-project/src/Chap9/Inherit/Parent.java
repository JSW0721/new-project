package Chap9.Inherit;

import java.io.FileNotFoundException;
import java.io.IOException;

public abstract class Parent {
    void method() throws IOException {
        throw new IOException();
    }
}
