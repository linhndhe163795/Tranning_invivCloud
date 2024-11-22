public class SendMail implements ServiceSendMessage
{

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending mail: " + message);
    }
}
