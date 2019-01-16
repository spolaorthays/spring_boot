package io.redspark.thot.controller.dto;

import io.redspark.thot.enums.LeadStatus;
import io.redspark.thot.model.User;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/*@Data
@Builder*/
@AllArgsConstructor
@NoArgsConstructor
public class CreateLeadDTO {

    private String company;
    private String description;
    private Long vendorId;
    private LeadStatus leadStatus;

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

    public LeadStatus getLeadStatus() {
        return leadStatus;
    }

    public void setLeadStatus(LeadStatus leadStatus) {
        this.leadStatus = leadStatus;
    }

    public Long getVendorId() {
        return vendorId;
    }

    public void setVendorId(Long vendorId) {
        this.vendorId = vendorId;
    }
}
