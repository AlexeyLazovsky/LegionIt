package GameApp;

import java.io.FileWriter;
import java.io.IOException;

public class Game {
    enum GameType {
        SOCCER,
        HOCKEY,
        RUGBY
    }

    public static void writeNumOfPlayersPerTeam(GameType game) {
        String fileName = game.toString().toLowerCase() + ".txt";
        int numOfPlayers = 0;

        switch (game) {
            case SOCCER:
                numOfPlayers = 11;
                break;
            case HOCKEY:
                numOfPlayers = 6;
                break;
            case RUGBY:
                numOfPlayers = 15;
                break;
            default:
                System.out.println("Invalid game type");
                return;
        }

        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(Integer.toString(numOfPlayers));
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Error. Cannot write to file.");
            e.printStackTrace();
        }
    }
}
