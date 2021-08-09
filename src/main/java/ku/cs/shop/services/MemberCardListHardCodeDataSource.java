package ku.cs.shop.services;

import ku.cs.shop.models.MemberCard;
import ku.cs.shop.models.MemberCardList;

public class MemberCardListHardCodeDataSource {
    private MemberCardList cardList;

    public MemberCardListHardCodeDataSource() {
        cardList = new MemberCardList();
        readData();
    }

    public void readData() {
        MemberCard john = new MemberCard("John Smith", "081-222-8888");
        MemberCard anna = new MemberCard("Anna Frost", "082-333-9999", 135);
        MemberCard harry = new MemberCard("Harry Potter", "083-444-0000", 40000);
        cardList.addCard(john);
        cardList.addCard(anna);
        cardList.addCard(harry);
        cardList.addCard(new MemberCard("Charles ", "091-777-6543", 800));
        cardList.addCard(new MemberCard( "kantapat radchBabbageawatr",  "091-575-2593",  20));
        cardList.addCard(new MemberCard( "new opit",  "091-555-25555",  100));
        cardList.addCard(new MemberCard( "Mark zuckerburg",  "091-565-1111",  3));
        cardList.addCard(new MemberCard( "Steve Job",  "066-245-7777",  400));
        cardList.addCard(new MemberCard( "Saten Steve",  "088-888-8888",  20));

    }

    public MemberCardList getCardList() {
        return cardList;
    }
}
