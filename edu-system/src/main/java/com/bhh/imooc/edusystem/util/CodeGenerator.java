package com.bhh.imooc.edusystem.util;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.sun.xml.internal.bind.v2.TODO;

import java.util.ArrayList;

public class CodeGenerator {
    public static void main(String[] args) {

        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        // 获取当前项目根路径
        String projectPath = System.getProperty("user.dir");
        //根据目录情况更改
        //TODO：修改路径
        gc.setOutputDir(projectPath+"/educational"+"/edu-system/src/main/java");
        gc.setAuthor("bhh");
        gc.setOpen(false); //不打开生产的文件
        gc.setFileOverride(false); //不覆盖之前生成的文件
        gc.setServiceName("%sService");
        //gc.setIdType(IdType.AUTO);// 主键策略 自增  注意要和数据库中表实际情况对应
        //gc.setDateType(DateType.ONLY_DATE);
        gc.setSwagger2(true);//自动开启swagger2的支持
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        //TODO：修改uri和用户密码
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUrl("jdbc:mysql://localhost:3306/education?characterEncoding=utf8&useSSL=false&serverTimezone=Asia/Shanghai&rewriteBatchedStatements=true");
        dsc.setUsername("root");
        dsc.setPassword("123456");
        dsc.setDbType(DbType.MYSQL);
        mpg.setDataSource(dsc);

        // 包配置
        PackageConfig pc = new PackageConfig();
        //TODO：修改模块名+包名
        pc.setModuleName("edusystem");
        //包名（不包括模块名）
        pc.setParent("com.bhh.imooc");
        pc.setController("controller");
        pc.setService("service");
        pc.setEntity("domain.entity");
        pc.setMapper("mapper");
        mpg.setPackageInfo(pc);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        //TODO：导入表的名称相关策略
        //可以用同配符号:表示生成t_开头的对应库下所有表
        strategy.setInclude("user");
        //strategy.setInclude("t"+"_\\w*");
        strategy.setNaming(NamingStrategy.underline_to_camel);// 下划线转驼峰
        strategy.setTablePrefix("t_");//去掉t_这个前缀后生成类名
        strategy.setEntityLombokModel(true);// 自动生成lombok注解  记住要有lombok依赖和对应的插件哈
        strategy.setLogicDeleteFieldName("is_deleted");//设置逻辑删除字段 要和数据库中表对应哈

        // 设置创建时间和更新时间自动填充策略
        TableFill created_date = new TableFill("created_date", FieldFill.INSERT);
        TableFill updated_date = new TableFill("updated_date", FieldFill.INSERT_UPDATE);
        ArrayList<TableFill> tableFills = new ArrayList<>();
        tableFills.add(created_date);
        tableFills.add(updated_date);
        strategy.setTableFillList(tableFills);

        // 乐观锁策略
        strategy.setVersionFieldName("version");
        strategy.setRestControllerStyle(true);//采用restful 风格的api
        strategy.setControllerMappingHyphenStyle(true); // controller 请求地址采用下划线代替驼峰
        mpg.setStrategy(strategy);

        // 执行
        mpg.execute();
    }
}