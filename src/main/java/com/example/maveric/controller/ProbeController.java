package com.example.maveric.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.maveric.model.ProbeRequest;
import com.example.maveric.model.ProbeResult;
import com.example.maveric.service.ProbeService;

@RestController
@RequestMapping("/api/probe")

public class ProbeController {

	@Autowired
	private ProbeService probeService;
	
    
	@PostMapping("/move")	
	public ResponseEntity<ProbeResult> moveProbe(@RequestBody ProbeRequest request) {
		return ResponseEntity.ok(probeService.executeCommands(request));
	}
}
