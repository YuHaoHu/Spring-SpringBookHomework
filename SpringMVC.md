## # SpringMVC 
# 1、springmvc的常用注解

1、@Controller：控制层 ：表明程序是控制层

	    @Controller 用于标记在一个类上，使用它标记的类就是一个SpringMVC Controller 对象。
    
    	将控制器类交给Spring 来管理。有两种方式：
    
    　　		（1）在SpringMVC 的配置文件中定义MyController 的bean 对象。
			 <!--方式一-->
  		  	<bean class="cn.com.tjxy.controller.Application" id="application"/>
    
    　　		（2）在SpringMVC 的配置文件中告诉Spring 该到哪里去找标记为@Controller 的Controller 控制器。
		    <!--方式二-->
		    < context:component-scan base-package = "cn.com.tjxy.controller" />//路径写到controller的上一层(扫描包详解见下面浅析)
2、@RequestMapping

    @RequestMapping:是一个用来处理请求地址映射的注解，可用于类或方法上。用于类上，表示类中的所有响应请求的方法都是以该地址作为父路径。
    
    1、 value， method；
    
    value： 指定请求的实际地址，指定的地址可以是URI Template 模式（后面将会说明）；
    
    method：  指定请求的method类型， GET、POST、PUT、DELETE等；
    
    2、consumes，produces
    
    consumes： 指定处理请求的提交内容类型（Content-Type），例如application/json, text/html;
    
    produces:指定返回的内容类型，仅当request请求头中的(Accept)类型中包含该指定类型才返回；