package cn.abmis.lightflow.postservice.config;

import com.baomidou.mybatisplus.core.injector.DefaultSqlInjector;
import com.baomidou.mybatisplus.core.injector.ISqlInjector;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@MapperScan("cn.abmis.lightflow.postservice.dal.mysql.mapper") //扫描对应的 mapper 接口
@EnableTransactionManagement(proxyTargetClass = true) // 启动事务管理。
public class DatabaseConfiguration {

    @Bean
    public ISqlInjector sqlInjector() {
        return new DefaultSqlInjector(); // MyBatis Plus 逻辑删除
    }

    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor(); // MyBatis Plus 分页插件
    }


}
