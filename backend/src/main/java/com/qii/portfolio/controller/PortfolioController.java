package com.qii.portfolio.controller;

import com.qii.portfolio.model.Project;
import com.qii.portfolio.service.PortfolioService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class PortfolioController {
    private final PortfolioService portfolioService;

    public PortfolioController(PortfolioService portfolioService) {
        this.portfolioService = portfolioService;
    }

    @GetMapping("/api/projects")
    public List<Project> getProjects() {
        return portfolioService.getProjects();
    }
}
