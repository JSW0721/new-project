package Chap6.annotation;

@AnnotationName(elementNameOne = "값", elementNameTwo = 3)
public class ClassName {

    @AnnotationName(elementNameOne = "값")
    int field;

    int getField(){
        return field;
    }
    void setField(int field){
        this.field = field;
    }

    @AnnotationName(elementNameOne = "값")
    void method(){

    }
}
