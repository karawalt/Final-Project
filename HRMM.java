/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HRM;

import java.util.ArrayList;

/**
 *
 * @author KaraWalters
 */
public class HRMM {
   
public static ArrayList<Room> RoomData;
public static void main(String[] args)
{

RoomData = new ArrayList<>();

RoomData.add(new Room("", "", 100, 100));
RoomData.add(new Room("", "", 113, 115));
RoomData.add(new Room("", "", 224, 200));
RoomData.add(new Room("", "", 314, 150));

NewJFrame mainframe = new NewJFrame();

mainframe.setVisible(true);

}
}


    
