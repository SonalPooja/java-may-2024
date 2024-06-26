package Assignments.OopsAssignment.Interfaces.Problem2;

public class EmailSender implements NotificationSender, EmailNotification{

    String recipient;

    @Override
    public void setRecipients(String email) {
        this.recipient = email;
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Email sent to : " + recipient);
        System.out.println("Message : " + message);
    }
}
