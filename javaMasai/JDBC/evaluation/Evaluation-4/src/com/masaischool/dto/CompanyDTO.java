package com.masaischool.dto;

import javax.xml.crypto.Data;
import java.util.Date;

public interface CompanyDTO {
    public String getCompany_id();
    public void setCompany_id(String company_id);
    public String getCompany_name();
    public void setCompany_name(String company_name);
    public long getTurnover_in_crores();
    public void setTurnover_in_crores(long turnover_in_crores);

    public Date getRegistration_date();
    public void setRegistration_date(Date registration_date);
}
