package Lesson_2;

public class SecondLesson {
    public static void main(String[] args) {
        for (int i=0; i < 10; i++) {
            System.out.println("Hello" + i);
        }

        String letter = "Marina";

        if (letter == "Boris") {
            System.out.println("Give letter to Boris");
        } else if (letter == "Irina") {
            System.out.println("Give letter to Irina");
        } else if (letter == "Marina") {
            System.out.println("Give letter to Marina");
        } else if (letter == "Alex") {
            System.out.println("Give letter to Alex");
        } else {
            System.out.println("Go out office");
        }

        System.out.println("****************");

        switch (letter) {
            case "Boris":
                System.out.println("Give letter to Boris");
                break;
            case "Irina":
                System.out.println("Give letter to Irina");
                break;
            case "Marina":
                System.out.println("Give letter to Marina");
                break;
            case "Alex":
                System.out.println("Give letter to Alex");
                break;
            default:
                System.out.println("Go out office");

        }
        }

    }

