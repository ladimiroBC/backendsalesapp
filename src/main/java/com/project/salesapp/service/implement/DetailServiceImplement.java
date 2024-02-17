package com.project.salesapp.service.implement;

import com.project.salesapp.dao.DetailDao;
import com.project.salesapp.models.Detail;
import com.project.salesapp.service.DetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class DetailServiceImplement implements DetailService {
    @Autowired
    private DetailDao detailDao;

    @Transactional(readOnly = false)
    public List<Detail> findAll() {
        return (List<Detail>) detailDao.findAll();
    }

    @Transactional(readOnly = false)
    public Detail save(Detail detail) {
        return detailDao.save(detail);
    }

    @Transactional(readOnly = false)
    public void delete(Integer id) {
        detailDao.deleteById(id);
    }

    @Transactional(readOnly = false)
    public Detail findById(Integer id) {
        return detailDao.findById(id).orElse(null);
    }
}
