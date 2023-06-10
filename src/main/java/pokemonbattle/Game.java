package pokemonbattle;
import javax.swing.*;

public class Game{
    
        public void gameMain() 
    {  
        Pokemon pokemon = new Pokemon();
        Battle battle = new Battle();
        JOptionPane.showMessageDialog(null, "Welcome to Pokemon Battle Simulation!\nThis is a demo game built on Java for studying purpose\n All Pokemon names and related are property of The Pokemon Company and Nintendo.");
        String[] statsPokemon;
            statsPokemon = pokemon.choosePokemon();
        String pokemonName = statsPokemon[0];
        int pokemonHealth = Integer.parseInt(statsPokemon[1]);
        int pokemonAttack = Integer.parseInt(statsPokemon[2]);
        //Testing if method's returning values;
        //--------------------------------------------------------------------------------------------------
        JOptionPane.showMessageDialog(null, pokemonName + "\n" + pokemonHealth + "\n" + pokemonAttack);
        //--------------------------------------------------------------------------------------------------
        String[] enemyPokemon =pokemon.enemyAppear();
        String enemyPokemonName = enemyPokemon[0];
        int enemyPokemonHealth = Integer.parseInt(enemyPokemon[1]);
        int enemyPokemonAttack = Integer.parseInt(enemyPokemon[2]);
        JOptionPane.showMessageDialog(null, enemyPokemonName + "\n" + enemyPokemonHealth + "\n" + enemyPokemonAttack);
        battle.pokemonBattle(pokemonName, pokemonHealth, pokemonAttack, enemyPokemonName, enemyPokemonHealth, enemyPokemonAttack);
    }
    public boolean loopGameplay() {
        boolean loopResult = false;
        int option;
        do {
            option = JOptionPane.showConfirmDialog(null, "Do you want to play again?");
            if (option == JOptionPane.YES_OPTION) {
                loopResult = true;
            } else if (option == JOptionPane.NO_OPTION) {
                loopResult = false;
            } else {
              JOptionPane.showMessageDialog(null, "Invalid Option");
         }
     } while (option != JOptionPane.YES_OPTION && option != JOptionPane.NO_OPTION);
     return loopResult;
    }
}
