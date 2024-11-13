public class UserOutput {
    public static void main(String[] args) {
        //Standard output/terminal output
        //Continuous printing 
        System.out.println("This");
        System.out.println("is");
        System.out.print("Java/n");

        //Line break after printing 
        System.out.println("Next print will start from next line");

        //Print using formatting 
        //% floating point, %d integral, %s String(any)
        System.out.printf("Tempereture %f degree celsius",30.22);
        //Can we use multiple placeholder
        System.out.printf("Name %s age %d, weight %f", "mero naam" , 30,75.44);
        //The arrangement of the placeholder and value given after the string must match 
        //eg:1 is %s string, 2 %d integer, 3% float
    }
}
