package dao.inface;

import java.util.List;

import entity.Card;

public interface InfaceCard {
    public int addCard(int Customer, String cardNumber, String expiredMonth, String expiredYear);
    public int updCard(Card card);
    public int delCard(Card card);

    public List<Card> showAllCards();
    public List<Card> showCardsByCust(int idCust);
}
