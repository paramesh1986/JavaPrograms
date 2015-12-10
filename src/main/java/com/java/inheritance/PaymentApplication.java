package com.java.inheritance;

public class PaymentApplication {

    public static void main(String[] args) {

        // Initialization
        SalaryProcessSystem paymentSystem = new SalaryProcessSystem();

        ContractEmployee johnSmith = new ContractEmployee("John Smith", "1111", 300.0);
        paymentSystem.addPayee(johnSmith);

        ContractEmployee paulJones = new ContractEmployee("Paul Jones", "2222", 350.0);
        paymentSystem.addPayee(paulJones);

        PermanentEmployee maryBrown = new PermanentEmployee("Mary Brown", "3333", 500.0);
        paymentSystem.addPayee(maryBrown);

        PermanentEmployee susanWhite = new PermanentEmployee("Susan White", "4444", 470.0);
        paymentSystem.addPayee(susanWhite);

        // Process Weekly Payment
        paymentSystem.processPayments();
    }

}
