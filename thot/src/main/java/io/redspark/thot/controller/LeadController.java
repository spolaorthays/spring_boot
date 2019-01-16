package io.redspark.thot.controller;

import io.redspark.thot.controller.dto.CreateLeadDTO;
import io.redspark.thot.controller.dto.LeadDTO;
import io.redspark.thot.service.LeadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("leads")
public class LeadController {

    private final LeadService leadService;

    @Autowired //ele linka automaticamente com o dependencia
    public LeadController(LeadService leadService) {
        this.leadService = leadService;
    }

    @PostMapping
    public LeadDTO create(@RequestBody CreateLeadDTO leadDTO){
        return leadService.create(leadDTO);
    }

    @GetMapping("{id}")
    public LeadDTO findById(@PathVariable Long id){
        return leadService.findById(id);
        //LeadDTO.builder()
          //      .company("Sesc")
            //    .build();
    }

    @GetMapping
    public List<LeadDTO> findAll(){
        return leadService.findAll();
    }

    @PutMapping("{id}")
    public LeadDTO update(@PathVariable Long id, @RequestBody CreateLeadDTO createLeadDTO){
        return leadService.update(id, createLeadDTO);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id){
        leadService.delete(id);
    }

}
