package Assignments.OopsAssignment.Interfaces.Problem2;

public class SMSSender implements NotificationSender, SMSNotification{

    String phoneNumber;

    @Override
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("SMS sent to : " + phoneNumber);
        System.out.println("Message : " + message);
    }

}
