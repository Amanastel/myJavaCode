package com.masaischool.dto;

import java.util.Date;

public class CompanyDTOImpl implements CompanyDTO{
    private String company_id;
    private String company_name;
    private long Turnover_in_crores;
    private Date registration_date;

    @Override
    public String getCompany_id() {
        return company_id;
    }

    @Override
    public void setCompany_id(String company_id) {
        this.company_id = company_id;
    }

    @Override
    public String getCompany_name() {
        return company_name;
    }

    @Override
    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    @Override
    public long getTurnover_in_crores() {
        return Turnover_in_crores;
    }

    @Override
    public void setTurnover_in_crores(long turnover_in_crores) {
        Turnover_in_crores = turnover_in_crores;
    }

    @Override
    public Date getRegistration_date() {
        return registration_date;
    }

    @Override
    public void setRegistration_date(Date registration_date) {
        this.registration_date = registration_date;
    }

    public CompanyDTOImpl(String company_id, String company_name, long turnover_in_crores, Date registration_date) {
        this.company_id = company_id;
        this.company_name = company_name;
        Turnover_in_crores = turnover_in_crores;
        this.registration_date = registration_date;
    }

    @Override
    public String toString() {
        return "CompanyDTOImpl{" +
                "company_id='" + company_id + '\'' +
                ", company_name='" + company_name + '\'' +
                ", Turnover_in_crores=" + Turnover_in_crores +
                ", registration_date=" + registration_date +
                '}';
    }
}
