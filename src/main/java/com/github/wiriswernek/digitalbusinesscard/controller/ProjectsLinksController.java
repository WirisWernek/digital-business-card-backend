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
import com.github.wiriswernek.digitalbusinesscard.model.dto.base.BaseDTO;

@RestController
@RequestMapping("projects-links")
public class ProjectsLinksController implements BaseController {
	@Override
	@GetMapping("/")
	public ResponseEntity getAll() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getAll'");
	}

	@Override
	@GetMapping("/{id}")
	public ResponseEntity getById(@PathVariable Long id) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getById'");
	}

	@Override
	@PostMapping("/")
	public ResponseEntity insert(@RequestBody BaseDTO dto) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'insert'");
	}

	@Override
	@PostMapping("/all")
	public ResponseEntity insertAllObjects(@RequestBody List<BaseDTO> list) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'insertAllObjects'");
	}

	@Override
	@PutMapping("/{id}")
	public ResponseEntity update(@RequestBody BaseDTO dto) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'update'");
	}

	@Override
	@PutMapping("/all")
	public ResponseEntity updateAllObjects(@RequestBody List<BaseDTO> list) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'updateAllObjects'");
	}

	@Override
	@DeleteMapping("/{id}")
	public ResponseEntity delete(@PathVariable Long id) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
	}

	@Override
	@DeleteMapping("/all")
	public ResponseEntity deleteAll(@RequestBody List<Long> ids) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
	}

	@Override
	@PatchMapping("/active/{id}")
	public ResponseEntity active(@PathVariable Long id) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'active'");
	}

	@Override
	@PatchMapping("/active/all")
	public ResponseEntity activeAllByIds(@RequestBody List<Long> ids) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'activeAllByIds'");
	}

	@Override
	@PatchMapping("/desactive/all")
	public ResponseEntity desactive(@PathVariable Long id) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'desactive'");
	}

	@Override
	@PatchMapping("/desactive/all")
	public ResponseEntity desactiveAllByIds(@RequestBody List<Long> ids) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'desactiveAllByIds'");
	}
}
