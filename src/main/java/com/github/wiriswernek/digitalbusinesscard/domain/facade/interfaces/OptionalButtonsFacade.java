package com.github.wiriswernek.digitalbusinesscard.domain.facade.interfaces;

import java.util.List;

import com.github.wiriswernek.digitalbusinesscard.model.dto.OptionalButtonDTO;

public interface OptionalButtonsFacade {
	public List<OptionalButtonDTO> getAll() throws Exception;

	public OptionalButtonDTO getById(Long id) throws Exception;

	public OptionalButtonDTO insert(OptionalButtonDTO dto) throws Exception;

	public List<OptionalButtonDTO> insertAllObjects(List<OptionalButtonDTO> list) throws Exception;

	public OptionalButtonDTO update(OptionalButtonDTO dto) throws Exception;

	public List<OptionalButtonDTO> updateAllObjects(List<OptionalButtonDTO> list) throws Exception;

	public OptionalButtonDTO delete(Long id) throws Exception;

	public List<OptionalButtonDTO> deleteAll(List<Long> ids) throws Exception;

	public OptionalButtonDTO active(Long id) throws Exception;

	public List<OptionalButtonDTO> activeAllByIds(List<Long> ids) throws Exception;

	public OptionalButtonDTO desactive(Long id) throws Exception;

	public List<OptionalButtonDTO> desactiveAllByIds(List<Long> ids) throws Exception;
}
