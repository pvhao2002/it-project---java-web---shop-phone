package me.thshop.dao;

import java.util.List;

import me.thshop.entity.ImageEntity;

public interface IImageDAO {
	List<ImageEntity> findAll();
	ImageEntity findOne(Integer imageId);
	Integer insert(ImageEntity imageEntity);
	void delete(Integer imageId);
	void update(ImageEntity imageEntity);
}
