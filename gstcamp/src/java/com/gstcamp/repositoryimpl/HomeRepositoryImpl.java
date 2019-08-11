/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gstcamp.repositoryimpl;

import com.gstcamp.bean.ClientBean;
import com.gstcamp.repository.HomeRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author aziz
 */
@Repository
public class HomeRepositoryImpl implements HomeRepository {

    
    @Override
    public List getGSTList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        
        return arrayList;
    }

    @Override
    public List showClient() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ClientBean("12345", "Parag Sarees", "Citylight", "Gujarat", "111111"));
        arrayList.add(new ClientBean("12346", "D. Light Textile", "Citylight", "Gujarat", "1111897"));
        
        arrayList.add(new ClientBean("12347", "Textile Corp", "Parle Point", "Gujarat", "111113"));
        arrayList.add(new ClientBean("12348", "Mahendra Sarees", "Citylight", "Gujarat", "111145"));
        
        return arrayList;
    }
}
