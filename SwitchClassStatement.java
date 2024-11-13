public class SwitchClassStatement {
    public static void main(String[] args) {
        int day = 5;
        switch (day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
            System.out.println("Unknown day");
            break;
    

             
        }
        //nested switch statement 
        String beverage = "Coke"
        char gender= 'M';
        switch(beverage){
            case "Coke":
                switch(gender){
                    case 'M':
                        System.out.println("Male");
                        break;
                    case 'F':
                        System.out.println("Female");
                        break;

                }
                System.out.println("Black");
                break;
            default:
                System.out.println("Unknown Bevrages");
                break;
            
        }

    }
    
}
