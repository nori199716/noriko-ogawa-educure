public class Main7 {
    public static void main(String[] args){
        
        int key = 2;
        int pressCont = 2;

        switch (key) {
            case 1:
                switch (pressCont){
                   case 1:
                    System.out.println("A");
                    break;
                   case 2:
                    System.out.println("B");
                    break;
                   default:
                    System.out.println("C");
                }
                break;
        
            case 2:
                switch (pressCont){
                    case 1:
                        System.out.println("D");
                        break;
                    case 2:
                        System.out.println("E");
                        break;
                    default:
                        System.out.println("F");
                }
                break;

            default:
                System.out.println("Invalid key");
        }

    }
    
}
