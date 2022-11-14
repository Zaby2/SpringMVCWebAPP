package ru.example.training;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    private String song = "The Devill in ";

    private List<String> songsList = new ArrayList<>();
    @Override
    public String getSong() {
        for (int i = 0; i <= 3; i++) {
            song += "I";
            songsList.add(song);
        }
        return songsList.toString();
    }
}
