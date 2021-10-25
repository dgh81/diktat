package com.company;

import java.time.LocalDate;
import java.util.Date;

public class Media {
    private String titel = "";
    private String beskrivelse = "";
    private LocalDate created;
    private LocalDate modified;
    private static int counter = 0;

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public void setBeskrivelse(String beskrivelse) {
        this.beskrivelse = beskrivelse;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }

    public void setModified(LocalDate modified) {
        this.modified = modified;
    }

    public String getTitel() {
        return titel;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public LocalDate getCreated() {
        return created;
    }

    public LocalDate getModified() {
        return modified;
    }

    public int getUnikID() {
        return unikID;
    }

    private int unikID = 0;

    public Media() {
        this.unikID = ++ counter;
        this.created = LocalDate.now();
        this.modified = this.created;
        System.out.println("Et nyt media-objekt er oprettet!");
    }

    @Override
    public String toString() {
        return "Media{" +
                "titel='" + titel + '\'' +
                ", beskrivelse='" + beskrivelse + '\'' +
                ", created=" + created +
                ", modified=" + modified +
                ", unikID=" + unikID +
                '}';
    }

    public Media(String titel, String beskrivelse) {
        this.unikID = ++ counter;
        this.titel = titel;
        this.beskrivelse = beskrivelse;
        this.created = LocalDate.now();
        this.modified = this.created;
    }
}
