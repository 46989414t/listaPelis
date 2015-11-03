package com.pelis.listapeliculas.JSON;

/**
 * Created by enric on 3/11/15.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "page",
        "results",
        "total_pages",
        "total_results"
})
public class listaPrueba {

    @JsonProperty("page")
    private Integer page;
    @JsonProperty("results")
    private List<Result> results = new ArrayList<Result>();
    @JsonProperty("total_pages")
    private Integer totalPages;
    @JsonProperty("total_results")
    private Integer totalResults;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The page
     */
    @JsonProperty("page")
    public Integer getPage() {
        return page;
    }

    /**
     *
     * @param page
     * The page
     */
    @JsonProperty("page")
    public void setPage(Integer page) {
        this.page = page;
    }

    public Example withPage(Integer page) {
        this.page = page;
        return this;
    }

    /**
     *
     * @return
     * The results
     */
    @JsonProperty("results")
    public List<Result> getResults() {
        return results;
    }

    /**
     *
     * @param results
     * The results
     */
    @JsonProperty("results")
    public void setResults(List<Result> results) {
        this.results = results;
    }

    public Example withResults(List<Result> results) {
        this.results = results;
        return this;
    }

    /**
     *
     * @return
     * The totalPages
     */
    @JsonProperty("total_pages")
    public Integer getTotalPages() {
        return totalPages;
    }

    /**
     *
     * @param totalPages
     * The total_pages
     */
    @JsonProperty("total_pages")
    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public Example withTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }

    /**
     *
     * @return
     * The totalResults
     */
    @JsonProperty("total_results")
    public Integer getTotalResults() {
        return totalResults;
    }

    /**
     *
     * @param totalResults
     * The total_results
     */
    @JsonProperty("total_results")
    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

    public Example withTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Example withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
-----------------------------------com.example.Result.java-----------------------------------

        package com.example;

        import java.util.ArrayList;
        import java.util.HashMap;
        import java.util.List;
        import java.util.Map;
        import javax.annotation.Generated;
        import com.fasterxml.jackson.annotation.JsonAnyGetter;
        import com.fasterxml.jackson.annotation.JsonAnySetter;
        import com.fasterxml.jackson.annotation.JsonIgnore;
        import com.fasterxml.jackson.annotation.JsonInclude;
        import com.fasterxml.jackson.annotation.JsonProperty;
        import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "adult",
        "backdrop_path",
        "genre_ids",
        "id",
        "original_language",
        "original_title",
        "overview",
        "release_date",
        "poster_path",
        "popularity",
        "title",
        "video",
        "vote_average",
        "vote_count"
})
public class Result {

    @JsonProperty("adult")
    private Boolean adult;
    @JsonProperty("backdrop_path")
    private String backdropPath;
    @JsonProperty("genre_ids")
    private List<Integer> genreIds = new ArrayList<Integer>();
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("original_language")
    private String originalLanguage;
    @JsonProperty("original_title")
    private String originalTitle;
    @JsonProperty("overview")
    private String overview;
    @JsonProperty("release_date")
    private String releaseDate;
    @JsonProperty("poster_path")
    private String posterPath;
    @JsonProperty("popularity")
    private Double popularity;
    @JsonProperty("title")
    private String title;
    @JsonProperty("video")
    private Boolean video;
    @JsonProperty("vote_average")
    private Double voteAverage;
    @JsonProperty("vote_count")
    private Integer voteCount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The adult
     */
    @JsonProperty("adult")
    public Boolean getAdult() {
        return adult;
    }

    /**
     *
     * @param adult
     * The adult
     */
    @JsonProperty("adult")
    public void setAdult(Boolean adult) {
        this.adult = adult;
    }

    public Result withAdult(Boolean adult) {
        this.adult = adult;
        return this;
    }

    /**
     *
     * @return
     * The backdropPath
     */
    @JsonProperty("backdrop_path")
    public String getBackdropPath() {
        return backdropPath;
    }

    /**
     *
     * @param backdropPath
     * The backdrop_path
     */
    @JsonProperty("backdrop_path")
    public void setBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
    }

    public Result withBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
        return this;
    }

    /**
     *
     * @return
     * The genreIds
     */
    @JsonProperty("genre_ids")
    public List<Integer> getGenreIds() {
        return genreIds;
    }

    /**
     *
     * @param genreIds
     * The genre_ids
     */
    @JsonProperty("genre_ids")
    public void setGenreIds(List<Integer> genreIds) {
        this.genreIds = genreIds;
    }

    public Result withGenreIds(List<Integer> genreIds) {
        this.genreIds = genreIds;
        return this;
    }

    /**
     *
     * @return
     * The id
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    public Result withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     *
     * @return
     * The originalLanguage
     */
    @JsonProperty("original_language")
    public String getOriginalLanguage() {
        return originalLanguage;
    }

    /**
     *
     * @param originalLanguage
     * The original_language
     */
    @JsonProperty("original_language")
    public void setOriginalLanguage(String originalLanguage) {
        this.originalLanguage = originalLanguage;
    }

    public Result withOriginalLanguage(String originalLanguage) {
        this.originalLanguage = originalLanguage;
        return this;
    }

    /**
     *
     * @return
     * The originalTitle
     */
    @JsonProperty("original_title")
    public String getOriginalTitle() {
        return originalTitle;
    }

    /**
     *
     * @param originalTitle
     * The original_title
     */
    @JsonProperty("original_title")
    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public Result withOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
        return this;
    }

    /**
     *
     * @return
     * The overview
     */
    @JsonProperty("overview")
    public String getOverview() {
        return overview;
    }

    /**
     *
     * @param overview
     * The overview
     */
    @JsonProperty("overview")
    public void setOverview(String overview) {
        this.overview = overview;
    }

    public Result withOverview(String overview) {
        this.overview = overview;
        return this;
    }

    /**
     *
     * @return
     * The releaseDate
     */
    @JsonProperty("release_date")
    public String getReleaseDate() {
        return releaseDate;
    }

    /**
     *
     * @param releaseDate
     * The release_date
     */
    @JsonProperty("release_date")
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Result withReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
        return this;
    }

    /**
     *
     * @return
     * The posterPath
     */
    @JsonProperty("poster_path")
    public String getPosterPath() {
        return posterPath;
    }

    /**
     *
     * @param posterPath
     * The poster_path
     */
    @JsonProperty("poster_path")
    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public Result withPosterPath(String posterPath) {
        this.posterPath = posterPath;
        return this;
    }

    /**
     *
     * @return
     * The popularity
     */
    @JsonProperty("popularity")
    public Double getPopularity() {
        return popularity;
    }

    /**
     *
     * @param popularity
     * The popularity
     */
    @JsonProperty("popularity")
    public void setPopularity(Double popularity) {
        this.popularity = popularity;
    }

    public Result withPopularity(Double popularity) {
        this.popularity = popularity;
        return this;
    }

    /**
     *
     * @return
     * The title
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     * The title
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public Result withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     *
     * @return
     * The video
     */
    @JsonProperty("video")
    public Boolean getVideo() {
        return video;
    }

    /**
     *
     * @param video
     * The video
     */
    @JsonProperty("video")
    public void setVideo(Boolean video) {
        this.video = video;
    }

    public Result withVideo(Boolean video) {
        this.video = video;
        return this;
    }

    /**
     *
     * @return
     * The voteAverage
     */
    @JsonProperty("vote_average")
    public Double getVoteAverage() {
        return voteAverage;
    }

    /**
     *
     * @param voteAverage
     * The vote_average
     */
    @JsonProperty("vote_average")
    public void setVoteAverage(Double voteAverage) {
        this.voteAverage = voteAverage;
    }

    public Result withVoteAverage(Double voteAverage) {
        this.voteAverage = voteAverage;
        return this;
    }

    /**
     *
     * @return
     * The voteCount
     */
    @JsonProperty("vote_count")
    public Integer getVoteCount() {
        return voteCount;
    }

    /**
     *
     * @param voteCount
     * The vote_count
     */
    @JsonProperty("vote_count")
    public void setVoteCount(Integer voteCount) {
        this.voteCount = voteCount;
    }

    public Result withVoteCount(Integer voteCount) {
        this.voteCount = voteCount;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Result withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}