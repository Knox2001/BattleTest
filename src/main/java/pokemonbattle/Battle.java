package pokemonbattle;
import javax.swing.*;

public class Battle{
    public void pokemonBattle(String pokemonName, int pokemonHealth, int pokemonAttack, String enemyPokemonName, int enemyPokemonHealth,int enemyPokemonAttack){
        JOptionPane.showMessageDialog(null, "A wild "+enemyPokemonName+" appears");
        JOptionPane.showMessageDialog(null, "Battle begins!!!");
        String[] lifePoints = battleLoop(pokemonName, pokemonHealth, pokemonAttack, enemyPokemonName, enemyPokemonHealth, enemyPokemonAttack);
        pokemonHealth = Integer.parseInt(lifePoints[0]);
        enemyPokemonHealth = Integer.parseInt(lifePoints[1]);
        if(pokemonHealth < 1 ){
            JOptionPane.showMessageDialog(null, "YOU LOSE!\nBetter luck next time");
        }else{
            JOptionPane.showMessageDialog(null, "CONGRATULATIONS!!!\nYou win");
        }
    }

    public String[] battleLoop(String pokemonName, int pokemonHealth, int pokemonAttack, String enemyPokemonName, int enemyPokemonHealth, int enemyPokemonAttack){
        String[] health = new String[2];
        do{
            try{
                int actionPerformed = Integer.parseInt(JOptionPane.showInputDialog("Do you want to:\n\n1 - Attack\n2 - Heal"));
                switch(actionPerformed){
                    case 1 ->{
                        enemyPokemonHealth-=pokemonAttack;
                        break; 
                    }
                    case 2 ->{
                        pokemonHealth+=30;
                        JOptionPane.showMessageDialog(null, "You healed 30LP");
                    }
                    default ->{
                        JOptionPane.showMessageDialog(null, "Invalid Option");
                    }
                }
                 if (enemyPokemonHealth <= 0) {
                break;
                 }
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Invalid Option");
            }
            
        }while(pokemonHealth > 0 && enemyPokemonHealth > 0);
        health[0] = String.valueOf(pokemonHealth);
        health[1] = String.valueOf(enemyPokemonHealth);
        return health;
    }
        
}