## # 日志

#1、日志的级别：
    trace<debug<info<warn<error<fatal

1）级别之间是包含的关系，意思是如果你设置日志级别是trace，则大于等于这个级别的日志都会输出。

2）这不同的级别的含义大家都很容易理解，这里就简单介绍一下：

trace： 是追踪，就是程序推进以下，你就可以写个trace输出，所以trace应该会特别多，不过没关系，我们可以设置最低日志级别不让他输出。

debug： 调试么，我一般就只用这个作为最低级别，trace压根不用。是在没办法就用eclipse或者idea的debug功能就好了么。

info： 输出一下你感兴趣的或者重要的信息，这个用的最多了。

warn： 有些信息不是错误信息，但是也要给程序员的一些提示，类似于eclipse中代码的验证不是有error 和warn（不算错误但是也请注意，比如以下depressed的方法）。

error： 错误信息。用的也比较多。

fatal： 级别比较高了。重大错误，这种级别你可以直接停止程序了，是不应该出现的错误么！不用那么紧张，其实就是一个程度的问题。
# 2、日志调用:
```

    	private static final Logger logger = LoggerFactory.getLogger(Application.class);
    
    	@PostConstruct
    	public void logSomething() {
    		logger.debug("Sample Debug Message");
    		logger.info("Sample info Message");
    		logger.trace("Sample trace Message");
    		logger.error("Sample error Message");
    		logger.warn("Sample warn Message");
    	}

# 3、配置文件：

      logging:
     	 level:
       	 	root: warn
       		 org.springframework.web: info
     	 file: logging-spring.log  #生成file文件
