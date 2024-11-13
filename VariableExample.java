public class VariableExample {
    // Instance variable
    int instanceVariable=100;
    //instanceVariable can only be accessed with the object
    //Static Variable
    static boolean staticVariable = false;
    //staticVariable can be accessed with Class directly

    void firstFunction(){
        int localVariable=300;
        System.out.println("Local Variable : " + localVariable);

    }


    public static void main(String[] args) {
        int localVariable2 = 400;
        System.out.println("Local Variable :" + localVariable2);
        //To use the instance variable of a class, make object
        //Syntax: ClassName objVariable= new ClassName();
        VariableExample variableExampleObj= new VariableExample();
        // the variable of VariableExample is called object, here variableExampleObj
        System.out.println("Instance Variable : "+ variableExampleObj.instanceVariable);
        //Static variable can be accessed with, ClassName.variableName
        System.out.println("Static Variable :" + VariableExample.staticVariable);
        //Java TypeCasting Primitive Datatype 
        //Widening Casting/Implicit Casting/automatic 
        //Comversion of smaller datatype to larger datatype (size/capacity)
        //byte-> short -> char -> int -> long -> float -> double 
        byte byteVariable = 10;
        short shortVariable = byteVariable; // here byte is automatically converted to short
        int mathMark = 20;
        double mathconverted = mathMark; // int is automatically converted to double -> 20.0
        System.out.println("Int to double" + mathconverted);
        //Narrowing Casting/Explicit Casting/Manual
        //Conversion of larger datatye to smaller datatype
        double gpa=3.4;
        int gpaInt= (int) gpa;
        System.out.println("GPA int" + gpaInt);
        int floatConversion = (int) 400.33f; // 400

        
    }
}
