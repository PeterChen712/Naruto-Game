import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;
import java.util.*;

// Class Induk atau superclass
abstract class Ninja{
    // Atribut
    protected String name;
    protected String type;
    protected String rank;
    protected double attack;
    protected double health;
    protected double armor;
    protected double chakra;

    // Constructor
    protected Ninja(String name, String type, String rank, double attack,double health, double armor, double chakra) {
        this.name = name;
        this.type = type;
        this.rank = rank;
        this.attack = attack;
        this.health = health;
        this.armor = armor;
        this.chakra = chakra;
    }

    public String getName(){
        return name;
    }

    public String getType(){
        return type;
    }

    public String getRank(){
        return rank;
    }

    public double getHealth() {
        return health;
    }

    public double getArmor(){
        return armor;
    }

    public double getChakra(){
        return chakra;
    }

    abstract void skill(Ninja target) throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException;

}



class Naruto extends Ninja{
    // Constructor khusus untuk Naruto
    private Sage sage;
    private KCM ksm;

    public Naruto(){
        super("Naruto Uzumaki", "Attack", "C", 500,7000, 200, 1000);
    }
    
    Random random = new Random();
    boolean angry = false;
    // boolean sage = false ;
    int bunshin = 0;

    // @Override
    void skill(Ninja target) throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException{
        if (angry == true) {
            if (chakra >= 3000) {
                System.out.println("Naruto now can controlled Kyubi's chakra " + "\u001B[34m" + "(+3000) " + "\u001B[0m" + "\u001B[32m" + "(+5000) " + "\u001B[0m" + "\u001B[31m" + "(+1500)" + "\u001B[0m");
                chakra += 3000;
                health += 5000;
                attack += 1500;
                angry = false;

            }
            else{
                bunshin = 0;
                int randomNumber = random.nextInt(1);
                if (randomNumber == 0) {
                    System.out.println("Nine tails claws !!!");
                    if (target.getArmor() >0) {
                        target.armor -= attack * (20/100);
                        target.health -= attack * (100/100);
                    }
                    else{
                        target.health -= attack * (20/100);
                    }
                }
                else if (randomNumber == 1) {
                    System.out.println("Biju dama !!!");
                    if (target.getArmor() >0) {
                        target.armor -= attack * (300/100);
                        target.health -= attack * (100/100);
                    }
                    else{
                        target.health -= attack * (300/100);
                    }
                }
                // KE MODE KURAMA
                else if (randomNumber == 2) { 
                    System.out.println("Chakra filled " + "\u001B[34m" + "(+250)" + "\u001B[0m");
                    chakra += 250;
                    
                }
            }


        }
        else if (chakra <= 0) {
            System.out.println("Naruto is filled up by Kyubi's chakra " + "\u001B[34m" + "(+2000) " + "\u001B[0m" + "\u001B[32m" + "(+100)" + "\u001B[0m");
            System.out.println("Grrraaahh !!!");
            AudioFile.Audio("Audio\\Naruto\\Transform\\kyubi chakra undercontrol.wav");
            angry = true;
            chakra += 2000;

            
        }
        else{
            while (true) {
                System.out.print("1. Fill chakra\n2. Kagebunshin no jutsu\n3. Rasengan\n4. Rasen Shuriken\n= ");
                Scanner input = new Scanner(System.in);
                int menu = input.nextInt();
    
                if (menu == 1) { 
                    System.out.println("Chakra filled " + "\u001B[34m" + "(+100)" + "\u001B[0m");
                    AudioFile.Audio("Audio\\Effect\\FIll chakra.wav");
                    chakra+=100;
                    break;
                }
                else if (menu == 2) {
                    System.err.println("Naruto : KageBunshin no jutsu");
                    AudioFile.Audio("Audio\\Naruto\\Kage bunshin\\Activating_Kage_Bunshin_no_Jutsu_(Naruto_Anime)_-_Sound_Effect_for_editing.wav");
                    while (true) {
                        System.err.print("Total bunshin : ");
                        int tambah_bunshin = input.nextInt();
                        if (bunshin < 0) {
                            System.err.println("Invalid input");
                        }
                        else{
                            bunshin += tambah_bunshin;
                            System.out.println("Total bunshin " + bunshin);
                            break;
                        }
                    }
                    break;
                
                }
                else if (menu == 3) {
                    if (bunshin > 2) {
                        System.out.println("Naruto : Rasen tarengan ");
                        
                    }


                    System.out.println("Naruto : Rasengan");
                    chakra -= 20;
                    AudioFile.Audio("Audio\\Naruto\\Rasengan\\rasengan.wav");
                    int acc = 100;
                    if (target.getArmor() >0) {
                        target.armor -= attack * (50/100);
                        target.health -= attack * (20/100);
                    }
                    else{
                        target.health -= attack * (50/100);
                    }

                    break;

                }
                else if (menu == 4) {
                    System.out.println("Naruto : Futon Rasen shuriken ");
                    AudioFile.AudioSorted("Audio\\Naruto\\Rasengan\\rasen shuriken.wav");
                    AudioFile.AudioSorted("Audio\\Effect\\Rasen shuriken effect.wav");
                    AudioFile.Audio("Audio\\Effect\\exploit.wav");
                    target.health -= attack;
                    chakra -= 400;
                    break;
                    
                }
                else{
                    System.out.println("Invalid input");
                }
                input.close();
            }
        }
        
        

    }

    class Sage{
        
    }

    class KCM{

    }

}



class Sasuke extends Ninja{
    public Sasuke(){
        super("Sasuke Uchiha", "Assasint","B",800,7000, 150, 1000);
    }


    // @Override
    public void skill(Ninja target) throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException{
        while (true) {
            System.out.print("1. Fill chakra\n2. Chidori\n3. Katon gokakyu\n= ");
            Scanner input = new Scanner(System.in);
            int menu = input.nextInt();

            if (menu == 1) { 
                System.out.println("Chakra filled " + "\u001B[34m" + "(+100)" + "\u001B[0m");
                chakra+=100;
                AudioFile.Audio("Audio\\Effect\\FIll chakra.wav");
                break;
            }
            else if (menu == 2) {
                System.out.println("Sasuke : Chidori");

                if (target.getArmor() >0) {
                    target.armor -= attack * (50/100);
                    target.health -= attack * (20/100);
                }
                else{
                    target.health -= attack * (50/100);
                }

                AudioFile.Audio("Audio\\Sasuke\\Chidori\\chidori.wav");
                AudioFile.Audio("Audio\\Effect\\chidori effect.wav");
                AudioFile.Audio("Audio\\Effect\\chidori effect.wav");
                break;
            }
            else if (menu == 3) {
                System.out.println("Sasuke : Katon gokakyu no jutsu");
                if (target.getArmor() >0) {
                    target.armor -= attack * (50/100);
                    target.health -= attack * (20/100);
                }
                else{
                    target.health -= attack * (50/100);
                }
                AudioFile.AudioSorted("Audio\\Sasuke\\Sasuke_Katon_Goukakyuu.wav");
                AudioFile.Audio("Audio\\Effect\\goukakyu effect.wav");
                break;
            }
            else{
                System.out.println("Invalid input");
            }
            input.close();
        }
    }
}
class Sakura extends Ninja{
    public Sakura(){
        super("Sakura Haruno", "Healer","C",300,5000, 90, 600);
    }
    // @Override
    public void skill(Ninja target) throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException{
        while (true) {
            System.out.print("1. Fill chakra\n2. Shannaro\n3. Heal jutsu\n= ");
            Scanner input = new Scanner(System.in);
            int menu = input.nextInt();

            if (menu == 1) { 
                System.out.println("Chakra filled " + "\u001B[34m" + "(+100)" + "\u001B[0m");
                chakra+=100;
                AudioFile.Audio("Audio\\Effect\\FIll chakra.wav");
                break;
            }
            else if (menu == 2) {
                System.out.println("Sakura : Shannaroo !!!");
                target.health -= attack;
                break;
            }
            else if (menu == 3) {
                if (health <= 1000) {
                    System.out.println("Health++ " + "\u001B[32m" + "(+500)" + "\u001B[0m");
                    health += 500;
                    break;
                }
                else{
                    System.out.println("Health++ " + "\u001B[32m" + "(+200)" + "\u001B[0m");
                    health += 200;
                    break;
                }
            }
            else{
                System.out.println("Invalid input");
            }
            input.close();
        }
    }
}

class Kakashi extends Ninja{
    public Kakashi(){
        super("Kakashi Hatake", "Assasint","A",1000,6000, 110, 900);
    }
    // @Override
    public void skill(Ninja target) throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException{
        while (true) {
            System.out.print("1. Fill chakra\n2. Raikiri\n= ");
            Scanner input = new Scanner(System.in);
            int menu = input.nextInt();

            if (menu == 1) { 
                System.out.println("Chakra filled " + "\u001B[34m" + "(+100)" + "\u001B[0m");
                chakra+=100;
                AudioFile.Audio("Audio\\Effect\\FIll chakra.wav");
                break;
            }
            else if (menu == 2) {
                System.out.println("Kakashi : Raikiri");

                if (target.getArmor() >0) {
                    target.armor -= attack * (50/100);
                    target.health -= attack * (20/100);
                }
                else{
                    target.health -= attack * (50/100);
                }
                break;
            }
            else{
                System.out.println("Invalid input");
            }
            input.close();
        }
    }
}







