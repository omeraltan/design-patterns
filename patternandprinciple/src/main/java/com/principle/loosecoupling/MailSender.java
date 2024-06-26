package com.principle.loosecoupling;

interface IMailServer{
    void send(String subject, String body);
}

public class MailSender {

    public void send(IMailServer mailServer) {
        mailServer.send("omer@tes.com","test test");
    }

}

class Gmail implements IMailServer{
    public void send(String subject, String body) {
        System.out.println("Sending mail to " + body);
    }
}

class Hotmail implements IMailServer{
    public void send(String subject, String body) {
        System.out.println("Sending hot mail to " + body);
    }
}

class Yandex implements IMailServer{
    public void send(String subject, String body) {
        System.out.println("Sending yandex mail to " + body);
    }
}

class TestMail{
    public static void main(String[] args) {
        MailSender sender = new MailSender();
        sender.send(new Hotmail());
        sender.send(new Yandex());
        sender.send(new Gmail());
    }
}
