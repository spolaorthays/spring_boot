package io.redspark.thot.model;

import io.redspark.thot.controller.dto.LeadDTO;
import io.redspark.thot.enums.LeadStatus;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "TB_LEAD")
//@Data
@NoArgsConstructor
@AllArgsConstructor
public class Lead {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String company;

    @Column
    private String description;

    @ManyToOne
    @JoinColumn(name = "vendor_id")
    private User vendor;

    @Column
    @Enumerated(EnumType.STRING)
    private LeadStatus leadStatus;

    /*public Lead(LeadDTO leadDTO) {
        this.id = leadDTO.getId();
        this.description = leadDTO.getDescription();
        this.company = leadDTO.getCompany();
        this.vendor = leadDTO.getVendor();
        this.leadStatus = leadDTO.getLeadStatus();
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

    public User getVendor() {
        return vendor;
    }

    public void setVendor(User vendor) {
        this.vendor = vendor;
    }

    public LeadStatus getLeadStatus() {
        return leadStatus;
    }

    public void setLeadStatus(LeadStatus leadStatus) {
        this.leadStatus = leadStatus;
    }
}
