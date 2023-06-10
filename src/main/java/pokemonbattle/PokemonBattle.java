package pokemonbattle;
import javax.swing.*;

public class PokemonBattle{
    public static void main(String[] args) 
    {
        boolean continuePlaying;
        do 
        {
            Game game = new Game();
            game.gameMain();
            continuePlaying = game.loopGameplay();
        } while (continuePlaying);
        JOptionPane.showMessageDialog(null, "Thanks for playing!");
    }
}