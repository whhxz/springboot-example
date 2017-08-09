package com.whh.com.whh.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * DemoApiController
 * Created by xuzhuo on 2017/8/8.
 */
@RestController
@RequestMapping("demoApi")
@Api(value = "测试接口", description = "这个是测试用的接口")
public class DemoApiController {
    private static Map<String, String> data = new ConcurrentHashMap<>();
    static {
        data.put("111", "aaa");
        data.put("222", "bbb");
        data.put("333", "ccc");
        data.put("444", "ddd");
        data.put("555", "eee");
    }
    @ApiOperation(value = "所有数据", response = Map.class)
    @RequestMapping(value = "/allData", method = RequestMethod.GET)
    public Map<String, String> allData(){
        return data;
    }

    @ApiOperation(value = "展示数据", response = String.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "数据正常"),
            @ApiResponse(code = 404, message = "页面找不到")
    })
    @RequestMapping(value = "/show/{key}", method = RequestMethod.GET)
    public String value(@PathVariable String key){
        return data.get(key);
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ResponseEntity<String> add(@RequestParam String key, @RequestParam String value){
        data.put(key, value);
        return new ResponseEntity<>("Add OK", HttpStatus.OK);
    }

    @RequestMapping(value = "/update/{key}", method = RequestMethod.POST)
    public ResponseEntity<String> update(@RequestParam String value, @PathVariable String key){
        data.put(key, value);
        return new ResponseEntity<>("Update OK", HttpStatus.OK);
    }

    @RequestMapping(value = "/remove/{key}", method = RequestMethod.GET)
    public ResponseEntity<String> remove(@PathVariable String key){
        data.remove(key);
        return new ResponseEntity<>("Remove", HttpStatus.OK);
    }


}
