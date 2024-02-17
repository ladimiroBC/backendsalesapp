package com.project.salesapp.service;

import com.project.salesapp.models.Detail;
import java.util.List;

public interface DetailService {
    public List<Detail> findAll();
    public Detail save(Detail detail);
    public void delete(Integer id);
    public Detail findById(Integer id);
}
