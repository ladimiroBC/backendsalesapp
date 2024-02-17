package com.project.salesapp.controllers;

import com.project.salesapp.models.Detail;
import com.project.salesapp.service.DetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/detail")
public class DetailController {
    @Autowired
    private DetailService detailService;

    @PostMapping(value = "/")
    public ResponseEntity<Detail> add(@RequestBody Detail detail) {
        Detail object = detailService.save(detail);
        return new ResponseEntity<>(object, HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Detail> delete(@PathVariable Integer id) {
        Detail object = detailService.findById(id);

        if(object != null)
            detailService.delete(id);
        else
            return new ResponseEntity<>(object, HttpStatus.INTERNAL_SERVER_ERROR);

        return new ResponseEntity<>(object, HttpStatus.OK);
    }

    @PutMapping(value = "/")
    public ResponseEntity<Detail> edit(@RequestBody Detail detail) {
        Detail object = detailService.findById(detail.getIdDetail());

        if (object != null) {
            object.setProduct(detail.getProduct());
            object.setTransaction(detail.getTransaction());
            object.setAmountDetail(detail.getAmountDetail());
            object.setPurchaseDetail(detail.getPurchaseDetail());
            object.setTotalDetail(detail.getTotalDetail());
            detailService.save(object);
        }
        else {
            return new ResponseEntity<>(object, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(object, HttpStatus.OK);
    }

    @GetMapping("/list")
    public List<Detail> read() {
        return detailService.findAll();
    }

    @GetMapping("/list/{id}")
    public Detail readById(@PathVariable Integer id) {
        return detailService.findById(id);
    }
}
