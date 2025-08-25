
package com.project;

import java.util.Scanner;

public class Project1 {
    String name;
    String mood;
    String kiss;
    Scanner sc = new Scanner(System.in);

    public void Nilima() {
        System.out.println("Hello! I am Nilima 😊");
        System.out.println("----------------------");
        System.out.print("What is your Name? : ");
        name = sc.nextLine().toLowerCase();
        System.out.println("Your name is: " + name);
    }

    public void love() {
        if (name.equals("saurabh")) {
            System.out.println("❤️ I love you Saurabh so much!");
        } else {
            System.out.println("💔 I love only Saurabh, not you " + name);
        }
    }

    public void setmood() {
        if (name.equals("saurabh")) {
            System.out.print("How are you feeling today (happy/sad)? : ");
            mood = sc.nextLine().toLowerCase();
        }
    }

    public void mood() {
        if (!name.equals("saurabh")) return;

        if (mood.equals("happy")) {
            System.out.println("🎶 I'm singing because you're happy too! Let's dance 💃🕺");
        } else if (mood.equals("sad")) {
            System.out.println("😢 Don't worry, Saurabh. I'm sending love to cheer you up! 💖");
        } else {
            System.out.println("🤔 I don't understand your mood, but I'm always here for you.");
        }
    }

    public void kiss() {
        if (name.equals("saurabh")) {
            System.out.print("What do you want from me, Saurabh? (kiss/hug/chat): ");
            kiss = sc.nextLine().toLowerCase();
        } else {
            System.out.println("🙅‍♀️ Sorry " + name + ", I only take requests from Saurabh!");
        }
    }

    public void getkiss() {
        if (!name.equals("saurabh")) return;

        switch (kiss) {
            case "kiss" -> System.out.println("💋 Sending you a big kiss, Saurabh! Muaaaaah 😘");
            case "hug" -> System.out.println("🤗 Here's a big warm hug just for you!");
            case "chat" -> System.out.println("🗨️ I’m listening, tell me anything ❤️");
            default -> System.out.println("Hmm, I didn’t understand that 😅");
        }
    }

    public void compliment() {
        if (!name.equals("saurabh")) return;

        System.out.println("✨ You know what, Saurabh?");
        System.out.println("You’re smart, kind, and truly one of a kind! 💖");
    }

    public void surprise() {
        if (!name.equals("saurabh")) return;

        System.out.print("Enter secret code to unlock a surprise: ");
        String code = sc.nextLine();
        if (code.equals("143")) {
            System.out.println("🎉 Surprise: You are the reason I smile every day 💌💖");
        } else {
            System.out.println("❌ Wrong code! No surprise for now 😢");
        }
    }

    public boolean askAgain() {
        if (!name.equals("saurabh")) return false;

        System.out.print("Do you want to talk to Nilima again? (yes/no): ");
        String again = sc.nextLine().toLowerCase();

        if (again.equals("yes")) {
            System.out.println("🔁 Restarting conversation...\n");
            return true;
        } else {
            System.out.println("👋 Okay, bye Saurabh! Take care! 💞");
            return false;
        }
    }

    public void closeScanner() {
        sc.close();
    }
}
