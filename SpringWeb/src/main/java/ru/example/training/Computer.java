package ru.example.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private int id;
    private MusicPlayer mp;
    @Autowired
    public void setMp(MusicPlayer mp) {
        this.mp = mp;
        this.id = 1;
    }
    @Override
    public String toString() {
        return "Computer " + id + " " + mp.playMusic();
    }
}
