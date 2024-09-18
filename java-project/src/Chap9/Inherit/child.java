package Chap9.Inherit;

import java.io.FileNotFoundException;

public class child extends Parent {
/*    @Override
    void method() throws FileNotFoundException{
        throw new FileNotFoundException();
    }*/
/*    @Override
    void method() throws NumberFormatException{
        throw new NumberFormatException();
    }*/
/*    @Override
    void method() throws ClassCastException{
        throw new ClassCastException();
    }*/
    @Override
    void method() throws ArithmeticException{
        throw new ArithmeticException();
    }
    //IOException 하위 예외처리는 상속 받은 자손 클래스에서도 처리가능.
}
