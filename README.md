# SNAKES & LADDERS 1D JAVA
A command-line implementation of the 1D Snakes and Ladders game using Java and OOPS concepts.

### This Snakes and Ladders game has been developed in java using object oriented programming concepts such as data encapsulation, abstraction, class relationships, inheritance, polymorphism, etc.

##### Note: Final updated project files are in "Project Files-Updated" folder.

## How to run??
    1. Setup a project after installing JDK 16(prefered) or above.
    2. Add the project files to the src folder.
    3. Now run the project using TwoPlay as the main class.

## About

This game has a single player and duel players mde game with really simple objectives: 
    For single player, how many game points the player obtained when he or she completed the game.
    For duel players, who finshes the game first.

As visible in the Snake&Ladder_Visual.png image, the game consists of 14 floors and it counts the total points collected during the game play. Negative points are also allowed in the game. Location of all floors are similar to that in the Snake&Ladder_Visual.png image.
There are different types of floors
    1. empty floor
    2. snake floor
    3. ladder floor

There are two types of snake floors:
    1. normal
    2. king cobra
    
There are two types of ladders:
    1. normal
    2. elevator

Whenever a player moves to any floor, he/she has to jump on the floor to know the type of floor:
        ● Empty floor rewards the player with one point and displays the message that player has reached an empty floor.
        ● Normal snake floor would deduct two points from total and would display the message that player has reached normal snake floor. After this it will move
          the player’s position to the first floor.
        ● King cobra snake would deduct four points from total and would display the message that player has reached king cobra. After this it will move the
          player’s position to the third floor.
        ● Ladder floor rewards the player with two points and displays the message that the player has reached a ladder floor. After this it will move the
          player’s position to the twelfth floor.
        ● Elevator floor rewards the player with four points and displays the message that the player has reached the elevator floor. After this it will move the
          player’s position to the tenth floor.
          
The game has a special dice that has only two faces, 1 and 2. When a dice is thrown, it returns a randomly chosen face value. The game is started only when the player gets 1 on the Dice.

