package com.oyra.svti.svtitest.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class ProgramsList {

    @SerializedName("copyright")
    @Expose
    private String copyright;
    @SerializedName("programs")
    @Expose
    private List<Program> programs = new ArrayList<>();
    @SerializedName("pagination")
    @Expose
    private Pagination pagination;

    /**
     * @return The copyright
     */
    public String getCopyright() {
        return copyright;
    }

    /**
     * @param copyright The copyright
     */
    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    /**
     * @return The programs
     */
    public List<Program> getPrograms() {
        return programs;
    }

    /**
     * @param programs The programs
     */
    public void setPrograms(List<Program> programs) {
        this.programs = programs;
    }

    /**
     * @return The pagination
     */
    public Pagination getPagination() {
        return pagination;
    }

    /**
     * @param pagination The pagination
     */
    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

}
