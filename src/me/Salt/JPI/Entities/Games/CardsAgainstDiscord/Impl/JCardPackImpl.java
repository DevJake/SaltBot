package me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Impl;

import me.Salt.JPI.Entities.Games.CardsAgainstDiscord.JCardPack;

import java.util.List;

/**
 * Created by Salt001 on 07/12/2016.
 */
public class JCardPackImpl implements JCardPack {
    String name;
    String description;
    String author;
    List<JCardImpl> cards;

    /**
     * A cardpack constructor
     *
     * @param name        String - The name of the cardpack
     * @param description String - A description of the cardpack
     * @param author      String - The cardpack author's name
     * @param cards       List - The cards in this cardpack
     */
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
