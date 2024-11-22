public class SendSMS implements ServiceSendMessage{

    @Override
    public void sendMessage(String message) {
        System.out.println("Send SMS: " + message);
    }
}
