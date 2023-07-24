# Introduction
An adventure game is designed in Java language in accordance with OOP principles. The game is designed based on text.

#### Characters

| Character| Damage | Health | Money |
| -------- | ------- |--------|-------|  
| Samurai  |   5     |   21   |   15  |
| Archer   |   7     |   18   |   20  |
| Knighter |   8     |   24   |   5   |

#### Obstacles

| Obstacle | Damage  | Health | Money |
| -------- | ------- |--------|-------|  
| Zombie   |   3     |   10   |   4   |
| Vampire  |   4     |   14   |   7   |
| Bear     |   7     |   20   |   12  |

#### Weapons

| Weapon   | Damage  | Money  |
| -------- | ------- |--------|  
| Gun      |   2     |   25   |
| Sword    |   3     |   35   |
| Rifle    |   7     |   45   |

#### Armors

| Armor    | Damage  | Money  |
| -------- | ------- |--------|  
| Light    |   1     |   15   |
| Medium   |   3     |   25   |
| Heavy    |   5     |   40   |

# How to play
- You can choose your character and give a name to your character.
- 
    1- Player enters name first

    2- Player chooses character

    3- The player chooses which location to go to
     * Health regenerates if player chooses Safe House
     * If the player chooses the Store, they can buy armor or weapons.
     * If the player chooses Jungle, he is fighting a random number of vampires. If he wins, he will receive money and wood as loot.
     * If the player chooses Cave, he is fighting a random number of zombies. If he wins, he will receive money and food as loot.
     If the player chooses River, they are fighting a random number of bears. If he wins, he will receive money and water as loot.

     4- If the player's health is 0, the game is over.
     
     5- If the player stops by all the locations and collects all the loot and does not die, they will win the game.


# Installation
- Clone the repo
If you want to clone and work on this repository locally, you can follow these steps:

1. Fork the repository
2. Clone it to your local machine
3. Navigate to the project directory
4. Run the following commands:
```
$ javac Main.java
$ java Main
```

# Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.






