package utils;

public class TestData {

    private String entryDate;
    private String entryTime;
    private String entryPeriod;
    private String leavingDate;
    private String leavingTime;
    private String leavingPeriod;

    public TestData(String entryDate, String entryTime, String entryPeriod,
                    String leavingDate, String leavingTime, String leavingPeriod){

        super();
        this.entryDate = entryDate;
        this.entryTime = entryTime;
        this.entryPeriod = entryPeriod;
        this.leavingDate = leavingDate;
        this.leavingTime = leavingTime;
        this.leavingPeriod = leavingPeriod;

    }

    public String getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }

    public String getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(String entryTime) {
        this.entryTime = entryTime;
    }

    public String getEntryPeriod() {
        return entryPeriod;
    }

    public void setEntryPeriod(String entryPeriod) {
        this.entryPeriod = entryPeriod;
    }

    public String getLeavingDate() {
        return leavingDate;
    }

    public void setLeavingDate(String leavingDate) {
        this.leavingDate = leavingDate;
    }

    public String getLeavingTime() {
        return leavingTime;
    }

    public void setLeavingTime(String leavingTime) {
        this.leavingTime = leavingTime;
    }

    public String getLeavingPeriod() {
        return leavingPeriod;
    }

    public void setLeavingPeriod(String leavingPeriod) {
        this.leavingPeriod = leavingPeriod;
    }
}
