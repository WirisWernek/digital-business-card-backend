package com.github.wiriswernek.digitalbusinesscard.controller.base;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.github.wiriswernek.digitalbusinesscard.model.dto.base.BaseDTO;

public interface BaseInterfaceController {

	public ResponseEntity getAll();

	public ResponseEntity getById( Long id );

	public ResponseEntity insert( BaseDTO dto );

	public ResponseEntity insertAllObjects( List<BaseDTO> list );

	public ResponseEntity update( BaseDTO dto );

	public ResponseEntity updateAllObjects( List<BaseDTO> list );

	public ResponseEntity delete(Long id);

	public ResponseEntity deleteAll(List<Long> ids);

	public ResponseEntity active( Long id );

	public ResponseEntity activeAllByIds( List<Long> ids );

	public ResponseEntity desactive( Long id );

	public ResponseEntity desactiveAllByIds( List<Long> ids );
}
