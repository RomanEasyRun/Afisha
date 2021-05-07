package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Afisha;
import ru.netology.manager.AfishaManager;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AfishaManagerTest {
    private AfishaManager manager = new AfishaManager(5);
    private Afisha firstFilm = new Afisha(1, "first", "Comedy");
    private Afisha secondFilm = new Afisha(2, "second", "Horror");
    private Afisha thirdFilm = new Afisha(3, "third", "Fantasy");
    private Afisha fourthFilm = new Afisha(4, "fourth", "Adventure");
    private Afisha fifthFilm = new Afisha(5, "fifth", "ScienceFiction");
    private Afisha sixthFilm = new Afisha(6, "sixth", "Thriller");
    private Afisha seventhFilm = new Afisha(7, "seventh", "Western");
    private Afisha eighthFilm = new Afisha(8, "eighth", "Detective");
    private Afisha ninthFilm = new Afisha(9, "ninth", "Cartoon");
    private Afisha tenthFilm = new Afisha(10, "tenth", "Documentary");


    @Test
    void getSpecificNumber() {
        manager.add(firstFilm);
        manager.add(secondFilm);
        manager.add(thirdFilm);
        manager.add(fourthFilm);
        manager.add(fifthFilm);
        manager.add(sixthFilm);
        manager.add(seventhFilm);
        manager.add(eighthFilm);
        manager.add(ninthFilm);
        manager.add(tenthFilm);
        Afisha[] actual = manager.getLast();
        Afisha[] expected = new Afisha[]{tenthFilm, ninthFilm, eighthFilm, seventhFilm, sixthFilm};
        assertArrayEquals(expected, actual);
    }
}