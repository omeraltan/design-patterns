package com.principles.openclosed;

interface IBank {
    boolean moneyTransfer(int amount, String accountNumber);
}

public class MoneySender {

    public void sendMoney(IBank bank, int amount, String accountNumber) {
        bank.moneyTransfer(amount, accountNumber);
    }

}

class Halkbank implements IBank {

    @Override
    public boolean moneyTransfer(int amount, String accountNumber) {
        System.out.println("Halkbank");
        return false;
    }
}

class Garanti implements IBank {

    @Override
    public boolean moneyTransfer(int amount, String accountNumber) {
        System.out.println("Garanti");
        return false;
    }
}

// Add new Bank here

class Test{
    public static void main(String[] args) {
        MoneySender sender = new MoneySender();
        sender.sendMoney(new Halkbank(), 10, "Halkbank");
        sender.sendMoney(new Garanti(), 100, "Garanti");
    }
}
