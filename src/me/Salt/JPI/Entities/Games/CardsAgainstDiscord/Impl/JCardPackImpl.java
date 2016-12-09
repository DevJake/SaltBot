package me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Impl;

import me.Salt.JPI.Entities.Games.CardsAgainstDiscord.JCardPack;

import java.util.List;

/**
 * Created by 15122390 on 07/12/2016.
 */
public class JCardPackImpl implements JCardPack {
    String name;
    String description;
    String author;
    List<JCardImpl> cards;

    public JCardPackImpl(String name, String description, String author, List<JCardImpl> cards) {
        this.name = name;
        this.description = description;
        this.author = author;
        this.cards = cards;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getAuthor() {
        return author;
    }

    public List<JCardImpl> getCards() {
        return cards;
    }
}
