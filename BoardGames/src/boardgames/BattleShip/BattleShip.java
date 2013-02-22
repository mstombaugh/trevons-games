/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package boardgames.BattleShip;

import java.util.*;
/**
 *
 * @author Mike
 */
public class BattleShip {

    Scanner in = new Scanner(System.in); //Scanner object for basic IO in pre-GUI interface
    
    final int BOARD_W = 10;
    final int BOARD_H = 10;
    ArrayList<Ship> ships = new ArrayList<Ship>();
    
    String[][] gameBoard = new String[BOARD_W][BOARD_H];
    /*
     * game board tiles:
     *      "o" -> ocean
     *      posative number -> index in ships vector of the ship in that location (no hit)
     *      negative number -> index in ships vector of the ship in that location (hit)
     */
    
    public BattleShip() {
       //nothing to construct at this time
    }
    
     /**
     * Ships:
     * 1 length 2
     * 2 length 3
     * 1 length 4
     * 1 length 5
     */
    public void intit(){
        //set up game board to have only "ocean" tiles
        for(int x=0; x<BOARD_W; x++){
            for(int y = 0; y<BOARD_H; y++){
                gameBoard[x][y]="o";
            }
    }
        
        //add all the ships from largest to smallest
        ships.add( new Ship(5,"Battleship"));
        ships.add( new Ship(4,"Cruiser"));
        ships.add( new Ship(3,"Submarine"));
        ships.add( new Ship(3,"Destroyer"));
        ships.add( new Ship(2,"PT Boat"));
        
        //create a method to place ships so when we move to GUI we only have to rewrite the method
        placeShips();
        
        
    }
    
    public void placeShips(){
        //this method will be remade for GUI version
        int x=0, y=0;
        String orientation = "";
        for(int i=0; i<ships.size();i++){
            System.out.println("Ship: " + ships.get(i).name() + 
                               ". Size: " + ships.get(i).size());
            
            System.out.println("X coordinate: ");
            x=in.nextInt();
            System.out.println("Y coordinate: ");
            y=in.nextInt();
            System.out.println("Orientation: ");
            orientation=in.nextLine();
            
            //make sure ships are in bounds
            String locationOK = checkShipInBounds(i, x, y, orientation);
            if(locationOK != "OK"){
                System.out.println("Cannot place ship at that location because " + locationOK + '.');
                i--;
            }
            switch(orientation.charAt(0)){
                case 'N':
                    for(int o=0;o<ships.get(i).size();o++){
                        if(gameBoard[x][y+o]!="o"){
                            System.out.println("Collision!  A boat is already in one of the locations");i--;
                            
                            break;
                        }
                    }
                    for(int o=0;o<ships.get(i).size();o++){
                        if(gameBoard[x][y+o]!="o"){
                           
                            gameBoard[x][y+o] = i + "";
                        }
                    }
                    
                    break;
               
                case 'E':
                    for(int o=0;o<ships.get(i).size();o++){
                        if(gameBoard[x+o][y]!="o"){
                            System.out.println("Collision!  A boat is already in one of the locations");i--;
                            
                            break;
                        }
                    }
                    for(int o=0;o<ships.get(i).size();o++){
                        if(gameBoard[x+o][y]!="o"){
                            
                            gameBoard[x+o][y] = i + "";
                        }
                    }
                    
                    
                    break;
                
                case 'S':
                    for(int o=0;o<ships.get(i).size();o++){
                        if(gameBoard[x][y-o]!="o"){
                            System.out.println("Collision!  A boat is already in one of the locations");i--;
                            
                            break;
                        }
                    }
                    for(int o=0;o<ships.get(i).size();o++){
                        if(gameBoard[x][y-o]!="o"){
                           
                            gameBoard[x][y-o] = i + "";
                        }
                    }
                    
                    break;
                
                case 'W':
                    for(int o=0;o<ships.get(i).size();o++){
                        if(gameBoard[x-o][y]!="o"){
                            System.out.println("Collision!  A boat is already in one of the locations");i--;
                            
                            break;
                        }
                    }
                    for(int o=0;o<ships.get(i).size();o++){
                        if(gameBoard[x-o][y]!="o"){
                            
                            gameBoard[x-o][y] = i + "";
                        }
                    }
                    
                    break;
                default:
                    i--;
                    break;
                  
            }
            
        }
    }
    
    public String checkShipInBounds(int shipIndex, int x, int y, String orientation){
        //make sure orientation is an accepted direction
        if(orientation != "NORTH" || orientation != "EAST" || orientation != "SOUTH" || orientation != "WEST") return "incorrect location string";
        
        //make sure the ship in fully on the board
        if(orientation == "NORTH"){
            if( ships.get(shipIndex).size()+y > BOARD_H ) return "OOB NORTH " + ships.get(shipIndex).size()+y;
        }
        if(orientation == "EAST"){
            if( ships.get(shipIndex).size()+x > BOARD_W ) return "OOB EAST " + ships.get(shipIndex).size()+x;
        }
        if(orientation == "SOUTH"){
            if( y-ships.get(shipIndex).size() < BOARD_H ) return "OOB SOUTH " + (y-ships.get(shipIndex).size());
        }
        if(orientation == "SOUTH"){
            if( x-ships.get(shipIndex).size() < BOARD_W ) return "OOB WEST " +  (y-ships.get(shipIndex).size());
        }
        
        return "OK";
    }
}