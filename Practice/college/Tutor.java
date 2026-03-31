public class Tutor {
    private String staffName;
    private String staffID;

    Tutor(String staffID, String staffName) {
        this.staffID = staffID;
        this.staffName = staffName;
    }

    // Staff ID
    public String getStaffID() {
        return staffID;
    }

    // Staff Name
    public String getStaffName() {
        return staffName;
    }

    public String toString() {
        return String.format("%s (%s) ", staffName, staffID);
    }

}
