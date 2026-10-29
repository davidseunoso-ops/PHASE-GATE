def mini_parking_system(parking_slot):
    space = []
    
    for index in parking_slot:
        parking_slot = 'O'
        
        parking_system_menu = """
        ========================================
                    MINI PARKING SYSTEM
        ========================================
                      Select[Option]
            1.  Display Parking Space
            2.  Available space
            3.  Monitor when a car leaves
            0.  Exit
        ========================================
                """
        print(parking_system_menu);
        
        theSpace = False
        
        while True:
            parking_number = input("Enter your parking slot number: ")
        
            rowIndex = parkingNumber - 1;

        if rowIndex >= 0 && rowIndex < 20:
                  
            if parkingSlot[rowIndex] == 'O':
                parkingSlot[rowIndex] = '1'
                
                for index in parking_slot:
                    print(parkingSlot, " ");
                        print();
                    break;
            
            else:
                print("Sorry, space already occupied.")
                 
        else: 
            print("Invalid space selection. Try again");
                theSpace = False
        
              
            
       
    
    
                
               
               
