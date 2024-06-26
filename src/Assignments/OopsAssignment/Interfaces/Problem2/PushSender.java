package Assignments.OopsAssignment.Interfaces.Problem2;

public class PushSender implements NotificationSender, PushNotification{

    String deviceName;

    @Override
    public void setDevice(String device) {
        this.deviceName = device;
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Push notification sent to : " + deviceName);
        System.out.println("Message : " + message);
    }

}
