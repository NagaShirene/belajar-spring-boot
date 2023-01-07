package com.Fadhil.LatihanTerori.spring.core;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import com.Fadhil.LatihanTerori.spring.core.configuration.BarConfiguration;
import com.Fadhil.LatihanTerori.spring.core.configuration.FooConfiguration;

@Configuration
@Import({
    FooConfiguration.class,
    BarConfiguration.class
})
public class MainConfiguration {
}
