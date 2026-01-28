package com.sysrec.barbearia.srvbarbeariasysrec.infrastructure.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
    @GetMapping("/health")
    public String health() {
        return "srv-barbearia-sysRec Rodando";
    }
}
