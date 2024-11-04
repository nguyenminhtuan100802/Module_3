package org.example.ytb_javaweb_p2.dao;

import org.example.ytb_javaweb_p2.model.NewModel;

import java.util.List;

public interface INewDAO {
    List<NewModel> findByCategoryId(Long categoryId);
}
