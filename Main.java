import java.io.IOException;
import java.util.*;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Main {

    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException{
        Random random = new Random();
       
        int menu=1;
        int stat =0;
        // int round = 1;
        
        
        String[] ninjadeck = {"Naruto", "Sasuke", "Sakura", "Kakashi"};


        Scanner input = new Scanner(System.in);
        System.out.printf("\n%s%n Welcome to Ninja Battle\n%n", "=".repeat(100));

        //PERULANGAN UTAMA
        while (true) {
            Naruto Naruto = new Naruto();
            Sasuke Sasuke = new Sasuke();
            Sakura Sakura = new Sakura();
            Kakashi Kakashi = new Kakashi();

            Ninja pick = Naruto;
            // String pick2;
            Ninja pick2 = Naruto;
            String enemy2;


            int round = 1;

            if (stat == 0) {
                while (true) {
                    System.out.printf("%s%n", "=".repeat(100));
                    System.err.println("1. VS Battle\n2. Practice\n3. Exit");
                    System.err.print("= ");
                    if (input.hasNextInt()) {
                        stat = input.nextInt();
                        if (stat != 1 && stat != 2 && stat != 3) {
                            System.err.println("Please choose 1/2/3");
                            System.out.printf("\n%s%n", "=".repeat(100));
                        }
                        else{
                            break;
                        }
                    }
                    else{
                        System.err.println("Invalid input");
                        input.next();
                        System.out.printf("%s%n", "=".repeat(100));
                    }
                }
            }
            else if (stat == 1) {
                while (true) {
                    System.out.printf("\n%s%n", "=".repeat(100));
                    System.err.print("Choose your battle field : \n1. Single battle\n2. Tag Team\n= ");
                    if (input.hasNext()) {
                        menu = input.nextInt();
                        if (menu != 1 && menu != 2) {
                            System.err.println("Please choose 1 or 2");
                            System.out.printf("\n%s%n", "=".repeat(100));
                        }
                        else{
                            break;
                        }
                    }
                    else{
                        System.err.println("Invalid input");
                        input.next();
                        System.out.printf("%s%n", "=".repeat(100));
                    }
                }
    
                if (menu == 1) {
                    System.out.printf("\n%s%n", "=".repeat(100));
                    while (true) {
                        System.err.print("Player 1 :\nPlease pick a ninja : \n1. Naruto\n2. Sasuke\n3. Sakura\n4. Kakashi\n= ");
                        if (input.hasNext()) {
                            menu = input.nextInt();
                            if (menu != 1 && menu != 2 && menu != 3 && menu != 4) {
                                System.err.println("Invalid input");
                                System.out.printf("\n%s%n", "=".repeat(100));
                            }
                            else{
                                break;
                            }
                        }
                        else{
                            System.err.println("Invalid input");
                            input.next();
                            System.out.printf("%s%n", "=".repeat(100));
                        }
                    }  
    
                    if (menu == 1) {
                        pick = Naruto;
                        AudioFile.AudioSorted("Audio\\Naruto\\Naruto.wav");
                    }
                    else if (menu == 2) {
                        pick = Sasuke;
                        AudioFile.AudioSorted("Audio\\Sasuke\\Sasuke.wav");
                    }
                    else if (menu == 3) {
                        pick = Sakura;
                        AudioFile.AudioSorted("Audio\\Sakura\\Sakura.wav");
                    }
                    else if (menu == 4) {
                        pick = Kakashi;
                        AudioFile.AudioSorted("Audio\\Kakashi\\Kakashi.wav");
                    }
    
                    while (true) {
                        System.err.print("\nPlayer 2: \nPlease pick a ninja : \n1. Naruto\n2. Sasuke\n3. Sakura\n4. Kakashi\n= ");
                        if (input.hasNext()) {
                            menu = input.nextInt();
                            if (menu != 1 && menu != 2 && menu != 3 && menu != 4) {
                                System.err.println("Invalid input");
                                System.out.printf("\n%s%n", "=".repeat(100));
                            }
                            else{
                                break;
                            }
                        }
                        else{
                            System.err.println("Invalid input");
                            input.next();
                            System.out.printf("%s%n", "=".repeat(100));
                        }
                    }
    
                    if (menu == 1) {
                        pick2 = Naruto;
                        AudioFile.AudioSorted("Audio\\Naruto\\Naruto.wav");
                    }
                    else if (menu == 2) {
                        pick2 = Sasuke;
                        AudioFile.AudioSorted("Audio\\Sasuke\\Sasuke.wav");
                    }
                    else if (menu == 3) {
                        pick2 = Sakura;
                        AudioFile.AudioSorted("Audio\\Sakura\\Sakura.wav");
                    }
                    else if (menu == 4) {
                        pick2 = Kakashi;
                        AudioFile.AudioSorted("Audio\\Kakashi\\Kakashi.wav");
                    }
                }
    
                else if (menu == 2) { // not finish yet
                    System.out.println("Coming soon");
                    break;

                    // int number = 1;
                    // System.out.printf("\n%s%n", "=".repeat(100));
                    // while (true) {
                    //     System.err.print("Please pick a ninja : ");
                    //     for (String picking : ninjadeck) {
                    //         System.out.println(number + ". " + picking);
                    //         number++;
                    //     }
                    //     if (input.hasNext()) {
                    //         menu = input.nextInt();
                    //         if (menu != 1 && menu != 2 && menu != 3 && menu != 4) {
                    //             System.err.println("Invalid input");
                    //             System.out.printf("\n%s%n", "=".repeat(100));
                    //         }
                    //         else{
                    //             break;
                    //         }
                    //     }
                    //     else{
                    //         System.err.println("Invalid input");
                    //         input.next();
                    //         System.out.printf("%s%n", "=".repeat(100));
                    //     }
                    // }
                    // if (menu == 1) {
                    //     pick = Naruto;
                    //     ninjadeck[0] = " ";
                    // }
                    // else if (menu == 2) {
                    //     pick = Sasuke;
                    // }
                    // else if (menu == 3) {
                    //     pick = Sakura;
                    // }
                    // else if (menu == 4) {
                    //     pick = Kakashi;
                    // }
    
                }

                //   MULAI OKE GAS
                System.out.printf("%s%n", "=".repeat(100));
                System.err.println("\nGame start in");
                System.err.println("3");
                Thread.sleep(1000);
                System.err.println("2");
                Thread.sleep(1000);
                System.err.println("1");
                Thread.sleep(1000);
                System.out.printf("%s%n", "=".repeat(100));

                int randomMusic = random.nextInt(2);
                // if (randomMusic == 0) {
                //     Ninja.Audio("Audio\\Music\\Battle0.wav");
                // }
                // else{
                //     Ninja.Audio("Audio\\Music\\Battle0.wav");
                // }
                
        
                while (true) {
                    if (pick2.getHealth() <= 0) {
                        System.out.printf("%s%n", "=".repeat(100));
                        System.out.println(pick.getName() + " win !");
                        System.out.printf("%s%n", "=".repeat(100));
                        while (true) {
                            System.out.print("1. Play again\n2. Back to menu\n= ");
                            menu = input.nextInt();
                            if (menu == 1) {
                                break;
                            }
                            else if (menu == 2) {
                                stat = 0;
                                break;
                            } 
                        }
                        break;
                    }
                    else if (pick.getHealth() <= 0) {
                        System.out.printf("%s%n", "=".repeat(100));
                        System.out.println(pick2.getName() + " win !");
                        System.out.printf("%s%n", "=".repeat(100));
                        while (true) {
                            System.out.print("1. Play again\n2. Back to menu\n= ");
                            menu = input.nextInt();
                            if (menu == 1) {
                                break;
                            }
                            else if (menu == 2) {
                                stat = 0;
                                break;
                            }
                        }
                        break;
        
                    }
                    else{
                        System.out.printf("%s%n", "=".repeat(100));
                        System.out.println("Round " + round);
                        round++;
                        System.out.printf("%s%n", "=".repeat(100));
                        System.out.println("\nPlayer 1 :");               
                        System.out.println("Health: " + pick.getHealth());
                        System.out.println("Armor: " + pick.getArmor());
                        System.out.println("Chakra: " + pick.getChakra());
                        // System.out.printf("%s%n", "=".repeat(100));
                        System.out.println();
                        System.out.println(pick.getName() + "'s skill : ");
                        pick.skill(pick2);
                        Thread.sleep(2000);
                        
                        // Menampilkan status setelah serangan
                        

                        System.out.println("\nPlayer 2 :");
                        System.out.println("Target Health: " + pick2.getHealth());
                        System.out.println("Target Armor: " + pick2.getArmor());
                        System.out.println("Target Chakra: " + pick2.getChakra());
                        // System.out.printf("%s%n", "=".repeat(100));
                        System.out.println();
                        System.out.println(pick2.getName() + "'s skill : ");
                        pick2.skill(pick);
                        Thread.sleep(2000);

                        

                        // break;
                        

                        
                    }
                }

            }
            else if (stat == 2) {
                System.out.println("Coming soon");
                break;
            }
            else if (stat == 3) {
                System.exit(0);
            }
        }
        
    }
}

