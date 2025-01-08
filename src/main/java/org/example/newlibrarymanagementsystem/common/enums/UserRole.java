package org.example.newlibrarymanagementsystem.common.enums;

/**
 * Represents roles for users in the library management system.
 */
public enum UserRole {
    ADMINISTRATOR("Administrator with full privileges"),
    LIBRARIAN("Librarian with access to book management"),
    MEMBER("Member with borrowing privileges");

    private final String description;

    UserRole(String description) {
        this.description = description;
    }

    /**
     * Returns a description of the role.
     *
     * @return the description of the role
     */
    public String getDescription() {
        return description;
    }
}
