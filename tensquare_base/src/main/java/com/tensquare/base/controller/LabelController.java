package com.tensquare.base.controller;

import com.tensquare.base.pojo.Label;
import com.tensquare.base.service.LabelService;
import entity.Result;
import entity.StatusCode;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: tensquare_parent52
 * @description: 标签控制层
 * @author: tianshengfei
 * @create: 2019-10-28 11:27
 **/
@RestController
@RequestMapping("/label")
@Api(tags = {"标签控制层"})
public class LabelController {

    @Autowired
    private LabelService labelService;

    /**
     * 查询全部列表
     * @return
     */
    @GetMapping
    @ApiOperation("查询全部列表")
    public Result<List> findAll(){
        return new Result(true, StatusCode.OK,"查询成功",labelService.findAll());
    }

    /**
     * 根据id查询标签
     * @param id
     * @return
     */
    @ApiOperation("根据id查询标签")
    @GetMapping("/{id}")
    public Result<Label> findById(@PathVariable String id){
        return new Result<>(true,StatusCode.OK,"查询成功",labelService.findById(id));
    }

    /**
     * 增加标签
     * @param label
     * @return
     */
    @ApiOperation("增加标签")
    @PostMapping
    public Result add(@RequestBody Label label){
        labelService.add(label);
        return new Result(true,StatusCode.OK,"增加成功");
    }

    /**
     * 修改标签
     * @return
     */
    @ApiOperation("修改标签")
    @PutMapping("/{id}")
    public Result update(@RequestBody Label label,@PathVariable String id){
        label.setId(id);
        labelService.update(label);
        return new Result(true,StatusCode.OK,"修改成功");
    }

    /**
     * 删除标签
     * @return
     */
    @ApiOperation("删除标签")
    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable String id){
        labelService.deleteById(id);
        return new Result(true,StatusCode.OK,"删除成功");
    }

    /**
     * 条件查询标签
     * @param label
     * @return
     */
    @ApiOperation("条件查询标签")
    @PostMapping("search")
    public Result search(@RequestBody Label label){
        List<Label> list = labelService.findSearch(label);
        return new Result<>(true,StatusCode.OK,"查询成功",list);
    }
}
