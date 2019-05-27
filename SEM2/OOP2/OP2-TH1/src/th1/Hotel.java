package th1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author M.Asad Saeed
 */
public class Hotel {
    
    private String hotelName;
    private Room room[][] = {
        {new Room(RoomType.DOUBLE), new Room(RoomType.SINGLE), 
            new Room(RoomType.SUITE)},
        {new Room(RoomType.SINGLE), new Room(RoomType.SUITE)},
        {new Room(RoomType.SINGLE), new Room(RoomType.SINGLE)}
    };
    
    public Hotel(String hotelName) {
        this.hotelName = hotelName;
    }
    
    public void printRoomStatus() {
        //Print Each Room Status
        System.out.println("***" + hotelName + "***");
        
        for(int a = 0; a < room.length; a++){
            System.out.println("Floor: " + a);
            
            for(int b = 0; b < room[a].length; b++){
                System.out.println("\tRoom Number: " + b + " Room Type: " + room[a][b].getRoomType() + 
                        " Occupied? " + room[a][b].getOccupied());
            }     
        }
    }
    
    public void setRoomtoOccupied(int floor, int roomNumber) {
        //Set Occupied Rooms
        System.out.println("***" + hotelName + "***");
        room[floor][roomNumber].setOccupied(true);
        
        for(int a = 0; a < room.length; a++){
            System.out.println("Floor: " + a);
            
            for(int b = 0; b < room[a].length; b++){ 
                System.out.println("\tRoom Number: " + b + " Room Type: " + room[a][b].getRoomType() + 
                        " Occupied? " + room[a][b].getOccupied());
            }
        }
    }
    
    public Room getOpenRoomType(RoomType type) {
        //Check For Available Room For Specifed Room
        Room room1 = new Room(type);
        for(int a = 0; a < room[0].length; a++){
            for(int b = 0; b < room[a].length; b++){ 
                if(room[a][b].getRoomType() == type){
                if(room[a][b].getOccupied() == false){  
                room1 = room[a][b];
                }
                }
                
            }
                
        }
        return room1;

    }
}