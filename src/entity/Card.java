package entity;

public class Card {
    private Customer cst;
    private String cardNumber;
    private String expiredMonth;
    private String expiredYear;

    public Card() {
    }

    public Card(Customer cst, String cardNumber, String expiredMonth, String expiredYear) {
        this.cst = cst;
        this.cardNumber = cardNumber;
        this.expiredMonth = expiredMonth;
        this.expiredYear = expiredYear;
    }

    public Customer getCst() {
        return cst;
    }

    public void setCst(Customer cst) {
        this.cst = cst;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpiredMonth() {
        return expiredMonth;
    }

    public void setExpiredMonth(String expiredMonth) {
        this.expiredMonth = expiredMonth;
    }

    public String getExpiredYear() {
        return expiredYear;
    }

    public void setExpiredYear(String expiredYear) {
        this.expiredYear = expiredYear;
    }
}
