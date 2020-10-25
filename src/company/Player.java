package company;

import java.util.*;

public class Player {
    private String playerName;
    public int playerMoney = 10000;

    //Creating the arraylists for each player
    public ArrayList<Animal> animals = new ArrayList<Animal>();
    public ArrayList<Food> foods = new ArrayList<Food>();
    //Constructor for the player

    public Player(String name) {
        playerName = name;
    }

    //Methods the player may use
    public int getCash() {
        return playerMoney;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void removeCash(int cash) {
        playerMoney = playerMoney - cash;
    }

    public void sellAnimal(Player player) {
        Scanner input = new Scanner(System.in);
        var animalsToDelete = new ArrayList<Animal>();
        int x = 0;
        System.out.println("-Select which animal you want to sell-");
        for (var animal : animals) {
            System.out.println(x + " " + animal.getName() + " is currently worth $"
                    + (animal.getInitialPrice() * animal.getHealth()));
            x++;
        }
        int choice = 0;
        tryCatchingNumbers(choice);
        int price = animals.get(choice).getInitialPrice() * animals.get(choice).getHealth();
        player.playerMoney = price + player.playerMoney;
        System.out.println("--------------------------\n" +
                "You just sold " + animals.get(choice).getName() + " for $"
                + (animals.get(choice).getInitialPrice() * animals.get(choice).getHealth()));
        System.out.println("Your new balance is $" + player.playerMoney);
        System.out.println("---------------------------");
        animalsToDelete.add(animals.get(choice));

        for (var i = animals.size() - 1; i >= 0; i--) {

            if (i == choice) {
                animals.remove(choice);
            }
        }
    }

    public void printAnimals() {

        int id = 0;
        var animalsToDelete = new ArrayList<Animal>();

        for (var animal : animals) {
            if (animal.health > 1) {
                System.out.println(id + " " + animal.getName() + " has " + animal.getHealth() + "% health");
                id++;
            } else if (animal.health < 1) {
                animalsToDelete.add(animal);
            }
        }
        for (var key : animalsToDelete) {
            animals.remove(key);
        }
    }

    public void breedAnimal(Player player) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int randNum = rand.nextInt(101);
        int animal2;
        int animal1;
        do {
            int x = 0;
            for (var animal : animals) {
                System.out.println(x + " " + animal.getName());
                x++;
            }
            System.out.println("Pick the first animal to breed");
            animal1 = input.nextInt();
            System.out.println("Pick the second animal to breed with");
            animal2 = input.nextInt();

        } while (animal1 == animal2);

        if (animals.get(animal1).getType() != animals.get(animal2).getType()) {
            System.out.println("You can't breed different animal types.");
        } else {

            if (randNum > 50) {
                System.out.println("You bred " + animals.get(animal1).getName() + " with " + animals.get(animal2).getName());
                System.out.println("Please type the name of the new animal: ");
                String babyName = input.next();
                String gender = player.rollGender();
                if (animals.get(animal1).getType() == "Fish") {
                    player.animals.add(new Fish(babyName, gender));
                } else if (animals.get(animal1).getType() == "Hamster") {
                    player.animals.add(new Hamster(babyName, gender));
                } else if (animals.get(animal1).getType() == "Cat") {
                    player.animals.add(new Cat(babyName, gender));
                } else if (animals.get(animal1).getType() == "Dog") {
                    player.animals.add(new Dog(babyName, gender));
                } else if (animals.get(animal1).getType() == "Monkey") {
                    player.animals.add(new Monkey(babyName, gender));
                }
                System.out.println("The breeding was successful.");
                System.out.println("The new animal is a " + animals.get(animal1).getType() +
                        " and it is called " + babyName);
            } else {
                System.out.println("The breeding failed.");
            }
        }
    }

    public void feedAnimal(Player player) {
        Scanner input = new Scanner(System.in);
        var foodToDelete = new ArrayList<Food>();
        if (player.animals.size() > 0 && player.foods.size() > 0) {
            System.out.println("Select which animal you would like to feed");
            int x = 0;
            for (var animal : animals) {
                System.out.println(x + " " + animal.getName() + " has " + animal.getHealth() + "% health");
                x++;
            }
            int animalChoice = 0;
            tryCatchingNumbers(animalChoice);

            if(animals.get(animalChoice).getType().contains("Fish")){
                int count = 0;
                int noFood= 0;
                for (var food : foods){
                    if (food.getType().equals("FishFood")){
                        System.out.println(count + " 1 kg of " + food.getType());
                        noFood++;
                        count++;
                    }
                }
                if(noFood == 0){
                    System.out.println("You have no fish food");
                }else{
                    System.out.println("Select which food you would like to feed your animal with ");
                    int fishFoodChoice = 0;
                    tryCatchingNumbers(fishFoodChoice);
                    animals.get(animalChoice).health = animals.get(animalChoice).health + foods.get(fishFoodChoice).getHealthPoints();
                    foods.get(fishFoodChoice).healthPoints =+ animals.get(animalChoice).health;
                    foodToDelete.add(foods.get(fishFoodChoice));
                    for(var key : foodToDelete){
                        foods.remove(key);
                    }
                    System.out.println(animals.get(animalChoice).getName() + " now has " + animals.get(animalChoice).health + "% health \n");
                    System.out.println("-------------------");
                }
            }
            if(animals.get(animalChoice).getType().contains("Hamster")){
                int count = 0;
                int noFood= 0;
                for (var food : foods){
                    if (food.getType().equals("Carrot")){
                        System.out.println(count + " 1 kg of " + food.getType());
                        noFood++;
                        count++;
                    }
                }
                if(noFood == 0){
                    System.out.println("You have no carrots.");
                }else{
                    System.out.println("Select which food you would like to feed your animal with ");
                    int hamsterFoodChoice = 0;
                    tryCatchingNumbers(hamsterFoodChoice);
                    animals.get(animalChoice).health = animals.get(animalChoice).health + foods.get(hamsterFoodChoice).getHealthPoints();
                    foods.get(hamsterFoodChoice).healthPoints =+ animals.get(animalChoice).health;
                    foodToDelete.add(foods.get(hamsterFoodChoice));
                    for(var key : foodToDelete){
                        foods.remove(key);
                    }
                    System.out.println(animals.get(animalChoice).getName() + " now has " + animals.get(animalChoice).health + "% health \n");
                    System.out.println("-------------------");
                }
            }
            if(animals.get(animalChoice).getType().contains("Cat")){
                int count = 0;
                int noFood= 0;
                for (var food : foods){
                    if (food.getType().equals("Meat")){
                        System.out.println(count + " 1 kg of " + food.getType());
                        noFood++;
                        count++;
                    }
                }
                if(noFood == 0){
                    System.out.println("You have no meat.");
                }else{
                    System.out.println("Select which food you would like to feed your animal with ");
                    int catFoodChoice = 0;
                    tryCatchingNumbers(catFoodChoice);
                    animals.get(animalChoice).health = animals.get(animalChoice).health + foods.get(catFoodChoice).getHealthPoints();
                    foods.get(catFoodChoice).healthPoints =+ animals.get(animalChoice).health;
                    foodToDelete.add(foods.get(catFoodChoice));
                    for(var key : foodToDelete){
                        foods.remove(key);
                    }
                    System.out.println(animals.get(animalChoice).getName() + " now has " + animals.get(animalChoice).health + "% health \n");
                    System.out.println("-------------------");
                }
            }
            if(animals.get(animalChoice).getType().contains("Dog")){
                int count = 0;
                int noFood= 0;
                for (var food : foods){
                    if (food.getType().equals("Meat")){
                        System.out.println(count + " 1 kg of " + food.getType());
                        noFood++;
                        count++;
                    }
                }
                if(noFood == 0){
                    System.out.println("You have no meat food");
                }else{
                    System.out.println("Select which food you would like to feed your animal with ");
                    int dogFoodChoice = 0;
                    tryCatchingNumbers(dogFoodChoice);
                    animals.get(animalChoice).health = animals.get(animalChoice).health + foods.get(dogFoodChoice).getHealthPoints();
                    foods.get(dogFoodChoice).healthPoints =+ animals.get(animalChoice).health;
                    foodToDelete.add(foods.get(dogFoodChoice));
                    for(var key : foodToDelete){
                        foods.remove(key);
                    }
                    System.out.println(animals.get(animalChoice).getName() + " now has " + animals.get(animalChoice).health + "% health \n");
                    System.out.println("-------------------");
                }
            }
            if(animals.get(animalChoice).getType().contains("Monkey")){
                int count = 0;
                int noFood= 0;
                for (var food : foods){
                    if (food.getType().equals("Carrot")){
                        System.out.println(count + " 1 kg of " + food.getType());
                        noFood++;
                        count++;
                    }
                }
                if(noFood == 0){
                    System.out.println("You have no carrots food");
                }else{
                    System.out.println("Select which food you would like to feed your animal with ");
                    int monkeyFoodChoice = 0;
                    tryCatchingNumbers(monkeyFoodChoice);
                    animals.get(animalChoice).health = animals.get(animalChoice).health + foods.get(monkeyFoodChoice).getHealthPoints();
                    foods.get(monkeyFoodChoice).healthPoints =+ animals.get(animalChoice).health;
                    foodToDelete.add(foods.get(monkeyFoodChoice));
                    for(var key : foodToDelete){
                        foods.remove(key);
                    }
                    System.out.println(animals.get(animalChoice).getName() + " now has " + animals.get(animalChoice).health + "% health \n");
                    System.out.println("-------------------");
                }
            }
        }else{
            System.out.println("You are missing either animals or food in order to feed animal.");
        }
    }

    public void healthDecay() {
        for (var animal : animals) {
            Random rand = new Random();
            var value = 10 + rand.nextInt(20);
            animal.health = animal.health - value;
        }
    }

    public String rollGender() {
        Random rand = new Random();
        var number = rand.nextInt(2) + 1;
        if (number == 1) {
            return "Male";
        } else if (number == 2) {
            return "Female";
        } else {
            return null;
        }
    }

    public int tryCatchingNumbers(int choice) {
        Scanner input = new Scanner(System.in);
        choice = 0;
        boolean continueLoope = false;
        boolean choiceInRange = true;
        while (!continueLoope) {
            try {
                choice = input.nextInt();
                if (choice <= animals.size()) {
                    continueLoope = true;
                } else {
                    System.out.println("The number you typed is outside the array of animals.");
                    continue;
                }
            } catch (InputMismatchException e) {
                System.out.println("Wrong type of input");
                input.next(); // clear scanner wrong input
            }
        }
        return choice;
    }
}


