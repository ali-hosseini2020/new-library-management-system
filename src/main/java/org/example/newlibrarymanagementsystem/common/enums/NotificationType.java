package org.example.newlibrarymanagementsystem.common.enums;

/**
 * Enum representing notification types.
 */
public enum NotificationType {
    EMAIL("Email notification"),
    SMS("SMS notification"),
    PUSH("Push notification");

    private final String description;

    NotificationType(String description) {
        this.description = description;
    }

    /**
     * Returns the description of the notification type.
     *
     * @return the description of the notification type
     */
    public String getDescription() {
        return description;
    }
}
