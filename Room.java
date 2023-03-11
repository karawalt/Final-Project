/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author KaraWalters
 */
package HRM;

import java.util.ArrayList;
import javax.swing.JFrame;

class Room {

    public String CustomerName;
    public int Room;
    public int RoomPrice;
    public boolean isAvailable;

    public Room(String name, int room, int price) {

        this.CustomerName = name;
        this.Room = room;
        this.RoomPrice = price;
        this.isAvailable = true;
    }

}



