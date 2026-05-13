package com.gotorobinpeter.catalog;

import jakarta.validation.constraints.Min;
import org.springframework.boot.context.properties.bind.DefaultValue;

public record ApplicationProperties(@DefaultValue("10") @Min(1) int pageSize) {}
