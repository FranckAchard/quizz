import java.util.*;
import java.lang.Math;
import java.util.Scanner;

public class Quizz {
    private static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        int cpt;
        int score;
        
        score = 0;
        String[] questions = new String[3];
        String[] reponsesOK = new String[3];
        String[] reponsesSaisies = new String[3];
        
        // liste questions et reponses attendues
        
        questions[0] = "quelle est la capitale de la France?";
        reponsesOK[0] = "Paris";
        questions[1] = "quel est le meilleur groupe de pop/rock de tous les temps ?";
        reponsesOK[1] = "Beatles";
        questions[2] = "quel est l'âge du capitaine?";
        reponsesOK[2] = "42";
        for (cpt = 0 ; cpt <= 2 ; cpt += 1) {
            if (questionReponse(questions[cpt], reponsesOK[cpt]) == true) {
                score = score + 1;
            }
        }
        System.out.println("Score final = " + score);
    }
    
    private static boolean questionReponse(String question, String reponseOK) {
        boolean resultat;
        String reponseSaisie;
        
        System.out.println(question);
        reponseSaisie = input.nextLine();
        if (reponseSaisie.equals(reponseOK)) {
            System.out.println("Bonne réponse !");
            resultat = true;
        } else {
            System.out.println("Faux ! la bonne réponse est : " + reponseOK);
            resultat = false;
        }
        
        return resultat;
    }
}
