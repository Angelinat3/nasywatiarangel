public class ATMWithdrawal {

    // Define variables
    private int userPIN;              // User's PIN
    private float withdrawalAmount;   // Amount to withdraw
    private float cashSupplied;       // Cash supplied to the user
    private float updatedBalance;     // Updated account balance after withdrawal
    private String confirmationMessage; // Confirmation message for the user
    private boolean isPINCorrect;     // Flag for PIN verification
    private int attemptCount;         // PIN attempt counter
    private boolean transactionSuccess; // Flag to check if the transaction was successful
    private int transactionID;        // Unique ID for the transaction

    // Constructor to initialize default values
    public ATMWithdrawal(int userPIN, float currentBalance) {
        this.userPIN = userPIN;
        this.updatedBalance = currentBalance;
        this.attemptCount = 0; // Set initial attempt count to 0
        this.transactionID = generateTransactionID(); // Generate a random transaction ID
    }

    // Method to verify the PIN
    public void verifyPIN(int inputPIN) {
        this.isPINCorrect = (inputPIN == this.userPIN); // Check if the input PIN matches the stored PIN
        if (!isPINCorrect) {
            this.attemptCount++;
            if (this.attemptCount >= 3) {
                System.out.println("Too many incorrect attempts. Transaction blocked.");
            }
        } else {
            System.out.println("PIN verified successfully.");
        }
    }

    // Method to enter withdrawal amount
    public void enterWithdrawalAmount(float amount) {
        if (amount > 0 && amount <= this.updatedBalance) {
            this.withdrawalAmount = amount;
            System.out.println("Withdrawal amount entered: " + amount);
        } else {
            System.out.println("Invalid or insufficient funds for withdrawal.");
        }
    }

    // Method to process the cash withdrawal
    public void processWithdrawal() {
        if (isPINCorrect && this.withdrawalAmount > 0 && this.withdrawalAmount <= this.updatedBalance) {
            // Dispense the requested cash
            this.cashSupplied = this.withdrawalAmount;
            // Deduct from the balance
            this.updatedBalance -= this.withdrawalAmount;
            // Mark the transaction as successful
            this.transactionSuccess = true;
            this.confirmationMessage = "Withdrawal successful. Dispensed: $" + this.cashSupplied + 
                                       ". Your new balance is: $" + this.updatedBalance;
        } else {
            this.transactionSuccess = false;
            this.confirmationMessage = "Withdrawal failed. Please check your PIN and balance.";
        }
    }

    // Method to print the confirmation message
    public void printConfirmation() {
        if (transactionSuccess) {
            System.out.println(this.confirmationMessage);
        } else {
            System.out.println("Transaction failed. Please try again.");
        }
        System.out.println("Transaction ID: " + this.transactionID);
    }

    // Method to generate a random transaction ID
    private int generateTransactionID() {
        // Just for simplicity, generating a random number as transaction ID
        return (int) (Math.random() * 100000);
    }

    // Main method to test the ATM withdrawal functionality
    public static void main(String[] args) {
        // Initialize ATM with PIN and current balance
        ATMWithdrawal atm = new ATMWithdrawal(1234, 1000.0f);

        // Simulate the user entering the PIN
        atm.verifyPIN(1234); // Correct PIN

        // Simulate user entering the withdrawal amount
        atm.enterWithdrawalAmount(300.0f); // Withdraw $300

        // Process the withdrawal
        atm.processWithdrawal();

        // Print the confirmation message
        atm.printConfirmation();
    }
}
