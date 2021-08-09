package ku.cs.shop.models;

import java.util.ArrayList;

public class MemberCardList {
    private ArrayList<MemberCard> cards;

    public MemberCardList() {
        cards = new ArrayList<>();
    }

    public void addCard(MemberCard card) {
        cards.add(card);
    }

    public ArrayList<MemberCard> getAllCards() {
        return cards;
    }


}

