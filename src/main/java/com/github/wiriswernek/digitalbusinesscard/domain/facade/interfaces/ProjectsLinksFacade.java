package com.github.wiriswernek.digitalbusinesscard.domain.facade.interfaces;

import java.util.List;

import com.github.wiriswernek.digitalbusinesscard.model.dto.LinkDTO;

public interface ProjectsLinksFacade {
	public List<LinkDTO> getAll() throws Exception;

	public LinkDTO getById(Long id) throws Exception;

	public LinkDTO insert(LinkDTO dto) throws Exception;

	public List<LinkDTO> insertAllObjects(List<LinkDTO> list) throws Exception;

	public LinkDTO update(LinkDTO dto) throws Exception;

	public List<LinkDTO> updateAllObjects(List<LinkDTO> list) throws Exception;

	public LinkDTO delete(Long id) throws Exception;

	public List<LinkDTO> deleteAll(List<Long> ids) throws Exception;

	public LinkDTO active(Long id) throws Exception;

	public List<LinkDTO> activeAllByIds(List<Long> ids) throws Exception;

	public LinkDTO desactive(Long id) throws Exception;

	public List<LinkDTO> desactiveAllByIds(List<Long> ids) throws Exception;
}
