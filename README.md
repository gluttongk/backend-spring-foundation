# backend-spring-foundation
A documentation to describe how to build background.

## second step: to add the basic modules required initially
To add the basic modules required initially, then to select the required dependencies.

Here will provide common basic modules, as well as some common dependencies.

### common basic modules
- framework:
- common:
- api:
- admin:

## common dependencies
-- spring-boot-starter-web:
1. 更新 http get实例
> 实用 ResponseEntity (org.springframework.http.ResponseEntity) 作为返回实例
> 并增加 CommonResponse 作为通用的返回结构体
```json
{
  "code": 200,
  "message": "success",
  "data": {
    "id": 1,
    "name": "test"
  }
}
```

-- mybatis-plus-boot-starter
> 配置参考 [官网](https://baomidou.com/pages/56bac0/)
