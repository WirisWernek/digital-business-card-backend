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

import com.github.wiriswernek.digitalbusinesscard.controller.base.BaseController;
import com.github.wiriswernek.digitalbusinesscard.domain.facade.interfaces.ActionsButtonsFacade;
import com.github.wiriswernek.digitalbusinesscard.exceptions.BusinessException;
import com.github.wiriswernek.digitalbusinesscard.model.dto.ActionButtonDTO;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("actions-buttons")
@RequiredArgsConstructor
public class ActionsButtonsController extends BaseController {

	private ActionsButtonsFacade facade;

	@GetMapping("/{id}")
	public ResponseEntity<ActionButtonDTO> getById(@PathVariable Long id) {
		try {
			return ResponseEntity.ok().body(facade.getById(id));
		} catch (BusinessException be) {
			return badRequestResponse(be);
		} catch (Exception e) {
			return internalServerError(e);
		}
	}

	@GetMapping("/")
	public ResponseEntity<List<ActionButtonDTO>> getAll() {
		try {
			return ResponseEntity.ok().body(facade.getAll());
		} catch (BusinessException be) {
			return badRequestResponse(be);
		} catch (Exception e) {
			return internalServerError(e);
		}
	}

	@PostMapping("/")
	public ResponseEntity<ActionButtonDTO> insert(@RequestBody ActionButtonDTO dto) {
		try {
			return ResponseEntity.ok().body(facade.insert(dto));
		} catch (BusinessException be) {
			return badRequestResponse(be);
		} catch (Exception e) {
			return internalServerError(e);
		}
	}

	@PostMapping("/all")
	public ResponseEntity<List<ActionButtonDTO>> insertAllObjects(@RequestBody List<ActionButtonDTO> list) {
		try {
			return ResponseEntity.ok().body(facade.insertAllObjects(list));
		} catch (BusinessException be) {
			return badRequestResponse(be);
		} catch (Exception e) {
			return internalServerError(e);
		}
	}

	@PutMapping("/{id}")
	public ResponseEntity<ActionButtonDTO> update(@RequestBody ActionButtonDTO dto) {
		try {
			return ResponseEntity.ok().body(facade.update(dto));
		} catch (BusinessException be) {
			return badRequestResponse(be);
		} catch (Exception e) {
			return internalServerError(e);
		}
	}

	@PutMapping("/all")
	public ResponseEntity<List<ActionButtonDTO>> updateAllObjects(@RequestBody List<ActionButtonDTO> list) {
		try {
			return ResponseEntity.ok().body(facade.updateAllObjects(list));
		} catch (BusinessException be) {
			return badRequestResponse(be);
		} catch (Exception e) {
			return internalServerError(e);
		}
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<ActionButtonDTO> delete(@PathVariable Long id) {
		try {
			return ResponseEntity.ok().body(facade.delete(id));
		} catch (BusinessException be) {
			return badRequestResponse(be);
		} catch (Exception e) {
			return internalServerError(e);
		}
	}

	@DeleteMapping("/all")
	public ResponseEntity<List<ActionButtonDTO>> deleteAll(@RequestBody List<Long> ids) {
		try {
			return ResponseEntity.ok().body(facade.deleteAll(ids));
		} catch (BusinessException be) {
			return badRequestResponse(be);
		} catch (Exception e) {
			return internalServerError(e);
		}
	}

	@PatchMapping("/active/{id}")
	public ResponseEntity<ActionButtonDTO> active(@PathVariable Long id) {
		try {
			return ResponseEntity.ok().body(facade.active(id));
		} catch (BusinessException be) {
			return badRequestResponse(be);
		} catch (Exception e) {
			return internalServerError(e);
		}
	}

	@PatchMapping("/active/all")
	public ResponseEntity<List<ActionButtonDTO>> activeAllByIds(@RequestBody List<Long> ids) {
		try {
			return ResponseEntity.ok().body(facade.activeAllByIds(ids));
		} catch (BusinessException be) {
			return badRequestResponse(be);
		} catch (Exception e) {
			return internalServerError(e);
		}
	}

	@PatchMapping("/desactive/{id}")
	public ResponseEntity<ActionButtonDTO> desactive(@PathVariable Long id) {
		try {
			return ResponseEntity.ok().body(facade.desactive(id));
		} catch (BusinessException be) {
			return badRequestResponse(be);
		} catch (Exception e) {
			return internalServerError(e);
		}
	}

	@PatchMapping("/desactive/all")
	public ResponseEntity<List<ActionButtonDTO>> desactiveAllByIds(@RequestBody List<Long> ids) {
		try {
			return ResponseEntity.ok().body(facade.desactiveAllByIds(ids));
		} catch (BusinessException be) {
			return badRequestResponse(be);
		} catch (Exception e) {
			return internalServerError(e);
		}
	}

}
