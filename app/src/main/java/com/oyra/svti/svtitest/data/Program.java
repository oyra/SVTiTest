
package com.oyra.svti.svtitest.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Program implements Serializable{

    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("programcategory")
    @Expose
    private Programcategory programcategory;
    @SerializedName("payoff")
    @Expose
    private String payoff;
    @SerializedName("broadcastinfo")
    @Expose
    private String broadcastinfo;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("programurl")
    @Expose
    private String programurl;
    @SerializedName("programimage")
    @Expose
    private String programimage;
    @SerializedName("programimagetemplate")
    @Expose
    private String programimagetemplate;
    @SerializedName("socialimage")
    @Expose
    private String socialimage;
    @SerializedName("socialimagetemplate")
    @Expose
    private String socialimagetemplate;
    @SerializedName("socialmediaplatforms")
    @Expose
    private List<Socialmediaplatform> socialmediaplatforms = new ArrayList<>();
    @SerializedName("channel")
    @Expose
    private Channel channel;
    @SerializedName("archived")
    @Expose
    private Boolean archived;
    @SerializedName("hasondemand")
    @Expose
    private Boolean hasondemand;
    @SerializedName("haspod")
    @Expose
    private Boolean haspod;
    @SerializedName("responsibleeditor")
    @Expose
    private String responsibleeditor;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;

    /**
     * 
     * @return
     *     The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     The programcategory
     */
    public Programcategory getProgramcategory() {
        return programcategory;
    }

    /**
     * 
     * @param programcategory
     *     The programcategory
     */
    public void setProgramcategory(Programcategory programcategory) {
        this.programcategory = programcategory;
    }

    /**
     * 
     * @return
     *     The payoff
     */
    public String getPayoff() {
        return payoff;
    }

    /**
     * 
     * @param payoff
     *     The payoff
     */
    public void setPayoff(String payoff) {
        this.payoff = payoff;
    }

    /**
     * 
     * @return
     *     The broadcastinfo
     */
    public String getBroadcastinfo() {
        return broadcastinfo;
    }

    /**
     * 
     * @param broadcastinfo
     *     The broadcastinfo
     */
    public void setBroadcastinfo(String broadcastinfo) {
        this.broadcastinfo = broadcastinfo;
    }

    /**
     * 
     * @return
     *     The email
     */
    public String getEmail() {
        return email;
    }

    /**
     * 
     * @param email
     *     The email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 
     * @return
     *     The phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 
     * @param phone
     *     The phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 
     * @return
     *     The programurl
     */
    public String getProgramurl() {
        return programurl;
    }

    /**
     * 
     * @param programurl
     *     The programurl
     */
    public void setProgramurl(String programurl) {
        this.programurl = programurl;
    }

    /**
     * 
     * @return
     *     The programimage
     */
    public String getProgramimage() {
        return programimage;
    }

    /**
     * 
     * @param programimage
     *     The programimage
     */
    public void setProgramimage(String programimage) {
        this.programimage = programimage;
    }

    /**
     * 
     * @return
     *     The programimagetemplate
     */
    public String getProgramimagetemplate() {
        return programimagetemplate;
    }

    /**
     * 
     * @param programimagetemplate
     *     The programimagetemplate
     */
    public void setProgramimagetemplate(String programimagetemplate) {
        this.programimagetemplate = programimagetemplate;
    }

    /**
     * 
     * @return
     *     The socialimage
     */
    public String getSocialimage() {
        return socialimage;
    }

    /**
     * 
     * @param socialimage
     *     The socialimage
     */
    public void setSocialimage(String socialimage) {
        this.socialimage = socialimage;
    }

    /**
     * 
     * @return
     *     The socialimagetemplate
     */
    public String getSocialimagetemplate() {
        return socialimagetemplate;
    }

    /**
     * 
     * @param socialimagetemplate
     *     The socialimagetemplate
     */
    public void setSocialimagetemplate(String socialimagetemplate) {
        this.socialimagetemplate = socialimagetemplate;
    }

    /**
     * 
     * @return
     *     The socialmediaplatforms
     */
    public List<Socialmediaplatform> getSocialmediaplatforms() {
        return socialmediaplatforms;
    }

    /**
     * 
     * @param socialmediaplatforms
     *     The socialmediaplatforms
     */
    public void setSocialmediaplatforms(List<Socialmediaplatform> socialmediaplatforms) {
        this.socialmediaplatforms = socialmediaplatforms;
    }

    /**
     * 
     * @return
     *     The channel
     */
    public Channel getChannel() {
        return channel;
    }

    /**
     * 
     * @param channel
     *     The channel
     */
    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    /**
     * 
     * @return
     *     The archived
     */
    public Boolean getArchived() {
        return archived;
    }

    /**
     * 
     * @param archived
     *     The archived
     */
    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    /**
     * 
     * @return
     *     The hasondemand
     */
    public Boolean getHasondemand() {
        return hasondemand;
    }

    /**
     * 
     * @param hasondemand
     *     The hasondemand
     */
    public void setHasondemand(Boolean hasondemand) {
        this.hasondemand = hasondemand;
    }

    /**
     * 
     * @return
     *     The haspod
     */
    public Boolean getHaspod() {
        return haspod;
    }

    /**
     * 
     * @param haspod
     *     The haspod
     */
    public void setHaspod(Boolean haspod) {
        this.haspod = haspod;
    }

    /**
     * 
     * @return
     *     The responsibleeditor
     */
    public String getResponsibleeditor() {
        return responsibleeditor;
    }

    /**
     * 
     * @param responsibleeditor
     *     The responsibleeditor
     */
    public void setResponsibleeditor(String responsibleeditor) {
        this.responsibleeditor = responsibleeditor;
    }

    /**
     * 
     * @return
     *     The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

}
