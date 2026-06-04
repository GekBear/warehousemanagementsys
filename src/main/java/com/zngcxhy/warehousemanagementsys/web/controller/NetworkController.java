package com.zngcxhy.warehousemanagementsys.web.controller;

import com.zngcxhy.warehousemanagementsys.util.NetWorkUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Network related
 *
 * @author ifcc
 */
@RestController
public class NetworkController {
    @GetMapping("/api/system/getCurrentIp")
    public String getCurrentIp(HttpServletRequest request) {
        return NetWorkUtils.getCurrentIp(request);
    }
}