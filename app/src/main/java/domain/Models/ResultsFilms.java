package domain.Models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by andrefernandes on 1/8/17.
 */

public class ResultsFilms {

    @SerializedName("episode_id")
    private String episodeId;

    @SerializedName("opening_crawl")
    private String openingCrawl;

    @SerializedName("director")
    private String director;

    @SerializedName("title")
    private String title;

    @SerializedName("created")
    private String created;

    @SerializedName("producer")
    private String producer;

    @SerializedName("release_date")
    private String releaseDte;

    @SerializedName("characters")
    private String[] characters;

    public String getEpisodeId() {
        return episodeId;
    }

    public void setEpisodeId(String episodeId) {
        this.episodeId = episodeId;
    }

    public String getOpeningCrawl() {
        return openingCrawl;
    }

    public void setOpeningCrawl(String openingCrawl) {
        this.openingCrawl = openingCrawl;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getReleaseDte() {
        return releaseDte;
    }

    public void setReleaseDte(String releaseDte) {
        this.releaseDte = releaseDte;
    }

    public String[] getCharacters() {
        return characters;
    }

    public void setCharacters(String[] characters) {
        this.characters = characters;
    }
}
