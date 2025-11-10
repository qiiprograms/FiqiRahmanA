package com.qii.portfolio.service;

import com.qii.portfolio.model.Project;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PortfolioService {
    public List<Project> getProjects() {
        return List.of(
                new Project("Website Portfolio", "Website pribadi dengan Java backend", "https://github.com/qii/portfolio"),
                new Project("Todo App", "Aplikasi daftar tugas dengan React", "https://github.com/qii/todoapp"),
                new Project("Weather App", "Menampilkan cuaca menggunakan API", "https://github.com/qii/weatherapp")
        );
    }
}
