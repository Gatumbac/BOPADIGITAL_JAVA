package Employability;

public class InternNotificationService implements Subscriber {

  @Override
  public void update(NotifiableEntity context) {
    String notificationTitle = context.getNotificationTitle();
    String notificationMessage = context.getNotificationMessage();
    this.sendPushNotification(notificationTitle, notificationMessage);
  }

  public void sendPushNotification(String title, String body) {
    // Envía notificación push interna
  }
}