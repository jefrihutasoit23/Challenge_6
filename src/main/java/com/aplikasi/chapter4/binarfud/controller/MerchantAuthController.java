package com.aplikasi.chapter4.binarfud.controller;

import com.aplikasi.chapter4.binarfud.entity.Merchant;
import com.aplikasi.chapter4.binarfud.repository.MerchantRepository;
import com.aplikasi.chapter4.binarfud.service.MerchantService;
import com.aplikasi.chapter4.binarfud.utils.SimpleStringUtils;
import com.aplikasi.chapter4.binarfud.utils.TemplateResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/merchantsAuth")
public class MerchantAuthController {

    @Autowired
    private MerchantService merchantService;
    SimpleStringUtils simpleStringUtils = new SimpleStringUtils();

    @Autowired
    public MerchantRepository merchantRepository;

    @Autowired
    public TemplateResponse response;

    @PutMapping(value ={"/updateStatus", "/updateStatus/"})
    public ResponseEntity<Map> updateMerchantStatus(@RequestBody Merchant request) {
        try {
            return new ResponseEntity<Map>(merchantService.updateMerchantStatus(request), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Map>(response.Error(e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR); // 500
        }
    }

    @PutMapping(value={"/update", "/update/"})
    public ResponseEntity<Map> update(@RequestBody Merchant request) {
        try {
            return new ResponseEntity<Map>(merchantService.update(request), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Map>(response.Error(e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR); // 500
        }
    }
}
