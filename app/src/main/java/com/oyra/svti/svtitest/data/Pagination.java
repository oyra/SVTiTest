
package com.oyra.svti.svtitest.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Pagination {

    @SerializedName("page")
    @Expose
    private Integer page;
    @SerializedName("size")
    @Expose
    private Integer size;
    @SerializedName("totalhits")
    @Expose
    private Integer totalhits;
    @SerializedName("totalpages")
    @Expose
    private Integer totalpages;
    @SerializedName("nextpage")
    @Expose
    private String nextpage;

    /**
     * 
     * @return
     *     The page
     */
    public Integer getPage() {
        return page;
    }

    /**
     * 
     * @param page
     *     The page
     */
    public void setPage(Integer page) {
        this.page = page;
    }

    /**
     * 
     * @return
     *     The size
     */
    public Integer getSize() {
        return size;
    }

    /**
     * 
     * @param size
     *     The size
     */
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * 
     * @return
     *     The totalhits
     */
    public Integer getTotalhits() {
        return totalhits;
    }

    /**
     * 
     * @param totalhits
     *     The totalhits
     */
    public void setTotalhits(Integer totalhits) {
        this.totalhits = totalhits;
    }

    /**
     * 
     * @return
     *     The totalpages
     */
    public Integer getTotalpages() {
        return totalpages;
    }

    /**
     * 
     * @param totalpages
     *     The totalpages
     */
    public void setTotalpages(Integer totalpages) {
        this.totalpages = totalpages;
    }

    /**
     * 
     * @return
     *     The nextpage
     */
    public String getNextpage() {
        return nextpage;
    }

    /**
     * 
     * @param nextpage
     *     The nextpage
     */
    public void setNextpage(String nextpage) {
        this.nextpage = nextpage;
    }

}
