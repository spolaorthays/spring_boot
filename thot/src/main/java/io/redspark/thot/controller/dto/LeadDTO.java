package io.redspark.thot.controller.dto;

import io.redspark.thot.enums.LeadStatus;
import io.redspark.thot.model.Lead;
import io.redspark.thot.model.User;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/*@Data
@Builder*/
@AllArgsConstructor
@NoArgsConstructor
public class LeadDTO {

    //Pelo lombok acontece erro, com get/set normal funciona

    private Long id;
    private String company;
    private String description;
    private UserDTO vendor; //aqui é USERDTO mesmo, pois estou dando para o objeto o user já tratado
    private LeadStatus leadStatus;

    /*public LeadDTO(Lead lead) {
        this.id = lead.getId();
        this.company = lead.getCompany();
        this.description = lead.getDescription();
        this.vendor = lead.getVendor();
        this.leadStatus = lead.getLeadStatus();
    }*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UserDTO getVendor() {
        return vendor;
    }

    public void setVendor(UserDTO vendor) {
        this.vendor = vendor;
    }

    public LeadStatus getLeadStatus() {
        return leadStatus;
    }

    public void setLeadStatus(LeadStatus leadStatus) {
        this.leadStatus = leadStatus;
    }
}
