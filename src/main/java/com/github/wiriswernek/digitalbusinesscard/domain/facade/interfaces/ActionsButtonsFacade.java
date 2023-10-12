package com.github.wiriswernek.digitalbusinesscard.domain.facade.interfaces;

import java.util.List;

import com.github.wiriswernek.digitalbusinesscard.model.dto.ActionButtonDTO;

public interface ActionsButtonsFacade {
	public List<ActionButtonDTO> getAll() throws Exception;

	public ActionButtonDTO getById(Long id) throws Exception;

	public ActionButtonDTO insert(ActionButtonDTO dto) throws Exception;

	public List<ActionButtonDTO> insertAllObjects(List<ActionButtonDTO> list) throws Exception;

	public ActionButtonDTO update(ActionButtonDTO dto) throws Exception;

	public List<ActionButtonDTO> updateAllObjects(List<ActionButtonDTO> list) throws Exception;

	public ActionButtonDTO delete(Long id) throws Exception;

	public List<ActionButtonDTO> deleteAll(List<Long> ids) throws Exception;

	public ActionButtonDTO active(Long id) throws Exception;

	public List<ActionButtonDTO> activeAllByIds(List<Long> ids) throws Exception;

	public ActionButtonDTO desactive(Long id) throws Exception;

	public List<ActionButtonDTO> desactiveAllByIds(List<Long> ids) throws Exception;
}
