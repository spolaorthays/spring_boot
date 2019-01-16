package io.redspark.thot.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "TB_USER")
//@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @OneToMany(mappedBy = "vendor")
    private List<Lead> leadList;

    @ManyToMany
    @JoinTable(name = "TB_USER_JOB_TITLE")
    private List<JobTitle> jobTitleList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Lead> getLeadList() {
        return leadList;
    }

    public void setLeadList(List<Lead> leadList) {
        this.leadList = leadList;
    }

    public List<JobTitle> getJobTitleList() {
        return jobTitleList;
    }

    public void setJobTitleList(List<JobTitle> jobTitleList) {
        this.jobTitleList = jobTitleList;
    }
}
