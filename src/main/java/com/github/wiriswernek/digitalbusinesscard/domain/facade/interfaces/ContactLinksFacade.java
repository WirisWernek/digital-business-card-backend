package com.github.wiriswernek.digitalbusinesscard.domain.facade.interfaces;

import java.util.List;

import com.github.wiriswernek.digitalbusinesscard.model.dto.ContactLinkDTO;


public interface ContactLinksFacade {
	public List<ContactLinkDTO> getAll() throws Exception;

	public ContactLinkDTO getById(Long id) throws Exception;

	public ContactLinkDTO insert(ContactLinkDTO dto) throws Exception;

	public List<ContactLinkDTO> insertAllObjects(List<ContactLinkDTO> list) throws Exception;

	public ContactLinkDTO update(ContactLinkDTO dto) throws Exception;

	public List<ContactLinkDTO> updateAllObjects(List<ContactLinkDTO> list) throws Exception;

	public ContactLinkDTO delete(Long id) throws Exception;

	public List<ContactLinkDTO> deleteAll(List<Long> ids) throws Exception;

	public ContactLinkDTO active(Long id) throws Exception;

	public List<ContactLinkDTO> activeAllByIds(List<Long> ids) throws Exception;

	public ContactLinkDTO desactive(Long id) throws Exception;

	public List<ContactLinkDTO> desactiveAllByIds(List<Long> ids) throws Exception;
}
