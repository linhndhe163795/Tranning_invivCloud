//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ServiceSendMessage mail = new SendMail();
        ServiceSendMessage sms = new SendSMS();
        // sử dụng DI thì chỉ cần tiêm injection
        Client client = new Client(mail);
//      Client client = new Client(sms);
        client.proccessMessage();
        //không sử dụng dependece injection
        client.processMessageSend("Hello world !!!");
    }
}