/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gstcamp.repositoryimpl;

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
    
}
