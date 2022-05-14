public class Character {
    public String characterName = "Gandalf";
    public int level = 0;
    public int healthPoints = 100;
    public int manaPoints = 200;

    /**
     * Create two Constructors
     * 1 - Non Parameterized Constructor
     * 2 - Parameterized Constructor Initializing healthPoints, level, CharacterName
     * and mana
     */

    Character(String name, int HP, int lvl, int mana)
    {
        characterName = name;
        level = lvl;
        healthPoints = HP;
        manaPoints = mana;

    }

    /**
     * Create a Method that displays the Name of the Character
     * eg. "Character Initialized : Gandalf"
     */
    Character(String name) {
        characterName = name;
    }

    /**
     * Create a method to Damage Target Character
     */

    public void damageTarget(Character enemyCharacter, int damagePoints, int manacost) {
        /**
         * Deduct health points from enemy character
         */
        enemyCharacter.healthPoints -= damagePoints;
        enemyCharacter.manaPoints -= manacost;
        System.out.println("Enemy character HP Left is " + enemyCharacter.healthPoints + " and mana left is "
                + enemyCharacter.manaPoints);

        /**
         * Prompt Character is defeated if HP falls below 0
         * eg. Character Shaman defeated.
         */
        if (enemyCharacter.healthPoints <= 0) {
            System.out.println("\nCharacter " + enemyCharacter.characterName + " is defeated.");
        }

    }

    public void damageGet(Character mainCharacter, int dp, int manacost) {
        mainCharacter.healthPoints -= dp;
        mainCharacter.manaPoints -= manacost;
        System.out.println("Main character HP left is " + mainCharacter.healthPoints + " and mana left is "
                + mainCharacter.manaPoints);

        if (mainCharacter.healthPoints <= 0) {
            System.out.println("\nCharacter " + mainCharacter.healthPoints + " is defeated");
        }
    }

    public void increase(Character enemyCharacter, int addhp, int addmana) {
        enemyCharacter.healthPoints += addhp;
        enemyCharacter.manaPoints += addmana;
        System.out.println("Increase HP by " + addhp + " and also mana is increase by " + addmana);

        if (enemyCharacter.healthPoints <= 20)
        {
            System.out.println("Increase HP by" + enemyCharacter.healthPoints);
        }
    }

    public static int levelup = 10;

    Character(int levels)
    {
        if (levelup > levels)
            level = levelup;
    }
}