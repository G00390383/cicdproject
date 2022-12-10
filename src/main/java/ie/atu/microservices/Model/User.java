package ie.atu.microservices.Model;

public class User {
    private String name;
    private Long ppsnNo;
    private int creditScore;
    private String emailId;

    public User(String name, Long ppsnNo, int creditScore, String emailId) {
        setName(name);
        setPpsnNo(ppsnNo);
        setCreditScore(creditScore);
        setEmailId(emailId);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >= 3) {
            this.name = name;
        }
        else{
            throw new IllegalArgumentException("Name must be 3 characters or longer");
        }
    }

    public Long getPpsnNo() {
        return ppsnNo;
    }

    public void setPpsnNo(Long ppsnNo) {
        if(Long.toString(ppsnNo).length() >9 || Long.toString(ppsnNo).length()<8) {
            throw new IllegalArgumentException("PPSN number must be 8 or 9 characters long");
        }
        else{
            this.ppsnNo = ppsnNo;
        }
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        if((300 <= creditScore ) && (creditScore <= 850)) {
            this.creditScore = creditScore;
        }
        else{
            throw new IllegalArgumentException("Credit score can only be between 300 and 850");
        }
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        if(emailId.endsWith("gmail.com") || emailId.endsWith("atu.ie")) {
            this.emailId = emailId;
        }
        else{
            throw new IllegalArgumentException("Only gmail and atu emails accepted");
        }
    }
}
