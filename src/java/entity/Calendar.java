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
public class Calendar {
    private int syear,sday,smonth,eyear,eday,emonth, year,eweek, duration, recom_id;
    private String phase, district;
    private Date starting, ending,todayDate;

    /**
     * @return the syear
     */
    public int getSyear() {
        return syear;
    }

    /**
     * @param syear the syear to set
     */
    public void setSyear(int syear) {
        this.syear = syear;
    }

    /**
     * @return the sday
     */
    public int getSday() {
        return sday;
    }

    /**
     * @param sday the sday to set
     */
    public void setSday(int sday) {
        this.sday = sday;
    }

    /**
     * @return the smonth
     */
    public int getSmonth() {
        return smonth;
    }

    /**
     * @param smonth the smonth to set
     */
    public void setSmonth(int smonth) {
        this.smonth = smonth;
    }

    /**
     * @return the eyear
     */
    public int getEyear() {
        return eyear;
    }

    /**
     * @param eyear the eyear to set
     */
    public void setEyear(int eyear) {
        this.eyear = eyear;
    }

    /**
     * @return the eday
     */
    public int getEday() {
        return eday;
    }

    /**
     * @param eday the eday to set
     */
    public void setEday(int eday) {
        this.eday = eday;
    }

    /**
     * @return the emonth
     */
    public int getEmonth() {
        return emonth;
    }

    /**
     * @param emonth the emonth to set
     */
    public void setEmonth(int emonth) {
        this.emonth = emonth;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
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
     * @return the district
     */
    public String getDistrict() {
        return district;
    }

    /**
     * @param district the district to set
     */
    public void setDistrict(String district) {
        this.district = district;
    }

    /**
     * @return the starting
     */
    public Date getStarting() {
        return starting;
    }

    /**
     * @param starting the starting to set
     */
    public void setStarting(Date starting) {
        this.starting = starting;
    }

    /**
     * @return the ending
     */
    public Date getEnding() {
        return ending;
    }

    /**
     * @param ending the ending to set
     */
    public void setEnding(Date ending) {
        this.ending = ending;
    }

    /**
     * @return the todayDate
     */
    public Date getTodayDate() {
        return todayDate;
    }

    /**
     * @param todayDate the todayDate to set
     */
    public void setTodayDate(Date todayDate) {
        this.todayDate = todayDate;
    }

    /**
     * @return the eweek
     */
    public int getEweek() {
        return eweek;
    }

    /**
     * @param eweek the eweek to set
     */
    public void setEweek(int eweek) {
        this.eweek = eweek;
    }

    /**
     * @return the duration
     */
    public int getDuration() {
        return duration;
    }

    /**
     * @param duration the duration to set
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }

    /**
     * @return the recom_id
     */
    public int getRecom_id() {
        return recom_id;
    }

    /**
     * @param recom_id the recom_id to set
     */
    public void setRecom_id(int recom_id) {
        this.recom_id = recom_id;
    }
    
            }