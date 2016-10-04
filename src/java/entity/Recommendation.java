/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.sql.Date;

/**
 *
 * @author Bryll Joey Delfin
 */
public class Recommendation {
    private String recommendation_name, type, description, status, phase;
    private Date date_start, date_create, date_end; 

    /**
     * @return the recommendation_name
     */
    public String getRecommendation_name() {
        return recommendation_name;
    }

    /**
     * @param recommendation_name the recommendation_name to set
     */
    public void setRecommendation_name(String recommendation_name) {
        this.recommendation_name = recommendation_name;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the phase
     */
    public String getPhase() {
        return phase;
    }

    /**
     * @param phase the phase to set
     */
    public void setPhase(String phase) {
        this.phase = phase;
    }

    /**
     * @return the date_start
     */
    public Date getDate_start() {
        return date_start;
    }

    /**
     * @param date_start the date_start to set
     */
    public void setDate_start(Date date_start) {
        this.date_start = date_start;
    }

    /**
     * @return the date_create
     */
    public Date getDate_create() {
        return date_create;
    }

    /**
     * @param date_create the date_create to set
     */
    public void setDate_create(Date date_create) {
        this.date_create = date_create;
    }

    /**
     * @return the date_end
     */
    public Date getDate_end() {
        return date_end;
    }

    /**
     * @param date_end the date_end to set
     */
    public void setDate_end(Date date_end) {
        this.date_end = date_end;
    }
}