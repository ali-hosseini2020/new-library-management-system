package org.example.newlibrarymanagementsystem.common.enums;

/**
 * Enum representing the various statuses of a loan.
 */
public enum LoanStatus {
    PENDING("Loan request is pending approval"),
    ACTIVE("Loan is active"),
    OVERDUE("Loan is overdue"),
    RETURNED("Loan has been returned");

    private final String description;

    LoanStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

/*public enum LoanStatus {
    ACTIVE("Loan is currently active"),
    OVERDUE("Loan is overdue"),
    COMPLETED("Loan has been completed");

    private final String description;

    LoanStatus(String description) {
        this.description = description;
    }

    *//**
     * Returns the description of the loan status.
     *
     * @return the description of the status
     *//*
    public String getDescription() {
        return description;
    }

    *//**
     * Checks if the loan is active.
     *
     * @return true if active, false otherwise
     *//*
    public boolean isActive() {
        return this == ACTIVE;
    }
}*/
