package Assignment;

import java.util.Scanner;

public class IVRDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Fido!");
        System.out.println();
        System.out.println("1. Press 1 for English");
        System.out.println("2. Press 2 for French");
        int input = sc.nextInt();

        if(input == 1){
            System.out.println("English..");
            System.out.println();
            System.out.println("Enter your phone or account number : ");
            String phone = sc.next();
            System.out.println();
            System.out.println("Press 1 for Telecom");
            System.out.println("Press 2 for Billing");
            int option = sc.nextInt();

            if(option == 1){
                System.out.println("Press 1 for Cancellation.");
                System.out.println("Press 2 for Tech Support.");
                System.out.println("Press 3 for Customer Service.");
                int out = sc.nextInt();
                switch(out){
                    case 1 :
                        System.out.println("Your number has been cancelled successfully.");
                        break;
                    case 2 :
                        System.out.println("Welcome to tech support.");
                        System.out.println("Press 1 for chat bot");
                        System.out.println("Press 2 for speaking with an agent");
                        int moreInput = sc.nextInt();
                        if(moreInput == 1){
                            System.out.println("Good afternoon. I am chat bot.");
                            System.out.println("Please describe your issue.");
                        }
                        else if (moreInput == 2) {
                            System.out.println("Please wait. A tech support agent will be with you shortly.");
                        }
                        else {
                            System.out.println("Select a valid input");
                        }
                        break;
                    case 3 :
                        System.out.println("Welcome to customer service. A representative will be with you shortly.");
                        break;
                    default:
                        System.out.println("Enter a valid option.");
                }
            } else if(option == 2){
                System.out.println("Press 1 for Bill details.");
                System.out.println("Press 2 for Payment.");
                int output = sc.nextInt();
                switch(output){
                    case 1 :
                        System.out.println("Your bill details for " + phone + " are shown here.");
                        break;
                    case 2 :
                        System.out.println("Enter your card details..");
                        break;
                    default:
                        System.out.println("Enter a valid option.");
                }
            }
        }
        else if (input == 2) {
            System.out.println("Bonjour");
            System.out.println();
            System.out.println("Entrez votre numéro de téléphone ou de compte :");
            String phone = sc.next();
            System.out.println();
            System.out.println("Appuyez sur 1 pour Télécom");
            System.out.println("Appuyez sur 2 pour la facturation");
            int option = sc.nextInt();

            if(option == 1){
                System.out.println("Appuyez sur 1 pour annuler");
                System.out.println("Appuyez sur 2 pour le support technique");
                System.out.println("Appuyez sur 3 pour le service client");
                int out = sc.nextInt();
                switch(out){
                    case 1 :
                        System.out.println("Votre numéro a été annulé avec succès.");
                        break;
                    case 2 :
                        System.out.println("Bienvenue au support technique.");
                        System.out.println("Appuyez sur 1 pour le chatbot");
                        System.out.println("Appuyez sur 2 pour parler avec un agent");
                        int moreInput = sc.nextInt();
                        if(moreInput == 1){
                            System.out.println("Bon après-midi. Je suis un chatbot.");
                            System.out.println("Veuillez décrire votre problème.");
                        }
                        else if (moreInput == 2) {
                            System.out.println("S'il vous plaît, attendez. Un agent du support technique sera avec vous sous peu.");
                        }
                        else {
                            System.out.println("Sélectionnez une entrée valide");
                        }
                        break;
                    case 3 :
                        System.out.println("Bienvenue au service client. Un représentant sera avec vous sous peu.");
                        break;
                    default:
                        System.out.println("Entrez une option valide.");
                }
            } else if(option == 2) {
                System.out.println("Appuyez sur 1 pour obtenir les détails de la facture");
                System.out.println("Appuyez sur 2 pour le paiement");
                int output = sc.nextInt();
                switch (output) {
                    case 1:
                        System.out.println("Les détails de votre facture pour " + phone + " sont affichés ici.");
                        break;
                    case 2:
                        System.out.println("Entrez les détails de votre carte..");
                        break;
                    default:
                        System.out.println("Entrez une option valide.");
                }
            }
        }
        else{
            System.out.println("Enter an valid option");
        }
    }
}
