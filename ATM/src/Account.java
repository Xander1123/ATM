/*
 * Copyright (c) 2022.
 *
 * Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 * intellij no copyright generate
 */

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Account {
    private int customerNumber;
    public int pinNumber;
    public double checkingBalance = 0;
    public double savingBalance = 0;

    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    public Account(int cst_no, int pin) {

    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void getpinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    public Account(int customerNumber, int pinNumber, double checkingBalance, double savingBalance) {
        this.customerNumber = customerNumber;
        this.pinNumber = pinNumber;
        this.checkingBalance = checkingBalance;
        this.savingBalance = savingBalance;
    }

    public int setcustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
        return customerNumber;
    }

    public int getcustomerNumber() {
        return customerNumber;
    }

    public int setpinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
        return pinNumber;
    }

    public int getpinNumber() {
        return pinNumber;

    }

    public double getcheckingBalance() {
        return checkingBalance;
    }

    public double getsavingBalance() {
        return savingBalance;
    }

    public double calcCheckingWithdraw(double amount) {
        checkingBalance = (checkingBalance - amount);
        return checkingBalance;
    }

    public double calcSavingWithdraw(double amount) {
        savingBalance = (savingBalance - amount);
        return savingBalance;
    }

    public double calcCheckingDeposit(double amount) {
        savingBalance = (checkingBalance + amount);
        return checkingBalance;
    }

    public double calcSavingDeposit(double amount) {
        checkingBalance = (checkingBalance + amount);
        return checkingBalance;
    }

    public void calcCheckTransfer(double amount) {
        checkingBalance = checkingBalance - amount;
        savingBalance = savingBalance + amount;
    }

    public void calcSavingTransfer(double amount) {
        savingBalance = checkingBalance - amount;
        savingBalance = savingBalance + amount;

    }

    public void getCheckingWithdrawInput() {
        boolean end = false;
        while (!end) {
            try {
                System.out.println("\nCurrent Checkings Account Balance: " + moneyFormat.format(checkingBalance));
                System.out.println("\nAmount you wantto withdraw from Checking Account : ");
                double amount = input.nextDouble();
                if ((checkingBalance - amount) >= 0 && amount >= 0) {
                    calcCheckingWithdraw(amount);
                    System.out.println("\nCurrent Checkings Accaount Balance :" + moneyFormat.format(checkingBalance));
                    end = true;
                } else {
                    System.out.println("\nBalance Cannot be Neqative");

                }


            } catch (InputMismatchException e) {
                System.out.println("\nInvalid Choice ....");
                input.next();
            }
        }
    }

    public void getsavingWithdrawInput() {
        boolean end = false;
        while (!end) {
            try {
                System.out.println("\"\\nCurrent Savings Account Balance: " + moneyFormat.format(savingBalance));
                System.out.print("\nAmount you want to withdraw from Savings Account: ");
                double amount = input.nextDouble();
                if ((savingBalance - amount) >= 0 && amount > 0) {
                    calcSavingWithdraw(amount);
                    System.out.println("\nCurrent Savings Account Balance: " + moneyFormat.format(savingBalance));
                    end = true;
                } else {
                    System.out.println("\nBalance Cannot be Negative");

                }
            } catch (InputMismatchException e) {
                System.out.println("\nInvalid Choice ");
                input.next();
            }


        }
    }

    public void getCheckingDepositInput() {
        boolean end = false;
        while (!end) {
            try {
                System.out.println("\nCurrent Checkings Account Balance: " + moneyFormat.format(checkingBalance));
                System.out.print("\nAmount you want to deposit from Checkings Account: ");
                double amount = input.nextDouble();
                if ((checkingBalance + amount) >= 0 && amount >= 0) {
                    calcCheckingDeposit(amount);
                    System.out.println("\nCurrent Checkings Account Balance: " + moneyFormat.format(checkingBalance));
                    end = true;
                } else {
                    System.out.println("\n Balance Cannot Be Negative ...");

                }
            } catch (InputMismatchException e) {
                System.out.println("\nInvalid Choice ..");
                input.next();
            }
        }

    }

    public void getSavingDepositInput() {
        boolean end = false;
        while (!end) {
            try {
                System.out.println("\nCurrent Savings Account Balance: " + moneyFormat.format(savingBalance));
                System.out.print("\nAmount you want to deposit into your Savings Account: ");
                double amount = input.nextDouble();

                if ((savingBalance + amount) >= 0 && amount >= 0) {
                    calcSavingDeposit(amount);
                    System.out.println("\nCurrent Savings Account Balance: " + moneyFormat.format(savingBalance));
                    end = true;
                } else {
                    System.out.println("\nBalance Cannot Be Negative.");
                }
            } catch (InputMismatchException e) {
                System.out.println("\nInvalid Choice.");
                input.next();
            }
        }
    }

    public void getTransferInput(String accType) {
        boolean end = false;
        while (!end) {
            try {
                if (accType.equals("Checkings")) {
                    System.out.println("\nSelect an accaount you wish to transfer funds to:");
                    System.out.println("1. Savings ");
                    System.out.println("2. Exit");
                    System.out.println("\nChoice");
                    int choice = input.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("\nCurrent Checkings Account Balance: " + moneyFormat.format(checkingBalance));
                            System.out.print("\nAmount you want to deposit into your Savings Account: ");
                            double amount = input.nextDouble();
                            if ((savingBalance + amount) >= 0 && (checkingBalance - amount) >= 0 && amount >= 0) {
                                calcCheckTransfer(amount);
                                System.out.println("\nCurrent Savings Account Balance: " + moneyFormat.format(savingBalance));
                                System.out.println(
                                        "\nCurrent Checkings Account Balance: " + moneyFormat.format(checkingBalance));
                                end = true;
                            } else {
                                System.out.println("\nBalance Cannot Be Negative...");

                            }
                            break;
                        case 2:
                            return;
                        default:
                            System.out.println("\nInvalid Choice");
                            break;
                    }
                } else if (accType.equals("Savings")) {
                    System.out.println("\nSelect an account you wish to tranfers funds to: ");
                    System.out.println("1. Checkings");
                    System.out.println("2. Exit");
                    System.out.print("\nChoice: ");
                    int choice = input.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("\nCurrent Savings Account Balance: " + moneyFormat.format(savingBalance));
                            System.out.print("\nAmount you want to deposit into your savings account: ");
                            double amount = input.nextDouble();
                            if ((checkingBalance + amount) >= 0 && (savingBalance - amount) >= 0 && amount >= 0) {
                                calcSavingTransfer(amount);
                                System.out.println("\nCurrent checkings account balance: " + moneyFormat.format(checkingBalance));
                                System.out.println("\nCurrent savings account balance: " + moneyFormat.format(savingBalance));
                                end = true;
                            } else {
                                System.out.println("\nBalance Cannot Be Negative");

                            }
                            break;
                        case 2:
                            return;
                        default:
                            System.out.println("\nInvalid Choice");
                            break;
                    }
                }


            } catch (InputMismatchException e) {
                System.out.println("\nInvalid Choice");
                input.next();
            }
        }

    }
}