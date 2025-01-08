package org.example.newlibrarymanagementsystem.common.enums;

/**
 * Enum representing report types in the library system.
 */
public enum ReportType {
    PDF("PDF report format"),
    EXCEL("Excel report format");

    private final String description;

    ReportType(String description) {
        this.description = description;
    }

    /**
     * Returns the description of the report type.
     *
     * @return the description of the report type
     */
    public String getDescription() {
        return description;
    }
}
