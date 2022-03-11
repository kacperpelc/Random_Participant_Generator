package src.com.intive;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Klaudia", "Patrycja",
                "Weronika", "Agnieszka", "Justyna", "Kacper P.", "Monika", "Krzysiek", "Ania", "Kacper Ł.");

        List<Person> participants = new ArrayList<>();

        for (String name : names) {
            participants.add(new Person(name));
        }

        Person randomPerson;
        String answer;

        Scanner scanner = new Scanner(System.in);

        int isAskedCount = 0;
        Random rand = new Random();

        System.out.println("Hello, do you want to select Patronage member?");

        do {
            answer = scanner.nextLine().toLowerCase();
            if (answer.equals("yes")) {
                do {
                    randomPerson = participants.get(rand.nextInt(participants.size()));

                    if (!randomPerson.getIsAsked()) {
                        randomPerson.setIsAsked(true);
                        System.out.println("The chosen one is " + randomPerson.getName());
                        System.out.println("Do you want to select another Patronage member?");
                        isAskedCount += 1;
                        break;
                    }

                    else if (isAskedCount == participants.size()) {
                        for (Person person : participants) {
                            person.setIsAsked(false);
                        }
                        isAskedCount = 0;
                        System.out.println("Everyone was asked, do you want to play again?");
                        break;
                    }

                }
                while (randomPerson.getIsAsked());
            }

            else if (answer.equals("no")) {
                System.out.println("Bye");
                return;
            }

            else
                System.out.println("Do you want to select Patronage member? Just type YES or NO!");
        }

        while(!answer.equals("no"));
        System.out.println(answer);
    }
}
