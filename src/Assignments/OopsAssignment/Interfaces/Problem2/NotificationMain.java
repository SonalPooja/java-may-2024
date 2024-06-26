package Assignments.OopsAssignment.Interfaces.Problem2;

public class NotificationMain {

    public static void main(String[] args) {

        EmailSender emailSender = new EmailSender();
        emailSender.setRecipients("sonalpooja11@gmail.com");
        emailSender.sendNotification("This is an email notification.");
        System.out.println();

        SMSSender smsSender = new SMSSender();
        smsSender.setPhoneNumber("789-345-5473");
        smsSender.sendNotification("This is a sms notification.");
        System.out.println();

        PushSender pushSender = new PushSender();
        pushSender.setDevice("Samsung Galaxy Fold 5");
        pushSender.sendNotification("This is a push notification.");
        System.out.println();
    }
}
