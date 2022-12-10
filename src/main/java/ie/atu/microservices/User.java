package ie.atu.microservices;

public class User {
    private String name;
    private Long ppsnNo;
    private int creditScore;
    private String emailId;

    public User(String name, Long ppsnNo, int creditScore, String emailId) {
        setName(name);
        this.ppsnNo = ppsnNo;
        this.creditScore = creditScore;
        this.emailId = emailId;
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
        this.ppsnNo = ppsnNo;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
