public class UserinputUsingArgs {
    public static void main(String[] args) {
        //The parameter String[] args takes array of input 
        //You can compile java file with 
        //java FileName.java
        //java FileName args1 args2
        //or
        //Java FileName.java args1 args2
        System.out.println("First Args" + args[0]);
        System.out.println("Second Args" + args[1]);

        //The args are in database string to convert or parse my args
        int argsParse1 = Integer.parseInt(args[0]);
        int argsParse2 = Integer.parseInt(args[1]);
        System.out.println("Sum of args" + (argsParse1 + argsParse2));
    }
    
}
