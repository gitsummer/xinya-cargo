package com.cargo.car.controller;


import com.cargo.car.service.CarCardTypeService;
import com.commom.utils.ResponseInfo;
import com.commom.utils.ResponseUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jobob
 * @since 2020-11-02
 */
@Api(tags = "车辆类型列表")
@RestController
@RequestMapping("/api/base/carCardType")
public class CarCardTypeController {
    @Autowired
    private CarCardTypeService carCardTypeService;

    @ApiOperation(value = "获取车牌类型列表")
    @GetMapping("/list")
    public ResponseInfo list()  {
        return ResponseUtil.success(carCardTypeService.list());
    }
}
