package com.springserver.cocktailspringserver.domain.tool;

import com.springserver.cocktailspringserver.domain.tool.Tool;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToolRepository extends JpaRepository<Tool, Integer> {
}