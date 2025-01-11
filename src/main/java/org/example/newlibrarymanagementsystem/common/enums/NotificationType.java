package org.example.newlibrarymanagementsystem.common.enums;

/**
 * Enum representing notification types.
 */
public enum NotificationType {
    EMAIL("Notification sent via email"),
    SMS("Notification sent via SMS"),
    PUSH("Notification sent via push notification");

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
