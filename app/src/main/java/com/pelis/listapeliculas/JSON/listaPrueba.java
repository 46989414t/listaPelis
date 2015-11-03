package com.pelis.listapeliculas.JSON;

/**
 * Created by enric on 3/11/15.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "page",
        "results",
        "total_pages",
        "total_results"
})*/
public class listaPrueba {

    //@JsonProperty("page")
    private Integer page;
    //@JsonProperty("results")
    private List<Result> results = new ArrayList<Result>();
    //@JsonProperty("total_pages")
    private Integer totalPages;
    //@JsonProperty("total_results")
    private Integer totalResults;
    //@JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The page
     */
    //@JsonProperty("page")
    public Integer getPage() {
        return page;
    }

    /**
     *
     * @param page
     * The page
     */
    //@JsonProperty("page")
    public void setPage(Integer page) {
        this.page = page;
    }

    public listaPrueba withPage(Integer page) {
        this.page = page;
        return this;
    }

    /**
     *
     * @return
     * The results
     */
    //@JsonProperty("results")
    public List<Result> getResults() {
        return results;
    }

    /**
     *
     * @param results
     * The results
     */
    //@JsonProperty("results")
    public void setResults(List<Result> results) {
        this.results = results;
    }

    public listaPrueba withResults(List<Result> results) {
        this.results = results;
        return this;
    }

    /**
     *
     * @return
     * The totalPages
     */
    //@JsonProperty("total_pages")
    public Integer getTotalPages() {
        return totalPages;
    }

    /**
     *
     * @param totalPages
     * The total_pages
     */
    //@JsonProperty("total_pages")
    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public listaPrueba withTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }

    /**
     *
     * @return
     * The totalResults
     */
    //@JsonProperty("total_results")
    public Integer getTotalResults() {
        return totalResults;
    }

    /**
     *
     * @param totalResults
     * The total_results
     */
    //@JsonProperty("total_results")
    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

    public listaPrueba withTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
        return this;
    }

    //@JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    //@JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public listaPrueba withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}

