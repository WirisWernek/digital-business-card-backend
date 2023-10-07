package com.github.wiriswernek.digitalbusinesscard.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.wiriswernek.digitalbusinesscard.controller.base.BaseClassController;
import com.github.wiriswernek.digitalbusinesscard.controller.base.BaseInterfaceController;
import com.github.wiriswernek.digitalbusinesscard.domain.facade.interfaces.ActionsButtonsFacade;
import com.github.wiriswernek.digitalbusinesscard.exceptions.BusinessException;
import com.github.wiriswernek.digitalbusinesscard.model.dto.base.BaseDTO;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("actions-buttons")
@RequiredArgsConstructor
public class ActionsButtonsController extends BaseClassController implements BaseInterfaceController{

	private ActionsButtonsFacade facade;

	@Override
	@GetMapping("/")
	public ResponseEntity getAll() {
		try {
			return ResponseEntity.ok().body(facade.getAll());
		} catch (BusinessException be) {
			return badRequestResponse(be);
		} catch (Exception e) {
			return internalServerError(e);
		}
	}

	@Override
	@GetMapping("/{id}")
	public ResponseEntity getById(@PathVariable Long id) {
		try {
			return ResponseEntity.ok().body(facade.getById(id));
		} catch (BusinessException be) {
			return badRequestResponse(be);
		} catch (Exception e) {
			return internalServerError(e);
		}
	}

	@Override
	@PostMapping("/")
	public ResponseEntity insert(@RequestBody BaseDTO dto) {
		try {
			return ResponseEntity.ok().body(facade.insert(dto));
		} catch (BusinessException be) {
			return badRequestResponse(be);
		} catch (Exception e) {
			return internalServerError(e);
		}
	}

	@Override
	@PostMapping("/all")
	public ResponseEntity insertAllObjects(@RequestBody List<BaseDTO> list) {
		try {
			return ResponseEntity.ok().body(facade.insertAllObjects(list));
		} catch (BusinessException be) {
			return badRequestResponse(be);
		} catch (Exception e) {
			return internalServerError(e);
		}
	}

	@Override
	@PutMapping("/{id}")
	public ResponseEntity update(@RequestBody BaseDTO dto) {
		try {
			return ResponseEntity.ok().body(facade.update(dto));
		} catch (BusinessException be) {
			return badRequestResponse(be);
		} catch (Exception e) {
			return internalServerError(e);
		}
	}

	@Override
	@PutMapping("/all")
	public ResponseEntity updateAllObjects(@RequestBody List<BaseDTO> list) {
		try {
			return ResponseEntity.ok().body(facade.updateAllObjects(list));
		} catch (BusinessException be) {
			return badRequestResponse(be);
		} catch (Exception e) {
			return internalServerError(e);
		}
	}

	@Override
	@DeleteMapping("/{id}")
	public ResponseEntity delete(@PathVariable Long id) {
		try {
			return ResponseEntity.ok().body(facade.delete(id));
		} catch (BusinessException be) {
			return badRequestResponse(be);
		} catch (Exception e) {
			return internalServerError(e);
		}
	}

	@Override
	@DeleteMapping("/all")
	public ResponseEntity deleteAll(@RequestBody List<Long> ids) {
		try {
			return ResponseEntity.ok().body(facade.deleteAll(ids));
		} catch (BusinessException be) {
			return badRequestResponse(be);
		} catch (Exception e) {
			return internalServerError(e);
		}
	}

	@Override
	@PatchMapping("/active/{id}")
	public ResponseEntity active(@PathVariable Long id) {
		try {
			return ResponseEntity.ok().body(facade.active(id));
		} catch (BusinessException be) {
			return badRequestResponse(be);
		} catch (Exception e) {
			return internalServerError(e);
		}
	}

	@Override
	@PatchMapping("/active/all")
	public ResponseEntity activeAllByIds(@RequestBody List<Long> ids) {
		try {
			return ResponseEntity.ok().body(facade.activeAllByIds(ids));
		} catch (BusinessException be) {
			return badRequestResponse(be);
		} catch (Exception e) {
			return internalServerError(e);
		}
	}

	@Override
	@PatchMapping("/desactive/all")
	public ResponseEntity desactive(@PathVariable Long id) {
		try {
			return ResponseEntity.ok().body(facade.desactive(id));
		} catch (BusinessException be) {
			return badRequestResponse(be);
		} catch (Exception e) {
			return internalServerError(e);
		}
	}

	@Override
	@PatchMapping("/desactive/all")
	public ResponseEntity desactiveAllByIds(@RequestBody List<Long> ids) {
		try {
			return ResponseEntity.ok().body(facade.desactiveAllByIds(ids));
		} catch (BusinessException be) {
			return badRequestResponse(be);
		} catch (Exception e) {
			return internalServerError(e);
		}
	}
	
}
