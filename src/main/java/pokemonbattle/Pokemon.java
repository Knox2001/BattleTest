package pokemonbattle;
import javax.swing.*;

public class Pokemon{
        public String[] choosePokemon() {
        boolean selectionError = false;
        String pokemonName = "", pokemonHealth = "", pokemonAttack = "";       
        do{ 
            try{
                int chosenPokemon = Integer.parseInt(JOptionPane.showInputDialog("Choose your pokemon:\n1 - Charizard:\n   Health:100\n   Attack: 50\n\n2 - Blastoise:\n   Health: 150\n   Attack 35\n\n3 - Venosaur:\n   Health: 200\n   Attack: 20\n "));
                switch(chosenPokemon){
                    case 1 -> {
                        pokemonName = "Charizard";
                        pokemonHealth = "100";
                        pokemonAttack = "50";
                        selectionError = false;
                    }
                    case 2 -> {
                        pokemonName = "Blastoise";
                        pokemonHealth = "150";
                        pokemonAttack = "35";
                        selectionError = false;
                    }
                    case 3 -> {
                        pokemonName = "Venosaur";
                        pokemonHealth = "200";
                        pokemonAttack = "20";
                        selectionError = false;
                    }
                    default -> {
                        JOptionPane.showMessageDialog(null,"Invalid option.");
                        selectionError = true;
                    }
                }
              }catch(NumberFormatException e){
                 JOptionPane.showMessageDialog(null, "Invalid Option");
                 selectionError = true;
              }
        }while(selectionError);
        String[] pokemonStats = {pokemonName, pokemonHealth, pokemonAttack};
        return pokemonStats;
    }
         public String[] enemyAppear(){
            String enemyName= "", enemyHealth= "", enemyAttack= "";
            boolean selectionError = false;
            do{
                try{
                    int chooseEnemy = Integer.parseInt(JOptionPane.showInputDialog("Wich pokemon do you wanna battle?\n1- Typhlosion\n2- Feraligatr\n3 - Meganium"));
                    switch(chooseEnemy){
                        case 1 ->
                        {
                            enemyName = "Typhlosion";
                            enemyHealth = "100";
                            enemyAttack = "50";
                            selectionError = false;
                            break;
                        }
                        case 2 ->{
                            enemyName = "Feraligatr";
                            enemyHealth = "150";
                            enemyAttack = "35";
                            selectionError = false;
                            break;
                        }
                        case 3 ->{
                            enemyName = "Meganium";
                            enemyHealth = "200";
                            enemyAttack = "20";
                            selectionError = false;
                            break;
                        }
                        default -> {
                            JOptionPane.showMessageDialog(null,"Invalid option.");
                            selectionError = true;
                        }
                     
                }
                          
                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "Invalid Option");
                    selectionError = true;
                }
            }while(selectionError);
            String[] enemyPokemonStats = {enemyName, enemyHealth, enemyAttack};
            return enemyPokemonStats;
         }
}