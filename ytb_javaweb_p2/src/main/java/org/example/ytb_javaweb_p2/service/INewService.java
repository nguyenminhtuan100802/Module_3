package org.example.ytb_javaweb_p2.service;

import org.example.ytb_javaweb_p2.model.NewModel;

import java.util.List;

public interface INewService {
    List<NewModel> findByCategoryId(Long categoryId);
}
