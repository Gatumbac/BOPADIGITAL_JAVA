package Employability;

public class EmailService implements Subscriber {

  @Override
  public void update(NotifiableEntity context) {
    String recipientEmail = context.getRecipientEmail();
    String notificationTitle = context.getNotificationTitle();
    String notificationMessage = context.getNotificationMessage();
    this.sendEmail(recipientEmail, notificationTitle, notificationMessage);
  }

  public void sendEmail(String to, String subject, String body) {
    // Envía email via SMTP
  }
}