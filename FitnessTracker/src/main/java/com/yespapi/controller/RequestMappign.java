package com.yespapi.controller;

import org.springframework.web.bind.annotation.RequestMethod;

public @interface RequestMappign {

	String value();

	RequestMethod method();

}
