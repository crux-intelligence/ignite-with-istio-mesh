package com.ignite.client.config;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({IgniteCacheManagerConfiguration.class})
public @interface EnableIgnite {}
