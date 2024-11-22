public class Client {
    private ServiceSendMessage serviceSendMessage;
    // Tight - coupling
    SendSMS sendSMS = new SendSMS();
    SendMail sendMail = new SendMail();
    // sử dụng constructor injection
    public Client(ServiceSendMessage serviceSendMessage) {
        this.serviceSendMessage = serviceSendMessage;
    }
    public void proccessMessage() {
        serviceSendMessage.sendMessage("Hello World");
    }

    //Thay đổi sang send bằng SMS thì phải thay đổi đối tượng sendMail -> sendSMS
    public void processMessageSend(String message) {
        sendSMS.sendMessage(message);
//        sendMail.sendMessage(message);
    }
}
