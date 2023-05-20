package controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.Університет;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class JsonManager {
    private Gson gson;

    public JsonManager() {
        gson = new GsonBuilder().setPrettyPrinting().create();
    }

    public void записатиУніверситетВФайл(Університет університет, String файл) {
        String json = gson.toJson(університет);
        try {
            Files.writeString(Path.of(файл), json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Університет зчитатиУніверситетЗФайлу(String файл) {
        try {
            String json = Files.readString(Path.of(файл));
            return gson.fromJson(json, Університет.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}