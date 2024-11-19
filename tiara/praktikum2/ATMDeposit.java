public class ATMDeposit {

    // Define variables
    private String cardNumber;        // Card number as a string
    private int userPIN;              // User's PIN
    private float depositAmount;      // Amount to deposit
    private float cashInput;          // Cash input by user
    private float updatedBalance;     // Updated account balance
    private String confirmationMessage; // Confirmation message for the user
    private boolean isPINCorrect;     // Flag for PIN verification
    private int attemptCount;         // PIN attempt counter
    private boolean isCashValid;      // Flag to check if the cash is valid
    private boolean transactionSuccess; // Flag to check if the transaction was successful
    private int transactionID;        // Unique ID for the transaction

    // Constructor to initialize default values
    public ATMDeposit(String cardNumber, int userPIN, float currentBalance) {
        this.cardNumber = cardNumber;
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

    // Method to accept the cash deposit
    public void acceptCash(float cashInput) {
        // Assuming some validation for the cash being deposited
        if (cashInput > 0) {
            this.isCashValid = true;
            this.cashInput = cashInput;
            System.out.println("Cash accepted.");
        } else {
            this.isCashValid = false;
            System.out.println("Invalid cash input.");
        }
    }

    // Method to update the account balance after the deposit
    public void updateAccountBalance() {
        if (isPINCorrect && isCashValid) {
            this.updatedBalance += this.cashInput;
            this.transactionSuccess = true;
            this.confirmationMessage = "Deposit successful. Your new balance is: " + this.updatedBalance;
        } else {
            this.transactionSuccess = false;
            this.confirmationMessage = "Deposit failed. Please try again.";
        }
    }

    // Method to print the confirmation message
    public void printConfirmation() {
        System.out.println(this.confirmationMessage);
    }

    // Method to generate a random transaction ID
    private int generateTransactionID() {
        // Just for simplicity, generating a random number as transaction ID
        return (int) (Math.random() * 100000);
    }

    // Main method to test the ATM deposit functionality
    public static void main(String[] args) {
        // Initialize ATM with card number, PIN, and current balance
        ATMDeposit atm = new ATMDeposit("1234-5678-9012-3456", 1234, 1000.0f);

        // Simulate the user entering the PIN
        atm.verifyPIN(1234); // Correct PIN

        // Simulate cash deposit process
        atm.acceptCash(500.0f); // Deposit $500

        // Update the balance
        atm.updateAccountBalance();

        // Print the confirmation message
        atm.printConfirmation();
    }
}
