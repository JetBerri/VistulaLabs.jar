package com.example.task93;

public class Main {
    public static void main(String[] args) {

        Account account = new Account("John Smith", 1000, "PL61109010140000071219812874");

        try {
            account.transfer(1500);
        } catch (NotEnoughMoneyException e) {
            System.out.println("Transfer failed: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        } finally {
            System.out.println("Current balance: " + account.getBalance());
        }
    }
}
