/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gstcamp.serviceimpl;

import com.gstcamp.repository.HomeRepository;
import com.gstcamp.service.HomeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author aziz
 */
@Service
public class HomeServiceImpl implements HomeService {

    @Autowired
    HomeRepository homeRepository;

    @Override
    public List getGSTList() {
        return homeRepository.getGSTList();
    }

}
