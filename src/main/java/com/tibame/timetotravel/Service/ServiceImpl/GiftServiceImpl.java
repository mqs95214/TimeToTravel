package com.tibame.timetotravel.service.ServiceImpl;

import com.tibame.timetotravel.entity.Gift;
import com.tibame.timetotravel.repository.GiftRepository;
import com.tibame.timetotravel.service.GiftService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("giftService")
public class  GiftServiceImpl implements GiftService {

    @Autowired
    @Qualifier("giftRepository")
    private GiftRepository giftRepository;

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    @Transactional
    public void insert(Gift gift) {
        giftRepository.save(gift);
    }
    @Override
    @Transactional
    public void deleteById(Integer giftId) {
        giftRepository.deleteById(giftId);
    }

    @Override
    @Transactional
    public void update(Integer giftId, Gift gift) {
        entityManager.merge(gift);
    }

    @Override
    public Gift findById(Integer giftId) {
        return giftRepository.findById(giftId).orElse(null);
    }

    @Override
    public List<Gift> findAll() {
        return giftRepository.findAll();
    }
}
