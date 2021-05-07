package ru.netology.manager;

import ru.netology.domain.Afisha;

public class AfishaManager {
    private Afisha[] film = new Afisha[0];
    private int numberOfFilms = 10;

    public AfishaManager() {
    }

    public AfishaManager(int numberOfFilms) {
        this.numberOfFilms = numberOfFilms;
    }

    public void add(Afisha newFilm) {
        int length = film.length + 1;
        Afisha[] poster = new Afisha[length];
        for (int i = 0; i < film.length; i++) {
            poster[i] = film[i];
        }
        poster[poster.length - 1] = newFilm;
        film = poster;
    }

    public Afisha[] getLast() {
        int number = Math.min(numberOfFilms, film.length);
        Afisha[] result = new Afisha[number];
        for (int i = 0; i < number; i++) {
            int index = film.length - 1 - i;
            result[i] = film[index];
        }
        return result;
    }
}
