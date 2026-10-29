import java.util.Scanner;

public class MiniParkingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        char parkingSlot[] = new char[20];
        
        for(int row = 0; row < parkingSlot.length; row++) {
            parkingSlot[row] = 'O';
        }
        
        String parkingSystemMenu = """
              ========================================
                          MINI PARKING SYSTEM
              ========================================
                      Select[Option]
                1.  Display Parking Space
                2.  Available space
                3.  Monitor when a car leaves
                0.  Exit
              ========================================
                """;
        System.out.println(parkingSystemMenu);
        
        boolean theSpace = false;
        while(true) {
        //for(int row = 0; row < parkingSlot.length; row++) {
        //    System.out.print(parkingSlot[row] + " ");
      //  }
      //  System.out.println();
      
        System.out.print("Enter your parking slot number: ");
        int parkingNumber = scanner.nextInt();
        
        int rowIndex = parkingNumber - 1;

        if (rowIndex >= 0 && rowIndex < 20) {
                  
            if (parkingSlot[rowIndex] == 'O') {
                parkingSlot[rowIndex] = '1';
                
                for(int row = 0; row < parkingSlot.length; row++) {
                    System.out.print(parkingSlot[row] + " ");
                    }
                    System.out.println();
                    break;
            } 
                else {
                    System.out.println("Sorry, space already occupied.");
                 
                }
        } 
            else { 
                System.out.println("Invalid space selection. Try again");
                theSpace = false;
            }
        }
    }
}
              
            
       
    
    
                
               
               
