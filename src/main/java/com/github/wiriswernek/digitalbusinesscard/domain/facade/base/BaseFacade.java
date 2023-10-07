package com.github.wiriswernek.digitalbusinesscard.domain.facade.base;

import java.util.List;

import com.github.wiriswernek.digitalbusinesscard.model.dto.base.BaseDTO;

public interface BaseFacade {
	public List<BaseDTO> getAll() throws Exception;

	public BaseDTO getById(Long id) throws Exception;

	public BaseDTO insert(BaseDTO dto) throws Exception;

	public List<BaseDTO> insertAllObjects(List<BaseDTO> list) throws Exception;

	public BaseDTO update(BaseDTO dto) throws Exception;

	public List<BaseDTO> updateAllObjects(List<BaseDTO> list) throws Exception;

	public BaseDTO delete(Long id) throws Exception;

	public List<BaseDTO> deleteAll(List<Long> ids) throws Exception;

	public BaseDTO active(Long id) throws Exception;

	public List<BaseDTO> activeAllByIds(List<Long> ids) throws Exception;

	public BaseDTO desactive(Long id) throws Exception;

	public List<BaseDTO> desactiveAllByIds(List<Long> ids) throws Exception;
}
