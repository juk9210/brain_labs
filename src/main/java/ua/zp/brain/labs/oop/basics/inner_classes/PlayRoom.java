package ua.zp.brain.labs.oop.basics.inner_classes;


import java.util.Arrays;
import java.util.Comparator;

/**
 * Create class PlayRoom.
 *
 * @author Shakhov Yevhen.
 */

class PlayRoom {
    /**
     * Create method main.
     *
     * @param args
     */
    public static void main(String[] args) {
        /*
          Create array of games on physical media.
         */
        Game.GameDisk[] disks = new Game.GameDisk[4];
        disks[0] = Game.getDisk("GTA Vice City", Genre.ACTION, "Game offer the player the role of a " +
                "criminal (usually having the status of “six”) in a big city, advancing with the development of the" +
                " plot along the career ladder of organized crime.");
        disks[1] = Game.getDisk("FIFA 2019", Genre.SPORTS, "The announcement took place on June 9," +
                " 2018. On the cover, the Portuguese footballer Cristiano Ronaldo, who plays for the Italian Juventus," +
                " was depicted again.");
        disks[2] = Game.getDisk("Medal of Honor: Warfighter", Genre.SHOOTER, "Medal of Honor: " +
                "Warfighter is part of a series of games of the same name and a continuation of the game Medal of " +
                "Honor, released in 2010 and which restarted the entire series of games");
        disks[3] = Game.getDisk("Counter Ctrike", Genre.SHOOTER, "Counter-Strike gameplay takes" +
                " place in the format of a match divided into several rounds between two teams of players, one" +
                " of which plays the role of \"terrorists\", and the other - counter-terrorist special forces");
        /*
          Create array of games from the virtual store.
         */
        Game.VirtualGame[] virtuals = new Game.VirtualGame[4];
        virtuals[0] = Game.getVirtualGame("NHL 18", Genre.SPORTS, 3);
        virtuals[1] = Game.getVirtualGame("Call of Duty 4", Genre.SHOOTER, 5);
        virtuals[2] = Game.getVirtualGame("Resident Evil", Genre.SHOOTER, 4);
        virtuals[3] = Game.getVirtualGame("Far Cry", Genre.SHOOTER, 2);
        /*
        Create instance of class GameConsole.
         */
        GameConsole sony = new GameConsole(Brand.SONY, Model.XBOX_ONE, Serial.KFV251F);
        /*
        Using built-in classes - Arrays and Comparator, and their methods - sort() and compare sort array of games
        on physical media by genre.Apply compareTo.After,output this array to console with method toString().
         */
        Arrays.sort(disks, new Comparator<Game.GameDisk>() {
            public int compare(Game.GameDisk o1, Game.GameDisk o2) {
                return o1.getData().getGenre().compareTo(o2.getData().getGenre());
            }
        });
        System.out.println(Arrays.toString(disks));
        /*
        Using built-in classes - Arrays and Comparator, and their methods - sort() and compare sort array of games
         from the virtual store by rating.Apply Integer.compare.After,output this array to console with method toString().
         */
        Arrays.sort(virtuals, new Comparator<Game.VirtualGame>() {
            public int compare(Game.VirtualGame o1, Game.VirtualGame o2) {
                return Integer.compare(o1.getRating(), o2.getRating());
            }
        });
        System.out.println(Arrays.toString(virtuals));
    }
}
