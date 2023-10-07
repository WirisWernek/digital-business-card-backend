package com.github.wiriswernek.digitalbusinesscard.model.repository.base;

import java.util.List;

import com.github.wiriswernek.digitalbusinesscard.model.entity.base.BaseEntity;

public interface BaseRepository {

	public List<BaseEntity> getAll();

	public BaseEntity getById( Long id );

	public BaseEntity insert( BaseEntity dto );

	public List<BaseEntity> insertAllObjects( List<BaseEntity> list );

	public BaseEntity update( BaseEntity dto );

	public List<BaseEntity> updateAllObjects( List<BaseEntity> list );

	public void deleteById();

	public void active( Long id );

	public void activeAllByIds( List<Long> ids );

	public void desactive( Long id );

	public void desactiveAllByIds( List<Long> ids );
}
